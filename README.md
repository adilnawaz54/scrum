##  Step-by-Step Guide: Install Python in Ubuntu

### Step 1: Check if Python is Already Installed

```bash
python3 --version
```
![image](https://github.com/user-attachments/assets/c6708b87-331c-4592-b1d4-ee16ae1cb1c1)

If not, follow the steps below to install it.

---

### Step 2: Update System Packages

```bash
sudo apt update
sudo apt upgrade -y
```

This ensures your package lists and software are up to date.

---

### Step 3: Install Python 3

Ubuntu comes with Python 3.x by default, but you can install or upgrade it:

```bash
sudo apt install python3 -y
```

---

### Step 4: Install pip (Python Package Manager)

```bash
sudo apt install python3-pip -y
```

Check pip version:

```bash
pip3 --version
```

---

### Step 7: Verify Installation

```bash
python3 --version
pip3 --version
```

---

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
