def call(Map config = [:]) {
    def REPO_URL = config.repoUrl ?: 'https://github.com/OT-MyGurukulam/frontend.git'
    def BRANCH = config.branch ?: 'main'
    def BUILD_DIR = config.buildDir ?: 'frontend'
    def EMAIL = config.email ?: 'adilnawaz54@gmail.com'

    node {
        try {
            stage('Clean Workspace') {
                cleanWs()
            }

            stage('Checkout Code') {
                git branch: BRANCH, url: REPO_URL
            }

            stage('Install Node.js') {
                sh '''
                    if command -v node > /dev/null 2>&1; then
                        echo "Node.js is already installed, skipping installation."
                    else
                        echo "Node.js not found, installing..."
                        curl -fsSL https://deb.nodesource.com/setup_16.x | sudo -E bash -
                        sudo apt-get install -y nodejs
                    fi
                '''
            }

            stage('Install Dependencies') {
                dir(BUILD_DIR) {
                    sh 'npm install'
                }
            }

            stage('Create public/index.html') {
                sh '''
                    mkdir -p public
                    cat > public/index.html <<EOF
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
                '''
            }

            stage('Run Code Compilation') {
                dir(BUILD_DIR) {
                    sh 'CI=false npm run build'
                }
            }

            stage('Archive Build Artifacts') {
                archiveArtifacts artifacts: 'build/**'
            }

            mail to: EMAIL,
                 subject: " Build Successful: ${env.JOB_NAME} [${env.BUILD_NUMBER}]",
                 body: "The Jenkins job completed successfully.\nCheck details: ${env.BUILD_URL}"
        } catch (err) {
            mail to: EMAIL,
                 subject: " Build Failed: ${env.JOB_NAME} [${env.BUILD_NUMBER}]",
                 body: "Please check the Jenkins job for failure details:\n${env.BUILD_URL}"

            error("Build failed: ${err}")
        }
    }
}
