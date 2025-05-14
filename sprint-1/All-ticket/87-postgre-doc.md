
# PostgresSQL Documentation

![Logo](https://miro.medium.com/v2/resize:fit:610/1*lZrXmWJRDLqIImJThs5Lrw.png)

### Author
| Created     | Version | Author        | Modifed | Comment           | Reviewer         |
|-------------|---------|---------------|-------|------------|------------------|
| 26-04-2025  |  V1.2      | Yuvraj Singh | 01-05-2025 | Internal Review   | Siddharth Pawar  |
| 02-05-2025  |  V2        | Yuvraj Singh |            | L0 Review         | Naveen Haswani |
| 06-05-2025  |  V3        | Yuvraj Singh |            | L1 Review         | Deepak Nishad |
|             |  V4        | Yuvraj Singh |            | L2 Review         | Ashwani Singh |


## Table of Contents

<details>
<summary>1. Introduction</summary>

- [Introduction](#introduction)  
- [What is PostgreSQL](#what-is-postgresql)  
- [Why Use PostgreSQL?](#why-use-postgresql)

</details>

<details>
<summary>2. Core Concepts</summary>

- [Features](#features-of-postgresql)  
- [Key Concepts](#key-concepts)  
- [Architecture Overview](#architecture-overview)

</details>

<details>
<summary>3. Getting Started</summary>

- [Setup](#setup)  
- [Creating and Managing a PostgreSQL Database](#creating-and-managing-a-postgresql-database)  
- [Common SQL Commands](#common-sql-commands)  
- [Best Practices](#best-practices)

</details>

<details>
<summary>4. Wrap-up</summary>

- [Conclusion](#conclusion)  
- [Contact](#contact)  
- [References](#references)

</details>

---

## Introduction
This guide provides a comprehensive overview of PostgreSQL—a powerful, open-source relational database management system. It covers PostgreSQL’s key features, core concepts, common SQL operations, advanced functionalities, and best practices. By understanding and using PostgreSQL effectively, developers and database administrators can build scalable, reliable, and high-performance database solutions for a wide range of applications. 

---

## What is PostgreSQL?
PostgreSQL is a powerful, open-source object-relational database management system (ORDBMS) known for its reliability, scalability, and advanced features. It is widely used for various applications, from small personal projects to large-scale enterprise deployments.

---

## Why Use PostgreSQL?
| Benefits          | Description                                               |
|-------------------|------------------------------------------------------------|
| **Reliable**      | Trusted for mission-critical applications.                |
| **Scalable**      | Suitable for small apps to large data-intensive systems.  |
| **Open-source**   | No licensing fees, large ecosystem, active contributions. |
| **Versatile**     | Supports OLTP, OLAP, geospatial data, full-text search, and more. |
| **Feature-rich**  | Advanced indexing, partitioning, JSON support, and more.   |

---

## Features of PostgreSQL

| Feature                  | Description                                                                                 |
|--------------------------|---------------------------------------------------------------------------------------------|
| **Open Source**          | Free to use with strong community support and continuous development.                      |
| **Advanced Data Types**  | Supports JSON, XML, arrays, ranges, geometric types, and user-defined types.               |
| **High Availability**    | Offers replication, failover, and clustering for fault tolerance and scalability.          |
| **Extensibility**        | Allows creation of custom data types, functions, and procedural languages like PL/pgSQL.   |
| **Foreign Data Access**  | Connects to external databases (e.g., MySQL, Oracle, CSV) using Foreign Data Wrappers.     |
| **Full-Text Search**     | Enables efficient search capabilities across large text fields.                            |
| **Security**             | Includes user roles, SSL, encryption, and fine-grained access controls.                    |
| **Materialized Views**   | Caches complex query results for faster access and better performance.                     |


---

## Key Concepts
| Term               | Description                                                                                  |
|--------------------|----------------------------------------------------------------------------------------------|
| **Database**       | A collection of related data objects like tables, views, and functions.                      |
| **Schema**         | A logical grouping of database objects within a database.                                    |
| **Table**          | A structured collection of data records with rows and columns.                               |
| **Column**         | A named attribute of a table that holds specific data types like integers, text, or timestamps.|
| **Row**            | A single instance of data in a table, containing values for each column.                     |
| **SQL**            | A standardized language for querying and manipulating data in relational databases.          |
| **Indexes**        | Data structures that improve query performance by speeding up data retrieval.                |
| **Constraints**    | Rules that enforce data integrity by restricting the type or format of data allowed in a table.|
| **Transactions**   | A sequence of one or more SQL operations executed as a single unit, ensuring consistency.     |

---

## Architecture Overview

![image](https://github.com/user-attachments/assets/bea7e325-4c37-4537-a450-e3f54efdeee1)

### Client Request Handling

**Client Applications → Postmaster**
- Client applications initiate a connection to the PostgreSQL server.
- The **Postmaster** (inspired by PostgreSQL terminology) acts as a listener or connection handler that accepts incoming connections.

**Postmaster → Backend Process**
- Once a connection is accepted, the Postmaster delegates it to a **Backend Process**.
- This process handles actual request execution.

**Backend Process → Shared Memory**
- The backend process interacts with **Shared Memory** to access cached data or communicate with other processes.
- Shared memory enables fast data access and inter-process communication within PostgreSQL.

---

### Server and Storage Management

**Client Applications → Main Server Process**
- This path shows client interactions that may trigger lower-level operations (e.g., triggering flushes, compactions).

**Main Server Process → Background Processes**
- The **Main Server Process** oversees overall operations and delegates longer-running or maintenance tasks to **Background Processes**.

**Background Processes → Storage Manager**
- Background processes (e.g., compaction, flushing, repair) work with the **Storage Manager**.
- The **Storage Manager** handles actual data writing to disk (SSTables), compactions, and other I/O tasks.

---



## Setup

Use the [PostgreSQL POC](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-86-Vardaan/ot-ms-understanding/software/database/postgressql/poc/README.md) for a step-by-step setup guide.

---

## Creating and Managing a PostgreSQL Database
| Rule                 | Description                                                                                 |
|----------------------|---------------------------------------------------------------------------------------------|
| **Database Creation**| Use the `CREATE DATABASE` command to create a new database instance.                        |
| **Schema Definition**| Design your schema using `CREATE TABLE`, `FOREIGN KEY`, `PRIMARY KEY`, and data types.       |
| **Data Manipulation**| Use `INSERT`, `UPDATE`, `DELETE`, and `SELECT` commands to manage data.                      |
| **User Management**  | Use `CREATE ROLE`, `GRANT`, and `REVOKE` to manage users and their permissions.              |
| **Backup and Recovery** | Use `pg_dump`, `pg_restore`, and replication to ensure data durability.                    |

---

## Common SQL Commands
| Command | Description |
|---------|-------------|
| `CREATE DATABASE dbname;` | Create a new database. |
| `CREATE TABLE tablename (column1 TYPE, column2 TYPE);` | Create a new table. |
| `INSERT INTO tablename (column1, column2) VALUES (value1, value2);` | Insert a new row. |
| `SELECT * FROM tablename;` | Retrieve all data from a table. |
| `UPDATE tablename SET column1 = value1 WHERE condition;` | Update data. |
| `DELETE FROM tablename WHERE condition;` | Delete specific rows. |
| `DROP TABLE tablename;` | Delete a table. |
| `ALTER TABLE tablename ADD COLUMN columnname TYPE;` | Modify a table structure. |

---

## Best Practices

| **Practice**                            | **Description**                                                                 |
|----------------------------------------|---------------------------------------------------------------------------------|
| **Use Connection Pooling**             | Tools like **PgBouncer** help manage high-concurrency workloads efficiently.    |
| **Analyze & Vacuum Tables**            | Regular maintenance improves query planning and reclaims storage.              |
| **Regular Backups**                    | Use `pg_dump` and test restore processes to ensure data safety.                |
| **Use Indexes Wisely**                 | Indexes speed up queries but can slow inserts/updates if overused.             |
| **Apply Constraints**                  | Enforce data integrity using primary keys, foreign keys, and checks.           |
| **Secure the Database**                | Use roles, permissions, and **SSL encryption** to protect access and data.     |
| **Monitor Performance**                | Use tools like `pg_stat_activity` and `pg_stat_statements` to track bottlenecks.|

---

## Conclusion
PostgreSQL is a powerful and versatile database management system that offers a wide range of features and benefits. Its reliability, scalability, and advanced capabilities make it a popular choice for various applications. By understanding the key concepts, common SQL commands, and advanced features, we can effectively use PostgreSQL to manage and analyze our data.

---

## Contact

| Name          | Email Address                              |
|---------------|--------------------------------------------|
| Yuvraj Singh  | yuvraj.singh.snaatak@mygurukulam.co         |

---

## References

| Resource                         | Link                                                |
|----------------------------------|-----------------------------------------------------|
| **PostgreSQL Official Documentation** | [Visit](https://www.postgresql.org/docs/) |
| **PostgreSQL Wiki**              |  [Visit](https://wiki.postgresql.org/)     |
| **PostgreSQL GitHub Repository** | [Visit](https://github.com/postgres/postgres) |
| **Awesome PostgreSQL**           | [Visit](https://github.com/dhamaniasad/awesome-postgres) |
