
# Conclusion Documentation of **Monorepo vs Micro Repo**

| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 26-04-2025  | V1   | Harsh Wardhan Singh   | 26-04-2025    | Internal Reviewer| Pritam           |
| 26-04-2025| V1.1| Harsh Wardhan Singh | 28-04-2025 | Internal Reviewer| Pritam |
| 26-04-2025| V1.1| Harsh Wardhan Singh | 02-05-2025| Internal L0| Akshit |
| 26-04-2025| V1.2| Harsh Wardhan Singh | 02-05-2025 | Internal L0| Akshit |

## Table of Contents
- [Purpose](#purpose)
- [Introduction](#introduction)
- [Comparison Monorepo vs Micro Repo](#comparison-monorepo-vs-micro-repo)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [References](#references)


## Purpose

The purpose of this documentation is to design an effective Version Control System (VCS) strategy that suits our organizational and project needs. We aim to compare Monorepo and Microrepo approaches, evaluate them against relevant criteria, and choose a path that best supports scalability, maintainability, and team collaboration.

## Introduction

Version Control Systems (VCS) are the backbone of modern software development, enabling collaboration, version tracking, and deployment management. Choosing the right repository structure is critical to ensure the system remains scalable, flexible, and efficient over time.

Two popular strategies for organizing repositories are:

- **Monorepo (Monolithic Repository)**
- **Microrepo (Multiple Repositories)**

Each has distinct characteristics, advantages, and trade-offs.

---

## Monorepo

A Monorepo approach consolidates multiple projects or services into a single repository. Organizations like Google, Meta, Uber, and Airbnb famously use Monorepos.

**Characteristics:**
- Single repository containing all services, libraries, and common components.
- Centralized control over versioning and standards.
- Shared tooling and dependencies.



---

## Microrepo

A Microrepo approach maintains each project or service in its own separate repository. Companies like Amazon, Netflix, LinkedIn, and Oracle follow this pattern.

**Characteristics:**
- Each service, library, or module has its own isolated repository.
- Teams have autonomy over their repositories.
- Different services can have different lifecycles.


To see the features of Mono and Micro Repo, please refer to [this link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-97-Adil/vcs_design%20+%20poc/mono-micro%20repo/mono%20repo%20features/README.md).


---

## Comparison Monorepo vs Micro Repo

| Criteria        | Monorepo                                          | Microrepo                                      |
|-----------------|----------------------------------------------------|------------------------------------------------|
| **Companies**    | Google, Meta, Uber, Airbnb                        | Amazon, Netflix, LinkedIn, Oracle               |
| **Collaboration**| Shared repository, shared ownership               | Separate repositories, independent ownership   |
| **Dependency**   | Shared dependencies                               | Independent dependency management              |
| **Scalability**  | Single standard applied across all services      | Services define their own standards             |
| **Atomic Changes**| Easy across all services                         | Ease across multiple repositories          |
| **Build Complexity**| High for large codebases                       | Moderate depending on repo size                 |

---

## Conclusion

After careful consideration, we’ve decided to use a Microrepo strategy. This approach suits our organization better because it allows us to make changes to each service independently, follow shared standards, manage dependencies more easily, and work together more effectively. To keep things organized and scalable, we’ll define clear boundaries for each module and use modern Monorepo tools to help us maintain a clean and efficient Microrepo setup.

---
## Contacts

| Name        | Email| 
  |-------------|---------|
  | Harsh Wardhan Singh| harsh.singh.snaatak@mygurukulam.co| 



---

## References


| Title        | Link| 
  |-------------|---------|
  | Google Monorepo Practices|[https://opensource.google/documentation/reference/monorepos/](https://www.thoughtworks.com/en-in/insights/blog/agile-engineering-practices/monorepo-vs-multirepo)| 

    
---
