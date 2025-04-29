# Employee API Detailed Document

##  **Author Information**
| Created     | Last updated | Version | Author         | Comment | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 26-04-2025  |  28-04-2025  | V1.2     | Adil Nawaz |     Internal Review    | Pritam    |

---


## Table of Contents

1. [Overview](#overview)
2. [Purpose](#purpose)
3. [Architecture](#architecture)
4. [Pre-Requisites](#pre-requisites)
    1. [Redis](#redis)
    2. [ScyllaDB](#scylladb)
5. [Build-Dependencies](#build-dependencies)
    1. [Migrations](#migrations)
    2. [Jq](#jq)
    3. [Golang](#golang)
6. [Conclusion](#conclusion)
7. [Contact Information](#contact-information)
8. [References](#references)

---

## Overview
In this document, we will provide a comprehensive overview of the dependencies associated with the Employee API and elucidate their roles and functionalities. The Employee API is a critical component of our microservices architecture, designed to handle all employee-related transactions efficiently. By understanding the dependencies and their interactions, we can gain insight into the operational aspects of the Employee API, ensuring robust and seamless integration within the overall system.

**Tech Stack Used**

1. **ScyllaDB** – ScyllaDB as its primary database for robust data storage.

2. **Redis** – An in-memory key-value data store that helps with quick data access through caching.


## Purpose
The Employee REST API is a Golang-based microservice designed to handle all employee-related transactions within the OT-Microservices ecosystem. It is fully platform-independent, capable of running on any platform. 



### Architecture
![Employee_API Architecture drawio](https://github.com/user-attachments/assets/5b87b48d-8399-4ac7-8d49-361de4189828)


###  Pre-Requisites 

   - [Redis](#defination-of-redis)
<img width="47" alt="Redis-Logo-768x480" src="https://github.com/user-attachments/assets/3095ec95-88a7-42f4-921e-91960ae90a9b">

> 👉 **Follow Documentation**: [Add Redis refrence]()
---

  - [ScyllaDb](#what-is-scylladb)
<img width="43" alt="Scylla_the_sea_monster" src="https://github.com/user-attachments/assets/29e536f3-e1b7-4dfe-a607-18f3ddf840ec">


> 👉 **Follow Documentation**: [ScyllaDB](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-89-Durgesh/ot-ms-understanding/scylladb/documentation/README.md)
---

     


### Build-Dependencies
 - [Migrations](#what-is-migrations)
 - [Jq](#what-is-jq)
     
 #### What is Migrations:
> 👉 **Follow Documentation**: [Migrate](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/migrate/intro/README.md)

#### What is Jq?
> 👉 **Follow Documentation**: [Jq](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/jq/intro/README.md)

### Golang 
> 👉 **Follow Documentation**: [Golang](https://github.com/snaatak-Downtime-Crew/Documentation/blob/yuvraj_scrums_29/common_stack/application/golang/introduction/README.md)




#### Conclusion
The Employee REST API, built in Go, uses ScyllaDB for fast data storage, Redis for caching, jq for JSON handling, and Swagger UI for interactive documentation—ensuring scalable, high-performance employee data management within the OT-Microservices ecosystem.

#### Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |


#### References
| Links | Descriptions|
|-------|--------------|
|(https://redis.io/documentation)|Redis Official Documentation|
|https://www.scylladb.com/|ScyllaDB Homepage Documentation|
|https://github.com/golang-migrate/migrate|Migrate Github Docs|
|https://github.com/golang-migrate/migrate/blob/master/cmd/migrate/README.md|Migrate CLI|
|https://en.wikipedia.org/wiki/Jq_(programming_language)|Jq|
|https://go.dev/doc/|Go Official Documentation|
|https://swagger.io/tools/swagger-ui/|Swagger UI Documentation|
