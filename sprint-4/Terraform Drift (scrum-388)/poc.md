# Terraform Drift POC

 
##  **Author Information**
| Last Updated | Version | Author          | Comment           | Reviewer |
|--------------|---------|------------------|-------------------|----------|
| 23-06-2025   | V1.0    | Adil Nawaz   | Internal Review   | Pritam   |
| 00-06-2025   | V2.0    | Adil Nawaz   | L0                | Shreya   |
| 00-06-2025   | V3.0    | Adil Nawaz   | L1               | Abhishek V   |


## Introduction
This documentation is about Drift detection, how Terraform detects drift between the declared infrastructure (.tf files) and actual state in the cloud.

## System Requirements

| Component        | Minimum Requirement           |
|------------------|-------------------------------|
| OS               | Ubuntu or other Linux-based   |
| Disk Space       | 8 GB                         |
| RAM              | 2 GB                          |
| Processor        | Single-core                     |
| Instance Type    | t2.small                      |

## Prerequisites

| **Category**                    | **Requirement**                                                                    |
| ------------------------------- | ---------------------------------------------------------------------------------- |
| **Terraform Setup**             | Terraform CLI installed (v1.0+ recommended)                                        |
| **Cloud Provider**              | A configured cloud account (e.g., AWS, Azure, GCP) with sufficient permissions     |
| **Authentication**              | Access credentials configured (`aws configure`, environment variables, etc.)       |
| **Infrastructure Code**         | A valid Terraform project with `.tf` files and at least one resource defined       |
| **State Management**            | Proper handling of the Terraform state file (`terraform.tfstate`)                  |
| **Remote State )**     | Use of remote backend like S3 + DynamoDB (for locking and collaboration)           |
| **Manual Access**               | Console/portal access to manually change resources (to simulate drift)             |


## Ports Required

| Port | Used By     | Description                                      |
|------|-------------|--------------------------------------------------|
| 22   | SSH         | Used for secure remote login and VM access.     |


## Commands to setup

### 1. Update Package Index

**Follow Step 3 here**: [Ubuntu Basic System Commands](https://github.com/snaatak-Downtime-Crew/Documentation/tree/main/common_stack/operating_system/ubuntu/sop/commoncommands#1-basic-system-commands)


### 2.  Install Terraform 
```
sudo apt-get install -y gnupg software-properties-common curl
```
#### Add HashiCorp GPG key
```
curl -fsSL https://apt.releases.hashicorp.com/gpg | sudo gpg --dearmor -o /usr/share/keyrings/hashicorp-archive-keyring.gpg
```
#### Add HashiCorp repo
```
echo "deb [signed-by=/usr/share/keyrings/hashicorp-archive-keyring.gpg] https://apt.releases.hashicorp.com $(lsb_release -cs) main" | \
  sudo tee /etc/apt/sources.list.d/hashicorp.list
```
#### Install Terraform
```
sudo apt update && sudo apt install terraform
```
#### Check version
```
terraform version
```
![image](https://github.com/user-attachments/assets/492ff6c7-33f0-4963-b728-ac9c87039941)


### 3. Create an Infra using Terraform

#### Create Terraform module
![image](https://github.com/user-attachments/assets/b521183e-c5e8-4af5-b9d9-f276f47dfb9c)

### 4. Run Terraform Commands

```
terraform init  
```
It initializes a working directory that contains Terraform configuration files. 
- Downloads the necessary provider plugins (e.g., AWS, Azure, Google Cloud).
- Sets up the remote backend (like S3, local, etc.) for storing the state file.
- Sets up the .terraform/ directory for use with plan, apply, etc.

Terraform creates a .terraform folder which contains:
Provider binaries
Backend configuration
Lock file (.terraform.lock.hcl) to pin plugin versions
![image](https://github.com/user-attachments/assets/a42de243-40fc-4007-af1e-c4e4c0deac3e)

```
terraform validate
```
It validates that your configuration files are syntactically and logically correct.
![image](https://github.com/user-attachments/assets/91d44caf-b3f2-446a-8ece-d2ee1889f08a)

```
terraform plan 
```
Shows what changes Terraform will make to match your config with the actual infrastructure 
![Screenshot 2025-06-23 123016](https://github.com/user-attachments/assets/97b90430-e2c0-434c-b027-3ec3df14ef6a)

```
terraform apply -auto-approve
```
![image](https://github.com/user-attachments/assets/7020227f-ff4b-48a6-8ada-af0db1abf7a7)


## Conclusion

Use terraform plan -detailed-exitcode in Jenkins. It is:
Simple
Fast to integrate
Free
CI/CD-friendly
No new tools to maintain

## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

### References
| Links                                             | Descriptions                                                    |
|---------------------------------------------------|-----------------------------------------------------------------|
|[Link](https://www.gitkraken.com/learn/git/tutorials/what-is-a-pull-request-in-git) |Documentation |

















