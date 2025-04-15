Here’s a **step-by-step installation guide for Python in Ubuntu** (works for Ubuntu 18.04, 20.04, 22.04, and later):

---

## 🐍 Step-by-Step Guide: Install Python in Ubuntu

### ✅ Step 1: Check if Python is Already Installed

```bash
python3 --version
```

You should see something like:
```bash
Python 3.10.12
```

If not, follow the steps below to install it.

---

### ✅ Step 2: Update System Packages

```bash
sudo apt update
sudo apt upgrade -y
```

This ensures your package lists and software are up to date.

---

### ✅ Step 3: Install Python 3

Ubuntu comes with Python 3.x by default, but you can install or upgrade it:

```bash
sudo apt install python3 -y
```

---

### ✅ Step 4: Install pip (Python Package Manager)

```bash
sudo apt install python3-pip -y
```

Check pip version:

```bash
pip3 --version
```

---

### ✅ Step 5: (Optional) Install Development Tools

If you're planning to build Python packages from source:

```bash
sudo apt install build-essential libssl-dev libffi-dev python3-dev -y
```

---

### ✅ Step 6: (Optional) Install `venv` for Virtual Environments

```bash
sudo apt install python3-venv -y
```

To create a virtual environment:

```bash
python3 -m venv myenv
source myenv/bin/activate
```

---

### ✅ Step 7: Verify Installation

```bash
python3 --version
pip3 --version
```

---

## 🧪 Bonus: Install a Specific Version of Python (e.g., 3.12)

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

---

Let me know if you want to make Python 3.12 your default, or want to install multiple versions side-by-side!
