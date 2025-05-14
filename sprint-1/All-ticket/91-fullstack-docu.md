# OT-MICROSERVICES Full Stack Documentation


## **Author Information**

| Created     | Last Updated | Version | Author          | Comment         | Reviewer |
|-------------|--------------|---------|-----------------|-----------------|----------|
| 02-05-2025  |  02-05-2025  | V1      | Nishkarsh Kumar | Internal Review | Pritam   |
| 02-05-2025  |  02-05-2025  | V2      | Nishkarsh Kumar | L0 | Akshit   |

---

## Table of Contents

1. [Introduction](#introduction)  
2. [Environment Setup Guide](#environment-setup-guide)  
3. [Architecture](#architecture)  
4. [Dataflow](#dataflow)  
5. [Application Components](#application-components)  
    - [Frontend](#frontend)  
    - [Backend](#backend)  
6. [Conclusion](#conclusion)  
7. [Contact Information](#contact-information)  
8. [References](#references)  

---

## Introduction

**OT-MICROSERVICES** is a full-stack microservices system designed to manage employee operations, including attendance, salary processing, and notifications. It leverages a scalable, decoupled architecture with a ReactJS frontend and multiple independent backend APIs.

---

## Environment Setup Guide

All the necessary setup instructions such as:

- System Requirements  
- Pre-requisites 
- Dependencies  
- Important Ports  

Are available in the [Full Stack POC](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-90-harsh/ot-ms-understanding/applications/fullstack/demo/README.md#system-requirements)

---
## Architecture
![1](https://github.com/Nishkarsh9/images/blob/main/Screenshot%202025-05-02%20130101.png)
- React frontend interacts with the backend microservices: Employee, Salary, Attendance, and Notification APIs.
- Redis serves as a caching layer for performance.
- ScyllaDB and PostgreSQL are used for persistent data storage.
- Elasticsearch acts as the centralized log and event store for notification processing.
- A Python script consumes data from Elasticsearch and triggers notifications.

---

## Dataflow

1. Frontend initiates API requests.
2. Backend APIs process requests, use Redis for caching, and store data in ScyllaDB or PostgreSQL.
3. Salary and Employee APIs push selected data to Elasticsearch.
4. Notification API reads from Elasticsearch and sends notifications.

---

## Application Components

### Frontend

![2](https://github.com/Nishkarsh9/images/blob/main/Screenshot%202025-05-01%20145943.png)

**Repository**: [Frontend](https://github.com/snaatak-Downtime-Crew/Documentation/tree/SCRUMS-83-Prateek/ot-ms-understanding/applications/frontend/documentation)

- Built with **React.js**, **HTML**, and **CSS**.
- Provides interfaces for employees, attendance and salaries.
- Connects to:
  - [Employee API](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-79-Adil/ot-ms-understanding/applications/employee/documentation/README.md)
  - [Salary API](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-81-harsh/ot-ms-understanding/applications/salary/documentation/README.md)
  - [Attendance API](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-77-Vardaan/ot-ms-understanding/applications/attendance/documentation/README.md)
  - [Notification API](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-75-PRINCE/ot-ms-understanding/applications/notification/documentation/README.md)

### Backend

#### 1. Employee API

![3](https://github.com/Nishkarsh9/images/blob/main/Screenshot%202025-05-01%20145308.png)
  
**Repo**: [Employee-API](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-79-Adil/ot-ms-understanding/applications/employee/documentation/README.md)  
- Built using **Go-language**.  
- Uses **Redis** for caching and **ScyllaDB** for persistent storage.  
- Pushes relevant data to **Elasticsearch** for downstream notification processing.  

#### 2. Salary API

![4](https://github.com/Nishkarsh9/images/blob/main/Screenshot%202025-05-01%20145414.png)

**Repo**: [Salary-API](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-81-harsh/ot-ms-understanding/applications/salary/documentation/README.md)  
- Built with **Java**.
- Uses **Redis** for caching and **ScyllaDB** for salary records.  
- Pushes salary alerts and logs to **Elasticsearch** for notifications.  

#### 3. Attendance API

![5](https://github.com/Nishkarsh9/images/blob/main/Screenshot%202025-05-01%20145640.png)

**Repo**: [Attendance-API](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-77-Vardaan/ot-ms-understanding/applications/attendance/documentation/README.md)  
- Built using **Python**.    
- Uses **Redis** as a caching layer.  
- Uses **PostgreSQL** for attendance records.  

#### 4. Notification API

![6](https://github.com/Nishkarsh9/images/blob/main/Screenshot%202025-05-02%20130743.png)
  
**Repo**: [Notification-API](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-75-PRINCE/ot-ms-understanding/applications/notification/documentation/README.md)  
- Built in **Python**.  
- Consumes employee/salary events from **Elasticsearch**.  
- Sends appropriate notifications (email/SMS/logs).   

---

## Conclusion

This documentation outlines the complete architecture, tools, and interdependencies in the OT-MICROSERVICES full-stack application. Each microservice is responsible for a domain-specific function and integrates using best practices. Elasticsearch serves as the bridge for real-time data processing and triggering notifications via a Python worker, making the system scalable and event-driven. The modular nature of the system ensures maintainability, scalability, and performance for modern enterprise requirements.

---

## Contact Information

| Name       | Email Address                        |
|------------|--------------------------------------|
| Nishkarsh Kumar    | nishkarsh.kumar.snaatak@mygurukulam.co         |

---

## References

| **Title**                    | **Link**                                    |
|-------------------------------|---------------------------------------------|
| Ubuntu Official Documentation | [Ubuntu Docs](https://help.ubuntu.com)     |
| Node.js Official Documentation | [Node.js Docs](https://nodejs.org/en/docs) |
| ScyllaDB Official Documentation | [Scylla Docs](https://docs.scylladb.com)  |
| PostgreSQL Official Documentation | [PostgreSQL Docs](https://www.postgresql.org/docs/) |
| Elasticsearch Docs | [Elasticsearch](https://www.elastic.co/guide/en/elasticsearch/reference/index.html) |

---
