# Employee API Detailed Document

##  **Author Information**
| Created     | Last updated | Version | Author         | Comment | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 26-04-2025  |  01-05-2025  | V1.1     | Adil Nawaz |     Internal Review    | Pritam    |
| 26-04-2025  |  06-05-2025  | V2.1     | Adil Nawaz |   L0   | Shreya    |
| 26-04-2025  |  06-05-2025   | V3     | Adil Nawaz |   L1   | Abhishek V    |
| 26-04-2025  |  06-05-2025  | V4     | Adil Nawaz |   L2   | Abhishek D  |

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
This document will provide a comprehensive overview of the dependencies associated with the Employee API and elucidate their roles and functionalities. The Employee API is a critical component of our microservices architecture, designed to handle all employee-related transactions efficiently. By understanding the dependencies and their interactions, we can gain insight into the operational aspects of the Employee API, ensuring robust and seamless integration within the overall system.

**Tech Stack Used**

1. **ScyllaDB** – ScyllaDB as its primary database for robust data storage.

2. **Redis** – An in-memory key-value data store that helps with quick data access through caching.

3. **Jq** - It is a powerful command-line tool used for parsing, filtering, and manipulating JSON data. 

4. **Golang** - It features built-in support for concurrency, making it ideal for building scalable and high-performance applications.

5. **Migrate** - This typically involves creating, modifying, or deleting database tables and columns to accommodate evolving application requirements.


## Purpose
The Employee REST API is a Golang-based microservice designed to handle all employee-related transactions within the OT Microservices ecosystem. It is fully platform-independent and can run on any platform. 



## Architecture
![Screenshot 2025-05-01 124109](https://github.com/user-attachments/assets/874b438e-c10b-4dc2-aa29-76a82595ad4f)


The Employee API first checks Redis for cached data. If found, it returns it immediately (cache hit). If not (cache miss), it queries ScyllaDB, retrieves the data, and then caches it in Redis for future use. A separate Migrations service handles updates to ScyllaDB.


##  Pre-Requisites 

   - **`Redis` helps applications run faster by storing frequently used data in memory instead of hard disks.It is designed for scenarios where speed is critical, like caching user data, real-time leaderboards, and messaging systems.**
<img width="60" alt="Redis-Logo-768x480" src="https://github.com/user-attachments/assets/3095ec95-88a7-42f4-921e-91960ae90a9b">

- **How to Install and Configure Redis**
> 
> 👉 **Follow Documentation**: [Redis](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-85-SHIVANI/ot-ms-understanding/redis/documentation/README.md)
---

  - **`ScyllaDB` primary purpose is to provide a scalable, low-latency database solution for applications with high throughput requirements. ScyllaDB is designed to deliver unparalleled performance while maintaining compatibility with popular NoSQL solutions like Apache Cassandra and Amazon DynamoDB.**
<img width="60" alt="Scylla_the_sea_monster" src="https://github.com/user-attachments/assets/29e536f3-e1b7-4dfe-a607-18f3ddf840ec">

- **How to Install and Configure ScyllaDB**
> 👉 **Follow Documentation**: [ScyllaDB](https://github.com/snaatak-Downtime-Crew/Documentation/tree/SCRUMS-89-Durgesh/ot-ms-understanding/software/database/scylladb/documentation#readme)
---

     


## Build-Dependencies
 - [Migrations](#what-is-migrations)
 - [Jq](#what-is-jq)
 - [Golang](#What-is-golang)
     
 ### What is Migrations:
 **`migrate` is a CLI-based, open-source migration tool from the Go community that allows you to apply version-controlled schema changes to your databases.**
 > 👉 **Follow more detailed documentation on Migrate**: [Migrate](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/migrate/intro/README.md)

### What is Jq?
**`JQ` is a powerful command-line tool that allows you to parse, transform, filter, and manipulate JSON data quickly and easily. Think of it as sed or awk, but specifically designed for JSON.**

> 👉 **Follow more detailed documentation on Jq**: [Jq](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/others/jq/intro/README.md)

### What is Golang?
**Go (or Golang) is a statically typed, compiled programming language developed at Google. It emphasizes simplicity, performance, and reliability, making it ideal for building scalable and maintainable systems.**
> 👉 **Follow more detailed documentation on Golang**: [Golang](https://github.com/snaatak-Downtime-Crew/Documentation/blob/yuvraj_scrums_29/common_stack/application/golang/introduction/README.md)




## Conclusion
The Employee REST API, built in Go, uses ScyllaDB for fast data storage, Redis for caching, jq for JSON handling, and Swagger UI for interactive documentation—ensuring scalable, high-performance employee data management within the OT-Microservices ecosystem.

## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |


## References
| Links | Descriptions|
|-------|--------------|
|[Link](https://redis.io/documentation)|Redis Official Documentation|
|[Link](https://www.scylladb.com/)|ScyllaDB Homepage Documentation|
|[Link](https://github.com/golang-migrate/migrate)|Migrate Github Docs|
|[Link](https://github.com/golang-migrate/migrate/blob/master/cmd/migrate/README.md)|Migrate CLI|
|[Link](https://en.wikipedia.org/wiki/Jq_(programming_language))|Jq|
|[Link](https://go.dev/doc/)|Go Official Documentation|
|[Link](https://swagger.io/tools/swagger-ui/)|Swagger UI Documentation|
