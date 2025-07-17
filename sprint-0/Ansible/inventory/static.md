#  Ansible Static Inventory

![Ansible Inventory](https://geekflare.com/wp-content/uploads/2019/06/ansible-680x290.jpg)

---

## Author Information

| Created     | Last updated | Version | Author         | Comment | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 18-04-2025  | 19-04-2025 | V1.1    | Prateek Rai |     Internal Review    | Siddharth Pawar    |
| 18-04-2025  | 19-04-2025 |  V2     | Prateek Rai |     L0 Review    | Shikha Tripathi    |
| 18-04-2025  | 19-04-2025 |  V3     | Prateek Rai |     L1 Review    | Kirti Nehra    |
| 18-04-2025  | 19-04-2025 | V4      | Prateek Rai |     L2 review    | Ashwani Singh |



---

## Table of Content

This document covers:

- [Introduction](#introduction)
- [Why Static Inventory](#why-static-inventory)
- [What is Static Inventory](#what-is-static-inventory)
- [Structure of a Static Inventory](#structure-of-a-static-inventory)
- [Example Static Inventory](#ansible-static-inventory-example)
- [How to Use with Ansible](#how-to-use-with-ansible)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [References](#references)

---

## Introduction

In Ansible, an inventory defines the list of hosts and their groupings used for automation. Static inventory files are simple to create and useful for environments with a fixed or known list of servers.

---

## Why Static Inventory?

Static inventories are a good choice when you have a small, stable set of servers that don’t change often. They are easy to set up and don’t require any complex
configurations or external plugins. Static inventories also make it simple to organize servers by groups and are perfect for environments where the list of hosts remains consistent over time.

---

## What is Static Inventory?

A static inventory is a text file, usually named `hosts` or `inventory`, that lists all servers, optionally grouped, with their connection details.

---

## Structure of a Static Inventory

An inventory file can be structured like this:

```ini
[web]
web01 ansible_host=192.168.1.10 ansible_user=ubuntu
web02 ansible_host=192.168.1.11 ansible_user=ubuntu

[db]
db01 ansible_host=192.168.1.20 ansible_user=ubuntu

[all:vars]
ansible_ssh_private_key_file=~/.ssh/id_rsa
ansible_python_interpreter=/usr/bin/python3
```
---

## Ansible Static Inventory Example

This document provides a static Ansible inventory setup that lists servers, organizes them into groups, and includes necessary connection variables for successful automation.

### Inventory File: `inventory.ini`

```ini
# Static Inventory File for Ansible

# Group: webservers
[webservers]
web1 ansible_host=192.168.1.10
web2 ansible_host=192.168.1.11

# Group: dbservers
[dbservers]
db1 ansible_host=192.168.1.20

# Group: monitoring
[monitoring]
monitor1 ansible_host=192.168.1.30

# Group Variables (optional)
[webservers:vars]
ansible_user=ubuntu
ansible_ssh_private_key_file=~/.ssh/web_key.pem

[dbservers:vars]
ansible_user=ubuntu
ansible_ssh_private_key_file=~/.ssh/db_key.pem

[monitoring:vars]
ansible_user=ubuntu
ansible_ssh_private_key_file=~/.ssh/monitor_key.pem

# Combine all into a parent group
[all:children]
webservers
dbservers
monitoring
```
---

## How to use with Ansible

Run any playbook with the `-i` flag to specify the inventory:

```bash
ansible-inventory -i inventory.ini --list
ansible all -i inventory.ini -m ping
ansible-playbook -i inventory.ini site.yml
```

You can group-specific playbooks using group names:

```bash
ansible-playbook -i inventory.ini -l webservers deploy.yml
```

---

## Conclusion

It offers simplicity, logical service grouping, Ansible compatibility, and customizable connection, auth, and interpreter settings.
Use static inventory for smaller or static infrastructure before moving to dynamic inventories for cloud-scale automation.

---

## Contacts

| Name | Email Address |
|------|----------------|
| Prateek Rai | prateek.rai.snaatak@mygurukulam.co |

---

## References

| Link | Description |
|------|-------------|
| [Ansible Inventory Docs](https://docs.ansible.com/ansible/latest/user_guide/intro_inventory.html) | Official Guide |
| [INI Inventory Examples](https://docs.ansible.com/ansible/latest/inventory_guide/intro_inventory.html#inventory-basics-hosts-and-groups) | Syntax & Format |
