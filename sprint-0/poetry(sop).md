# SOP: Python Poetry

<p align="center">
  <img src="https://th.bing.com/th/id/OIP.u0ITNfG1tfzVyuLcZWPWTAHaD4?w=343&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7" alt="image" width="300"/>
</p>

## **Author Information**
| Created     | Last updated | Version | Author         | Level | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 15-04-2025  | 17-04-2025 | V1.1    | Prince Batra  |     Internal Review    | Siddharth Pawar    |
| 15-04-2025  | 19-04-2025 |  V2     | Prince Batra  |     L0 Review    | Shreya Jaiswal    |
| 15-04-2025  | 21-04-2025 |  V3    | Prince Batra  |     L1 Review    | Kirti Nehra   |

---

## Table of Contents

- [Introduction](#introduction)  
- [Prerequisites](#prerequisites)  
- [Step-by-Step Instructions](#step-by-step-instructions)  
  - [Step 1: Install Python & pip (If not already installed)](#step-1-install-python--pip-if-not-already-installed)  
    - [System Update Command](#system-update-command)  
    - [Install Python-3 and python3-pip](#install-python-3-and-python3-pip) 
  - [Step 2: Install Poetry](#step-2-install-poetry)  
  - [Step 3: Create a New Poetry Project](#step-3-create-a-new-poetry-project)  
  - [Step 4: Create & Activate Virtual Environment](#step-4-create--activate-virtual-environment)  
  - [Step 5: Add Dependencies](#step-5-add-dependencies)  
  - [Step 6: Create a Simple Python Script (`cart.py`)](#step-6-create-a-simple-python-script-cartpy)  
  - [Step 7: Run the Script Using Poetry (Running in Context)](#step-7-run-the-script-using-poetry-running-in-context)  
- [Conclusion](#conclusion)  
- [Contact Information](#contact-information)  
- [Reference Table](#reference-table)

---

## Introduction

**Poetry** is a simple, all-in-one tool for managing Python projects, dependencies, and environments—making setup and collaboration easy and consistent.

---

## Prerequisites  
- Python 3.x and pip installed on the system
  
---

## Step-by-Step Instructions  

### Step 1: Install Python & pip (If not already installed)

 #### System Update Command
>  **Follow Step 3 here**: [System Update Command](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_3/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#1-basic-system-commands)
> 

![image](https://github.com/user-attachments/assets/4b9b80cb-31d4-4b98-a2be-44bab05fff5e)


> #### Install Python-3 and python3-pip
>  **Follow Step 3 & 4 here**: [Python3 & python3-pip Installation Commands](https://github.com/snaatak-Downtime-Crew/Documentation/blob/adil_scrums_11/common_stack/application/python/installation/guide/READEME.md#step-3-install-python3)
>

![image](https://github.com/user-attachments/assets/87756a95-f332-47f8-820c-57467127e03f)

### Step 2: Install Poetry

```bash
curl -sSL https://install.python-poetry.org | python3 -
```

To make Poetry available in your terminal session, update your shell configuration:

```bash
echo 'export PATH="$HOME/.local/bin:$PATH"' >> ~/.bashrc
source ~/.bashrc
poetry --version
```

![image](https://github.com/user-attachments/assets/5f4adb8b-2823-4295-a70c-56ece5a24b68)

This installs Poetry and adds it to your system's PATH.

### Step 3: Create a New Poetry Project

```bash
poetry new my_project
cd my_project
```
![image](https://github.com/user-attachments/assets/5a8ebbcd-f31a-40de-8b51-63f6c6127540)

This command will create a new project structure with:
- `pyproject.toml`: The file that manages dependencies.
- `my_project/`: Folder for your Python package.
- `tests/`: Folder for unit tests.

### Step 4: Create & Activate Virtual Environment

```bash
poetry env use python3
poetry env info
```

To manually activate the environment, run:

```bash
source $(poetry env info --path)/bin/activate
```
![image](https://github.com/user-attachments/assets/dfd9ddf9-054c-4051-9be9-b22fea297d60)

This step sets up a virtual environment isolated from your global Python environment.

To manually deactivate the environment, run:

```
deactivate
```


### Step 5: Add Dependencies

```bash
poetry add requests pandas flask
```
![image](https://github.com/user-attachments/assets/60b9239f-4875-4dd7-b363-d4b280dfd3fb)

This command will add requests, pandas, and flask to your project. The dependencies will appear in the pyproject.toml file under the [tool.poetry.dependencies] section:

```toml
[tool.poetry.dependencies]
requests = "^2.31.0"
pandas = "^2.2.1"
flask = "^2.3.0"
```
![image](https://github.com/user-attachments/assets/295f5866-d09b-48a2-a91a-f6795e9dd710)

Poetry will also create or update the poetry.lock file to ensure the same package versions are used everywhere.

### Step 6: Create a Simple Python Script (`cart.py`)

> **Follow Step 2 from here**: [Create a file](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_3/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#2-file-commands)

**Use filename as "cart.py"**

Paste the following code into the `cart.py` file:

```python
def calculate_total():
    cart = {
        "milk": 55,
        "bread": 40,
        "eggs": 75
    }
    total = sum(cart.values())
    print(f"Total grocery bill is: ₹{total}")

if __name__ == "__main__":
    calculate_total()
```

![image](https://github.com/user-attachments/assets/7e7b7445-e2d8-4ee1-9814-4f8f4bebca07)

This script calculates the total cost of grocery items and prints the bill in Indian Rupees (₹).

### Step 7: Run the Script Using Poetry (Running in Context)

```bash
poetry run python cart.py
```

Expected output:

```bash
Total grocery bill is: ₹170
```

![image](https://github.com/user-attachments/assets/787a17e5-9349-4a28-aaad-edd8b7e67986)

Running the script with `poetry run` ensures it uses the isolated virtual environment rather than your system's Python.

---

## Conclusion
Poetry simplifies Python project management and is perfect for beginners and teams. It keeps dependencies and environments isolated, reducing bugs and setup issues. If you’re starting a new project, always prefer using Poetry for a clean, maintainable structure.

---

## **Contact Information**
| **Name** | **Email Address**        |
|----------|--------------------------|
| **Prince Batra**  | **prince.batra.snaatak@mygurukulam.co**   |

---

## **Reference Table**
| **Links** | **Overview** |
|---------------|-------------|
| [Poetry Docs](https://python-poetry.org/docs/) | Guides on using Poetry for dependency management, publishing, and configuration. |
| [Poetry GitHub](https://github.com/python-poetry/poetry) | The source code and issue tracker for Poetry. Useful for devs or contributors. |
| [PEP 518](https://peps.python.org/pep-0518/) | The PEP introducing the `pyproject.toml` standard for Python build systems. |

---
