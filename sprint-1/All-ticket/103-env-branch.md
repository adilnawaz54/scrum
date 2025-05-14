# Environment Branch Flow

<p align="center">
  <img src="https://github.com/user-attachments/assets/a3f884b0-cb34-4268-b971-e2aab70426fb" width="500"/>
</p>

---

## Author Information
| Created | Version | Last Modified | Author | Comment | Reviewer |
| --- | --- | --- | --- | --- | --- |
| 01-05-2025 | V1.1 | 01-05-2025 | Shivani Narula | Internal Review | Siddharth Pawar |
| 01-05-2025 | V2 | 01-05-2025 | Shivani Narula | L0 Review | Naveen Haswani |
| 01-05-2025 | V3 | 01-05-2025 | Shivani Narula | L1 Review | Deepak Nishad |
| 01-05-2025 | V4 | 01-05-2025 | Shivani Narula | L2 Review | Ashwani Singh |

---

## Table of content 
- [Introduction](#introduction) 
- [What](#why)
- [Why](#why)
- [Types of Environment Branches](#types-of-environment-branches)
- [Environment Branch Flow](#environment-branch-flow)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Best Practices](best-practices)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [Reference Table](#reference-table)

# Introduction
This document provides a comprehensive overview of Environment Branches in version control systems. It explains their purpose, types, usage workflows, and best practices to support effective software development and deployment strategies.

---

## What?
Environment Branching Flow is a Git strategy that separates code across environments like development, staging, and production.It helps teams work in parallel, test safely, and deploy stable code efficiently.

---

## Why?
Environment branches help in managing different stages of software development (e.g., development, staging, production) by isolating code meant for each environment. They provide:
- **Better isolation and stability for production environments:** Keeps production code stable by limiting changes and testing.
- **Parallel development:** Multiple teams can work on different features or fixes without affecting each other.
- **Safer testing for production:** Enables testing of new features or bug fixes in staging or development environments before deploying to production.

---

## Types of Environment Branches
| **Branch**          | **Purpose**                                    | **Naming**                  | **Workflow**                                                                                          |
|---------------------|------------------------------------------------|-----------------------------|-------------------------------------------------------------------------------------------------------|
| **Development Branch** | Central branch for active development.       | `develop` or `dev`           | Feature branches are merged here after completion and review.                                          |
| **Feature Branches**  | Isolated branches for new features or bug fixes. | `feature/<feature-name>` (e.g., `feature/login-system`) | Created from `develop` and merged back after review. [Link to more details](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-100-Nishkarsh/vcs_design%20%2B%20poc/branching%20strategy/feature%20branch%20flow/README.md) |
| **Staging Branch**    | Pre-production testing environment.           | `staging`                    | Code from `develop` is merged for QA testing and reviews.                                              |
| **Release Branch**    | Stabilization and final prep for deployment.  | `release/<version>` (e.g., `release/v1.0.0`) | Bug fixes are finalized, then merged into `main` and `develop`.                                        |
---

## **Workflow Diagram**:

![image](https://github.com/user-attachments/assets/d01c45a7-c324-49d7-a956-e6b5a2866cc5)

## Environment Branch Flow:
1. **Feature Branch**: This branch is created to work on a specific feature or task. For example, if you need to add a "Login" feature, you would create a "feature/login" branch and work on it.
> Example: Once the "Login" feature is complete, you will merge this branch into the Development branch.
2. **Development:** This is the branch where all features get integrated. When multiple feature branches are complete, they are merged into the Development branch.
> Example: If both "Login" and "Signup" features are merged into the Development branch, they are now ready for the next step.
3. **Staging:** Staging is a testing environment where the application is tested before being deployed to production. Final checks and bug fixes are done here.
> Example: When "Login" and "Signup" features are merged from Development into Staging, the testing team verifies them here.
4. **Production:** This is the live environment where the app is available to real users. Once everything works well in Staging, changes are deployed to Production.
>Example: After successful testing of the "Login" and "Signup" features in Staging, they are deployed to Production so users can access them.

---

## Advantages
| **Advantage**            | **Description**                                                    |
|--------------------------|--------------------------------------------------------------------|
| **Isolation**             | Ensures active development does not impact production stability.  |
| **Scalability**           | Supports multiple developers working on different features.      |
| **Improved Code Quality** | Early detection and fixing of bugs.                               |
| **Organized Releases**    | Systematic and less error-prone deployment process.               |
| **Efficient Team Work**   | Teams can work on different features without stepping on each other's toes. |
| **Risk Reduction**        | Isolating changes helps prevent issues in the live environment.    |

---

## Disadvantages
| **Disadvantage**          | **Description**                                                    |
|--------------------------|--------------------------------------------------------------------|
| **Complexity**            | Managing multiple branches can be tricky.                         |
| **Merge Conflicts**       | Combining different branches can lead to conflicts that need resolving. |
| **Resource Intensive**    | Requires more resources for managing and testing various environments. |
| **Potential Delays**      | More stages can slow down the release process.                    |

---

## Best Practices

| **Best Practice**                      | **Description**                                                                 |
|---------------------------------------|---------------------------------------------------------------------------------|
| **Use Naming Conventions**            | Follow consistent branch names (e.g., `feature/login`, `release/v1.2.0`).       |
| **Keep Branches Short-lived**         | Avoid long-running branches to reduce merge conflicts and code drift.          |
| **Use Pull Requests and Code Reviews**| Always merge via PRs to maintain code quality and peer validation.             |
| **Automate Testing on Every Merge**   | Use CI pipelines to test code automatically when branches are merged.          |
| **Protect Main/Production Branches**  | Use Git branch protection rules to avoid direct commits to main/staging.       |
| **Regularly Sync Feature Branches**   | Rebase or merge `develop` into your feature branches regularly to avoid drift. |
| **Tag Releases**                      | Use Git tags (e.g., `v1.0.0`) on `release` or `main` branches for traceability. |
| **Use Feature Flags When Needed**     | Toggle incomplete features safely in production without rollback.              |

---

## Conclusion
Environment branching is a great way to manage software development, testing, and deployment. It helps maintain code quality and reduces risks, though it does come with some complexity. Understanding the flow and types of branches can help teams use this strategy effectively.

---

## Contacts

| Name | Email Address |
| --- | --- |
| Shivani Narula | shivani.narula.snaatak@mygurukulam.co |

---

## Reference Table

| Links                                                                                                                             | Descriptions                          |
|-----------------------------------------------------------------------------------------------------------------------------------|---------------------------------------|
| https://matiascreimerman.neocities.org/blogposts/creimerman/matias/methodology/environment-based-branching-strategy-branching-by-environment | Environment Branch Flow |
| https://www.abtasty.com/blog/git-branching-strategies/ | Different Branching Strategy |
