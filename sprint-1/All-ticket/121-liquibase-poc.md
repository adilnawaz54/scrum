## Liquibase POC

<p align="center">
  <img src="http://miro.medium.com/v2/resize:fit:1400/1*nv2OUhfT-faVH52acTTAEQ.png" alt="Liquibase Logo" width="150"/>
</p>

---

## Author Information
| Created | Version | Last Modified | Author | Comment | Reviewer |
| --- | --- | --- | --- | --- | --- |
| 30-04-2025 | V1 | 2-05-2025 | Shivani Narula | Internal Review | Siddharth Pawar |
| 02-05-2025 | V2 | 30-04-2025 | Shivani Narula | L0 Review | Naveen Haswani |
| 30-04-2025 | V3 | 30-04-2025 | Shivani Narula | L1 Review | Deepak Nishad |
| 30-04-2025 | V4.1 | 30-04-2025 | Shivani Narula | L2 Review | Ashwani Singh |


## Table of Contents

- [Introduction](#introduction)  
- [Pre-requisites](#pre-requisites)  
- [Architecture Overview](#architecture-overview)  
- [Step-by-Step Setup Guide](#step-by-step-setup-guide)  
- [Backup and Rollback Strategy](#backup-and-rollback-strategy)
- [Best Practices](#best-practices)   
- [Conclusion](#conclusion)  
- [Contact Information](#contact-information)  
- [Reference Table](#reference-table)

---

## Introduction

Liquibase is an open-source database schema change management tool. It helps developers and DevOps teams track, manage, and apply changes to relational databases in a version-controlled, automated, and repeatable manner.This POC demonstrates how Liquibase can be used for version-controlled database changes, including setup, change tracking, and rollback strategies.

---

## Pre-requisites

| Tool/Component      | Description                            |
|---------------------|----------------------------------------|
| Java (JDK 8+)        | Required to run Liquibase              |
| Liquibase CLI | Interface to apply DB changes          |
| Database             | PostgreSQL, MySQL, Oracle, etc.       |
| Git                  | For tracking changelogs               |
| JDBC Driver          | For connecting Liquibase to the DB    |
| SQL and Database Operations Knowledge | Basic understanding of SQL and database operations |

---

## Architecture Overview

![image](https://github.com/user-attachments/assets/b9e299c0-ba3e-4a3b-a788-e05296d7f258)


**Explanation**
1. Author: Developer
   Creates or updates the changelog file (changelog.xml) that defines database changes.This file is written in XML, YAML, JSON, or SQL format.

2. Version Control
   Changelog files are committed to Git or any version control system.Liquibase commands are triggered manually using the latest committed changelogs.

3. Liquibase
   Reads the changelog file and applies only unapplied changes to the database.Keeps track of applied changes using internal tables (DATABASECHANGELOG, etc.).

4. Database
   The actual target database receives schema/data updates from Liquibase.All changes are executed in order and stored for audit/history.

---
## Step-by-Step Setup Guide

### 1. Install Java Development Kit (JDK)
 Kindly use this documentation to install a specific version of Java.
 
 👉**References here**:  [Java Installation](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/application/java/installation/script/README.md)
> ➡️ **Note:**  Liquibase is a Java-based tool, so installing JDK 8+ version.It is mandatory and required to run Liquibase commands because Liquibase runs on the Java Virtual Machine (JVM).
 
---

### 2. Install PostgresSQL 
 Kindly use this documentation to install a PostgresSQL DB.
 
 👉 **References here**: [Install PostgresSql](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-86-Vardaan/common_stack/software/postgresql/installation/README.md)

---
### 3. Install Liquibase

➡️ Import the Liquibase GPG key and repository:
>
>```bash
>wget -O- https://repo.liquibase.com/liquibase.asc | gpg --dearmor > liquibase-keyring.gpg && \
>cat liquibase-keyring.gpg | sudo tee /usr/share/keyrings/liquibase-keyring.gpg > /dev/null && \
>echo 'deb [arch=amd64 signed-by=/usr/share/keyrings/liquibase-keyring.gpg] https://repo.liquibase.com stable main' | sudo tee /etc/apt/sources.list.d/liquibase.list
>```

---
➡️ Update the package list:
After adding the repository, update your system's package list to recognize the new repository:
>
>```bash
> sudo apt-get update
>```
---
➡️ Install Liquibase:
Install liquibase by running
>
>```bash
> sudo apt-get install liquibase
>```
---
![image](https://github.com/user-attachments/assets/ad4c4493-2efb-4b75-8d14-bb7d7d387cf9)


➡️Verification
After completing the installation, ensure Liquibase is ready to use by running a simple version command:
>
>```bash
> liquibase --version
>```
---
![image](https://github.com/user-attachments/assets/6155a2af-79c7-4494-9768-c8116d2c6105)

### 4. For Connecting with DB
➡️ Update **liquibase.properties** file from your project(OT-MICROSERVICES) to connect with db 
 - Just Replace IP address `172.31.xx.xx` with your actual private IP address.
---

### 5. Check liquibase status

```bash
liquibase status
```
---
![image](https://github.com/user-attachments/assets/b219edf9-2d6b-4acb-bc5c-0e1f011cd716)

---

## Backup and Rollback Strategy

| Strategy Type  | Approach                                               |
|----------------|--------------------------------------------------------|
| Backup         | DB snapshot before Liquibase run (e.g., `pg_dump`)     |
| Rollback       | Use `rollback` tag or Liquibase rollback commands      |
| ChangeSet Design | Include `<rollback>` inside each `changeSet`         |

## Explanation:

➡️ Backup:
A backup strategy in Liquibase involves regularly saving the database state before making any changes. This ensures you can restore the database if something goes wrong. Backups are typically created using tools like pg_dump for PostgreSQL and are essential before applying new changelogs.

➡️ Rollback:
A rollback strategy in Liquibase allows you to revert specific schema changes using versioned changelogs. This is useful when a recently applied change introduces issues. Rollbacks are defined directly in the changelogs and are executed through Liquibase CLI commands to restore the previous state of the schema.

---

### ✅ Case 1: Applying Changes to the Database (Tested)
In this scenario, we apply an actual change to the database using Liquibase. For example, adding a new column to an existing table:

**ChangeLog Example:**
```xml
<changeSet id="101" author="shivani">
    <addColumn tableName="employee">
        <column name="designation" type="varchar(100)"/>
    </addColumn>
    <rollback>
        <dropColumn tableName="employee" columnName="designation"/>
    </rollback>
</changeSet>
```

**Command to Apply Change:**
```bash
liquibase update
```

**Outcome**: The `designation` column is added to the `employee` table and can be verified directly from the DB.

---

### ✅ Case 2: Performing a Rollback to Previous State (Tested)
If a change introduces an issue or was mistakenly applied, it can be rolled back using the `rollbackCount` or `rollbackToTag`.

**Rollback Command Example:**
```bash
liquibase rollbackCount 1
```

**Outcome**: The last changeset (e.g., adding `designation` column) is reverted and dropped from the database.

---

### Rollback vs Backup — When to Use What?

| Scenario                                                                 | Recommended Action         | Reason                                                                 |
|--------------------------------------------------------------------------|-----------------------------|------------------------------------------------------------------------|
| Minor schema issue from recent deployment (change tracked by Liquibase) | **Liquibase Rollback**      | Easier, version-controlled, and doesn't affect unrelated data         |
| Corrupt data or failed manual DB operation                               | **Restore Backup**          | Liquibase only handles schema/versioned changes, not data integrity   |
| Multiple chained failures from changesets                                | **Restore Backup**          | Rollbacks might fail partially; restoring ensures full consistency    |
| Controlled change gone wrong (with defined `<rollback>`)                | **Liquibase Rollback**      | Clean, declarative rollback logic is already embedded in the changeset |
| Untracked schema or direct DB changes                                    | **Restore Backup**          | Liquibase can't rollback unknown or manually introduced changes       |

---

### Backup Command Example (Before Applying Changes)
Always take a DB snapshot prior to applying Liquibase updates:

```bash
pg_dump -h <private-ip-address> -p 5432 -U postgres -d attendance_db > backup.sql
```

---

## Best Practices

| **Best Practice**        | **Description**                                                                 |
|--------------------------|---------------------------------------------------------------------------------|
| **Version Control**      | Store your changelog files in a version control system (e.g., Git).              |
| **Granular Changesets**  | Make changesets small and granular to facilitate easier troubleshooting and rollback. |
| **Testing**              | Always test changesets in a staging environment before applying them to production. |
| **Documentation**        | Document changesets thoroughly to ensure they are understandable by other team members. |

---

## Conclusion
Liquibase is a powerful tool for managing database schema changes, providing a reliable way to track, version, and deploy changes. By following best practices and having a solid backup and rollback strategy, you can effectively manage your database schema lifecycle.


## **Contact Information**

| Name           | Email Address                             |
|----------------|-------------------------------------------|
| Shivani Narula   | shivani.narula.snaatak@mygurukulam.co       |

---

## **Reference Table**

| **Link**                                                                                                                     | **Description**                                    |
|-----------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| [How to install Liquibase Database DevOps](https://chandrapurnimabhatnagar.medium.com/how-to-install-liquibase-database-devops-34ca9a6d9705) | Liquibase installation   |
| [Liquibase Official Documentation](https://www.liquibase.org/documentation.html) | Liquibase Official Documentation |
| [Java JDK Documentation](https://docs.oracle.com/en/java/) | Java JDK Documentation |
 
