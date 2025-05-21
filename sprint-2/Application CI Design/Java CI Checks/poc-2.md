
# Java Code Compilation Using Maven (POC)
<p align="center">
  <img src="https://icons.labex.io/how-to-compile-java-programs-easily.png" alt="Java Code Compilation Diagram" width="150"/>
</p>

 ##  **Author Information**
 | Last Updated | Version | Author          | Comment           | Reviewer |
|--------------|---------|------------------|-------------------|----------|
| 19-05-2025   | V1.0    | Adil Nawaz   | Internal Review   | Pritam   |
| 00-05-2025   | V2.0    | Adil Nawaz   | L0                | Shreya   |
| 00-05-2025   | V3.0    | Adil Nawaz   | L1               | Abhishek V   |

---

## **Table of Contents**

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)  
- [System Requirements](#system-requirements)  
- [Build-Time Dependencies](#build-time-dependencies)  
- [Run-Time Dependencies](#run-time-dependencies)  
- [Code Compilation in Java CI Checks](#code-compilation-in-java-ci-checks)  
- [Step-by-Step Instructions](#step-by-step-instructions)  
  - [Step 1: Install JDK and Maven](#step-1-install-jdk-and-maven)  
  - [Step 2: Clone the Git Repository](#step-2-clone-the-git-repository)  
  - [Step 3: Compile the Java Code](#step-3-compile-the-java-code)  
- [Conclusion](#conclusion)  
- [Contact Information](#contact-information)  
- [References](#references)

---

## **Introduction**
This document demonstrates how to compile a Java project using Maven via terminal commands. It offers a quick, CI-friendly method without relying on Jenkins or other CI tools.

---
## **Prerequisites**

These are the software-level and access-related requirements that must be fulfilled before proceeding with Java code compilation using Maven:

- A Linux-based system with `sudo` privileges
- Internet access for downloading packages and Maven dependencies
- Access to the GitHub repository with a valid `pom.xml` file
- Basic knowledge of terminal commands
- Git installed on the system

---

## **System Requirements**

These are the hardware and core software requirements needed to ensure the system can compile and run Java applications effectively:

| **Specification**          | **Minimum Requirement**                                          |
|----------------------------|------------------------------------------------------------------|
| **Operating System**        | Ubuntu 22.04 LTS, CentOS, Amazon Linux 2, or equivalent         |
| **Processor**               | Dual-core CPU or higher                                          |
| **Memory (RAM)**            | Minimum 2 GB (Recommended: 4 GB or more for larger projects)     |
| **Disk Space**              | Minimun 1 GB of free disk space for the installation and dependencies                                 |
| **Java Version**            | JDK 8 or higher (Set the `JAVA_HOME` environment variable)               |
| **Maven Version**           | Apache Maven 3.x (latest stable version)                        |
| **Git**                     | Latest version for cloning repositories                         |


---

## **Build-Time Dependencies**

| Tool     | Version | Description                                                            |
|----------|---------|------------------------------------------------------------------------|
| Maven    | 3.x+    | Build automation tool for compiling, managing dependencies, and packaging |
| JDK      | 17      | Required to compile Java source code                                    |
| Git      | Latest  | Required to clone the code repository                                   |

---

## **Run-Time Dependencies**

| Tool  | Version | Description                                        |
|-------|---------|----------------------------------------------------|
| Java  | 17      | Java runtime environment to execute compiled classes |

---

## **Code Compilation in Java CI Checks**

Refer to the [Detailed Document](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-156-SHIVANI/application-ci/checks/java/code-compilation/documenation/README.md) for extended integration details.

---

## **Step-by-Step Instructions**

### **Step 1: Install JDK and Maven**

➡️ *Installation*: [Go to this link for Jdk & Maven installation guide](https://github.com/snaatak-Downtime-Crew/Documentation/tree/main/common_stack/application/java/maven/sop#prerequisites)

![Screenshot 2025-05-18 142137](https://github.com/user-attachments/assets/33f445f4-01b4-4171-94cc-ae2ec3ce8161)
![image](https://github.com/user-attachments/assets/e97ae2d2-0225-4d3b-9348-f0e0f290e187)
![image](https://github.com/user-attachments/assets/af595d2a-642e-4496-b31c-d383633a1e67)

---

### **Step 2: Clone the Git Repository**
```bash
sudo apt install -y git
git --version

git clone https://github.com/OT-MICROSERVICES/salary-api.git
cd salary-api
```
![image](https://github.com/user-attachments/assets/210d6a17-b2cf-4458-a6b5-99e379b589a5)

---

### **Step 3: Compile the Java Code**
```bash
mvn compile
```

- If the build completes successfully, you should see:
  ```
  BUILD SUCCESS
  ```

![image](https://github.com/user-attachments/assets/1d33fabe-88d2-4888-8c05-fa79e5588186)
![image](https://github.com/user-attachments/assets/e8ec4644-8828-4d62-a94e-fa5846b07445)

---

## **Conclusion**
Compiling Java code through the terminal using Maven ensures fast feedback, simplifies local testing, and supports lightweight CI workflows.

---

## **Contact Information**

| Name           | Email Address                             |
|----------------|-------------------------------------------|
| Shivani Narula | shivani.narula.snaatak@mygurukulam.co    |

---

## **References**

| Links                                                                 | Descriptions                              |
|----------------------------------------------------------------------|-------------------------------------------|
| [Maven Documentation](https://maven.apache.org/)                    | Official Apache Maven guide and commands  |
| [OpenJDK Installation Guide](https://openjdk.org/install/)          | Details for installing OpenJDK on Linux   |
| [Git Basics](https://git-scm.com/doc)                               | Git usage and command references          |
