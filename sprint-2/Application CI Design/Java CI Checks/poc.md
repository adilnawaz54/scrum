# Proof of Concept (POC) for Java Unit Testing

##  **Author Information**
| Last Updated | Version | Author          | Comment           | Reviewer |
|--------------|---------|------------------|-------------------|----------|
| 19-05-2025   | V1.0    | Adil Nawaz   | Internal Review   | Pritam   |
| 00-05-2025   | V2.0    | Adil Nawaz   | L0                | Shreya   |
| 00-05-2025   | V3.0    | Adil Nawaz   | L1               | Abhishek V   |

## Table of Contents


1. [Introduction](#introduction)
2. [Pre-requisites](#pre-requisites)
3. [System Requirements](#system-requirements)
4. [Security Ports](#security-ports)
5. [Testing Framework](#testing-framework)
6. [Step-by-step Installation](#step-by-step-installation)
   * [Step 1: Update System Packages](#step-1-update-system-packages)
   * [Step 2: Install Java 17 and Maven](#step-2-install-java-17-and-maven)
   * [Step 3: Cloning the Java Application](#step-3-cloning-the-java-application)
   * [Step 4: Configure pom.xml](#step-4)
     * [Add JUnit Dependency](#add-the-junit-dependency-to-pomxml)
     * [Add Maven Compiler Plugin](#add-maven-dependency-in-pomxml)
     * [Update Surefire Plugin](#update-surefire-plugin-configuration-in-pomxml)
   * [Step 5: Execute Java Unit Tests](#step-5-execute-java-unit-tests)
7. [Generate HTML Report with Surefire](#generate-html-report-with-surefire)
8. [POC Conclusion](#poc-conclusion)
9. [Contact Information](#contact-information)
10. [References](#references)

---

## Introduction
Unit testing in Java is an essential practice for ensuring the correctness and functionality of individual code units. In this document, we will outline the steps for setting up and executing unit tests using the JUnit framework in a typical Java project.

## Pre-requisites 
- Java Version 17 (as specified in pom.xml)
- Maven: Maven simplifies dependency management and project build processes, including testing.
- JUnit: A necessary library for executing the unit tests.


## System Requirements

| **Specification**      | **Details**         |
|-------------------------|---------------------|
| **Operating System**    | Ubuntu 22.04      |
| **CPU**                | 2 vCPU             |
| **Hard Disk**             | 20 GB              |
| **RAM**                | 4 GB               |


## **Security Ports**

| **Port** | **Use Case**                  |
|----------|-------------------------------|
| 22       | SSH access for remote login   |
| 5432     | PostgreSQL database access    |

## Testing Framework
Java unit testing is facilitated by various testing frameworks, with JUnit being one of the most widely adopted. JUnit provides a structured way to write, organize, and execute tests.

Overview
The salary microservice has pre-existing unit test cases authored by the developer, which are located in the following directory path:

```
src/test/java/com/opstree/microservice/salary
```

## **Step-by-step Installation**

> **NOTE:**   
> We are using **SalaryAPI** for Java Unit testing.  
> Refer to the official POC documentation for complete steps: [Salary API POC](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/ot-ms-understanding/applications/salary/poc/README.md)

 ### **Step 1. Update System Packages**

>
>  **Update system**  
> 👉 **Follow Step 3 here**: [System update Commands](https://github.com/snaatak-Downtime-Crew/Documentation/blob/main/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#1-basic-system-commands)
>
> 

### Step 2. Install Java 17 and Maven
Since the salary codebase relies on Java 17, it is essential to install the correct version of Java and Maven for managing project dependencies.
- ![image](https://github.com/user-attachments/assets/b98f2a5f-7631-4783-b560-30bc0af5eb82)
- ![image](https://github.com/user-attachments/assets/487be602-13cd-451a-98dc-57e2201bfb0e)


### Step 2. Cloning the Java Application
![image](https://github.com/user-attachments/assets/e1ccbba5-2cb1-4b21-ba6d-8cc1c0894570)

### Step 3. Clean the project
- This removes any previously compiled files or cached test results.

![Screenshot 2025-05-21 194207](https://github.com/user-attachments/assets/fa5abc47-b0f2-4ba7-8616-ef9e12e7bdd5)

### Step 4. 

#### Add the JUnit Dependency to ```pom.xml```
Ensure that the JUnit dependency is added to your ```pom.xml``` file:
```
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
```
![Screenshot from 2024-09-30 11-26-29](https://github.com/user-attachments/assets/9440f179-d1f9-49db-ad64-3bd18cddd81a)


#### Add Maven Dependency in ```pom.xml```
Add the Maven compiler plugin to your ```pom.xml``` file for compiling your Java project:
```
<dependency>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.11.0</version>
    <type>maven-plugin</type>
</dependency>
```
![Screenshot from 2024-09-30 11-25-10](https://github.com/user-attachments/assets/c5eeed17-8b8e-4d73-9e1c-a2b29954e880)

#### Update Surefire Plugin Configuration in pom.xml
To resolve compatibility issues with JUnit, you may need to uncomment and adjust the Surefire plugin configuration in the pom.xml file.
Make sure to update the Surefire plugin 3.0.0:
![Screenshot from 2024-09-30 11-23-38](https://github.com/user-attachments/assets/51c12b2b-7107-4443-8c56-0b5f77bdb976)

### Step 5. Execute Java Unit Tests
- ![Screenshot 2025-05-21 233155](https://github.com/user-attachments/assets/b8598620-795f-402d-8596-0b7cf997dcce)

- ![image](https://github.com/user-attachments/assets/fd6c8208-3f37-4b27-b8fc-f68a9f00bede)


## Generate HTML Report with Surefire
To generate an HTML report from the test execution, run the following command:
```
mvn surefire-report:report
```
Navigate to target/site to view the generated report in your browser.

## POC Conclusion
This Proof of Concept (POC) demonstrates the process of setting up and executing unit tests in a Java project using JUnit and Maven. By incorporating unit tests into the development lifecycle, you can ensure code reliability, early bug detection, and maintainability. Tools like Maven and JUnit, along with best practices such as isolating tests and automating the testing process, significantly improve software quality. The continuous integration setup automates the testing process, ensuring that any new changes do not break existing functionality.

## Contact Information 
|Name|Email Address|
|:---:|:---:|
|Aayush|aayush.gaur.snaatak@mygurukulam.co|

## References 
|links | Description |
|-------|-----------|
|https://www.browserstack.com/guide/unit-testing-java | Unit Testing |
| https://www.baeldung.com/java-unit-testing-best-practices | Best Practices for Unit Testing |
