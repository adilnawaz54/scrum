# VCS Design + POC: Naming Conventions

| Created     | Last Updated | Version | Author          | Comment         | Reviewer |
|-------------|--------------|---------|-----------------|-----------------|----------|
| 01-05-2025  |  01-05-2025  | V1      | Nishkarsh Kumar | Internal Review | Pritam   |
| 01-05-2025  |  01-05-2025  | V2      | Nishkarsh Kumar | L0 | Akshit   |

---

## Table of Contents
- [Introduction](#introduction)
- [VCS Policies](#vcs-policies)
  - [Branch Naming Conventions](#branch-naming-conventions)
  - [Tag Naming Conventions](#tag-naming-conventions)
  - [Commit Message Guidelines](#commit-message-guidelines)
- [Best Practices](#best-practices)
- [Contact Information](#contact-information)
- [References](#references)  

---

## Introduction

This document defines the Version Control System (VCS) policies and conventions for the **Project VCS Design + POC**. It ensures consistency, traceability, and collaboration across development, QA, and release activities.

---

## VCS Policies

### Branch Naming Conventions

Follow a structured pattern to clearly identify the purpose and context of each branch.

**Template:**
```bash
<type>/<issue-id>-<short-description>
```

**Types:**
- `feature` – For new features
- `bugfix` – For bug fixes
- `hotfix` – For urgent fixes in production
- `release` – For release preparation
- `chore` – For maintenance, tooling, documentation changes

**Examples:**
- `feature/1234-add-user-auth`
- `bugfix/5678-fix-login-error`
- `hotfix/7890-crash-on-payment`
- `release/1.0.0`
- `chore/update-dependencies`

---

### Tag Naming Conventions

Tags are used for marking important points like releases.

**Template:**

```bash
v<major>.<minor>.<patch>[-<optional-info>]
```

**Examples:**
- `v1.0.0`
- `v1.2.0-beta`
- `v2.0.1-rc1`

---

### Commit Message Guidelines

A standardized commit message structure improves clarity and eases code review and debugging.

**Template:**

```bash
<type>(<scope>): <short-description>

[optional body]

[optional footer]
```

**Types:**
- `feat` – New feature
- `fix` – Bug fix
- `docs` – Documentation update
- `style` – Code style change (formatting, etc.)
- `refactor` – Code refactoring without adding features/fixes
- `test` – Adding tests
- `chore` – Maintenance work

**Example:**

feat(auth): implement JWT-based authentication

Added middleware to validate JWT tokens for all protected routes.

**Footer (optional):**
- Breaking changes
- Issue references (e.g., `Closes #123`)

---

## Best Practices

- Use clear, descriptive branch names aligned with feature or issue IDs.
- Follow semantic versioning for tags to track releases cleanly.
- Write meaningful commit messages using a consistent structure.
- Use `release/` branches for production deployment prep.
- Review commits before merging to ensure compliance with standards.

## Contact Information

| **Name**    | **Email**                |
|-------------|--------------------------|
| Nishkarsh Kumar     | nishkarsh.kumar.snaatak@mygurukulam.co  |

## References  

| Title                          | Link                                                                 |  
|--------------------------------|----------------------------------------------------------------------|  
| GitFlow Guide       | [Visit](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow) |  
| Conventional Commits                  | [Visit](https://www.conventionalcommits.org/) |  
