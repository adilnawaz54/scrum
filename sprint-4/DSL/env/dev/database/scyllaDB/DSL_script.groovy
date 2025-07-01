folder('terraform') { 
    displayName('Terraform') 
    description('Contains all Terraform infrastructure deployment jobs')
}

folder('terraform/env') { 
    displayName('env') 
    description('Environment specific deployments')
}

folder('terraform/env/dev') { 
    displayName('dev') 
    description('Development environment deployments')
}

folder('terraform/env/dev/databases') { 
    displayName('database') 
    description('Database specific deployments')
}

folder('terraform/env/dev/databases/scylladb') { 
    displayName('scylladb')
    description('Scylladb database deployments')
}

// Pipeline job for Deploy-instance
pipelineJob("terraform/env/dev/applications/scylladb/Deploy-instance") {
    description("Deploys/Destroys Deploy-instance using Terraform.")
    
    parameters {
        stringParam('BRANCH_NAME', 'SCRUMS-442-Adil', 'Git branch to use')
        choiceParam('ACTION', ['apply', 'destroy'], 'Choose apply to create infra or destroy to remove it.')
    }
    
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Downtime-Crew/terraform.git')
                        credentials('downtime_github')
                    }
                   branches('*/${BRANCH_NAME}')
                }
            }
            scriptPath("env/dev/databases/scylladb/instance/Jenkinsfile")
        }
    }
}
println "✔︎ Pipeline job created → terraform/env/dev/databases/scylladb/Deploy-instance"

// Pipeline job for Deploy-security-group
pipelineJob("terraform/env/dev/databases/scylladb/Deploy-security-group") {
    description("Deploys/Destroys Deploy-security-group using Terraform.")
    
    parameters {
        stringParam('BRANCH_NAME', 'SCRUMS-443-Adil', 'Git branch to use')
        choiceParam('ACTION', ['apply', 'destroy'], 'Choose apply to create infra or destroy to remove it.')
    }
    
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Downtime-Crew/terraform.git')
                        credentials('downtime_github')
                    }
                    branches('*/${BRANCH_NAME}')
                }
            }
            scriptPath("env/dev/databases/scylladb/security-group/Jenkinsfile")
        }
    }
}
println "✔︎ Pipeline job created → terraform/env/dev/databases/scylladb/Deploy-security-group"
