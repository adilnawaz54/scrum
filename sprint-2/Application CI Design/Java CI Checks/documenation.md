# Java CI Checks: Unit Testing

| 📅 CREATED/UPDATED | 📌 VERSION | ✍️ AUTHOR    | 📝 COMMENT                     |
|--------------------|------------|--------------|--------------------------------|
| 26-09-2024         | 0.1       | Aayush Gaur  |      Unit Testing         |

## Table of Contents
- [Introduction](#introduction)
- [What is Unit Testing](#what-is-unit-testing)
- [Why is Unit Testing Important](#why-is-unit-testing-important)
- [Different Tools for Unit Testing in Java](#different-tools-for-unit-testing-in-java)
- [Advantages of Unit Testing](#advantages-of-unit-testing)
- [Proof of Concept (POC)](#proof-of-concept-poc)
- [Best Practices](#best-practices)
- [Recommendation](#recommendation)
- [Conclusion](#conclusion)
- [Contact Information](#contact-information)
- [References](#references)


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
| **Confidence in Refactoring** | Developers can make changes with confidence, knowing that unit tests will catch any issues introduced during refactoring. |
| **Automated Testing**         | CI pipelines automate the testing process, reducing manual effort and human error.                |

## Different Tools for Unit Testing in Java
| Tool    | Key Features                                  | Strengths                                             | Limitations                                        |
|---------|-----------------------------------------------|------------------------------------------------------|---------------------------------------------------|
| **JUnit**  | Standard, used in most Java projects           | - Wide support and integration                         | - Limited configuration options                    |
|         | Annotation-based framework                    | - Easy to set up and use in CI/CD pipelines            | - Less advanced compared to TestNG for complex cases|
|         | Supports parameterized tests                  | - Active community support and regular updates         | - Requires external libraries for mocking          |
| **TestNG** | Flexible with advanced configuration          | - Parallel test execution, more options                | - Learning curve for beginners                     |
|         | Supports data-driven testing                  | - Great for running large test suites                  | - Somewhat heavier than JUnit for simple tests      |
|         | Dependency injection support                  | - Better handling of complex test configurations       | - Integration with some tools may need extra effort |
| **Spock**  | Groovy-based, expressive syntax               | - Clear, readable tests                                | - Learning Groovy is required                      |
|         | Powerful data-driven testing support           | - Combines JUnit, Mockito, and data-driven testing     | - Smaller community compared to JUnit/TestNG        |
|         | Provides advanced mocking and stubbing         | - Highly readable and concise syntax                   | - May require JVM tuning for large test suites      |
| **AssertJ** | Rich assertion library                        | - More readable assertions                             | - Used as an add-on to JUnit/TestNG                |
|         | Fluent API for chaining assertions             | - Supports custom assertions                          | - Limited by JUnit/TestNG functionality             |
|         | Strong IDE support and auto-completion         | - Simplifies writing complex assertions                | - Requires familiarity with functional-style programming |


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

## Recommendation
 JUnit is the recommended choice for performing unit testing in Java due to its:
- **Standardization**: Widely accepted in Java development.
- **Integration**: Seamless integration with popular IDEs.
- **Ease of Learning**: Simple syntax for quick adoption.
- **Community Support**: Large and active community for ongoing assistance.
- **Parallel Execution**: Improved support for optimizing test suite performance.
- **Compatibility**: Works well with Maven and Gradle for versatile project setups.

## Conclusion
Unit testing is a foundational practice in modern CI pipelines, helping to ensure the quality and reliability of software. Java developers have access to a variety of tools for writing and running unit tests, but JUnit stands out as a practical, effective solution for most projects.

### Contact Information 
|Name|Email Address|
|:---:|:---:|
|Aayush|aayush.gaur.snaatak@mygurukulam.co|

## References 
|links | Description |
|-------|-----------|
|https://www.browserstack.com/guide/unit-testing-java | Unit Testing |
| https://www.baeldung.com/junit-5 | Junit |
