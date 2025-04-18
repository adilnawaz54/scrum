# Introduction: Ansible Playbook
<p align="left">
  <img src="https://upload.wikimedia.org/wikipedia/commons/2/24/Ansible_logo.svg" alt="Ansible Logo" width="120">
</p>

---

| Created     | Version | Author          | Comment         | Reviewer |
|-------------|---------|-----------------|-----------------|----------|
| 18-04-2025  | V1      | Adil Nawaz      | Internal review | Pritam   |

---

##  Table of Contents

1. [Introduction](#1-introduction)  
2. [Why Ansible Playbook?](#2-why-ansible-playbook)  
3. [What is Ansible Playbook?](#3-what-is-ansible-playbook)  
4. [Dependencies](#4-dependencies)  
5. [Required Inputs](#5-required-inputs)  
6. [Features of Ansible Playbook](#6-features-of-ansible-playbook)  
  6.1 [Human-Readable (YAML Format)](#61-human-readable-yaml-format)  
  6.2 [Declarative](#62-declarative)  
  6.3 [Task Automation](#63-task-automation)  
  6.4 [Idempotent](#64-idempotent)  
  6.5 [Supports Roles and Variables](#65-supports-roles-and-variables)  
  6.6 [Inventory Targeting](#66-inventory-targeting)  
  6.7 [Privilege Escalation (sudo/become)](#67-privilege-escalation-sudobecome)  
  6.8 [Conditionals and Loops](#68-conditionals-and-loops)  
  6.9 [Handlers](#69-handlers)  
  6.10 [Extensible with Custom Modules](#610-extensible-with-custom-modules)  
7. [Conclusion](#7-conclusion)  
8. [Contacts](#8-contacts)  
9. [References](#9-references)

---


## 1. Introduction
This Introduction outlines about the Ansible playbook. It ensures consistent automation by detailing the objective, required inputs, validation checks, and step-by-step execution process.

---

## 2. Why ansible playbook?
Ansible playbooks enable consistent, repeatable automation of IT tasks across multiple systems. They reduce manual errors and save time by executing complex workflows with simple, human-readable code.

---

## 3. What is ansible playbook?
An Ansible playbook is a YAML file that defines a set of automation tasks to be executed on remote machines. It describes the desired system state and handles configuration, deployment, and orchestration efficiently.

---


## 4. Dependencies

Ensure the following before executing the playbook:

- Ansible is installed (version 2.9 or above).
- SSH access to the target nodes is configured.
- The inventory file is properly set with reachable hosts.
- Python installed on target nodes.
- Vault password file is available (if using Ansible Vault).

---


## 5. Required Inputs

| Parameter        | Description                                      |  Requirement                            |
|------------------|--------------------------------------------------|-----------------------------------------|
| `playbook`       | Path to the Ansible playbook file to execute     | Required                                |
| `inventory`      | Inventory file or host group to target           | Required                                |
| `vault_password` | Vault password file (if using encrypted secrets) | Required (if using Vault)               |
| `extra_vars`     | Dynamic variables passed at runtime              | Required (if playbook expects variables)|

---


## 6. Features of Ansible Playbook


###  6.1. **Human-Readable (YAML Format)**


###  6.2. **Declarative**



###  6.3. **Task Automation**



###  6.4. **Idempotent**




###  6.5. **Supports Roles and Variables**




###  6.6. **Inventory Targeting**



###  6.7. **Privilege Escalation (sudo/become)**



###  6.8. **Conditionals and Loops**



###  6.9. **Handlers**



###  6.10. **Extensible with Custom Modules**




---

### 7. Conclusion

Ansible Playbooks are simple, human-readable files used to automate tasks like configuration, deployment, and orchestration. They ensure repeatability, reduce errors, and streamline infrastructure management with clarity and efficiency.

---

## 8. Contacts

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

---

## 9. References

| **Title**                                 | **Link**                                                                                      |
|-------------------------------------------|-----------------------------------------------------------------------------------------------|
| Ansible Playbooks – Official Documentation| [Visit](https://docs.ansible.com/ansible/latest/user_guide/playbooks.html)                    |
| Ansible Inventory – Official Guide        | [Visit](https://docs.ansible.com/ansible/latest/user_guide/intro_inventory.html)              |
| Passing Variables to Playbooks            | [Visit](https://docs.ansible.com/ansible/latest/user_guide/playbooks_variables.html)          |
| Best Practices for Ansible Playbooks      | [Visit](https://docs.ansible.com/ansible/latest/tips_tricks/index.html)                       |

---
