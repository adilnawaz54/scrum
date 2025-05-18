# Proof of Concept (POC) for Java Unit Testing

| 📅 CREATED/UPDATED | 📌 VERSION | ✍️ AUTHOR    | 📝 COMMENT                     |
|--------------------|------------|--------------|--------------------------------|
| 28-09-2024         | 1.0  | Aayush Gaur  |     POC: Unit Testing         |


## Table of Contents

1. [Introduction](#introduction)
2. [Testing Framework](#testing-framework)
   - [Overview](#overview)
3. [Prerequisites](#prerequisites)
4. [Steps to Perform](#steps-to-perform)
   - [Cloning the Java Application](#cloning-the-java-application)
   - [Install Java 17 and Maven](#install-java-17-and-maven)
   - [Add the JUnit Dependency to `pom.xml`](#add-the-junit-dependency-to-pomxml)
   - [Add Maven Dependency in `pom.xml`](#add-maven-dependency-in-pomxml)
   - [Update Surefire Plugin Configuration in `pom.xml`](#update-surefire-plugin-configuration-in-pomxml)
   - [Execute Java Unit Tests](#execute-java-unit-tests)
   - [Generate HTML Report with Surefire](#generate-html-report-with-surefire)
5. [POC Conclusion](#poc-conclusion)
6. [Contact Information](#contact-information)
7. [References](#references)

## Introduction
Unit testing in Java is an essential practice for ensuring the correctness and functionality of individual code units. By isolating and testing these components, developers can improve code reliability and reduce the likelihood of errors. In this document, we will outline the steps for setting up and executing unit tests using the JUnit framework in a typical Java project.

## Testing Framework
Java unit testing is facilitated by various testing frameworks, with JUnit being one of the most widely adopted. JUnit provides a structured way to write, organize, and execute tests.

Overview
The salary microservice has pre-existing unit test cases authored by the developer, which are located in the following directory path:

```
src/test/java/com/opstree/microservice/salary
```


## Prerequisites
- Java Version 17 (as specified in pom.xml)
- Maven: Maven simplifies dependency management and project build processes, including testing.
- JUnit: A necessary library for executing the unit tests.

## Steps to perform

### Cloning the Java Application
To begin, clone the salary-api repository from GitHub into your local directory:
```
git clone https://github.com/OT-MICROSERVICES/salary-api.git
```
## Install Java 17 and Maven
Since the salary codebase relies on Java 17, it is essential to install the correct version of Java and Maven for managing project dependencies.
```
sudo apt update
sudo apt install openjdk-17-jdk
sudo apt install maven
```

## Add the JUnit Dependency to ```pom.xml```
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


## Add Maven Dependency in ```pom.xml```
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

### Update Surefire Plugin Configuration in pom.xml
To resolve compatibility issues with JUnit, you may need to uncomment and adjust the Surefire plugin configuration in the pom.xml file.
Make sure to update the Surefire plugin 3.0.0:
![Screenshot from 2024-09-30 11-23-38](https://github.com/user-attachments/assets/51c12b2b-7107-4443-8c56-0b5f77bdb976)

## Execute Java Unit Tests
Run the following Maven command to execute the unit tests:
```
mvn test
```
![Screenshot from 2024-09-30 12-25-03](https://github.com/user-attachments/assets/140aafdd-6e1e-4053-9ff7-86c6e7b1a81f)

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
