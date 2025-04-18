#  Documentation: Operating System - Ubuntu


| Created     | Version | Author        | Comment             | Reviewer         |
|-------------|---------|---------------|---------------------|------------------|
| 15-04-2025  | V1.2    | Adil Nawaz    |Internal Review      | Pritam           |
| 18-04-2025  | V2.2    | Adil Nawaz    | L0      | Shreya Jaiswal           |
---





##  Table of Contents

1. [**Introduction**](#1-introduction)  
2. [**What is Ubuntu?**](#2-what-is-ubuntu)  
3. [**Why use Ubuntu?**](#3-why-use-ubuntu)  
4. [**Ubuntu Versions & Releases**](#4-ubuntu-versions--releases)  
5. [**Ubuntu Use Cases**](#5-ubuntu-use-cases)  
6. [**What Are Flavours in Linux**](#6-what-are-flavours-in-linux)  
   - 6.1 [**Major Flavours of Linux (Distros)**](#61-major-flavours-of-linux-distros)  
7. [**Ubuntu Architecture Overview**](#7-ubuntu-architecture-overview)  
   - 7.1 [Hardware Layer](#71-hardware-layer)  
   - 7.2 [Linux Kernel](#72-linux-kernel)  
   - 7.3 [Shell / CLI Interface](#73-shell--cli-interface)  
   - 7.4 [Application Layer](#74-application-layer)  
8. [**Software Management**](#8-software-management)  
   - 8.1 [APT](#81-apt-advanced-package-tool)  
   - 8.2 [DPKG](#82-dpkg-debian-package-manager)  
   - 8.3 [Snap](#83-snap)  
   - 8.4 [Ubuntu Software Center (GUI)](#84-ubuntu-software-center-gui)  
9. [**Service Commands in Ubuntu**](#9-service-commands-in-ubuntu)  
   - 9.1 [Common Service Commands](#91-common-service-commands)  
10. [**Conclusion**](#10-conclusion)  
11. [**Contacts**](#11-contacts)  
12. [**References**](#12-references)  

---


##  1. **Introduction**
Ubuntu is a beginner-friendly Linux OS that’s free, open-source, and widely used for desktops, servers, and cloud systems. It makes software management easy with tools like APT and Snap, and gives you full control over background services using simple terminal commands.

##  2. What is Ubuntu?
Ubuntu is a **free and open-source Linux-based operating system** developed and maintained by **Canonical Ltd.** It is one of the most popular Linux distributions in the world, known for its ease of use, regular updates, and strong community support.

|           |                                                                |
|--------------------------|--------------------------------------------------------------------------------|
| **First released**       | **October 2004**                         |
| **Based on**           | **Debian Linux**                               |
| **Uses**        | **APT package manager** and **`.deb`** packages                        |



##  3. **Why use Ubuntu?**

Ubuntu is widely chosen by developers, system admins, and even casual users because it's:


| **Feature**             | **Highlights**                                                                 |
|--------------------------|--------------------------------------------------------------------------------|
| **Free & Open Source**      | No license fees, full source access, strong community                         |
| **User-Friendly**            | Clean GNOME UI, easy to use, rich software library                            |
| **Developer-Friendly**       | Built-in support for dev tools (Python, Docker, Git)                          |
| **Community & Docs**         | Large support community, extensive docs, easy troubleshooting                 |
| **Reliable Updates**         | LTS support, regular releases, security patches                               |
| **Cloud & DevOps Ready**     | Supported on AWS/Azure/GCP, Docker-ready, CI/CD tools compatible              |
| **Lightweight & Flexible**   | Runs well on old hardware or minimal VMs                     |




##  4. Ubuntu Versions & Releases

| Version       | Type  | Release Month | Support Until |
|---------------|-------|----------------|----------------|
| Ubuntu 22.04  | LTS   | April 2022     | April 2027 (standard) |
| Ubuntu 20.04  | LTS   | April 2020     | April 2025     |
| Ubuntu 23.10  | Interim | Oct 2023      | July 2022     |
| Ubuntu 24.04  | Interim | Oct 2023      | April 2024      |


- **LTS** = Long-Term Support (5 years support)
- Non-LTS releases are supported for 9 months

---


##  5. Ubuntu Use Cases

| **Use Case **        | **Description**                   |
|------------------|---------------------------|
| **Desktop OS**       | Ubuntu is widely used as a desktop operating system due to its clean user interface, easy software management, strong community support, and security. |
| **Web Servers**      | Ubuntu Server edition is a popular choice for running web servers due to its stability, security updates, and long-term support (LTS) releases.      |
| **DevOps & CI/CD**   | Ubuntu integrates well with automation tools like Jenkins, Ansible, Docker, and Kubernetes.  |
| **Cloud Images**     | AWS EC2 Ubuntu AMIs       |
| **Containers**       | Ubuntu is often used as the base image in Docker containers        |



##  6. What Are **Flavours in Linux**?

**"flavours"** (or **distributions/distros**) refer to **different versions** of the Linux operating system, built with different goals, tools, and user experiences — but **all share the same Linux kernel**.

---

##  6.1 Major Flavours of Linux (Distros)

| Flavour         | Base       | Package Manager | Target Audience / Use Case |
|-----------------|------------|------------------|-----------------------------|
| **Ubuntu**      | Debian     | APT (`.deb`)     | Beginners, developers, servers, cloud |
| **Debian**      | N/A        | APT (`.deb`)     | Stable, minimal, servers, advanced users |
| **Fedora**      | Red Hat    | DNF (`.rpm`)     | Developers, bleeding-edge |
| **CentOS**      | Red Hat    | YUM/DNF (`.rpm`) | Servers (no longer supported, now CentOS Stream) |
| **Alpine Linux**| N/A        | APK              | Lightweight, containers (e.g. Docker) |

---


##  7. **Ubuntu Architecture Overview**

Ubuntu is built on the **Linux kernel** and structured into multiple **layers** — from the core system up to the graphical interface and applications.

![linux architecture](https://github.com/user-attachments/assets/a476d87b-c185-47db-8058-50f58e03d5a6)



###  **7.1. Hardware Layer**
- Physical components: CPU, memory, disk, GPU, etc.
- Accessed via drivers managed by the kernel.

---

###  **7.2. Linux Kernel**
- Core of the system.
- Handles:
  - **Process management**
  - **Memory management**
  - **File systems**
  - **Device drivers**
  - **Networking**
- Ubuntu uses a slightly customized version of the **mainline Linux kernel**.

---

###  **7.3. Shell / CLI Interface**
- Bash, Zsh, Fish, etc.
- Enables users to run commands directly.
- Essential for system administration, scripting, and automation.

---

###  **7.4. Application Layer**
- Software installed via package managers:
  - APT (`.deb`)
  - Snap
- User applications: Firefox, LibreOffice, VSCode, GIMP, etc.

---

##  8. **Software Management**


##  **Key Software Management Tools in Ubuntu**

Ubuntu is based on **Debian**, so it uses **APT** (Advanced Package Tool) for package management.

| **Tool**      | **Description**  | 
|---------------|-------|
| **APT** (Advanced Package Tool)  | High-level CLI tool for `.deb` packages. Resolves dependencies and uses online repos  | 
| **DPKG** (Debian Package)  | Low-level tool to manage `.deb` files locally. No dependency resolution  |
| **Snap**  | Canonical's containerized package system. Auto-updates, cross-platform |

---

##  9. **Service commands in Ubuntu**

**`service` commands** are used to manage system services (start, stop, restart, etc.). These commands are wrappers around `systemctl` (for systemd) or older init systems.

List of **commonly used `service` commands** in Ubuntu:

###  9.1 Common Service Commands

| Command | Description |
|--------|-------------|
| `start` | Starts the service |
| `stop` | Stops the service |
| `restart` | Restarts the service |
| `reload` | Reloads config without stopping the service (if supported) |
| `status` | Shows the current status of the service |
| `enable` | Not supported with `service`; use `systemctl` |
| `disable` | Not supported with `service`; use `systemctl` |

---
##  10. **Conclusion**

Ubuntu stands out as one of the most reliable, user-friendly, and versatile Linux distributions available today. Whether you're a beginner exploring Linux for the first time, a developer building modern applications, or a system administrator managing large-scale infrastructure, **Ubuntu provides a powerful and secure environment** to get the job done.

---

## 11. Contacts

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

---

## 12. References

| **Title**                        | **Link**                                                                                      |
|----------------------------------|-----------------------------------------------------------------------------------------------|
| Ubuntu Official Documentation  | (https://help.ubuntu.com)          |
| Ubuntu Releases List           | (https://wiki.ubuntu.com/Releases) |
