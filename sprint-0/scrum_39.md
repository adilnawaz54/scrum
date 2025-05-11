
#  Documentation: Introduction on Make


| Created     | Version | Author        | Comment             | Reviewer         |
|-------------|---------|---------------|---------------------|------------------|
| 18-04-2025  | V1    | Adil Nawaz    |Internal Review      | Pritam           |
| 19-04-2025  | V2.1    | Adil Nawaz    |L0     | Shreya Jaiswal           |
---




##  Table of Contents

1. [**Introduction**](#1-introduction)  
2. [**What is `make`?**](#2-what-is-make)  
3. [**Why Use `make`?**](#3-why-use-make)  
4. [**Key Features of `make`**](#4-key-features-of-make)  
5. [**What is a Makefile?**](#5-what-is-a-makefile)  
   - [Structure of a Makefile](#structure-of-makefile--how-to-write-inside-makefile)  
   - [Installing `make`](#to-run-the-makefile-we-need-to-install-make-in-our-system)  
6. [**Conclusion**](#5-conclusion)  
7. [**Contacts**](#6-contacts)  
8. [**References**](#7-references)  

---


##  1. **Introduction**
The documentation provides you a basic understanding of why we use `make` and what are the benefits of using **make** in our project. We create a makefile which is a **to-do list for your project**, where `make` figures out **what needs to be done** and does it efficiently.

---

## 2. What is `make`?
`make` is a **build automation tool** that reads a **Makefile** to:
- Decide **what needs to be done**
- Run only the **necessary commands**
- Work across languages and tools (not just C/C++)

---



### 3. **Why Use `make`?**

| Benefit                        | Description                                                                 |
|-------------------------------|-----------------------------------------------------------------------------|
|  Automate Repetitive Tasks  | Replace long shell commands with simple ones like `make build`, `make test`. |
|  Standardize Workflows      | Teams can share consistent scripts inside a `Makefile`.                     |
|  Speed Up Onboarding        | New developers only need to run `make setup`—no need to memorize commands.  |
|  Efficient Build Process     | Only rebuilds what has changed—saves time and system resources.             |

---




### 4. **Key Features of `make`**

| Feature                     | Description                                                                 |
|----------------------------|-----------------------------------------------------------------------------|
|  **Target-based execution**   | Defines tasks (like `build`, `run`, `test`) and when they should run       |
|  **Dependency tracking**      | Only executes tasks if dependencies have changed                          |
|  **Human-readable Makefiles**| Easy to write and understand — looks like a to-do list for your project     |
|  **Language/tool agnostic**  | Use with Python, Go, Docker, Node.js, Rust, etc.                           |
|  **Fast and lightweight**     | Comes pre-installed on most Unix systems, no overhead                     |
|  **Customizable workflows**  | Create flexible targets like `make lint`, `make clean`, `make deploy`     |
|  **Integrates well with CI/CD** | Works smoothly with Jenkins, GitHub Actions, GitLab CI, etc.              |

---


## 5. What is a Makefile?

A **Makefile** is just a text file that defines:
- What commands to run
- When to run them (based on dependencies)
- Targets like `build`, `run`, `test`, or `clean`

---

  - ### Structure of Makefile ( How to write inside Makefile)

`Makefile` for a Python project:

```Makefile
install:
	pip install -r requirements.txt
run:
	python app.py
test:
	pytest
clean:
	rm -rf __pycache__ *.pyc
```
---


  - ## **To Run the Makefile we need to install make in our system**

> 👉 **Follow Documentation**: [make Installation](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_40/common_stack/others/make/sop/README.md)
>  
---


##  5. **Conclusion**

**make** simplifies repetitive tasks, improves consistency, and speeds up development. It's lightweight, easy to use, and works across languages and tools—making it a valuable addition to any project.

---


## 6. Contacts

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

---

## 7. References

| **Resource**                     | **Description**                                    |
|----------------------------------|--------------------------------------------------|
| [GNU Make Documentation](https://www.gnu.org/software/make/) | Official GNU Make documentation.                |
| [Make Tutorial](https://opensource.com/article/18/8/what-how-makefile) | Beginner-friendly guide to Makefiles.           |
| [GNU Make GitHub](https://github.com/mirror/make) | Source code repository for GNU Make.             |
| [make Installation](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_40/common_stack/others/make/sop/README.md)| Documentation on make Installation     |

---
