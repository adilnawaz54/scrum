
# Project VCS Policies | Branch Access Policies documentation

<div align="center">
  <img src="https://duo.com/assets/img/customerlogos/branch-logo.png" alt="Ansible Logo" width="40%"/>
</div>

---

## **Author Information**
| Created     | Last Updated | Version | Author         | Level          | Reviewer         |
|-------------|--------------|---------|----------------|----------------|------------------|
| 04-05-2025  | 07-05-2025   | V1.1    | Prateek Rai    | Internal Review| Siddharth Pawar |
| 04-05-2025  | 07-05-2025   | V2    | Prateek Rai    | L0 | Shikha Tripathi |
| 04-05-2025 | 07-05-2025      | V3     | Prateek Rai  | L1   | Kirti Nehra      |
| 04-05-2025 | 07-05-2025      | V4     | Prateek Rai  | L2   | Ashwani Singh      |

---

## Table of Contents

- [Introduction](#introduction)
- [What is Branch Access Policy?](#what-is-branch-access-policy)
- [Why Branch Protection Rules Are Important](#why-branch-protection-rules-are-important)
- [Branch Protection Rules](#branch-protection-rules)
- [Creating Branch Protection Rules](#creating-branch-protection-rules)
- [Access Permissions](#access-permissions)
- [Types of GitHub Accounts](#types-of-github-accounts)
- [Roles in an Organization](#roles-in-an-organization)
- [Roles Available for an Organization Repository](#roles-available-for-an-organization-repository)
- [Creating a Repository Role](#creating-a-repository-role)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [References](#references)

---

## Introduction
  
This document outlines the policies and practices for managing Branch Access within a version control system (VCS), focusing on Branch Protection Rules. These rules help enforce structured development workflows, secure the codebase, and streamline collaboration among teams.
The purpose of this documentation is to standardize the use of access controls across OT Microservices repositories and ensure that only approved, reviewed, and tested code is merged into protected branches.

---

## What is Branch Access policy?

A branch access policy is a set of rules that controls who can make changes to a specific branch in a version control system like Git (commonly on platforms such as GitHub, GitLab, or Bitbucket).

---

## Why Branch Protection Rules Are Important

- Prevents accidental or unapproved commits to key branches
- Enforces code reviews, improving quality and collaboration
- Avoids integration of untested or error-prone code
- Protects commit history from force pushes

---

## Branch Protection Rules

Git branch protection rules are essential security configurations that allow repository administrators to enforce policies to safeguard branches. These rules prevent unauthorized users from making changes or accidentally deleting important branches, such as the main or production branch.

### Protection Rules Available

| Rule | Description |
|------|-------------|
| **Require a pull request before merging** | Enforces PRs for merging to protected branches |
| **Require branches to be up to date before merging** | Status checks must be successful before merging |
| **Require conversation resolution before merging** | All PR conversations must be resolved before merging |
| **Require signed commits** | Only verified commits are allowed |
| **Require linear history** | Disallows merge commits; enforces rebase or squash |
| **Lock branch** | Makes the branch read-only and undeletable |

---

##  Creating Branch Protection Rules

1. Go to your **GitHub repository homepage**

![Image](https://github.com/Raisahab1905/Snaaak-demo/blob/main/Screenshot%202025-05-06%20191303.png?raw=true)

2. Click on **Settings**

![Image](https://github.com/Raisahab1905/Snaaak-demo/blob/main/Screenshot%202025-05-06%20191533.png?raw=true)

3. Navigate to **Code and automation → Branches**

![Image](https://github.com/Raisahab1905/Snaaak-demo/blob/main/Screenshot%202025-05-06%20191559.png?raw=true)

4. Click **Add Rule** next to Branch protection rules

5. Enter the **Branch name pattern** (e.g., `main`)

![Image](https://github.com/Raisahab1905/Snaaak-demo/blob/main/Screenshot%202025-05-06%20191633.png?raw=true)

6. Select desired **protection rules** and click **Create**

![Image](https://github.com/Raisahab1905/Snaaak-demo/blob/main/Screenshot%202025-05-06%20191712.png?raw=true)

---

## Access Permissions

Permissions define what actions users can perform on GitHub (e.g., create PRs, delete issues).

- **Roles** are sets of permissions assigned to individuals or teams.
- Roles differ across **account types** (see below).

---

## Types of GitHub Accounts

| Type | Description |
|------|-------------|
| **Personal accounts** | Two levels: owner and collaborators |
| **Organization accounts** | Owners can assign roles to individuals and teams |
| **Enterprise accounts** | For centralized policy, billing, and multi-org management |

---

## Roles in an Organization

Organization owners can assign roles to individuals and teams giving them different sets of permissions in the organization. You can give organization members, outside collaborators, and teams of people different levels of access to repositories owned by an organization by assigning them to roles. Choose the role that best fits each person or team's function in your project without giving people more access to the project than they need.

### Roles Available for an Organization Repository

| Role | Description |
|------|-------------|
| **Read** | For non-code contributors to view or discuss projects |
| **Write** | For contributors pushing code |
| **Maintain** | For PMs managing repos (excluding sensitive actions) |
| **Triage** | For contributors managing issues, discussions, and PRs |
| **Admin** | Full access including sensitive actions |
| **Custom roles** | Available only on GitHub Enterprise Cloud |

---

## Creating a Repository Role

1. Click on your profile photo → **Your Organizations**

![](https://github.com/Raisahab1905/Snaaak-demo/blob/main/Screenshot%202025-05-07%20024319.png?raw=true)

2. Select your **organization settings**

![](https://github.com/Raisahab1905/Snaaak-demo/blob/main/Screenshot%202025-05-07%20024636.png?raw=true)

3. Go to **Access → Repository roles**

![](https://github.com/Raisahab1905/Snaaak-demo/blob/main/Screenshot%202025-05-07%20024732.png?raw=true)

4. Scroll to **Custom roles**, click **Create a Role**


5. Fill details → Click **Create Role** 

---

## Conclusion

Implementing branch access policies in the OT Microservice project is vital for:

- Maintaining code quality and collaboration
- Preventing unauthorized or risky changes
- Enforcing workflows (e.g., PRs, code reviews, tests)
- Allowing only authorized contributors to push changes

---

## Contacts

| **Name**         | **Email Address**                     |
|------------------|----------------------------------------|
| Prateek Rai     | prateek.rai.snaatak@mygurukulam.co                |

---

## References

| **Title**                             | **Link**                                                                                 |
|--------------------------------------|------------------------------------------------------------------------------------------|
| GitLab Protected Branches            | [Visit](https://docs.gitlab.com/ee/user/project/protected_branches.html)                |
| GitHub Branch Protection Rules       | [Visit](https://docs.github.com/en/repositories/configuring-branches-and-merges-in-your-repository/managing-protected-branches) |
| Git Best Practices                   | [Visit](https://nvie.com/posts/a-successful-git-branching-model/)                       |
| GitLab CI/CD                         | [Visit](https://docs.gitlab.com/ee/ci/)                                                  |
| How to setup Git branch protection rules                | [Visit](https://spectralops.io/blog/how-to-set-up-git-branch-protection-rules/)                        |
