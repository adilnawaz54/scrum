folder('scylla-CI-CD') { 
    displayName('scylla-CI-CD') 
    description('Contains ScyllaDB CI-CD')
}

folder('scylla-CI-CD/CI') { 
    displayName('CI') 
    description('CI deployments')
}



// Pipeline job for CI-Scylla
pipelineJob("scylla-CI-CD/CI/scylla-role") {
    description("Deploys/Destroys Deploy-instance using scylla-CI-CD.")
    
    parameters {
        stringParam('BRANCH_NAME', 'SCRUMS-450-Adil', 'Git branch to use')
       
    }
    
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Downtime-Crew/jenkins-pipeline.git')
                        credentials('downtime_github')
                    }
                   branches('*/${BRANCH_NAME}')
                }
            }
            scriptPath("Scylla-CI/role/Jenkinsfile")
        }
    }
}
println "✔︎ Pipeline job created → scylla-CI-CD/CI/scylla-role"
