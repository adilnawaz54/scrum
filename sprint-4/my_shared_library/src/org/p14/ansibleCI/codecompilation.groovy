package org.p14.ansibleCI

def call(String buildDirectory = '.') {
    stage("React: Install Dependencies") {
        script {
            dir(buildDirectory) {
                sh 'npm install'
            }
        }
    }

    stage("React: Code Compilation") {
        script {
            dir(buildDirectory) {
                sh 'npm run build'
            }
        }
    }
}
