# Java CI Checks: Unit Testing

##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 19-05-2025  | v1      | Adil Nawaz    |        | Internal Reviewer| Pritam        |
|  | v2.1   | Adil Nawaz    |        | L0 Reviewer      | Shreya           |
|  | v3    | Adil Nawaz    |          | L1 Reviewer      | Abhiskek V         |
|  | v4    | Adil Nawaz    |         | L2 Reviewer      | Abhiskek D         |



## Table of Contents

1. [Introduction](#introduction)
2. [What is Unit Testing](#what-is-unit-testing)
3. [Why is Unit Testing Important](#why-is-unit-testing-important)
4. [Workflow Diagram](#workflow-diagram)
5. [Different Tools for Unit Testing in Java](#different-tools-for-unit-testing-in-java)
6. [Tool Comparison](#tool-comparison)
7. [Advantages of Unit Testing](#advantages-of-unit-testing)
8. [Proof of Concept (POC)](#proof-of-concept-poc)
9. [Best Practices](#best-practices)
10. [Conclusion](#conclusion)
11. [Contact Information](#contact-information)
12. [References](#references)



## Introduction
Unit testing is a critical practice in software development that involves testing individual units or components of an application in isolation. In Java, unit testing helps validate that each method or class performs as expected before the code is integrated into the larger system.

Unit tests are automated and run regularly as part of Continuous Integration (CI) pipelines to ensure that changes in the codebase don’t introduce regressions or break existing functionality.

## What is Unit Testing
Unit testing refers to testing individual components of the software (such as functions, classes, or methods) in isolation from other parts of the system. This is done to ensure that each unit behaves correctly according to its design and requirements.

In Java, common unit testing frameworks include JUnit and TestNG. These frameworks allow you to create tests that are automatically executed as part of the CI pipeline, ensuring that any code changes still meet quality standards.

## Why is Unit Testing Important
| **Reason**                   | **Explanation**                                                                                  |
|------------------------------|--------------------------------------------------------------------------------------------------|
| **Prevents Regressions**      | Running unit tests as part of a CI pipeline ensures that new changes don’t break existing code.   |
| **Early Bug Detection**       | Bugs are detected early in the development process, reducing the cost of fixing them later.       |
| **Code Quality**              | Unit tests enforce a structured and well-tested codebase.                                         |
## Workflow Diagram
![image](https://github.com/user-attachments/assets/7485bb81-88f4-4828-9bce-643335771002)


## Different Tools for Unit Testing in Java
| Tool                      | Description                                       | Key Features                               |
| ------------------------- | ------------------------------------------------- | ------------------------------------------ |
| **JUnit**                 | Most widely used testing framework for Java       | Annotations, assertions, runners           |
| **TestNG**                | Inspired by JUnit, supports more flexible tests   | Parallel testing, data-driven tests        |
| **JaCoCo**                | Java Code Coverage Library                        | Measures test coverage, integrates with CI |
| **Maven Surefire Plugin** | Runs unit tests in Maven build lifecycle          | Integration with Maven builds              |
| **Gradle Test Task**      | Runs unit tests during Gradle builds              | Flexible test configuration                |
| **SonarQube**             | Code quality and coverage analysis                | Integration with CI for reports            |

## Tool Comparison
| Feature / Tool         | JUnit                | TestNG                        | JaCoCo                  | Gradle Test Task          | SonarQube                         |
| ---------------------- | -------------------- | ----------------------------- | ----------------------- | ------------------------- | --------------------------------- |
| Category               | Testing Framework    | Testing Framework             | Code Coverage Tool      | Test Runner Task (Gradle) | Static Code Analysis Platform     |
| Test Framework Support | JUnit                | TestNG                        | Any (depends on runner) | JUnit/TestNG              | JUnit/TestNG/others               |
| Code Coverage          | No                   | No                            | Yes                     | No                        | Yes (pulls from JaCoCo)           |
| Reporting              | Yes (with Gradle)    | Yes                           | Yes (HTML, XML)         | Yes (console + HTML/XML)  | Yes (Dashboard, detailed metrics) |
| Custom Test Configs    | Limited              | Advanced (e.g., DataProvider) | Not applicable          | Yes (via `build.gradle`)  | Yes (custom rules and plugins)    |
| Ease of Use            | Easy                 | Medium                        | Easy                    | Medium                    | Medium to Advanced                |
| Best For               | General Unit Testing | Complex Test Flows            | Measuring Test Coverage | Orchestrating test runs   | Code Quality, Security, Coverage  |



## Advantages of Unit Testing
| **Benefit**                  | **Explanation**                                                                                      |
|------------------------------|------------------------------------------------------------------------------------------------------|
| **Automation**               | Unit tests can be automatically executed every time code is pushed, ensuring consistency.             |
| **Efficiency**              | As the project grows, more tests can be added to cover new features and components.                   |
| **Confidence in Code Changes**| Unit tests provide assurance that the codebase remains functional even after frequent updates.        |
| **Documentation**            | Well-written unit tests serve as documentation for the expected behavior of code components.          |
| **Faster Feedback**          | Quick feedback loops help developers address issues early in the development lifecycle.               |

## Proof of Concept (POC)
For performing unit testing in java you can refer this poc [Link](https://github.com/mygurukulam-p10/Documention/blob/main/Application%20CI%20Design/Java%20CI%20checks/Unit%20Testing/POC/readme.md)

## Best Practices
| **Best Practice**                | **Explanation**                                                                                                     |
|----------------------------------|---------------------------------------------------------------------------------------------------------------------|
| **Write Small, Isolated Tests**  | Each test should focus on a single piece of functionality.                                                           |
| **Use Meaningful Test Names**    | Use descriptive names that explain what the test is checking.                                                        |
| **Mock External Dependencies**   | Use mocking frameworks like Mockito to avoid dependencies on databases or external APIs.                             |
| **Keep Tests Fast**              | Unit tests should execute quickly to avoid slowing down the CI pipeline.                                             |
| **Ensure Code Coverage**         | Strive for high code coverage without sacrificing test quality.                                                      |
| **Automate Test Execution**      | Integrate unit testing into CI pipelines to catch issues early.                                                      |


## Conclusion
Unit testing is a foundational practice in modern CI pipelines, helping to ensure the quality and reliability of software. **JUnit** is the preferred tool for unit testing in Java because it is widely standardized, easy to learn, and supported by a large community. It integrates smoothly with build tools like Maven and Gradle, offers improved parallel test execution, and is compatible with most IDEs, making it a reliable and efficient choice for Java projects.

## Contact Information


| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

## References 
|links | Description |
|-------|-----------|
|https://www.browserstack.com/guide/unit-testing-java | Unit Testing |
| https://www.baeldung.com/junit-5 | Junit |
