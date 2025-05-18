#  Proof of Concept (POC) for Code Compilation for Golang
<img width="469" alt="image" src="https://github.com/user-attachments/assets/dbf5f68b-df66-4122-8e6f-bd5f7099636a" />


 ##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 18-05-2025  | V1      | Adil Nawaz    |        | Internal Reviewer| Pritam        |
| 18-05-2025  | V2    | Adil Nawaz    |          | L0 Reviewer      | Shreya           |
| 18-05-2025  | V3    | Adil Nawaz    |          | L1 Reviewer      | Abhiskek V         |
| 18-05-2025  | V3    | Adil Nawaz    |          | L2 Reviewer      | Abhiskek D         |


## 🔍 Purpose
We are preparing this document so that we can easily provide a completed guide to step code compilation which is designed in GoLang to manage employee-api information.

  
## 📑 Table of Contents
- [Introduction](#introduction)
- [⚙️ Pre-Requisites](#-pre-requisites)
- [🖥️ System Requirements](#-system-requirements)
- [🛠️ Build-Time Dependency](#-build-time-dependency)
- [🚀 Run-Time Dependency](#-run-time-dependency)
- [🌐 Important Ports](#-important-ports)
- [🏗️ Architecture](#-architecture)
- [📥 Step-by-step Installation](#-step-by-step-installation)
- [📝Conclusion](#conclusion)
- [📧 Contact Information ](#-contact-information )
- [📚 References](#-references )


## Introduction 
* This document will guide you through a Proof of Concept (PoC) for setting up and compiling . We will cover the necessary prerequisites, dependency, Architecture as well as the basic project structure.

## ⚙ Pre-Requisites

- Go installed on your machine.
- Familiarity with Go modules.

## 🖥 System Requirements
| Hardware Specifications | Minimum Requirement  |
|--------------------------|------------------------|
| Processor                | dual-core              |
| RAM                      | 4 GB                    |
| Disk                     |10 GB free disk space                  |
| OS                       | Ubuntu 22.04 LTS         |


## 🛠 Build-Time Dependency

| 🛠️ Name | 📦 Version | 📄 Description |
|---------|------------|----------------|
| **Go modules** | 1.20      | Make sure your Go project uses Go modules (go.mod and go.sum) for dependency management. |


## 🚀 Run-Time Dependency

| 🚀 Name | 📦 Version | 📄 Description          |
|---------|------------|--------------------------|
| **ScyllaDB** |  6.1.1  | ScyllaDB is a NoSQL database being utilized as the primary database in the employee application |

## 🌐 Important Ports

| 🔌 Inbound Traffic | 📄 Description           |
|--------------------|--------------------------|
| **9042**           | Used by ScyllaDB |


## 🏗 Architecture
![image](https://github.com/user-attachments/assets/cefdb377-0f61-4c43-afdc-596a4a9f1b55)
- Go Source: This represents the source code written in the Go programming language. It’s the initial code that you write and save in .go files.
  
- Compiler: The compiler is a tool that translates the Go source code into machine code. Within the compiler, there’s a step labeled “asm” which stands for assembly. This step converts the high-level Go code into assembly language, a low-level representation of the code that is closer to machine language.
  
- Executable Binary: The final output of the compilation process is the executable binary. This is the machine code that the computer can directly execute. 
## 📥 Step-by-step Installation

## Install git
```
sudo apt install git
```
### 📂 Step 1: Clone the Git Repository
```
https://github.com/OT-MICROSERVICES/employee-api.git
```

### Step 2: Change Directory
Change Directory to where your code is
```
cd employee-api
```

### Step 3: Code Compilation
This command compiles the source code of the project according to the settings defined in the main.go file.
- **go build:** This command compiles the Go source code in the current directory and produces an executable binary.
If successful, it will create a binary file named employee-api.
```
go build
```
- **./employee-api:** This command executes the binary that was created by the go build command.
The ./ indicates that the binary is located in the current directory.
Running this command starts the employee API service, making it ready to handle requests.

```
./employee-api
```
![ccsuccess](https://github.com/user-attachments/assets/3089ecee-144a-4fc4-a54d-fec1eff6539f)

- Compilation Successful: The Go source code has been successfully compiled into an executable binary named employee-api. The service is now ready to be executed and handle incoming requests. 


## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

## 📚 References
| Links | Descriptions|
|------|---------------------|
| Document|https://github.com/mygurukulam-p10/Documention/blob/main/Application%20CI%20Design/GoLang%20CI%20Checks/Code%20compilation%20Doc/readme.md|

