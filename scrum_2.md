#  Documentation: Operating System - Ubuntu


| Created     | Version | Author        | Comment             | Reviewer         |
|-------------|---------|---------------|---------------------|------------------|
| 15-04-2025  | V1.2    | Adil Nawaz    |Internal Review      | Pritam           |
---



##  Table of Contents

1. [**Introduction**](#1-introduction)  
2. [**Why to use Ubuntu?**](#2-why-to-use-ubuntu)  
   - [2.1 Free & Open Source](#21-free--open-source)  
   - [2.2 User-Friendly](#22-user-friendly)  
   - [2.3 Developer-Friendly](#23-developer-friendly)  
   - [2.4 Strong Community & Documentation](#24-strong-community--documentation)  
   - [2.5 Regular & Reliable Updates](#25-regular--reliable-updates)  
   - [2.6 Secure by Design](#26-secure-by-design)  
   - [2.7 Cloud & DevOps Ready](#27-cloud--devops-ready)  
   - [2.8 Lightweight & Flexible](#28-lightweight--flexible)  
3. [**What is Ubuntu?**](#3-what-is-ubuntu)  
4. [**Ubuntu Versions & Releases**](#4-ubuntu-versions--releases)  
5. [**Security Features**](#5-security-features)  
6. [**Ubuntu Use Cases**](#6-ubuntu-use-cases)  
7. [**What Are Flavours in Linux?**](#7-what-are-flavours-in-linux)  
   - [7.1 Major Flavours of Linux (Distros)](#71-major-flavours-of-linux-distros)  
8. [**Ubuntu Architecture Overview**](#8-ubuntu-architecture-overview)  
   - [8.1 Hardware Layer](#81-hardware-layer)  
   - [8.2 Linux Kernel](#82-linux-kernel)  
   - [8.3 Shell / CLI Interface](#83-shell--cli-interface)  
   - [8.4 Application Layer](#84-application-layer)  
9. [**Software Management**](#9-software-management)  
   - [9.1 APT (Advanced Package Tool)](#apt-advanced-package-tool)  
   - [9.2 DPKG (Debian Package Manager)](#dpkg-debian-package-manager)  
   - [9.3 Snap](#snap)  
   - [9.4 Ubuntu Software Center (GUI)](#ubuntu-software-center-gui)  
10. [**Service Commands in Ubuntu**](#10-service-commands-in-ubuntu)  
    - [10.1 Common Service Commands](#91-common-service-commands)  
11. [**Conclusion**](#10-conclusion)  
12. [**Contacts**](#11-contacts)  
13. [**References**](#12-references)  

---


##  1. **Introduction**
Ubuntu is a beginner-friendly Linux OS that’s free, open-source, and widely used for desktops, servers, and cloud systems. It makes software management easy with tools like APT and Snap, and gives you full control over background services using simple terminal commands.

##  2. **Why to use Ubuntu?**

Ubuntu is widely chosen by developers, system admins, and even casual users because it's:

---

###  **2.1. Free & Open Source**
- No licensing fees
- You have full access to the source code
- Supported by a large open-source community

---

###  **2.2. User-Friendly**
- Simple and clean **GNOME desktop interface**
- Easy to install and use, even for Linux beginners
- Large library of preinstalled and easily installable software

---

###  **2.3. Developer-Friendly**
- Built-in support for:
  - Python, Java, Node.js, Docker, Git, etc.
- Great for **coding, scripting, and automation**

---

###  **2.4. Strong Community & Documentation**
- Huge online community (AskUbuntu, StackOverflow)
- Extensive official docs and tutorials
- Tons of support for troubleshooting

---

###  **2.5. Regular & Reliable Updates**
- **LTS (Long Term Support)** versions with 5 years of updates
- Predictable release cycles
- Frequent security patches and bug fixes

---

###  **2.6. Secure by Design**
- Built-in firewall (UFW)
- AppArmor security module
- Unattended upgrades available
- Full-disk encryption optional at install time

---

###  **2.7. Cloud & DevOps Ready**
- Official support by **AWS, Azure, GCP**
- Common base image for Docker containers
- Works well with Jenkins, Ansible, Kubernetes, etc.

---

###  **2.8. Lightweight & Flexible**
- Can run on old hardware or minimal VMs
- Great for IoT devices with **Ubuntu Core**
  
---

##  3. What is Ubuntu?
Ubuntu is a **free and open-source Linux-based operating system** developed and maintained by **Canonical Ltd.** It is one of the most popular Linux distributions in the world, known for its ease of use, regular updates, and strong community support.

- First released in **October 2004**
- Based on **Debian Linux**
- Uses **APT package manager** and `.deb` packages
- Available in **Desktop**, **Server**, **Cloud**, and **Core (IoT)** versions

##  4. Ubuntu Versions & Releases

| Version       | Type  | Release Month | Support Until |
|---------------|-------|----------------|----------------|
| Ubuntu 22.04  | LTS   | April 2022     | April 2027 (standard) |
| Ubuntu 20.04  | LTS   | April 2020     | April 2025     |
| Ubuntu 23.10  | Interim | Oct 2023      | July 2022     |
| Ubuntu 24.04  | Interim | Oct 2023      | April 2024      |


- **LTS** = Long-Term Support (5 years support)
- Non-LTS releases are supported for 9 months

Great topic! Let's break it down 👇

---

##  5. Security Features

- Built-in **firewall** (UFW)
- **AppArmor** for application-level security
- **Unattended security updates**
- Optional full-disk encryption during install

---

##  6. Ubuntu Use Cases

| Use Case         | Example                   |
|------------------|---------------------------|
| Desktop OS       | Ubuntu is widely used as a desktop operating system due to its clean user interface, easy software management, strong community support, and security. |
| Web Servers      | Ubuntu Server edition is a popular choice for running web servers due to its stability, security updates, and long-term support (LTS) releases.      |
| DevOps & CI/CD   | Ubuntu integrates well with automation tools like Jenkins, Ansible, Docker, and Kubernetes.  |
| Cloud Images     | AWS EC2 Ubuntu AMIs       |
| Containers       | Ubuntu is often used as the base image in Docker containers        |



##  7. What Are **Flavours in Linux**?

**"flavours"** (or **distributions/distros**) refer to **different versions** of the Linux operating system, built with different goals, tools, and user experiences — but **all share the same Linux kernel**.

---

##  7.1 Major Flavours of Linux (Distros)

| Flavour         | Base       | Package Manager | Target Audience / Use Case |
|-----------------|------------|------------------|-----------------------------|
| **Ubuntu**      | Debian     | APT (`.deb`)     | Beginners, developers, servers, cloud |
| **Debian**      | N/A        | APT (`.deb`)     | Stable, minimal, servers, advanced users |
| **Linux Mint**  | Ubuntu     | APT (`.deb`)     | Beginners, Windows-like interface |
| **Fedora**      | Red Hat    | DNF (`.rpm`)     | Developers, bleeding-edge |
| **CentOS**      | Red Hat    | YUM/DNF (`.rpm`) | Servers (no longer supported, now CentOS Stream) |
| **Rocky Linux** | Red Hat    | DNF (`.rpm`)     | Replacement for CentOS (stable server use) |
| **Arch Linux**  | N/A        | Pacman           | Advanced users, DIY, rolling release |
| **Manjaro**     | Arch       | Pacman           | User-friendly Arch-based |
| **openSUSE**    | SUSE       | Zypper           | Developers, power users, enterprise |
| **Kali Linux**  | Debian     | APT (`.deb`)     | Cybersecurity, ethical hacking |
| **Zorin OS**    | Ubuntu     | APT (`.deb`)     | Windows users switching to Linux |
| **elementary OS** | Ubuntu   | APT (`.deb`)     | Mac-like interface, design-focused |
| **Pop!_OS**     | Ubuntu     | APT (`.deb`)     | Developers, System76 laptops, tiling window manager |
| **Alpine Linux**| N/A        | APK              | Lightweight, containers (e.g. Docker) |

---


##  8. **Ubuntu Architecture Overview**

Ubuntu is built on the **Linux kernel** and structured into multiple **layers** — from the core system up to the graphical interface and applications.

![linux architecture](https://github.com/user-attachments/assets/a476d87b-c185-47db-8058-50f58e03d5a6)



###  **8.1. Hardware Layer**
- Physical components: CPU, memory, disk, GPU, etc.
- Accessed via drivers managed by the kernel.

---

###  **8.2. Linux Kernel**
- Core of the system.
- Handles:
  - **Process management**
  - **Memory management**
  - **File systems**
  - **Device drivers**
  - **Networking**
- Ubuntu uses a slightly customized version of the **mainline Linux kernel**.

---

###  **8.3. Shell / CLI Interface**
- Bash, Zsh, Fish, etc.
- Enables users to run commands directly.
- Essential for system administration, scripting, and automation.

---

###  **8.4. Application Layer**
- Software installed via package managers:
  - APT (`.deb`)
  - Snap
- User applications: Firefox, LibreOffice, VSCode, GIMP, etc.

---

##  9. **Software Management**


##  **Key Software Management Tools in Ubuntu**

Ubuntu is based on **Debian**, so it uses **APT** (Advanced Package Tool) for package management.

| **Tool**      | **Description**  | 
|---------------|-------|
| **APT** (Advanced Package Tool)  | High-level CLI tool for `.deb` packages. Resolves dependencies and uses online repos  | 
| **DPKG** (Debian Package)  | Low-level tool to manage `.deb` files locally. No dependency resolution  |
| **Snap**  | Canonical's containerized package system. Auto-updates, cross-platform |

---

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
