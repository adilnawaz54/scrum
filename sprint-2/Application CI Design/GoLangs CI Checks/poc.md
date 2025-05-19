#  Proof of Concept (POC) for Code Compilation for Golang
![golang](https://github.com/user-attachments/assets/e431582b-cce1-48e9-9e95-ad8a47625b4d)


 ##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 18-05-2025  | V1      | Adil Nawaz    |        | Internal Reviewer| Pritam        |
| 18-05-2025  | V2    | Adil Nawaz    |          | L0 Reviewer      | Shreya           |
| 18-05-2025  | V3    | Adil Nawaz    |          | L1 Reviewer      | Abhiskek V         |
| 18-05-2025  | V3    | Adil Nawaz    |          | L2 Reviewer      | Abhiskek D         |



  
Here’s a **Table of Contents (ToC)** you can add at the top of your document:

---

##  Table of Contents

1. [Introduction](#introduction)  
2. [Pre-Requisites](#pre-requisites)  
3. [System Requirements](#system-requirements)  
4. [Build-Time Dependency](#build-time-dependency)  
5. [Run-Time Dependency](#run-time-dependency)  
6. [Important Ports](#important-ports)  
7. [Step-by-step Installation](#step-by-step-installation)  
   - [Step 1: Check the Go version](#step-1-check-the-go-version)  
   - [Step 2: Install Go (if not installed)](#step-2-if-not-installed-install-go)  
   - [Step 3: Clone the Git Repository](#step-3-clone-the-git-repository)  
   - [Step 4: Change Directory](#step-4-change-directory)  
   - [Step 5: Code Compilation](#step-5-code-compilation)  
8. [Contact Information](#contact-information)  
9. [References](#references)  

---


## Introduction 
* This document will guide you through a Proof of Concept (PoC) for setting up and compiling . We will cover the necessary prerequisites, dependency as well as the basic project structure.

##  Pre-Requisites

- Go installed on your machine.
- Familiarity with Go modules.

##  System Requirements
| Hardware Specifications | Minimum Requirement  |
|--------------------------|------------------------|
| Processor                | dual-core              |
| RAM                      | 4 GB                    |
| Disk                     |10 GB free disk space                  |
| OS                       | Ubuntu 22.04 LTS         |


##  Build-Time Dependency

|  Name |  Version |  Description |
|---------|------------|----------------|
| **Go modules** | 1.20      | Make sure your Go project uses Go modules (go.mod and go.sum) for dependency management. |


##  Run-Time Dependency

|  Name |  Version |  Description          |
|---------|------------|--------------------------|
| **ScyllaDB** |  6.1.1  | ScyllaDB is a NoSQL database being utilized as the primary database in the employee application |

##  Important Ports

| 🔌 Inbound Traffic | 📄 Description           |
|--------------------|--------------------------|
| **9042**           | Used by ScyllaDB |

 
##  Step-by-step Installation
###  Step 1: Check the Go version
```
go version
```
###  Step 2: If not installed, install Go

![Screenshot 2025-05-19 130604](https://github.com/user-attachments/assets/9fcdbdf5-1b82-429a-b3ca-1c405a30ba2e)


###  Step 3: Clone the Git Repository
![Screenshot 2025-05-19 125951](https://github.com/user-attachments/assets/142c27e4-04b3-4d31-bb8c-69a1a81a4b96)


### Step 4: Change Directory
![Screenshot 2025-05-19 130011](https://github.com/user-attachments/assets/8c12d93f-ba48-49bf-b8cc-6b3c8dbaf993)

### Step 5: Code Compilation
This command compiles the source code of the project according to the settings defined in the main.go file.
- **go build:** This command compiles the Go source code in the current directory and produces an executable binary.
If successful, it will create a binary file named employee-api.
![Screenshot 2025-05-19 155054](https://github.com/user-attachments/assets/affa0535-999b-4898-b0d3-26b8df47cd6a)

- **./employee-api:** This command executes the binary that was created by the go build command.
The ./ indicates that the binary is located in the current directory.
Running this command starts the employee API service, making it ready to handle requests.

```
./employee-api
```
![Screenshot 2025-05-19 155552](https://github.com/user-attachments/assets/e7598818-40ea-4ccf-82f6-64cfa37519e2)


- Compilation Successful: The Go source code has been successfully compiled into an executable binary named employee-api. The service is now ready to be executed and handle incoming requests. 


## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

##  References
| Description | Links|
|------|---------------------|
| Document|[Link](https://github.com/mygurukulam-p10/Documention/blob/main/Application%20CI%20Design/GoLang%20CI%20Checks/Code%20compilation%20Doc/readme.md)|
