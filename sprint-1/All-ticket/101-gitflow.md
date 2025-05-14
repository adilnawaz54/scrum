# Branching Strategy: Git Flow Documentation

<p align="center">
  <img src="https://git-scm.com/images/logo@2x.png" width="150" alt="Git Logo"/>
</p>

---

## **Author Information**
| Created     | Last updated | Version | Author         | Level           | Reviewer        |
|-------------|--------------|---------|----------------|------------------|------------------|
| 03-05-2025  | 03-05-2025   | V1      | Prateek Rai      | Internal Review  | Siddharth Pawar    |
| 03-05-2025  | 03-05-2025   | V2    | Prateek Rai    | L0 | Shikha Tripathi |
| 03-05-2025 | 03-05-2025      | V3     | Prateek Rai  | L1   | Kirti Nehra      |
| 03-05-2025 | 03-05-2025      | V4     | Prateek Rai  | L2   | Ashwani Singh      |

---

## Table of Contents 
- [Introduction](#introduction)
- [What is Git Flow?](#what-is-git-flow)
- [Why Git Flow?](#why-git-flow)
- [Workflow Diagram](#workflow-diagram)
- [Git Flow Branching Strategy](#git-flow-branching-strategy)
- [Advantages vs Disadvantages](#advantages-vs-disadvantages)
- [Best Practices](#best-practices)
- [Conclusion](#conclusion)
- [Contact Information](#contact-information)
- [References](#references)

---

## Introduction

This document outlines the Git Flow branching strategy—a powerful Git workflow for managing software development and release cycles. Git Flow promotes strong version control discipline by clearly separating feature development, testing, and production code.

---

## What is Git Flow?

Git Flow is a Git branching model that defines a strict branching structure designed to support continuous delivery and release management. It introduces dedicated branches for features, releases, and hotfixes, improving the stability and structure of the software development lifecycle.

---

## Why Git Flow?

- **Structured Development**: Clear separation of concerns between feature development, releases, and fixes.
- **Parallel Workstreams**: Teams can work on features, prepare releases, and patch production bugs independently.
- **Stable Production Code**: Main and develop branches maintain code quality through controlled merges.
- **Well-defined Lifecycle**: Branch naming conventions and rules make the release process predictable and repeatable.

---

## Workflow Diagram

![Image](https://github.com/Raisahab1905/Snaaak-demo/blob/main/git%20flow.png?raw=true)

---

## Git Flow Branching Strategy

| Branch        | Purpose                                                      |
|---------------|--------------------------------------------------------------|
| `main`        | Always reflects production-ready state.                      |
| `develop`     | Integrates features and is used for the next release.        |
| `feature/*`   | Created from `develop` to work on new features.              |
| `release/*`   | Branched from `develop` to prepare for a new release.        |
| `hotfix/*`    | Branched from `main` to fix critical production issues.      |

**Branching Rules:**

- `feature/*` branches merge into `develop`
- `release/*` branches merge into `main` and `develop`
- `hotfix/*` branches merge into `main` and `develop`

---

## Advantages vs Disadvantages

| **Advantages**                                                      | **Disadvantages**                                                  |
|---------------------------------------------------------------------|---------------------------------------------------------------------|
| Clearly defined branching and merging strategies                   | Can be overly complex for small teams or rapid development cycles   |
| Stable production code through `main` and hotfix isolation         | Slower iteration due to multiple layers (release, develop, etc.)    |
| Release candidates and bug fixes managed cleanly                   | Requires discipline and tooling to avoid conflicts and confusion     |
| Easily integrates into CI/CD pipelines with proper branch control  | May need adjustments for trunk-based or continuous delivery setups   |

---

## Best Practices

| **Practice**                   | **Description**                                                             |
|-------------------------------|-----------------------------------------------------------------------------|
| Use semantic branch names      | Example: `feature/login-ui`, `hotfix/payment-bug`, `release/v1.0.0`        |
| Avoid long-running feature branches | Merge features regularly to prevent merge conflicts                       |
| Protect `main` and `develop`  | Enable branch protection rules in your VCS platform                        |
| Automate testing & deployment | Trigger CI/CD pipelines for `develop`, `release`, and `main` branches       |
| Review and tag releases       | Use Git tags when merging `release/*` or `hotfix/*` into `main`            |
| Use pull/merge requests       | Ensure code is peer-reviewed before merging any branch                     |

---

## Conclusion

Git Flow is a robust strategy for managing development in larger teams or projects with formal release cycles. Its disciplined approach separates new development from release preparation and urgent fixes, reducing the risk of bugs reaching production. For this project, we will adopt **Git Flow** to benefit from structured code management, reliable releases, and clearer developer workflows.

---

## **Contact Information**  

| **Name**        | **Email Address**                          |
|-----------------|--------------------------------------------|
| Prateek Rai      | prateek.rai.snaatak@mygurukulam.co                     |

---

## References

| **Title**                        | **Link**                                                                                           | **Overview**                                                                 |
|----------------------------------|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| Original Git Flow by nvie       | [Visit](https://nvie.com/posts/a-successful-git-branching-model/)                                  | The original blog post introducing Git Flow                                  |
| Atlassian Git Flow Guide        | [Visit](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)              | Atlassian's take on Git Flow with illustrations                              |
| Git Flow Tooling                | [Visit](https://github.com/nvie/gitflow)                                                            | GitFlow extensions for command-line Git users                                |
