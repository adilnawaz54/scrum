# Ansible Roles Introduction

![Ansible Logo](https://geekflare.com/wp-content/uploads/2019/06/ansible-680x290.jpg)

---

## Author Information

| Created     | Last updated | Version | Author         | Comment | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 18-04-2025  | 19-04-2025 | V1.1    | Prateek Rai |     Internal Review    | Siddharth Pawar    |
| 18-04-2025  | 19-04-2025 |  V2.1     | Prateek Rai |     L0 Review    | Shikha Tripathi    |
| 18-04-2025  | 22-04-2025 |  V3     | Prateek Rai |     L1 Review    | Kirti Nehra    |
| 18-04-2025  | 22-04-2025 | V4      | Prateek Rai |     L2 review    | Ashwani Singh |


---

## Table of Content

This document covers the following:

- [Introduction](#introduction)
- [Why Use Ansible Roles](#why-use-ansible-roles)
- [What is an Ansible Role](#what-is-an-ansible-role)
- [Key Features](#key-features)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Best Practices](#best-practices)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [References](#references)

---

## Introduction

This document introduces Ansible Roles for developers and operations teams using a common stack, helping create maintainable, reusable, and scalable automation scripts.

---

## Why Use Ansible Roles?

Ansible Roles help you keep your automation code clean and organized. When playbooks get big, roles make them easier to manage, reuse, and share with your team.
They support teamwork by allowing different people to work on different parts like ```nginx```, ```java```, or ```docker```.
Roles also make it easier to apply version control and follow best practices.
Roles make Ansible more scalable, consistent, and collaborative.

---

## What is an Ansible Role?

A role is a way to group related tasks, files, and variables into folders. It follows a standard layout and makes it easier to plug parts of your automation into different projects.
Each role has its own folder with sections like ```tasks```, ```handlers```, and ```templates```.
You can simply call a role in a playbook, and Ansible will know where to find everything it needs.

Each role has its own directory structure including:

```bash
roles/
└── myrole/
    ├── tasks/
    │   └── main.yml
    ├── handlers/
    ├── templates/
    ├── files/
    ├── vars/
    ├── defaults/
    ├── meta/
```

You can use a role in a playbook like:

```yaml
- hosts: web
  roles:
    - role: nginx
```

- If you want to know details of the directory structure of ansible roles then you can go through this link: [directory structure of roles](https://github.com/snaatak-Downtime-Crew/Documentation/blob/prince_scrums_44/common_stack/ansible/roles/directory_structure/README.md#directory-breakdown-with-purpose-use-case-and-example)

---

## Key Features

| Feature | Description |
|--------|-------------|
| **Structure** | Clearly separates tasks, handlers, templates, etc. |
| **Reusability** | Easily reused across multiple playbooks |
| **Modularity** | Enables component-based automation |
| **Maintainability** | Easier to manage, test, and update |
| **Sharing** | Roles can be shared via Ansible Galaxy |
| **Security** | Use role-based variables and secrets effectively |
| **Standardization** | Promotes best practices and clean layouts |

---

## Advantages

| Advantage | Description |
|-----------|-------------|
| **Modularity** | Roles allow you to break down automation into logical, reusable components. |
| **Reusability** | Easily reused across multiple playbooks or projects without rewriting code. |
| **Maintainability** | Cleaner separation of logic makes it easier to maintain and update. |
| **Team Collaboration** | Multiple team members can work on different roles in parallel. |
| **Standard Directory Layout** | Enforces a consistent structure, which helps with onboarding and debugging. |
| **Version Control Friendly** | Easier to track changes and manage code reviews for modular content. |
| **Community Support** | Roles can be downloaded/shared via [Ansible Galaxy](https://galaxy.ansible.com/). |
| **Better Scalability** | Makes it easier to manage growing infrastructure with minimal duplication. |

---

## Disadvantages

| Disadvantage | Description |
|--------------|-------------|
| **Initial Learning Curve** | Understanding the folder structure and role-based execution takes some time. |
| **Overhead for Small Projects** | Using roles may feel excessive for simple automation scripts. |
| **Complex Dependencies** | Managing inter-role dependencies can get tricky without clear documentation. |
| **Debugging Depth** | Requires digging into multiple folders/files to troubleshoot role behavior. |
| **Execution Flow Visibility** | The abstraction might hide task execution order unless well-documented. |

---

## Best Practices

| Area | Practice |
|------|----------|
| **Naming Conventions** | Use clear and consistent naming for roles and variables. E.g., `nginx_setup`, `java_app`. |
| **Role Scope** | Keep roles focused. One role should do one thing (e.g., install Nginx, not Nginx + firewall). |
| **Use Defaults** | Place non-critical default variables in `defaults/main.yml`, and override in `vars/` as needed. |
| **Avoid Hardcoding** | Use variables and templates instead of hardcoded values. |
| **Role Documentation** | Include a `README.md` within each role explaining its purpose, usage, and parameters. |
| **Dependencies** | Use `meta/main.yml` to declare dependencies between roles clearly. |
| **Role Testing** | Test roles independently using tools like `molecule`. |
| **Version Control** | Keep roles in source control with their own versioning where applicable. |
| **Limit External Downloads** | Avoid dynamic downloads during runtime; bake everything inside the role or document pre-requisites. |
| **Use Tags** | Add tags to tasks within roles to enable selective execution. |

---

## Conclusion

Ansible Roles help organize automation tasks into a clean, consistent structure, making it easier to manage, reuse, and scale automation projects—even for teams working on complex systems. 

---

## Contacts

| Name | Email Address |
|------|----------------|
| Prateek Rai | prateek.rai.snaatak@mygurukulam.co |

---

## References

| Link | Description |
|------|-------------|
| [Ansible Roles Official Docs](https://docs.ansible.com/ansible/latest/user_guide/playbooks_reuse_roles.html) | Introduction and usage |
| [Ansible Galaxy](https://galaxy.ansible.com/) | Browse and share roles |
