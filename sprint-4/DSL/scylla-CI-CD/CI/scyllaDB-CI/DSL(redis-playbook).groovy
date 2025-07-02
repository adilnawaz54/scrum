folder('redis-CI-CD') { 
    displayName('redis-CI-CD') 
    description('Contains redisDB CI-CD')
}

folder('redis-CI-CD/CI') { 
    displayName('CI') 
    description('CI deployments')
}


// Pipeline job for CI-redis
pipelineJob("redis-CI-CD/CI/redis-playbook") {
    description("Deploys/Destroys Deploy-instance using redis-CI-CD.")
    
    parameters {
        stringParam('BRANCH_NAME', 'SCRUMS-464-Adil', 'Git branch to use')
       
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
            scriptPath("Redis-CI/Playbook/Jenkinsfile")
        }
    }
}
println "✔︎ Pipeline job created → redis-CI-CD/CI/redis-playbook"
