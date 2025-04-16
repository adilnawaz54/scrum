##  Step-by-Step Guide: Install Python in Ubuntu

---

| Created     | Version | Author        | Comment | Reviewer         |
|-------------|---------|---------------|---------|------------------|
| 15-04-2025  | V1      | Adil Nawaz    |         | Pritam  |

---

###   Check if Python is Already Installed

```bash
python3 --version
```
![image](https://github.com/user-attachments/assets/c1ef7329-c933-4515-954f-82f4d9a4eaa7)

It's showing **Python version 3.10**. Now we need to update the Python Version. We need to follow some **steps**

---

### Step 1: Update System Packages

```bash
sudo apt update
sudo apt upgrade -y
```

This ensures your package lists and software are up to date.

---

### Step 2: Install Python 3

Ubuntu comes with Python 3.x by default, but you can install or upgrade it:

```bash
sudo apt install python3 -y
```
![Screenshot 2025-04-16 105321](https://github.com/user-attachments/assets/4219b4d0-3c1d-47da-a44d-a494d3ae2092)

---

### Step 3: Install pip (Python Package Manager)

```bash
sudo apt install python3-pip -y
```
![Screenshot 2025-04-16 105456](https://github.com/user-attachments/assets/90005147-05e7-4e6f-94fc-41bb74b700cc)

Check pip version:

```bash
pip3 --version
```
![Screenshot 2025-04-16 105520](https://github.com/user-attachments/assets/a15e885d-df59-4a2d-a4f1-8d012907dad4)

---

### Step 4: Verify Installation

```bash
python3 --version
pip3 --version
```
![Screenshot 2025-04-16 105520](https://github.com/user-attachments/assets/7b4dff82-a727-419f-b500-9671d4897059)

---

**If you want to install specific version of Python**

## 🧪  Install a Specific Version of Python (e.g., 3.12,3.13)

If you want the latest version:

```bash
sudo add-apt-repository ppa:deadsnakes/ppa -y
sudo apt update
sudo apt install python3.12 -y
```
![Screenshot 2025-04-16 110214](https://github.com/user-attachments/assets/a86238ff-acb0-4084-8e52-9edf85ba4023)
![Screenshot 2025-04-16 110356](https://github.com/user-attachments/assets/6e4a1772-5c6c-455a-bb90-c0bf1382d327)


Check version:
```bash
python3.12 --version
```
![Screenshot 2025-04-16 110416](https://github.com/user-attachments/assets/d7c379b1-8837-488d-bbbb-2739e213321a)
