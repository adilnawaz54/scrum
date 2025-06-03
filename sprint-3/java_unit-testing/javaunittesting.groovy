def call(Map config = [:]) {
    def repoUrl = config.repoUrl ?: 'https://github.com/snaatak-Downtime-Crew/salary-api.git'
    def branch = config.branch ?: 'main'
    def credentialsId = config.credentialsId ?: 'downtime_github'
    def emailRecipient = config.emailRecipient ?: 'adilnawaz54@gmail.com'

    pipeline {
        agent any

        tools {
            maven 'maven3.9.9'
            jdk 'JDK_17'
        }

        environment {
            EMAIL_RECIPIENT = "${emailRecipient}"
        }

        stages {
            stage('Clean Workspace') {
                steps {
                    cleanWs()
                }
            }

            stage('Checkout Code') {
                steps {
                    git credentialsId: "${credentialsId}",
                        url: "${repoUrl}", branch: "${branch}"
                }
            }

            stage('Build & Run Unit Tests') {
                steps {
                    sh 'mvn clean test'
                }
            }

            stage('Publish Test Results') {
                steps {
                    script {
                        def reportExists = fileExists './target/surefire-reports/TEST-*.xml'
                        if (reportExists) {
                            junit './target/surefire-reports/*.xml'
                        } else {
                            echo 'No test reports found. Skipping report publishing.'
                        }
                    }
                }
            }
        }

        post {
            success {
                echo "Unit testing completed successfully."
                mail to: "${env.EMAIL_RECIPIENT}",
                    subject: "Jenkins Job Success: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                    body: "The Unit testing job has completed successfully.\n\nCheck the job: ${env.BUILD_URL}"
            }

            failure {
                echo "Unit testing failed."
                mail to: "${env.EMAIL_RECIPIENT}",
                    subject: "Jenkins Job Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                    body: "The Unit testing job has failed.\n\nCheck the logs: ${env.BUILD_URL}"
            }

            always {
                echo "Pipeline execution completed."
            }
        }
    }
}
