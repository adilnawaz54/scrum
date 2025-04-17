#  Documentation: Python Installation Guide

---
##  **Author Information**
| Created     | Version | Author        | Comment                 | Reviewer         |
|-------------|---------|---------------|-------------------------|------------------|
| 17-04-2025  | V1      | Adil Nawaz    |   Internal Reviewer     | Pritam           |

---


##  Table of Contents

1. [**Introduction**](#introduction)  
2. [**Python Installation Steps (Ubuntu)**](#python-installation-steps-ubuntu)  
   - [Step 1: Check if Python is Already Installed](#step-1-check-if-python-is-already-installed)  
   - [Step 2: Update System Packages](#step-2-update-system-packages)  
   - [Step 3: Install Python3](#step-3-install-python3)  
   - [Step 4: Install pip (Python Package Manager)](#step-4-install-pip-python-package-manager)  
   - [Step 5: Verify Installation](#step-5-verify-installation)  
3. [**Available Python Versions**](#available-python-versions)  
4. [**Install a Specific Version of Python**](#install-a-specific-version-of-python-eg-312313)  
5. [**Conclusion**](#conclusion)  
6. [**Contacts**](#contacts)  
7. [**References**](#references)

---


##  Introduction

This SOP provides a simple, beginner-friendly guide to installing Python3 on Ubuntu-based systems. Whether you're setting up Python for development, deployment, or just running Python apps, this guide ensures you’re up and running in minutes.

---

##  Python Installation Steps (Ubuntu)


### Step 1: Check if Python is Already Installed

```bash
python3 --version
```
![Screenshot 2025-04-17 092947](https://github.com/user-attachments/assets/b69f9ed7-9d5d-411a-baf6-89f5aa03879d)


It's showing **Python version 3.10**. 
>  **Note:** On Ubuntu 20.04 LTS and above, this installs **Python3.10** by default.
---

### **If Python is not Installed**

### Step 2: Update System Packages

```bash
sudo apt update
sudo apt upgrade -y
```

This ensures your package lists and software are up to date.

---

### Step 3: Install Python3

To install the latest available version from Ubuntu's repository:
```bash
sudo apt install python3 
```
![Screenshot 2025-04-17 101739](https://github.com/user-attachments/assets/21fdcbf7-67ba-464e-965c-82c937c1b09e)



---

### Step 4: Install pip (Python Package Manager)

pip is essential for installing Python packages from PyPI.

```bash
sudo apt install python3-pip 
```


Check pip version:

```bash
pip3 --version
```
![Screenshot 2025-04-17 102052](https://github.com/user-attachments/assets/9d35c4f1-8710-43c5-9dbd-8bc04db39b39)



---

### Step 5: Verify Installation

```bash
python3 --version
pip3 --version
```
![Screenshot 2025-04-17 102128](https://github.com/user-attachments/assets/858cc3e4-c6c7-479a-a9b0-592dde423efc)



---

As of April 2025, Python has released numerous versions since its inception. Here's an overview of the major Python versions and their latest releases:

---

##  Available Python Versions

Here are some commonly used Python versions:

| Version     | Command to Install           |
|---------    |------------------------------|
| Python 3.14 | `sudo apt install python3.14`|
| Python 3.13 | `sudo apt install python3.13`|
| Python 3.12 | `sudo apt install python3.12`|
| Python 3.11 | `sudo apt install python3.11`|
| Python 3.10 | `sudo apt install python3.10`|(default)


**If you want to install specific version of Python**

##   Install a Specific Version of Python (e.g., 3.12,3.13)

If you want the latest version:

```bash
sudo add-apt-repository ppa:deadsnakes/ppa -y
sudo apt update
sudo apt install python3.12 -y
```
![Screenshot 2025-04-17 102524](https://github.com/user-attachments/assets/ef098cc4-1eca-4d30-9f21-a3713bc7dc55)



Check version:
```bash
python3.12 --version
```

![Screenshot 2025-04-17 102728](https://github.com/user-attachments/assets/fecf78c4-3fbc-4b49-81a3-05c18fca4ac2)


---

##  Conclusion

Installing Python on Ubuntu is straightforward using the default packages.  
This SOP ensures anyone — even a beginner — can quickly set up Python, verify it, and choose the right version as per project needs.  
With Python properly installed, you're now ready to build, run, or deploy Python based applications with confidence.

---

## Contacts

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz   | adil.nawaz.snaatak@mygurukulam.co             |

---

##  References

| Title     | Link                                      |
|-----------|-------------------------------------------|
| Python    | (https://www.python.org/downloads/)           |

---
