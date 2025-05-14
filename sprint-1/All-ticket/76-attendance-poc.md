## **Attendance API Documentation for Setup & Run the attendance application**

<p align="center">
  <img src="https://5.imimg.com/data5/SELLER/Default/2022/3/DZ/AG/TW/32094369/attendance-management-software-1000x1000.png" alt="Attendance Logo" width="200"/>
</p>

## **Author Information**

| Created     | Last updated | Version | Author         | Level | Reviewer        |
|-------------|--------------|---------|----------------|-------|-----------------|
| 25-04-2025  | 02-05-2025    | V1.1  | Shivani Narula  | Internal Review | Siddharth Pawar |
| 02-04-2025  | 09-05-2025    | V2.1  | Shivani Narula  | Internal Review | Naveen Haswani |

## Table of Contents

<details>
<summary>1. Introduction</summary>

- [Introduction](#introduction)  

</details>

<details>
<summary>2. Environment Setup</summary>

- [Pre-requisites](#pre-requisites)  
- [System Requirements](#system-requirements)
- [Dependencies](#dependencies)
- [Important Ports](#important-ports)

</details>

<details>
<summary>3. Installation Guide</summary>

- [Step-by-step Installation Guide](#step-by-step-installation-guide)  
  - [PostgreSQL](#postgresql)  
  - [Redis](#redis)  
  - [Liquibase (Database Change Management)](#liquibase-database-change-management)
  - [Gunicorn](#gunicorn)
  - [Poetry](Poetry)  
  - [Make](#make)

</details>

<details>
<summary>4. Code Setup</summary>

- [Attendance API - Repo Clone & Setup](#attendance-api---repo-clone--setup)  

</details>

<details>
<summary>5. Testing & Execution</summary>

- [Run the Attendance API Server](#run-the-attendance-api-server)  

</details>

<details>
<summary>6. Wrap-up</summary>

- [Conclusion](#conclusion)  
- [Contact Information](#contact-information)  
- [Reference Table](#reference-table)

</details>


---

## **Introduction**
This document covers the setup, configuration, and execution of the Attendance REST API, a Python-based microservice for attendance tracking. It includes steps for installing dependencies, configuring PostgreSQL and Redis, running migrations, and testing the API with Swagger UI.

---

## **Pre-requisites**
| Requirement    | Description                             |
|----------------|-----------------------------------------|
| [PostgreSQL](https://www.postgresql.org/)    | A powerful, open-source relational database system, required for managing structured data                  |
| [Redis](https://redis.io/)  | An in-memory data structure store, often used for caching and message brokering. Install the latest stable version for best performance.          |
| [Poetry](https://python-poetry.org/)    | A Python dependency management and packaging tool for managing virtual environments and dependencies.                 |
| [Liquibase](https://docs.liquibase.com/home.html)  | A database schema change management tool that helps track, manage, and apply database changes consistently          |

---

## System Requirements
| **Hardware Specifications** | **Minimum Requirement** |
|-----------------------------|-----------------------|
| **Processor**                | Intel xeon Family     |
| **vCpu**     | 1         |
| **RAM**                      | 1 GB                   |
| **Disk**                     | 8GB                  | 
| **Operating System (OS)**    | Ubuntu 22.04  |
| **Virtual Machine (VM)**     | t2.micro          |

---

## Dependencies
| **Name**     | **Version** | **Description**                                                   |
|--------------|-------------|-------------------------------------------------------------------|
| Poetry       | 1.8.4       | Python package manager for managing dependencies                |
| Liquibase    | 4.30.0      | For managing database migrations and updates.                   |
| PostgreSQL   | 14.13       | Relational database system to store attendance data securely.    |
| Python 3.11  | 3.10.12     | Used for running the core application and managing dependencies. |
| Redis        | 4.6.0       | In-memory key-value store for caching to improve performance.    |
| Gunicorn     | Latest      | WSGI HTTP server to host the Flask application.                 |

---

## **Important Ports**
| **Port No.** | **Service**        | **Description**                                      |
|--------------|--------------------|------------------------------------------------------|
| 22           | SSH                | Port used for secure remote login and VM access.    |
| 6379         | Redis              | Port used for Redis client connections.             |
| 8080         | Application        | Port used to run and access the application.        |
| 5432         | PostgreSQL         | Port for PostgreSQL database connections.           |
| 80/443       | HTTP/HTTPS         | Ports used for web browsing (HTTP) and secure connections (HTTPS). |

---

## **Architecture**
![attendance](https://github.com/user-attachments/assets/afbdd13d-f7f3-4874-b2da-55288aa58900)

## **Flow Diagram**
![image](https://github.com/user-attachments/assets/4d337acd-39a6-4cf8-90db-3440b7fc2d70)

## **Step-by-Step Installation Guide**

## PostgreSQL

➡️ *Installation*: [Go to this link for postgresSQL installation guide](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-86-Vardaan/common_stack/software/postgresql/installation/README.md)

➡️ *Configuration*: [Go to this link for postgresSQL configuration guide](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-76-SHIVANI/common_stack/software/postgresql/configuration/README.md)

---

## Redis

➡️ *Installation and configuration*: [Go to this link for redis installation and configuration guide](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-84-PRINCE/ot-ms-understanding/software/middleware/redis/poc/README.md)

---

## Liquibase (Database Change Management)

➡️ *Install Liquibase*: [Go to this link for liquibase installation guide](https://github.com/snaatak-Downtime-Crew/Documentation/tree/SCRUMS-121-SHIVANI/database%20change%20management/database%20release%20management/poc%20on%20liquibase#step-by-step-setup-guide)

---

## Gunicorn

➡️ *Install Gunicorn*: [Install Gunicorn Guide](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/application/python/gunicorm/sop/README.md)

---

## Poetry 

➡️ *Install poetry*: [Install Poetry Guide](https://github.com/snaatak-Downtime-Crew/Documentation/blob/prince_scrums_16/common_stack/application/python/poetry/sop/README.md)

---

## Make

➡️ *Install make* [Go to this link for make installation guide](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/make/sop/README.md#installation-on-linux)

---

## **Attendance API - Repo Clone & Setup**
➡️ **Attendance api repository**: **https://github.com/OT-MICROSERVICES/attendance-api.git**

### Configuration changes in our repo for integrate with our private IP

➡️ **Update liquibase.properties file**
- Open `liquibase.properties` configuration file and then replace ip address with your actual private IP address.

➡️ **Update config.yaml file**
- Open the `config.yaml` configuration file and then replace both ip address with your actual private IP address.

---
## **Run the Attendance API Server**

### **Update pyproject.toml file**

➡️ To add the dependencies gunicorn, dataclasses-json, and psycopg2-binary properly, you should include them under [tool.poetry.dependencies],
```toml
gunicorn = "^21.2.0"
dataclasses-json = "^0.6.4"
psycopg2-binary = "^2.9.9"
```
### **To set up the PostgreSQL database, follow these steps:**
➡️ Set a password for the postgres user:
``` sql
- sudo -i -u postgres
- psql
- ALTER USER postgres WITH PASSWORD 'your_password';
```
**Note:** Make sure to replace 'your_password' with a secure password.

### **Run the script `scripts/db_init.sh` to create the database (ensure that the private IP is used instead of 'localhost' within the script)**
➡️ Test the connection:
``` psql -h <private-ip-address> -U postgres -d attendance_db ```

### **Run Migration**

```
make run-migrations
```

![image](https://github.com/user-attachments/assets/b8de4582-5805-4480-a437-7788c458c44f)
![image](https://github.com/user-attachments/assets/6cc881e9-8ccc-4c22-aea8-fb5bf4ffa7df)


### **Create service file for run the application:**

➡️ Create the **gunicorn.service** file at the path **/etc/systemd/system/gunicorn.service** and add the following content:

```
[Unit]
Description=gunicorn daemon for the Attendance API
After=network.target

[Service]
User=ubuntu
Group=ubuntu
WorkingDirectory=/home/ubuntu/attendance-api
ExecStart=/usr/local/bin/gunicorn --workers 3 --bind 0.0.0.0:8080 app:app

[Install]
WantedBy=multi-user.target
```

➡️ **Start & Check the status of your gunicorn service
 
```
sudo systemctl daemon-reload
sudo systemctl enable gunicorn
sudo systemctl start gunicorn 
sudo systemctl status gunicorn 
```
![image](https://github.com/user-attachments/assets/c01977e6-f330-43f4-bf9d-595d7b40a9ff)

➡️ Now, Open any browser and check the swagger page will be accessible on http://public-ip:8080/apidocs** 
>---
![image](https://github.com/user-attachments/assets/6d496183-27ef-473a-969a-e0152a4571ff)
![image](https://github.com/user-attachments/assets/cca22fcb-c2ad-4b9e-835e-152319d4e023)
![image](https://github.com/user-attachments/assets/cc846eca-b24c-4633-a429-982b94666e19)

---
## **Conclusion**

This Attendance API provides businesses with a streamlined and automated solution for tracking employee attendance. Designed with simplicity, reliability, and security in mind, the API not only simplifies attendance recording but also supports automated report generation and timely reminders. It enhances operational efficiency and helps organizations maintain accurate attendance records with minimal manual intervention.

---

## **Contact Information**

| Name           | Email Address                             |
|----------------|-------------------------------------------|
| Shivani Narula   | shivani.narula.snaatak@mygurukulam.co       |

---

## **Reference Table**

| **Link**                                                                                                                     | **Description**                                    |
|-----------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| [How to install and configure PostgreSQL on Ubuntu 20.04](https://medium.com/devops-technical-notes-and-manuals/how-to-install-and-configure-postgresql-on-ubuntu-20-04-4fd3cf072d6f) | PostgreSQL installation and configuration       |
| [How to install Liquibase Database DevOps](https://chandrapurnimabhatnagar.medium.com/how-to-install-liquibase-database-devops-34ca9a6d9705) | Liquibase installation                          |
