## OT Microservices Full Stack Application – PoC

## Author Information

| Created     | Version | Author        | Last Updated | Comment          | Reviewer         |
|-------------|---------|---------------|--------------|------------------|------------------|
| 05-05-2025  | V1.0    | Harsh Wardhan Singh| 05-05-2025   | Internal reviewer| Pritam       |

##   Table of Contents

 [Introduction](#introduction)  
 [Acceptance Criteria](#acceptance-criteria)  
 [System Requirements](#system-requirements)  
 [Dependencies](#dependencies)  
 [Important Ports](#important-ports)  
 [Architecture](#architecture)  
 [Dataflow Diagram](#dataflow-diagram)  
 [Installation Steps](#installation-steps)  
 [Contact](#contact)  
 [References](#references)  

##   Introduction

This Proof of Concept (PoC) demonstrates the setup and working of the **OT Microservices Full Stack Application**, which includes:

- Frontend React App
- Employee, Salary, and Attendance Microservices
- Redis, PostgreSQL, ScyllaDB
- Microservices consume APIs and support caching for performance

The PoC verifies that:
- All components are independently deployable
- APIs are responsive and integrated
- Caching mechanism is functional


##   System Requirements

| Hardware       | Minimum             |
|----------------|---------------------|
| CPU            | Dual Core           |
| RAM            | 4 GB                |
| Disk           | 20 GB               |
| OS             | Ubuntu 22.04 LTS    |

##  Dependencies

### Build-Time

| Name    | Version | Description               |
|---------|---------|---------------------------|
| Node.js | 18+     | React frontend            |
| Go      | 1.20+   | Backend services build    |
| Python     | 3+   | Backend services build    |

### Runtime

| Name       | Version | Description                        |
|------------|---------|------------------------------------|
| Redis      | 7.2+    | Cache system                       |
| ScyllaDB   | 5.4+    | Used by Employee & Salary services |
| PostgreSQL | 14+     | Used by Attendance service         |

##   Important Ports

| Service        | Port  | Description                     |
|----------------|-------|---------------------------------|
| Frontend       | 3000  | React App                       |
| Redis          | 6379  | Caching                         |
| PostgreSQL     | 5432  | Attendance DB                   |
| ScyllaDB       | 9042  | Employee & Salary DB            |
| Employee API   | 8080  | REST API                        |
| Salary API     | 8081  | REST API                        |
| Attendance API | 8082  | REST API                        |

## Architecture

The application uses microservice-based architecture with a frontend consuming 3 REST APIs, each connected to a different DB, and Redis acting as a cache layer.

![Screenshot 2025-05-02 123839](https://github.com/user-attachments/assets/60df46ee-1c67-4faf-81c3-e898bdfcda9d)

---
##   Dataflow Diagram

1. Frontend sends API requests:
   - `/api/v1/employee` → Employee API
   - `/api/v1/salary` → Salary API
   - `/api/v1/attendance` → Attendance API

2. APIs first check Redis for cached data.
3. If data not cached:
   - Employee/Salary API fetch from ScyllaDB.
   - Attendance API fetch from PostgreSQL.
4. Data is returned and cached for future requests.
---
##   Installation Steps for tools

###  To install PostgreSQL and configure
Please refer this to install [link](https://github.com/snaatak-Downtime-Crew/Documentation/tree/SCRUMS-86-Vardaan/ot-ms-understanding/software/database/postgressql/poc)
Please refer for configuration [Link]

###  To install Redis and configure
PLease refer this  to install [Link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-84-PRINCE/ot-ms-understanding/software/middleware/redis/poc/README.md)
Please refer this for configuration [Link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-84-PRINCE/common_stack/software/redis/configuration/README.md)

### To install SCylladb and configure
Please refer this install [Link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-88-Adil/ot-ms-understanding/software/database/scylladb/poc/README.md)
Please refer this for configuration [Link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-88-Adil/common_stack/software/scylladb/configuration/README.md)

---
## To set up the API


### To set Up Salary Api

Please refer this [Link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-80-Durgesh/ot-ms-understanding/applications/salary/poc/README.md)



![Screenshot from 2025-05-05 12-17-53](https://github.com/user-attachments/assets/46b55906-2190-4e81-b8d1-42e11c1ece42)

### To set Up Employee Api

Please refer this [Link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-78-YUVRAJ/ot-ms-understanding/applications/employee/poc/README.md)



![Screenshot from 2025-05-05 12-17-40](https://github.com/user-attachments/assets/062fe373-a2cc-48d0-b02a-a8d07c3203f3)

### To set Attendance Api

Please refer this [Link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-76-SHIVANI/ot-ms-understanding/applications/attendance/poc/README.md)



![Screenshot from 2025-05-07 00-01-37](https://github.com/user-attachments/assets/14ff0471-245d-4255-803a-9fcdb1b88c6d)


### To set Frontend Api
Please refer this [Link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-82-Nishkarsh/ot-ms-understanding/applications/frontend/poc/README.md)



![Screenshot from 2025-05-05 12-15-16](https://github.com/user-attachments/assets/0324b55c-853a-47ca-88c7-20bc2d22326b)

### To set Notification Api
Please refer this [Link](https://github.com/snaatak-Downtime-Crew/Documentation/tree/prateek_scrums_74/ot-ms-understanding/applications/notification/poc)

---


##   Contact

| Name             | Email                                |
|------------------|--------------------------------------|
| Harsh Wardhan Singh   | harsh.singh.snaatak@mygurukulam.co              |

##  References

| Title              | Link                                               |
|--------------------|----------------------------------------------------|
| Redis Docs         | https://redis.io/docs                             |
| ScyllaDB Docs      | https://docs.scylladb.com                         |
| PostgreSQL Docs    | https://www.postgresql.org/docs/                  |
