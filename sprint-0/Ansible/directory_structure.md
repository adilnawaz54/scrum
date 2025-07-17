# Ansible Role Directory Structure

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Ansible_logo.svg/1664px-Ansible_logo.svg.png" alt="Ansible Logo" width="130"/>
</p>

## **Author Information**
| Created     | Last updated | Version | Author         | Level | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 17-04-2025  | 17-04-2025 | V1    | Prince Batra  |     Internal Review    | Siddharth Pawar    |
| 17-04-2025  | 19-04-2025 |  V2     | Prince Batra  |     L0 Review    | Shreya Jaiswal    |
| 17-04-2025  | 21-04-2025 |  V3     | Prince Batra  |     L1 Review    | Kirti Nehra   |

---

## Table of Contents

1. [Introduction](#introduction)  
2. [How to Create an Ansible Role](#how-to-create-an-ansible-role)  
3. [Directory Breakdown (with Purpose, Use Case, and Example)](#directory-breakdown-with-purpose-use-case-and-example)  
   - [defaults/](#1-defaults)  
   - [files/](#2-files)  
   - [handlers/](#3-handlers)  
   - [meta/](#4-meta)  
   - [tasks/](#5-tasks)  
   - [templates/](#6-templates)  
   - [vars/](#7-vars)  
   - [tests/](#8-tests)  
4. [Best Practices](#best-practices)
5. [Conclusion](#conclusion)
6. [Contact Information](#contact-information)  
7. [Reference Table](#reference-table)

---

## Introduction

The Ansible Role Directory Structure is designed to organize automation code in a modular way. It separates tasks, variables, templates, and files into distinct directories for better manageability. This structure ensures reusability, scalability, and clarity in Ansible projects.

---

## How to Create an Ansible Role

**To create a new role with the standard directory structure, use the following general command:**

```bash
ansible-galaxy init <role_name>
```

**Example:** To create a role named `nginx`, run:

```bash
ansible-galaxy init nginx
```

**This will generate the following directory layout:**

```
nginx/
├── defaults/      # Default variables (overridable)
├── files/         # Static files to copy
├── handlers/      # Tasks triggered by 'notify'
├── meta/          # Role metadata and dependencies
├── tasks/         # Main list of tasks
├── templates/     # Jinja2 templates
├── tests/         # Role testing playbook
├── vars/          # Internal, fixed variables
```

---

## Directory Breakdown (with Purpose, Use Case, and Example)

### 1. defaults/


**Purpose:**  
Contains default variables that users can override.

**Use Case:**  
Set the default port or path for the config file.

**Example:** `defaults/main.yml`
```yaml
nginx_port: 80
nginx_conf_path: /etc/nginx/nginx.conf
```

---

### 2. files/

**Purpose:**  
Holds static files to be copied to target hosts.

**Use Case:**  
Deploy a static `index.html` to a web server.

**Example task using file:**
```yaml
- name: Copy index.html
  copy:
    src: index.html
    dest: /var/www/html/index.html
```

---

### 3. handlers/

**Purpose:**  
Contains tasks that run only when notified, e.g., restarting services.

**Use Case:**  
Restart Nginx if the config changes.

**Example:** `handlers/main.yml`
```yaml
- name: restart nginx
  service:
    name: nginx
    state: restarted
```

---

### 4. meta/

**Purpose:**  
Defines metadata like author, license, and dependencies.

**Use Case:**  
Specify role details or dependent roles.

**Example:** `meta/main.yml`
```yaml
galaxy_info:
  author: prince
  description: Install and configure nginx
```

---

### 5. tasks/

**Purpose:**  
The main logic of the role — the actual automation steps.

**Use Case:**  
Install and configure the nginx service.

**Example:** `tasks/main.yml`
```yaml
- name: Install Nginx
  apt:
    name: nginx
    state: present
    update_cache: yes

- name: Copy config template
  template:
    src: nginx.conf.j2
    dest: "{{ nginx_conf_path }}"
  notify: restart nginx
```

---

### 6. templates/

**Purpose:**  
Contains Jinja2 templates rendered with variables.

**Use Case:**  
Create dynamic configuration files.

**Example:** `templates/nginx.conf.j2`
```nginx
server {
  listen {{ nginx_port }};
  location / {
    root /var/www/html;
    index index.html;
  }
}
```

---

### 7. vars/

**Purpose:**  
Holds internal role-specific variables that should not be overridden.

**Use Case:**  
Set internal constants like system users.

**Example:** `vars/main.yml`
```yaml
nginx_user: www-data
```

---

<a id="defaults"></a>
### 8. tests/

**Purpose:**  
Used to validate that the role works correctly in isolation.

**Use Case:**  
Run a test playbook before production usage.

**Example:** `tests/test.yml`
```yaml
- name: Test Nginx Role
  hosts: localhost
  become: yes
  roles:
    - nginx
```

---

## Best Practices

| **Tip**                          | **Reason**                                                                                   |
|-------------------------------------------|----------------------------------------------------------------------------------------------|
| **Keep roles focused**                   | Makes roles reusable and easier to debug when each does only one specific job.               |
| **Use `defaults/` for override values**   | Allows flexibility—users can change values without modifying the role.                       |
| **Use `vars/` for fixed values**          | Prevents accidental changes to important values that should stay the same.                   |
| **Separate logic, config, and assets**    | Keeps your role clean, organized, and easier to understand and maintain.                     |
| **Test roles before production**          | Helps catch mistakes early and ensures your role works properly before using it in real use. |

---

## Conclusion
A well-organized Ansible role structure ensures clarity, reusability, and scalability. It separates different aspects of automation like configuration, files, and tasks for better management. Adhering to best practices improves collaboration and maintainability across teams.

---

## **Contact Information**
| **Name** | **Email Address**        |
|----------|--------------------------|
| **Prince Batra**  | **prince.batra.snaatak@mygurukulam.co**   |

---

## **Reference Table**

| **Links** | **Overview** |
|-----------|--------------|
| [Ansible Role Basics - Official Docs](https://docs.ansible.com/ansible/latest/user_guide/playbooks_reuse_roles.html) | Official documentation on the basics of Ansible roles and their reuse in playbooks. |
| [Ansible Galaxy Roles Guide](https://galaxy.ansible.com/docs/contributing/creating_role.html) | Guide on how to create and contribute roles on Ansible Galaxy. |
| [Ansible Documentation](https://docs.ansible.com/) | Official site for all Ansible documentation, including installation, configuration, and usage guides. |

---
