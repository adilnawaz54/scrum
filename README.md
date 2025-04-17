#  Documentation: Python Installation Guide

**Common Stack** | **Application** | **Python**  
**Component:** Python Setup & Installation (Ubuntu)

---
## 👤 **Author Information**
| Created     | Version | Author        | Comment                 | Reviewer         |
|-------------|---------|---------------|-------------------------|------------------|
| 15-04-2025  | V1      | Adil Nawaz    |   Internal Reviewer     | Pritam           |

---

## 📝 Introduction

This SOP provides a simple, beginner-friendly guide to installing Python3 on Ubuntu-based systems. Whether you're setting up Python for development, deployment, or just running Python apps, this guide ensures you’re up and running in minutes.

---

## ✅ Acceptance Criteria

This SOP must:
- Provide a clear, step-by-step installation guide for Python
- Include simple commands that work on Ubuntu 20.04 and above
- Ensure that Python is correctly installed and configured
- Be demo-friendly — even someone new can follow and explain it

---

## ⚙️ Python Installation Steps (Ubuntu)


### Step 1: Check if Python is Already Installed

```bash
python3 --version
```
![Screenshot 2025-04-17 092947](https://github.com/user-attachments/assets/19bcc26d-f838-4503-a036-0ce1f27fc07f)

It's showing **Python version 3.10**. 
> 🔍 **Note:** On Ubuntu 20.04 LTS and above, this installs **Python3.10** by default.
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
![image](https://github.com/user-attachments/assets/97676c09-a751-4c81-a7c6-6b83bb6afa0b)


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
![image](https://github.com/user-attachments/assets/26dc7d89-cb17-4881-a1b7-a60ab10ed416)


---

### Step 5: Verify Installation

```bash
python3 --version
pip3 --version
```
![image](https://github.com/user-attachments/assets/258bf8d6-f1a7-4ba7-b94a-773a770f4737)


---

As of April 2025, Python has released numerous versions since its inception. Here's an overview of the major Python versions and their latest releases:

---

## Python3 Versions and Their Latest Releases

### Python 3.x Series

- **Python 3.14**:Development in progress; latest alpha release is 3.14.0a6 

- **Python 3.13**:Latest release is 3.13.3 (April 8, 2025 citeturn0search4

- **Python 3.12**:Latest release is 3.12.10 (April 8, 2025 citeturn0search4

- **Python 3.11**:Latest release is 3.11.12 (April 8, 2025 citeturn0search4

- **Python 3.10**:Latest release is 3.10.17 (April 8, 2025 citeturn0search4

- **Python 3.9**:Latest release is 3.9.22 (April 8, 2025 citeturn0search4

- **Python 3.8**:Latest release is 3.8.20 (September 6, 2024 citeturn0search0

- **Python 3.7**:Latest release is 3.7.17 (June 6, 2023 citeturn0search0

- **Python 3.6**:Latest release is 3.6.15 (September 4, 2021 citeturn0search0

- **Python 3.5**:Latest release is 3.5.10 (September 5, 2020 citeturn0search0

- **Python 3.4**:Latest release is 3.4.10 (March 18, 2019 citeturn0search0

- **Python 3.3**:Latest release is 3.3.7 (September 19, 2017 citeturn0search0

- **Python 3.2**:Latest release is 3.2.6 (October 11, 2014 citeturn0search0

- **Python 3.1**:Latest release is 3.1.5 (April 9, 2012 citeturn0search0

- **Python 3.0**:Latest release is 3.0.1 (February 13, 2009 citeturn0search0


**If you want to install specific version of Python**

## 🧪  Install a Specific Version of Python (e.g., 3.12,3.13)

If you want the latest version:

```bash
sudo add-apt-repository ppa:deadsnakes/ppa -y
sudo apt update
sudo apt install python3.12 -y
```
![image](https://github.com/user-attachments/assets/c1e9002c-cdf7-447a-be06-988053c8797f)
![image](https://github.com/user-attachments/assets/beb2aaf4-2dad-444d-989c-3c76fa8eca47)


Check version:
```bash
python3.12 --version
```

![image](https://github.com/user-attachments/assets/beb2aaf4-2dad-444d-989c-3c76fa8eca47)

---

## ☕ Conclusion

Installing Python on Ubuntu is straightforward using the default packages.  
This SOP ensures anyone — even a beginner — can quickly set up Python, verify it, and choose the right version as per project needs.  
With Python properly installed, you're now ready to build, run, or deploy Python based applications with confidence.

---

## Contacts

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz   | adil.nawaz.snaatak@mygurukulam.co             |

---

## 🔗 References

| Title     | Link                                      |
|-----------|-------------------------------------------|
| Python    | (https://www.python.org/downloads/)           |

---

