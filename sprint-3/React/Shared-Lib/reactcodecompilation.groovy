def call(Map config = [:]) {
    def REPO_URL = config.repoUrl ?: 'https://github.com/OT-MyGurukulam/frontend.git'
    def BRANCH = config.branch ?: 'main'
    def BUILD_DIR = config.buildDir ?: 'frontend'
    def SLACK_CHANNEL = config.slackChannel ?: 'notificationn-channel'
    def SLACK_CREDENTIAL_ID = config.slackCredentialId ?: 'downtime-crew'
    def PRIORITY = config.priority ?: 'P1'
    def TOTAL_STAGES = 7

    pipeline {
        agent any

        environment {
            REPO_URL_ENV = "${REPO_URL}"
            BRANCH_ENV = "${BRANCH}"
            BUILD_DIR_ENV = "${BUILD_DIR}"
            SLACK_CHANNEL_ENV = "${SLACK_CHANNEL}"
            SLACK_CREDENTIAL_ID_ENV = "${SLACK_CREDENTIAL_ID}"
            PRIORITY_ENV = "${PRIORITY}"
            FAILED_STAGE = ''
            FAILURE_REASON = ''
            PASSED_STAGES = 0
            TOTAL_STAGES_ENV = "${TOTAL_STAGES}"
            BUILD_TRIGGER = "${currentBuild.getBuildCauses()[0]?.userName ?: 'Timer/SCM/Event'}"
        }

        stages {
            stage('Clean Workspace') {
                steps {
                    script {
                        env.FAILED_STAGE = 'Clean Workspace'
                        try {
                            cleanWs()
                            env.PASSED_STAGES = env.PASSED_STAGES.toInteger() + 1
                        } catch (e) {
                            env.FAILURE_REASON = e.getMessage()
                            error("Stage failed: ${env.FAILURE_REASON}")
                        }
                    }
                }
            }

            stage('Checkout Code') {
                steps {
                    script {
                        env.FAILED_STAGE = 'Checkout Code'
                        try {
                            git branch: "${env.BRANCH_ENV}", url: "${env.REPO_URL_ENV}"
                            env.PASSED_STAGES = env.PASSED_STAGES.toInteger() + 1
                        } catch (e) {
                            env.FAILURE_REASON = e.getMessage()
                            error("Stage failed: ${env.FAILURE_REASON}")
                        }
                    }
                }
            }

            stage('Approval to Proceed') {
                steps {
                    script {
                        try {
                            input message: "Do you want to proceed with the build?", ok: 'Yes, proceed'
                        } catch (err) {
                            currentBuild.result = 'ABORTED'
                            error("Build aborted by user.")
                        }
                    }
                }
            }

            stage('Install Node.js') {
                steps {
                    script {
                        env.FAILED_STAGE = 'Install Node.js'
                        try {
                            sh '''
                                export NVM_DIR="$HOME/.nvm"
                                if [ ! -s "$NVM_DIR/nvm.sh" ]; then
                                    curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash
                                fi
                                . "$NVM_DIR/nvm.sh"
                                nvm install 16
                                nvm use 16
                                echo "Node version: $(node -v)"
                                echo "NPM version: $(npm -v)"
                            '''
                            env.PASSED_STAGES = env.PASSED_STAGES.toInteger() + 1
                        } catch (e) {
                            env.FAILURE_REASON = e.getMessage()
                            error("Stage failed: ${env.FAILURE_REASON}")
                        }
                    }
                }
            }

            stage('Install Dependencies') {
                steps {
                    script {
                        env.FAILED_STAGE = 'Install Dependencies'
                        try {
                            dir("${env.BUILD_DIR_ENV}") {
                                sh '''
                                    export NVM_DIR="$HOME/.nvm"
                                    . "$NVM_DIR/nvm.sh"
                                    nvm use 16
                                    unset NODE_OPTIONS
                                    npm install
                                '''
                            }
                            env.PASSED_STAGES = env.PASSED_STAGES.toInteger() + 1
                        } catch (e) {
                            env.FAILURE_REASON = e.getMessage()
                            error("Stage failed: ${env.FAILURE_REASON}")
                        }
                    }
                }
            }

            stage('Create and Copy index.html') {
                steps {
                    script {
                        env.FAILED_STAGE = 'Create and Copy index.html'
                        try {
                            sh '''
                                mkdir -p public
                                cat <<EOF > public/index.html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>React App</title>
  </head>
  <body>
    <noscript>You need to enable JavaScript to run this app.</noscript>
    <div id="root"></div>
  </body>
</html>
EOF
                                mkdir -p ${BUILD_DIR_ENV}/public
                                cp public/index.html ${BUILD_DIR_ENV}/public/index.html
                            '''
                            env.PASSED_STAGES = env.PASSED_STAGES.toInteger() + 1
                        } catch (e) {
                            env.FAILURE_REASON = e.getMessage()
                            error("Stage failed: ${env.FAILURE_REASON}")
                        }
                    }
                }
            }

            stage('Run Code Compilation') {
                steps {
                    script {
                        env.FAILED_STAGE = 'Run Code Compilation'
                        try {
                            dir("${env.BUILD_DIR_ENV}") {
                                sh '''
                                    export NVM_DIR="$HOME/.nvm"
                                    . "$NVM_DIR/nvm.sh"
                                    nvm use 16
                                    unset NODE_OPTIONS
                                    CI=false npm run build
                                '''
                            }
                            env.PASSED_STAGES = env.PASSED_STAGES.toInteger() + 1
                        } catch (e) {
                            env.FAILURE_REASON = e.getMessage()
                            error("Stage failed: ${env.FAILURE_REASON}")
                        }
                    }
                }
            }

            stage('Archive Build Artifacts') {
                steps {
                    script {
                        env.FAILED_STAGE = 'Archive Build Artifacts'
                        try {
                            archiveArtifacts artifacts: "build/**"
                            env.PASSED_STAGES = env.PASSED_STAGES.toInteger() + 1
                        } catch (e) {
                            env.FAILURE_REASON = e.getMessage()
                            error("Stage failed: ${env.FAILURE_REASON}")
                        }
                    }
                }
            }
        }
    }
}
