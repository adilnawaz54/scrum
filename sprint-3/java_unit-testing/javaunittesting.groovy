def call(Map config = [:]) {
    pipeline {
        agent any

        tools {
            maven 'maven3.9.9'
            jdk 'JDK_17'
        }

        stages {
            stage('Initialize') {
                steps {
                    script {
                        env.EMAIL_RECIPIENT = config.email ?: 'adilnawaz54@gmail.com'
                        env.SLACK_CHANNEL = config.slackChannel ?: 'notificationn-channel'
                        env.SLACK_CREDENTIAL_ID = config.slackCredentialId ?: 'downtime-crew'
                        env.REPO_URL = config.repoUrl ?: 'https://github.com/snaatak-Downtime-Crew/salary-api.git'
                    }
                }
            }

            stage('Clean Workspace') {
                steps {
                    cleanWs()
                }
            }

            stage('Checkout Code') {
                steps {
                    git credentialsId: 'downtime_github',
                        url: "${env.REPO_URL}", branch: 'main'
                }
            }

            stage('Approval to Proceed') {
                steps {
                    script {
                        def userInput = input message: "Do you want to proceed with Build & Unit Test?", ok: "Approve"
                        echo "Approved by: ${userInput}"
                    }
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

            stage('Archive Test Reports') {
                steps {
                    archiveArtifacts artifacts: 'target/surefire-reports/**/*.*', fingerprint: true
                }
            }
        }

        post {
            success {
                script {
                    def triggeredBy = currentBuild.getBuildCauses()?.shortDescription ?: "Timer/SCM/Event"
                    def result = "SUCCESS"
                    def reportUrl = "${env.BUILD_URL}artifact/target/surefire-reports/"
                    def message = """*Job:* ${env.JOB_NAME}
*Build:* #${env.BUILD_NUMBER}
*Triggered by:* ${triggeredBy}
*Result:* ${result}
*Jenkins URL:* ${env.BUILD_URL}
*GitHub URL:* ${env.REPO_URL}
*Test Report:* ${reportUrl}"""

                    echo "Unit testing completed successfully."

                    mail to: "${env.EMAIL_RECIPIENT}",
                         subject: "Jenkins Job Success: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                         body: message

                    slackSend (
                        channel: "${env.SLACK_CHANNEL}",
                        color: 'good',
                        message: "${message}"
                    )
                }
            }

            failure {
                script {
                    def triggeredBy = currentBuild.getBuildCauses()?.shortDescription ?: "Timer/SCM/Event"
                    def result = "FAILURE"
                    def reportUrl = "${env.BUILD_URL}artifact/target/surefire-reports/"
                    def message = """*Job:* ${env.JOB_NAME}
*Build:* #${env.BUILD_NUMBER}
*Triggered by:* ${triggeredBy}
*Result:* ${result}
*Jenkins URL:* ${env.BUILD_URL}
*GitHub URL:* ${env.REPO_URL}
*Test Report:* ${reportUrl}"""

                    echo "Unit testing failed."

                    mail to: "${env.EMAIL_RECIPIENT}",
                         subject: "Jenkins Job Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                         body: message

                    slackSend (
                        channel: "${env.SLACK_CHANNEL}",
                        color: 'danger',
                        message: "${message}"
                    )
                }
            }

            aborted {
                script {
                    def triggeredBy = currentBuild.getBuildCauses()?.shortDescription ?: "Timer/SCM/Event"
                    def result = "ABORTED"
                    def reportUrl = "${env.BUILD_URL}artifact/target/surefire-reports/"
                    def message = """*Job:* ${env.JOB_NAME}
*Build:* #${env.BUILD_NUMBER}
*Triggered by:* ${triggeredBy}
*Result:* ${result}
*Jenkins URL:* ${env.BUILD_URL}
*GitHub URL:* ${env.REPO_URL}
*Test Report:* ${reportUrl}"""

                    echo "Pipeline was aborted by user."

                    mail to: "${env.EMAIL_RECIPIENT}",
                         subject: "Jenkins Job Aborted: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                         body: message

                    slackSend (
                        channel: "${env.SLACK_CHANNEL}",
                        color: 'warning',
                        message: "${message}"
                    )
                }
            }

            always {
                echo "Pipeline execution completed."
            }
        }
    }
}
