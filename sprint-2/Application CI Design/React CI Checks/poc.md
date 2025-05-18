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
We are preparing this document so that we can easily provide a completed guide to step code compilation which is designed in React to manage Frontend-api information.

  
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

##  Pre-Requisites

- Node.js and npm Installed
- Build Script in package.json
- Install Project Dependencies
- Troubleshooting Tools

## System Requirements

| Component        | Minimum Requirement           |
|------------------|-------------------------------|
| OS               | Ubuntu or other Linux-based   |
| Disk Space       | 8 GB                         |
| RAM              | 2 GB                          |
| Processor        | Single-core                     |
| Instance Type    | t2.small                      |




## Ports Required

| Port | Used By     | Description                                      |
|------|-------------|--------------------------------------------------|
| 22   | SSH         | Used for secure remote login and VM access.     |
| 3000 | React App   | Default port used by React development server.  |

##  Architecture
<img width="656" alt="image" src="https://github.com/user-attachments/assets/0a2f0273-2903-497f-ba46-a29d69faac2c">

The Frontend Web is the primary user interface for the OT-Microservices stack. It is a ReactJS-based application that allows users to interact with the system through a web browser. Built using the ReactJS framework, it provides a fast, responsive, and dynamic UI that can handle complex user interactions with minimal loading times.

##  Step-by-step Installation

### Step 1. Clone the repo
git clone https://github.com/OT-MyGurukulam/frontend.git
cd frontend

### Step 2. Install Node.js
sudo apt update
curl -fsSL https://deb.nodesource.com/setup_16.x | sudo -E bash -
sudo apt install -y nodejs

### Step 3. Install dependencies
npm ci

### Step 4. Build the code
npm run build

### Step 5. Validate build output
test -d build && echo "✅ Build successful" || echo "❌ Build failed"


## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

## 📚 References
| Links | Descriptions|
|------|---------------------|
| Document||


