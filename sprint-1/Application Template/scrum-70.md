# Application Template
---

##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 17-04-2025  | V1      | Adil Nawaz    | 17-04-2025        | Internal Reviewer| Pritam        |
| 26-04-2025  | V2.1    | Adil Nawaz    | 28-04-2025         | L0 Reviewer      | Shreya           |
| 00-05-2025  | V3    | Adil Nawaz    | 00-05-2025         | L1 Reviewer      | Abhiskek           |


---


## Table of Contents

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

| Name          | Version   | Description                                     |
|---------------|-----------|-------------------------------------------------|
| Go (Golang)   | 1.20+     | Programming language used to build the API.     |
| jq            | 1.6       | Command-line tool for processing JSON data.     |
| Migrate       | v4.15+    | Database migration tool for managing schemas.   |
| Git           | 2.34+     | Version control tool used for code repository.  |


### Run Time Dependency

| Name           | Version   | Description                                    |
|----------------|-----------|------------------------------------------------|
| Redis          | 7.2+      | In-memory database used for caching.           |
| ScyllaDB       | 5.4+      | Primary NoSQL database for storing employee data. |
| Swagger UI     | 4.15+     | API documentation tool for testing and exploring REST APIs. |
| Linux OS (Ubuntu) | 22.04 LTS | Operating system environment where the app runs. |



### Important Ports

| Inbound Traffic         | Description |
|-------------------------|------------------------|
| 8080          | used by Tomcat-server            |


| Outbon Traffic         | Description |
|-------------------------|------------------------|
| 9042          | used by ScyllaDB            |


## Architecture
![application architecture](https://github.com/user-attachments/assets/10e380ab-6d1a-4fa5-b7d2-8578157097eb)





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

Clone the git repository [commands]

Run the following command inside the directory to build your software artifact. [commands]


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
| Ubuntu Official Documentation  | [Ubuntu Documentation](https://help.ubuntu.com)          |
| Ubuntu Releases List           | [Ubuntu Releases](https://wiki.ubuntu.com/Releases) |




















