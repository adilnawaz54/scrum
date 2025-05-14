
# POC of Employee-API

![image](https://github.com/user-attachments/assets/75de11da-e895-4a24-a312-ad9824da4d59)


### Author
| Created     | Version | Author        | Modifed | Comment           | Reviewer         |
|-------------|---------|---------------|-------|------------|------------------|
| 25-04-2025  |  V1.1      | Yuvraj Singh | 01-05-2025 | Internal Review   | Siddharth Pawar  |
| 02-05-2025  |  V2.1      | Yuvraj Singh | 07-05-2025 | L0 Review         | Naveen Haswani |
|             |  V3        | Yuvraj Singh |            | L1 Review         | Deepak Nishad |
|             |  V4        | Yuvraj Singh |            | L2 Review         | Ashwani Singh |


## Table of Contents

<details>
<summary>1. Introduction</summary>

- [Introduction](#introduction)  
</details>

<details>
<summary>2. Environment Setup</summary>

- [Pre-requisites](#pre-requisites)  
- [Minimum System Requirements](#minimum-system-requirements)  
- [Important Ports](#important-ports) 

<details>
<summary>➤ Dependencies</summary>

- [Dependencies](#dependencies)  
  - [Buildtime Dependency](#buildtime-dependency)  
  - [Runtime Dependency](#runtime-dependency)

</details>
</details>

<details>
<summary>3. Installation Guide</summary>

- [Step-by-step Installation](#step-by-step-installation)  
  - [Access Server](#access-server)  
  - [Installing Dependencies for employee-api](#installing-dependencies-for-employee-api)  
    - [Go-lang](#go-lang)  
    - [ScyllaDB](#scylladb)  
    - [Redis](#redis)  
    - [Jq](#jq)  
    - [Make](#make)  
    - [Golang-migrate](#golang-migrate)

</details>

<details>
<summary>4. Configuration</summary>

- [Runtime Configuration](#runtime-configuration)  
  - [ScyllaDB Configuration](#scylladb)  
  - [Redis Configuration](#redis)  
- [Create KEYSPACE in Scylla](#create-keyspace-in-scylla)  
- [Redis CLI Permissions](#redis-cli-permissions)

</details>

<details>
<summary>5. Code Setup</summary>

- [Working with employee-api Code Repository](#working-with-employee-api-code-repository)  
  - [Migration Configuration](#migration-configuration)  
  - [Config File Setting](#config-file-setting)  
  - [Configure main.go](#configure-maingo)

</details>

<details>
<summary>6. Testing & Execution</summary>

- [Testing Go Modules](#testing-go-modules)  
- [Executing the API](#executing-the-api)  
- [Validating Execution](#validating-execution)

</details>

<details>
<summary>7. Wrap-up</summary>

- [Conclusion](#conclusion)  
- [Contact](#contact)  
- [References](#references)

</details>


## Introduction

Welcome to the Employee-API POC. Employee REST API is a golang based microservice which is responsible for all the employee related transactions in the OT-Microservices. This application is completely platform independent and can be run on any kind of platform. [For Employee API detailed document refer this document](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-79-Adil/ot-ms-understanding/applications/employee/documentation/README.md).


## Pre-requisites 
The below mentioned are the softwares that we will be using to setup our employee application.
- [ScyllaDB](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-89-Durgesh/ot-ms-understanding/software/database/scylladb/documentation/README.md)
- [Migrate](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/migrate/intro/README.md)
- [Redis](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-85-SHIVANI/ot-ms-understanding/software/middleware/redis/documentation/README.md)
- [Go](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/application/golang/introduction/README.md)
- [Make](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/make/intro/README.md)
- [Jq](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/jq/intro/README.md)

## Minimum System Requirements
| **Requirements** | **Details** |
|---------|---------|
| OS |  Ubuntu 22.4 |
| Vm type | t2 medium |
| Disk space | 15 GB |

## Important Ports
| Port No | Description | Traffic | 
|:----:|:----:| :----: |
|8080 | Employee API port | Inbound |
|22   | SSH | Inbound | 
|9042 | ScyllaDB | Inbound  |
|6379 | Redis | Inbound |

## Dependencies
### Buildtime Dependency
| Buildtime  Dependency  | version |
|:-----------------------:|:--------------------:|
| Golang | >=1.21 |
| Migrate | 4.15.2 |
| Jq    | 1.7  |
| Make  | 4.3  |

### Runtime Dependency
| Runtime Dependency | version |
|:-----------------------:|:--------------------:|
| ScyllaDB | 6.2 |
| Redis | 6.0.16 |


## Step-by-step installation
This guide explains how to set up a virtual machine (VM), install dependencies, configure the database and caching services, and run the `employee-api` application. Follow each step carefully to ensure the application is correctly installed and functioning.

![image](https://github.com/user-attachments/assets/4edb0197-26d2-4239-a077-e5b215728f1a)


### Access server

- *Connect to your server*

```
ssh -i path-to-your .pem key ubuntu@employee-api-public-ip
```
![image](https://github.com/user-attachments/assets/5e8f3e15-d7c9-4644-8926-e8f6761c5e45)

---

## Installing dependencies for employee-api

- *Update your server* [Go to this link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#1-basic-system-commands) and follow `STEP 3. Update and Upgrade Packages`.

---

### Go-lang

- *Install the go-lang package.* [Go to this link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/application/golang/installation/guide/README.md#2-golang-installation-guide-step-by-step-in-ubuntu) and follow `2. Golang Installation Guide (Step by Step) in Ubuntu` for Go-lang installation guide.

---

### ScyllaDB

---

- *Install ScyllaDB* [Go to this link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-88-Adil/common_stack/software/scylladb/installation/README.md#step-by-step-setup-guide)
 for ScyllaDB installation guide.

---

### Redis

---

- *Install redis-server* [Go to this link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-84-PRINCE/common_stack/software/redis/installation/README.md#1-install-redis-server) for Redis-server installation guide.

---

### Jq
---

- *Install jq* [Go to this link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/yuvraj_scrums_38/common_stack/others/jq/sop/README.md#installation-guide) and follow `Installation Guide` for steps to insatall jq.

---

### Make

---

- *Install make* [Go to this link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/make/sop/README.md#installation-on-linux) and follow `Installation on Linux` for make installation.

---

### Golang-migrate

---

- *Install Golang-migrate* [Go to this link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/migrate/sop/README.md#step-by-step-installation-guide) and follow `Step by step installation guide` for golang-migrate installation.
---

## Runtime Configuration

---

### Scylla DB

For scyllaDB configuration [click here](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-88-Adil/common_stack/software/scylladb/configuration/README.md)

---


### Redis

For redis configuration [click here](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-84-PRINCE/common_stack/software/redis/configuration/README.md)

---


## Create KEYSPACE in Scylla

For KEYSPACE creation follow  `Basic Operations` on [this link.](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-88-Adil/ot-ms-understanding/software/database/scylladb/poc/README.md#basic-operations)

---

## Redis CLI permissions

---
1. *Access redis command line interface*

```
redis-cli -h <private-ip>
```

![image](https://github.com/user-attachments/assets/c5580187-e179-4b08-8ae9-4a372aafc977)

---

2. *Configure User Permissions and Authentication*

```
ACL SETUSER scylla on >password ~* +@all
```

![image](https://github.com/user-attachments/assets/c3885161-3206-4ed1-a768-97006f117b5e)

---
3. *List updated ACL rules*

```
ACL LIST
```

![image](https://github.com/user-attachments/assets/30724b10-e091-4bc9-a94e-0b19432d2930)

---

4. *Quit redis cli*
   
```
exit
```

![image](https://github.com/user-attachments/assets/6812490a-4dc1-4cfe-b15a-d74cccdf5566)

---

## Working with employee-api code repository

---

1. *Clone the **employee-api** repository into our local system*

```
git clone https://github.com/OT-MICROSERVICES/employee-api.git  
```
![image](https://github.com/user-attachments/assets/e25dbc1c-32ff-4317-b26d-a788ab8b84eb)

---

2. *Move to **employee api** directory and lists the contents*

### Migration configuration

---

1. *Open the **migration.json** file and replace the IP address with your actual private IP*

![image](https://github.com/user-attachments/assets/5ce9b348-3d77-4df6-8341-ab3ecc7fd115)

---

2. *Execute the **migration.json** file to configure database connection.*

```
make run-migrations
```

![image](https://github.com/user-attachments/assets/6210624d-23ce-45c0-ab72-5d6b8c259f2d)

---

### Config file setting

---

> *Open **config.yaml** file and replace the IP address with your actual private IP for both scylladb and redis. And changed `enabled: true`*

![image](https://github.com/user-attachments/assets/97809e66-94cf-4369-a157-f6f02883e2cc)

---

### Configure main.go

---

> *Open **main.go** replace `localhost` with `<public-ip:8080>`*

![image](https://github.com/user-attachments/assets/1ed2b161-7e20-4fbd-88c4-9e6f62b383f8)

---

## Testing Go modules

---

1. *Perform coverage tests*

```
go test $(go list ./... | grep -v docs | grep -v model | grep -v main.go) -coverprofile cover.out  
```

![image](https://github.com/user-attachments/assets/6dbb8020-5fd7-4e69-9941-2b3e021e0791)
![image](https://github.com/user-attachments/assets/be135a84-f681-4a9f-8e36-916de6251e3a)

---

2. *Generate code coverage report in HTMLformat.*
   
```
go tool cover -html=cover.out
```

![image](https://github.com/user-attachments/assets/200ff568-b2d9-4494-825d-f602a0f4dd65)

---

## Executing the API

- *Run the api*

### Create service file for main.go

> *Opne the file /etc/systemd/system/employee-api.service and paste the below code in it*

```
[Unit]
Description=Employee API Go Service (go run main.go)
After=network.target

[Service]
User=ubuntu
WorkingDirectory=/home/ubuntu/employee-api
ExecStart=/usr/local/go/bin/go run main.go
Restart=on-failure
Environment=GIN_MODE=release

[Install]
WantedBy=multi-user.target

```
![image](https://github.com/user-attachments/assets/2a999418-86d7-4d53-8d03-29077a9235c2)

> *Then run the below [systemctl](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/operating_system/ubuntu/sop/services/README.md#systemctl-commands-explained) commands to start the employee-api service*

```
sudo systemctl daemon-reexec
sudo systemctl daemon-reload
sudo systemctl start employee-api.service
sudo systemctl enable employee-api.service
```

---

## Validating Execution

1. *Open a web browse and access this link.*

```
http://public-ip:8080/swagger/index.html
```

![image](https://github.com/user-attachments/assets/17307432-fd97-4b6e-8ad8-129a40ab7b1a)

2. *Click on post option and then 'try it out'*

![image](https://github.com/user-attachments/assets/aeda53ab-3115-42f2-9136-426017c46c32)

3. *Enter sample data and click on execute*

![image](https://github.com/user-attachments/assets/96081d28-3760-4d72-8c13-e0e276342829)

4. *If the response code is 200 then your data is successfully entered in the database and your setup is running well*

![image](https://github.com/user-attachments/assets/2174fde3-dfc3-4302-9ba5-06a802f30079)


## Conclusion

This Proof of Concept (POC) for the Employee API provides a detailed and structured approach to deploying a scalable and high-performing microservice. The document offers clear guidelines on system requirements, dependencies, and installation steps to ensure a seamless setup process. By leveraging modern technologies like Golang, ScyllaDB, and Redis, the API achieves optimal performance, scalability, and reliability.

## Contact

| Name| Email Address      |
|-----|--------------------------|
| Yuvraj Singh | yuvraj.singh.snaatak@mygurukulam.co |


## References

| Source                                                                                     | Description                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------ |
| [ScyllaDB Installation Guide](https://opensource.docs.scylladb.com/stable/getting-started/install-scylla/install-on-linux.html) | Comprehensive guide for installing ScyllaDB on Linux. |
| [Redis Installation Guide](https://redis.io/docs/latest/operate/oss_and_stack/install/install-redis/) | Step-by-step instructions for installationing Redis. |
| [Application Template ](https://github.com/OT-MICROSERVICES/documentation-template/wiki/Application-Template) | Document format followed from this link   | 
