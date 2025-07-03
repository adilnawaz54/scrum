folder('Redis-CI-CD') { 
    displayName('Redis-CI-CD') 
    description('Contains redisDB CI-CD')
}

folder('Redis-CI-CD/CI') { 
    displayName('CI') 
    description('CI deployments')
}



// Pipeline job for CI-redis
pipelineJob("Redis-CI-CD/CI/redis-role") {
    description("Creating job for Redis CI.")
    
    parameters {
        stringParam('BRANCH_NAME', 'SCRUMS-462-Adil', 'Git branch to use')
       
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
            scriptPath("Redis-CI/Role/Jenkinsfile")
        }
    }
}
println "✔︎ Pipeline job created → Redis-CI-CD/CI/redis-role"
