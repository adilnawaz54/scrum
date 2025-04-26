## Application Template
---

##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 17-04-2025  | V1      | Adil Nawaz    |                    | Pritam           | Internal Reviewer|
| 26-04-2025  | V2.1    | Adil Nawaz    |                    | L0 Reviewer      | Shreya           |


---


# Table of Contents

1. [Introduction](#introduction)  
2. [Pre-requisites](#pre-requisites)  
3. [System Requirements](#system-requirements)  
4. [Dependencies](#dependencies)  
    - [Build Time Dependency](#build-time-dependency)  
    - [Run Time Dependency](#run-time-dependency)  
5. [Important Ports](#important-ports)  
6. [Architecture](#architecture)  
7. [Dataflow Diagram](#dataflow-diagram)  
8. [Step-by-step Installation of [application]](#step-by-step-installation-of-application)  
    - [Step 1: Installation of Software Dependencies](#step-1-installation-of-software-dependencies)  
    - [Step 2: Build/Artifact Generation](#step-2-buildartifact-generation)  
    - [Step 3: Application Deployment](#step-3-application-deployment)  
9. [Contact Information](#contact-information)  
10. [References](#references)

---

## Introduction
This template provides a ready-to-use foundation for building scalable and maintainable applications.  
It helps standardize project setup, speed up development, and ensure clean architecture.

## Pre-requisites
Before diving into application deployment, let’s ensure your system meets basic hardware requirements and has necessary tools like Git, Docker, and language runtimes installed. 

## System Requirements

| Hardware Specifications | Minimum Recommendation |
|-------------------------|------------------------|
| Processor                | Dual Core                        |
| Ram                      | 4GB                       |
| Disk                     | 20GB                       |
| OS                       | Ubuntu(22.04)     |

## Dependencies

### Build Time Dependency

| Name                    | Version                | Description |
|-------------------------|------------------------|-------------|
|  <application>          | <version>              |<Description>|
|  <application>          | <version>              |<Description>|


### Run Time Dependency

| Name                    | Version                | Description |
|-------------------------|------------------------|-------------|
|  <application>          | <version>              |<Description>|
|  <application>          | <version>              |<Description>|



### Important Ports

| Inbound Traffic         | Description |
|-------------------------|------------------------|
| 8080          | used by Tomcat-server            |


| Outbon Traffic         | Description |
|-------------------------|------------------------|
| 9042          | used by ScyllaDB            |


## Architecture

![application architecture](https://github.com/user-attachments/assets/2a408d66-aeaa-4741-929b-3129dcbcde24)



## Dataflow Diagram

Explain the flow of the data in this diagram. How the data is traveling/flowing in this application.

---

## Step-by-step installation of [application]

### Step1: Installation of software Dependencies
> 👉 **Follow Documentation**: [Software Installation](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_71/templates/documentation_template/software_template/README.md)

**Build Dependency**
   - Add the command used to install the dependency in code snippet format. [command]

**Run time Dependency**
   - Add the command used to install the dependency in code snippet format. [command]

**Other Dependency**
   - These are the dependencies specific to integration of your application with 3rd party application.

### Step2: Build/Artifact Generation

#### 1. Clone the repository
```bash
git clone <repository-url>
cd <repository-folder>
```

#### 2. Run Database Migrations
Running make run-migrations will create the employee table automatically in your ScyllaDB instance.
```bash
make run-migrations
```
This creates tables, keyspaces, etc., in **<database>** based on your migration scripts.


#### 3. Build the application
You compile the Go code into a binary (executable file):
```bash
make build
```
or manually:
```bash
go build -o <application-api>
```

### Step3: Application Deployment
  - Deploy the software artifact. [command] by starting the application so it is up and running on a server.

  - Ensure the application deployed is in working state [command] by hitting the URL or using curl command

---

## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |


## References

| **Title**                        | **Link**                                                                                      |
|----------------------------------|-------------------------------------|
| Ubuntu Official Documentation  | (https://help.ubuntu.com)          |
| Ubuntu Releases List           | (https://wiki.ubuntu.com/Releases) |






















