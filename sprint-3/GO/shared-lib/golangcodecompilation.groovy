def call(Map config = [:]) {
    pipeline {
        agent any

        stages {
            stage('Init') {
                steps {
                    script {
                        env.GO_VERSION = config.GO_VERSION ?: 'go1.20.12'
                        env.GO_TARBALL = "${env.GO_VERSION}.linux-amd64.tar.gz"
                        env.GO_URL = "https://go.dev/dl/${env.GO_TARBALL}"
                        env.GOROOT = '/usr/local/go'
                        env.PATH += ":${env.GOROOT}/bin"
                        env.RECIPIENT = config.RECIPIENT ?: 'adilnawaz54@gmail.com'
                    }
                }
            }

            stage('Clean Workspace') {
                steps {
                    cleanWs()
                }
            }

            stage('Check & Install Go') {
                steps {
                    sh '''
                    if ! command -v go >/dev/null 2>&1; then
                        echo "Go not found. Installing ${GO_VERSION}..."
                        wget ${GO_URL}
                        sudo tar -C /usr/local -xzf ${GO_TARBALL}
                        export PATH=$PATH:/usr/local/go/bin
                    else
                        echo "Go is already installed: $(go version)"
                    fi
                    '''
                }
            }

            stage('Clone Repository') {
                steps {
                    git url: config.repoUrl ?: 'https://github.com/OT-MyGurukulam/employee-api.git',
                        branch: config.repoBranch ?: 'main'
                }
            }

            stage('Install Dependencies') {
                steps {
                    sh 'go mod tidy'
                }
            }

            stage('Code Compilation') {
                steps {
                    sh 'go build -v ./...'
                }
            }
        }

        post {
            success {
                echo 'Build successful!'
                mail to: "${env.RECIPIENT}",
                     subject: "Jenkins Build Successful: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                     body: "Good news!\n\nThe Jenkins build for job '${env.JOB_NAME}' succeeded.\n\nCheck it here: ${env.BUILD_URL}"
            }

            failure {
                echo 'Build failed!'
                mail to: "${env.RECIPIENT}",
                     subject: "Jenkins Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                     body: "Unfortunately, the Jenkins build for job '${env.JOB_NAME}' failed.\n\nCheck the details here: ${env.BUILD_URL}"
            }

            always {
                cleanWs()
            }
        }
    }
}
