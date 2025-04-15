##  Step-by-Step Guide: Install Python in Ubuntu

###   Check if Python is Already Installed

```bash
python3 --version
```
![image](https://github.com/user-attachments/assets/c1ef7329-c933-4515-954f-82f4d9a4eaa7)

It's showing Python version 3.10 
Now we need to update the Python Version. We need to follow some **steps**

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

---

### Step 3: Install pip (Python Package Manager)

```bash
sudo apt install python3-pip -y
```

Check pip version:

```bash
pip3 --version
```

---

### Step 4: Verify Installation

```bash
python3 --version
pip3 --version
```

---

**If you want to install specific version of Python**

## 🧪  Install a Specific Version of Python (e.g., 3.12,3.13)

If you want the latest version:

```bash
sudo add-apt-repository ppa:deadsnakes/ppa -y
sudo apt update
sudo apt install python3.12 -y
```

Check version:
```bash
python3.12 --version
```
