#  Proof of Concept (POC) for Code Compilation ReactJS
<img width="469" alt="image" src="https://github.com/user-attachments/assets/dbf5f68b-df66-4122-8e6f-bd5f7099636a" />


 ##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 18-05-2025  | V1      | Adil Nawaz    |        | Internal Reviewer| Pritam        |
| 18-05-2025  | V2    | Adil Nawaz    |          | L0 Reviewer      | Shreya           |
| 18-05-2025  | V3    | Adil Nawaz    |          | L1 Reviewer      | Abhiskek V         |
| 18-05-2025  | V3    | Adil Nawaz    |          | L2 Reviewer      | Abhiskek D         |

 



# Table of Contents

1. [Introduction](#introduction)
2. [Pre-Requisites](#pre-requisites)
3. [System Requirements](#system-requirements)
4. [Ports Required](#ports-required)
5. [Architecture](#architecture)
6. [Step-by-step Installation](#step-by-step-installation)
   1. [Step 1. Clone the repo](#step-1-clone-the-repo)
   2. [Step 2. Install Node.js](#step-2-install-nodejs)
   3. [Step 3. Install dependencies](#step-3-install-dependencies)
   4. [Step 4. Build the code](#step-4-build-the-code)
   5. [Step 5. Validate build output](#step-5-validate-build-output)
7. [Contact Information](#contact-information)
8. [References](#references)

---




## Introduction 
* This document will guide you through a Proof of Concept (PoC) for setting up and compiling . We will cover the necessary prerequisites, dependency, Architecture as well as the basic project structure.

##  Pre-Requisites

- Node.js and npm Installed
- Build Script in package.json
- Install Project Dependencies


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

![react](https://github.com/user-attachments/assets/d6d47556-fb74-4930-8cfb-565ff62d6c35)


The Frontend Web is the primary user interface for the OT-Microservices stack. It is a ReactJS-based application that allows users to interact with the system through a web browser. Built using the ReactJS framework, it provides a fast, responsive, and dynamic UI that can handle complex user interactions with minimal loading times.

##  Step-by-step Installation

### Step 1. Clone the repo


![Screenshot 2025-05-19 005718](https://github.com/user-attachments/assets/65a5a618-ad00-480e-b6f8-c3a9a7b10f0c)

### Step 2. Install Node.js
```
curl -fsSL https://deb.nodesource.com/setup_16.x | sudo -E bash -
sudo apt install -y nodejs
```
### Step 3. Install dependencies

![Screenshot 2025-05-19 013717](https://github.com/user-attachments/assets/02dd3050-a6af-41d3-880e-c5e1f48a7294)

### Step 4. Build the code

![Screenshot 2025-05-19 014033](https://github.com/user-attachments/assets/a97b43cc-e18b-4083-b571-d4d745a6a39e)

### Step 5. Validate build output
![Screenshot 2025-05-19 014838](https://github.com/user-attachments/assets/b294a7bf-d5e0-42da-8f80-13274d784a53)



## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

## References
| Descriptions | Link|
|------|---------------------|
| ReactJS| [Link](https://www.tutorialspoint.com/reactjs/reactjs_architecture.htm)|


