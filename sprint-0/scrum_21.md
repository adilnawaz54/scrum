#  SOP: Managing Python Dependencies with requirements.txt
![image](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSyVrRrhYDmUdt6QBsDkve4SneCW2cFnKk17Rf4HZ10_U2Z1XgfpBopH2OmXj1qjfo9g&usqp=CAU)


---

##  **Author Information**
| Created     | Last updated | Version | Author         | Comment | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 15-04-2025  | 17-04-2025 | V1.2     | Adil Nawaz |     Internal Review    | Pritam    |
| 18-04-2025  | 19-04-2025 |  V2.1    |Adil Nawaz |     L0 Review    | Shreya    |



---




##  Table of Contents

1. [Introduction](#introduction)  
2. [Installing from requirements.txt](#installing-from-requirementstxt)  
3. [Generating Dependencies for Requirement.txt](#generating-dependencies-for-requirementtxt)  
   - [Dependencies list inside Requirement.txt](#dependencies-list-inside-requirementtxt)  
   - [Example requirements.txt](#example-requirementstxt)  
4. [Using Virtual Environments](#using-virtual-environments)  
5. [Common pip install Issues & Troubleshooting](#common-pip-install-issues--troubleshooting)  
6. [Conclusion](#conclusion)  
7. [Contact](#contact)  
8. [References](#references)

---




##  Introduction

This SOP outlines how to create, install, and troubleshoot Python dependencies using the `requirements.txt` file. It covers best practices for versioning, using virtual environments, and handling common issues developers face.

---

> 👉 **Follow Documentation**: [What is requirement.txt and How to generate requirement.txt](https://github.com/snaatak-Downtime-Crew/Documentation/blob/yuvraj_scrums_20/common_stack/application/python/requirements/documentation/README.md)
---


##  Installing from requirements.txt

Make sure you are inside your project's virtual environment:

```bash
pip install -r requirements.txt
```
This command reads the file and installs every listed dependency.

---


##  Generating Dependencies for Requirement.txt
Generating dependencies in requirements.txt means listing all the packages your project needs so they can be easily installed later using `pip install -r requirements.txt`



   - ###  **Dependencies list inside Requirement.txt**

| Entry Type                     | Example                          | Description                                                                 |
|-------------------------------|----------------------------------|-----------------------------------------------------------------------------|
| **Exact package version**     | `flask==2.1.1`                   | Locks the version to avoid unexpected updates or breaking changes.         |
| **Minimum version**           | `requests>=2.25.0`               | Ensures at least this version is installed.                                |
| **Version range**             | `numpy>=1.18,<1.22`              | Allows updates within a safe range.                                        |
| **Environment markers**       | `PyYAML; python_version<"3.8"`   | Conditional install based on Python version.                               |
| **Editable installs**         | `-e ./local_package/`            | Installs a local package in “editable” mode (changes reflect live).        |
| **GitHub or Git packages**    | `git+https://github.com/user/repo.git@main#egg=package` | Install directly from a Git repository.      |
| **Recursive files**           | `-r other-requirements.txt`      | Includes another requirements file.                                        |

---

   - ###  Example `requirements.txt`

```txt
flask==2.1.1
requests>=2.25.0,<3.0.0
pandas
-e ./my-local-lib/
git+https://github.com/psf/requests.git@master#egg=requests
-r dev-requirements.txt
```

##  Using Virtual Environments
> 👉 **Follow Documentation**: [Virtual Environments](https://github.com/snaatak-Downtime-Crew/Documentation/blob/harsh_scrums_13/common_stack/application/python/virtualenv/documentation/README.md)


##  Common `pip install` Issues & Troubleshooting


| **Issue**                       | **Description**                                                                                           | **Fix**                                                                                                 |
|--------------------------------|-----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| **1. Version Conflicts**        | Conflicting requirements between packages.                                                                | Pin compatible versions manually in `requirements.txt`.                                                  |
| **2. No Matching Distribution** | Invalid version or package name.                                                                          | Double-check on [PyPI](https://pypi.org) or remove the version constraint.                               |
| **3. Install Fails / Slow**     | Installation fails midway or is very slow.                                                                | Run with `--no-cache-dir`:<br>`pip install --no-cache-dir -r requirements.txt`<br>Install build tools:<br>`sudo apt install python3-dev build-essential` |
| **4. OS-Specific Packages**     | Some packages are only compatible with specific OS like Windows/Linux.                                    | Use OS-specific `requirements-*.txt` or add notes for compatibility.                                     |
| **5. Unicode/Encoding Errors**  | Encoding issues in `requirements.txt`.                                                                    | Save file with UTF-8 encoding or regenerate using `pip freeze`.                                          |

---


##  Conclusion

Using `requirements.txt` makes maintaining, sharing, and deploying consistent Python environments easy. It is essential for any professional or collaborative Python project.

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
| documentation requirement.txt    | [generate requirment.txt ](https://github.com/snaatak-Downtime-Crew/Documentation/blob/yuvraj_scrums_20/common_stack/application/python/requirements/documentation/README.md)
| Virtual Environment    | [Virtual Environments](https://github.com/snaatak-Downtime-Crew/Documentation/blob/harsh_scrums_13/common_stack/application/python/virtualenv/documentation/README.md) | 


---
