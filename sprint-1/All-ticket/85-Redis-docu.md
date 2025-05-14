# Redis Documentation

<p align="center">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJrUIPz92r6o3cC76UZAYuU1vb7tmpCPmZAw&s" alt="Attendance Logo" height="100"width="200"/>
</p>

## Author Information

| **Created**       | **Version** | **Last Modified** | **Author**        | **Level**            | **Reviewer**  |
|--------------------|-------------|-------------------|-------------------|----------------------|---------------|
|   27-04-2025       |     V1.1     |    27-04-2025     |  Shivani Narula   | Internal review      | Siddharth Pawar |
|   27-04-2025       |     V2      |    27-04-2025     |  Shivani Narula   | L0 Review            | Naveen Haswani |
|   27-04-2025       |     V3      |    27-04-2025     |  Shivani Narula   | L1 Review            | Deepak Nishad |
|   27-04-2025       |     V4      |    27-04-2025     |  Shivani Narula   | L2 Review            | Ashwani Singh |

---

## Table of Contents

- [Introduction](#introduction)
- [Purpose](#purpose)
- [Why](#why)
- [Features](#features)
- [Architecture](#architecture)
- [Installation and Configuration](#installation-and-configuration)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Use Cases](#use-cases)
- [Conclusion](#conclusion)
- [Contact](#contact)
- [References](#references)

---

## Introduction

This document explains Redis — an open-source, very fast, in-memory database. Redis stores data in the system’s memory (RAM), which makes reading and writing extremely quick.It is mainly used for caching, real-time data processing, messaging, and session storage.

---

## Purpose

Redis helps applications run faster by storing frequently used data in memory instead of hard disks.It is designed for scenarios where speed is critical, like caching user data, real-time leaderboards, and messaging systems.

---

## Why?

Redis was chosen because it offers a very high speed for data access and supports multiple advanced data structures like strings, lists, sets, and hashes. It also provides persistence options, clustering, and replication, which makes it reliable for both temporary and durable storage needs without complex setups.

---

## Features

| Feature                  | Description                                                                 |
|--------------------------|-----------------------------------------------------------------------------|
| High Performance         | Redis stores data in-memory, enabling lightning-fast read/write operations. |
| Reduced Database Load    | Frequently accessed data is cached, minimizing direct hits to the database. |
| Scalability              | Supports clustering and sharding to handle growing application demands.     |
| Expiration & Eviction    | Configurable TTL and eviction policies manage cache size efficiently.       |
| Simple Integration       | Easily integrates with most languages and frameworks.                       |
| Improved User Experience | Faster data retrieval leads to lower latency and better responsiveness.     |

---

## Architecture

![image](https://github.com/user-attachments/assets/7f88b5b1-5110-4c05-8a58-ec136bc9440c)

### **Redis Caching Workflow Explained**
- **Client Sends a Data Request:** The client initiates a request to retrieve data, which first passes through the application layer.
- **Cache Lookup in Redis:** The application checks the Redis cache to see if the requested data is already stored.
 > If a cache hit occurs, the data is returned immediately, ensuring low-latency response.
- **Fallback to MySQL on Cache Miss:** If the data is not found in Redis (cache miss), the application queries the primary persistence store, typically a relational database like MySQL.
- **Cache Population with Retrieved Data:** Upon receiving the data from MySQL, the application stores (or “primes”) the data in Redis to serve future requests more efficiently.
- **Response Returned to Client:** Finally, the application returns the requested data to the client, either directly from the cache or after retrieving and caching it from the database.

---

## Installation and Configuration

- Follow the [link](https://github.com/snaatak-Downtime-Crew/Documentation/tree/SCRUMS-84-PRINCE/common_stack/software/redis/installation) for detailed installation and setup instructions.

---

## Advantages

| **Advantage**                    | **Description**                                                                 |
|-----------------------------------|---------------------------------------------------------------------------------|
| Very High Speed                  | Operations take less than a millisecond.                                        |
| Easy to Use                      | Simple commands and easy setup.                                                 |
| Supports Multiple Data Types     | Strings, lists, sets, sorted sets, hashes, bitmaps, etc.                        |
| Data Durability                  | Options to save data on disk periodically.                                      |
| High Availability and Scaling    | Master-slave replication and cluster support.                                  |
| Pub/Sub Messaging System         | Supports publish/subscribe messaging out of the box.                           |

---

## Disadvantages

| **Disadvantage**                  | **Description**                                                                 |
|-----------------------------------|---------------------------------------------------------------------------------|
| Memory Dependent                  | Everything is stored in RAM, so large datasets need large memory.               |
| Persistence Can Slow Down         | Saving data to disk can slightly affect speed.                                  |
| Single-threaded                   | By default, Redis processes commands one at a time (though it is very fast).    |
| Risk of Data Loss                 | If not configured properly for persistence, data may be lost after a crash.     |

---

## Use Cases

| **Use Case**                      | **Description**                                                                 |
|-----------------------------------|---------------------------------------------------------------------------------|
| Caching Frequently Used Data      | Reduces the load on databases and speeds up applications.                      |
| Session Storage                  | Stores user sessions in web applications (like login info).                    |
| Real-time Analytics               | Tracks user activity, page views, etc., instantly.                             |
| Message Queues                    | Acts as a simple queue for background jobs.                                     |
| Gaming Leaderboards               | Stores scores and rankings using sorted sets.                                  |
| Distributed Locking               | Helps manage access control to resources across distributed systems.            |

---

## Conclusion

Redis is a perfect choice when you need fast, reliable, and simple-to-use storage. It is trusted worldwide for caching, real-time messaging, and high-speed data access.Its lightweight design and great features make it very useful in modern applications.

---

## Contact

| **Name**           | **Email Address**                                 |
|---------------------|--------------------------------------------------|
| Shivani Narula     | shivani.narula.snaatak@mygurukulam.co             |

---

## References

| **Link** | **Description** |
|:---------|:----------------|
| [Guide to Fully Understanding Redis](https://blog.logrocket.com/guide-to-fully-understanding-redis/) | A detailed guide for fully understanding Redis concepts. |
| [Official Redis Documentation](https://redis.io/docs/) | Official documentation covering Redis features, commands, and best practices. |
| [Redis GitHub Repository](https://github.com/redis/redis) | Redis source code, updates, and community contributions. |
