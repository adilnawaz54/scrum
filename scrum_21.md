#  # SOP: Managing Python Dependencies with requirements.txt


---
## **Author Information**
| Created     | Version | Author        | Comment                 | Reviewer         |
|-------------|---------|---------------|-------------------------|------------------|
| 15-04-2025  | V1      | Adil Nawaz    |   Internal Reviewer     | Pritam           |

---


## 📑 Table of Contents

1. [Introduction](#introduction)  
2. [Why We Use It](#why-we-use-it)  
3. [What is requirements.txt?](#what-is-requirementstxt)  
4. [How to Generate requirements.txt](#how-to-generate-requirementstxt)  
5. [Installing from requirements.txt](#installing-from-requirementstxt)  
6. [Using Virtual Environments](#using-virtual-environments)  
   - [Why?](#why)  
   - [How?](#how)  
7. [Common Issues & Troubleshooting](#common-issues--troubleshooting)  
   - [1. Version Conflicts](#1-version-conflicts)  
   - [2. No Matching Distribution Found](#2-no-matching-distribution-found)  
   - [3. Install Fails Midway / Very Slow](#3-install-fails-midway--very-slow)  
   - [4. OS-Specific Packages](#4-os-specific-packages)  
   - [5. Unicode/Encoding Errors](#5-unicodeencoding-errors)  
8. [Best Practices](#best-practices)  
9. [Conclusion](#conclusion)  
10. [Contact](#contact)  
11. [References](#references)  

---



##  Introduction

This SOP outlines how to create, install, and troubleshoot Python dependencies using the `requirements.txt` file. It covers best practices for versioning, using virtual environments, and handling common issues developers face.

---

###  Why We Use It:
- It can recreate the **exact same environment**
- Ensures consistent environments for development, testing, and deployment
- Makes it easy to install dependencies in one go
- Helps with version locking to prevent future compatibility issues

---

##  What is requirements.txt?

`requirements.txt` is a plain text file used to list all the Python packages and versions required to run a project. It allows developers to **recreate the same environment** on other machines or servers.

---

##  How to Generate requirements.txt

After setting up and installing all your packages:
```bash
pip freeze > requirements.txt
```
This captures the exact versions of all installed packages in your current environment.

---

##  Installing from requirements.txt

Make sure you are inside your project's virtual environment:

```bash
pip install -r requirements.txt
```
This command reads the file and installs every listed dependency.

---

##  Using Virtual Environments

###  Why?
Virtual environments isolate your project's dependencies from the global Python environment.
We can create multiple virtual environment for every seperate project which helps to resolve version conflicts.

###  How?

By creating a seperate environment for the project and there we activate using script and perform all task in that environment
-- Keeps Dependencies Isolated
-- Avoids System-wide Installation
-- Simplifies Deployment
-- Cleaner Development

```bash
# Create virtual environment
python -m venv venv

# Activate (on Linux)
source venv/bin/activate

# Install dependencies
pip install requests flask

# To Deactivate (exit the environment)
deactivate

```
Once activated, you're "inside" that virtual environment and any pip install goes that virtual environment.
After activation, you’ll notice your terminal prompt changes—it'll show the environment name

```
(venv) your-computer:project-name user$

```
---

##  Common Issues & Troubleshooting

###  1. Version Conflicts
**Error:** Conflicting requirements between packages.
-  **Fix:** Pin compatible versions in `requirements.txt` manually.

###  2. No Matching Distribution Found
**Error:** Invalid version or package name.
-  **Fix:** Double-check on https://pypi.org or remove the version constraint.

###  3. Install Fails Midway / Very Slow
-  **Fix:**
```bash
pip install --no-cache-dir -r requirements.txt
```
-  Ensure build tools are installed:
```bash
sudo apt install python3-dev build-essential
```

###  4. OS-Specific Packages
Some packages are only compatible with Windows/Linux.
-  **Fix:** Use OS-specific `requirements-*.txt` files or add notes.

###  5. Unicode/Encoding Errors
-  **Fix:** Save the file with UTF-8 encoding or regenerate using `pip freeze`.

---

##  Best Practices

| Practice                      | Benefit                                            |
|------------------------------|----------------------------------------------------|
| Use virtualenv/venv          | Avoids dependency pollution                        |
| Pin versions                 | Prevents breaking changes                          |
| Separate dev/prod files      | Keeps production lean and clean                   |
| Regenerate requirements.txt  | After every major install/update                  |

---

##  Conclusion

Using `requirements.txt` makes it easy to maintain, share, and deploy consistent Python environments. It is essential for any professional or collaborative Python project.

---


## Contact

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz   | adil.nawaz.snaatak@mygurukulam.co             |

---

##  References

| Title     | Link                                      |
|-----------|-------------------------------------------|
| Python    | https://www.freecodecamp.org/news/python-requirementstxt-explained         |
| Python    | https://docs.mage.ai/development/dependencies/requirements | 

---

