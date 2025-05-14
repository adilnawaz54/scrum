# Pull Request in GitHub ![git-pull-request-fill-development](https://github.com/user-attachments/assets/047edfc3-5555-448c-ac53-ebb5d81207ba)

##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 27-04-2025  | V1.1    | Adil Nawaz    | 01-05-2025         | Internal Reviewer | Pritam |
| 27-04-2025  | V2      | Adil Nawaz    | 05-05-2025         | L0 Reviewer      | Shreya           |
| 27-04-2025  | V3      | Adil Nawaz    | 05-05-2025         | L1 Reviewer      | Abhishek V         |
| 27-04-2025  | V4     | Adil Nawaz    | 05-05-2025         | L2 Reviewer      | Abhishek D         |

---


## Table of Contents

1. [Introduction](#introduction)
2. [What is a Pull Request?](#what-is-a-pull-request)
3. [Why Do We Use Pull Requests](#why-do-we-use-pull-requests)
4. [Features of Pull Requests](#features-of-pull-requests)
5. [Architecture](#architecture)
   * [Advantages of Pull Requests](#advantages-of-pull-requests)
   * [Disadvantages of Pull Requests](#disadvantages-of-pull-requests)
6. [JIRA and Pull Request (PR) Mechanisms](#jira-and-pull-request-pr-mechanisms)
   * [Step 1: JIRA Issue Creation](#step-1-jira-issue-creation)
   * [Step 2: Branch Creation Linked to JIRA](#step-2-branch-creation-linked-to-jira)
   * [Step 3: Code Development & Commit Messages](#step-3-code-development--commit-messages)
   * [Step 4: Create a Pull Request](#step-4-create-a-pull-request)
   * [Step 5: PR Appears in JIRA](#step-5-pr-appears-in-jira)
7. [Best Practices for Pull Requests](#best-practices-for-pull-requests)
8. [Conclusion](#conclusion)
9. [Contact Information](#contact-information)
10. [References](#references)

---



## Introduction
This documentation is about Pull Request, which is widely used in open-source and enterprise environments to maintain clean, stable, and secure codebases. It allows teams to review, discuss, improve, and track modifications before integrating them.





## What is a Pull Request?

<p align="center">
<img width="500" alt="what is pull request" src="https://github.com/user-attachments/assets/f9d9f59d-ec87-481b-a577-4c92034a2200">
</p>


A **Pull Request** is a formal request to "pull" your code into the main project, after review and approval. It allows developers to contribute to a project by suggesting modifications, which can be reviewed, discussed, and merged into the main codebase by the repository's maintainers. A pull request is an essential tool for collaborating on open-source projects or within teams.

---


## Why Do We Use Pull Requests

| Reason               | Description                                                                                  |
|----------------------|----------------------------------------------------------------------------------------------|
| **Collaboration**    | Facilitates collaboration among multiple developers working on the same project.           |
| **Quality Assurance**| Ensures that changes are reviewed and meet the project's standards.                         |
| **Transparency**     | Keeps a detailed log of changes and the reasoning behind them.                               |
| **Feedback Loop**    | Encourages constructive feedback and helps improve code quality.                            |
| **Version Control**  | Provides control over the integration of changes into the main branch.                      |


## Features of Pull Requests

| Feature                | Description                                                                                     |
|------------------------|-------------------------------------------------------------------------------------------------|
| **Code Review**        | Pull requests allow team members or contributors to review code changes before they are merged. |
| **Discussion and Feedback** | Developers can discuss the proposed changes through comments and suggestions.                  |
| **Continuous Integration** | Automate testing and checks to ensure the proposed changes don't break the codebase.           |
| **Documentation**      | Provides a historical record of what changes were made, why, and by whom.                      |
| **Merge Control**      | Maintainers control when and how code changes are merged into the main branch.                 |

---


## Architecture

<p align="center">
   <img width="600" alt="How to use pull request" src="https://github.com/user-attachments/assets/b983b4f9-4c87-4bc3-8679-2cd3a0a50dac">
</p>


### Advantages of Pull Requests

| Benefit                             | Description |
|-------------------------------------|-----------------------------------------------|
| **Promotes Team Collaboration**     | Encourages multiple team members to review, suggest changes, and collaborate effectively.|
| **Improves Code Quality**           | By allowing multiple people to review the changes, potential bugs or improvements can be identified. |
| **Tracks Changes**                  | Helps maintain a record of what changes were made and why.  |
| **Enforces Best Practices**         | Pull requests can be set up to enforce guidelines and best practices before merging code.  |

### Disadvantages of Pull Requests

| Disadvantage | Description |
|:-------------|:------------|
| **Slower Development Cycle** | Waiting for reviews and approvals can delay merging and releasing new features. |
| **Review Bottlenecks** | If reviewers are busy or unavailable, PRs can pile up, creating a backlog. |
| **Overhead for Small Changes** | Even simple fixes (like typo corrections) require formal review, adding unnecessary process overhead. |
| **Merge Conflicts** | Long-living PRs can easily get outdated, leading to complex merge conflicts that are harder to resolve. |

---

## **JIRA** and **Pull Request (PR) mechanisms**


### Step 1: **JIRA Issue Creation**

* A developer (or product owner) creates a **JIRA issue** (e.g., `PROJECT-123`) for a new feature, bugfix, or task.
* This issue will act as the anchor for code changes.

![Screenshot 2025-05-06 123133](https://github.com/user-attachments/assets/878c68a1-74b0-411a-b933-80dd710b2036)

---

### Step 2: **Branch Creation Linked to JIRA**

* The developer creates a **Git branch** with the JIRA issue key in the name, for example:
  `SCRUMS-106-Adil`

<img src="https://github.com/user-attachments/assets/b7427d78-fbcc-45d4-a53a-61570c90c75a" width="600" alt="Screenshot 2025-05-06 111317" />

---

### Step 3: **Code Development & Commit Messages**
* These commits will also be **linked to the JIRA issue automatically**.
<img src="https://github.com/user-attachments/assets/9a4ae54b-8267-4d12-90b1-34667048fb66" width="600" alt="Screenshot 2025-05-06 115805" />

---

### Step 4: **Create a Pull Request**

* A PR is raised from the feature branch (e.g., `SCRUMS-106-Adil`) to the main/development branch.
* If the PR title or description includes the JIRA issue key, **JIRA will automatically link this PR** under the issue's "Development" section.
![Screenshot 2025-05-06 115834](https://github.com/user-attachments/assets/765f4083-b537-47f5-9351-13b93fc856af)
<img src="https://github.com/user-attachments/assets/c9e67bb5-9228-4091-9441-5a99d742d16a" width="600" alt="Screenshot 2025-05-06 120005" />

---

### Step 5: **PR Appears in JIRA**

  * JIRA shows the PR status (`Open`, `Merged`, `Declined`)
  * Reviewer(s) can see the PR directly in JIRA.
- <img src="https://github.com/user-attachments/assets/528f9e60-f955-4d3f-9b06-3d546865aab8" width="600" alt="Screenshot 2025-05-06 121915" />
- <img src="https://github.com/user-attachments/assets/f621a874-700d-4e52-80f0-6d09f0ec5e77" width="600" alt="Screenshot 2025-05-06 131408" />

---


## Best Practices for Pull Requests

| Best Practice | Description |
|:--------------|:------------|
| **Keep Pull Requests Small** | Focus on a single logical change to make reviews faster and easier to understand. |
| **Write Clear Titles and Descriptions** | Summarize *what* the change does and *why* it’s needed to help reviewers quickly grasp the purpose. |
| **Request Specific Reviewers** | Assign reviewers who have the right context or ownership of the code being modified. |
| **Link with Tickets** | Connect the PR to related issues (e.g., Jira, GitHub Issues) for full traceability. |
| **Address Review Comments Thoughtfully** | Engage respectfully with reviewer feedback; explain if you disagree instead of ignoring. |


---



### Conclusion

* Pull Requests (PRs) help manage contributions to a repository in a structured way.
* They maintain high-quality, stable, and secure codebases through code reviews.
* They support smooth and safe integration of code into the main branch.
* Small and focused PRs help in catching bugs early during the review process.

## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |



### References
| Links                                             | Descriptions                                                    |
|---------------------------------------------------|-----------------------------------------------------------------|
|[Link](https://www.gitkraken.com/learn/git/tutorials/what-is-a-pull-request-in-git) |Pull Request |
|[Link](https://axolo.co/blog/p/part-1-what-are-github-pull-requests)| Github doc for pull request|
|[Link](https://opensource.com/article/19/7/create-pull-request-github)|Opensource.com|
