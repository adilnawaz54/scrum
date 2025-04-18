#  Documentation: Operating System - Ubuntu


| Created     | Version | Author        | Comment             | Reviewer         |
|-------------|---------|---------------|---------------------|------------------|
| 15-04-2025  | V1.2    | Adil Nawaz    |Internal Review      | Pritam           |
---

##  1. **Introduction**
The documentation provides you a basic understanding of why we use `make` and what are the benefits of using `make` in our project. We create a makefile which is a **to-do list for your project**, where `make` figures out **what needs to be done** and does it efficiently.

---

##  2. **Why do we use Make?**
**make** is a build automation tool that automatically builds and manages dependencies.

### 2.1. **Automate Repetitive Tasks**
Instead of running long commands every time, you just run:
```bash
make test
make build
make run
```
`make` executes the exact commands you define in a `Makefile`.

---

### 2.2. **Manage Dependencies**
Originally built for compiling C/C++ programs, `make` tracks which files have changed and only rebuilds what’s 		necessary.  

---

### 2.3. **Language-Agnostic Tooling**
You can use `make` for:
- Compiling C, C++, Rust, Go
- Running Python scripts
- Docker builds
- Linting, testing, code formatting

---

### 2.4. **Faster Onboarding**
New developers only need to know:
```bash
make setup
make run
```
---

### 2.5. **Lightweight & Built-in**
- No need to install extra tools — `make` is usually already available on Unix-based systems
- Cross-compatible and scriptable

---

## 3. What is `make`?

**`make`** is a **build automation tool** that automatically builds and manages dependencies for our project, most often used in **C/C++**, but also useful in **Python**, **Go**, **Docker**, and more.

It's driven by a special file called a **Makefile**.

---

## 4. What is a Makefile?

A **Makefile** is just a text file that defines:
- What commands to run
- When to run them (based on dependencies)
- Targets like `build`, `run`, `test`, or `clean`

---

## Example:

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

Now from your terminal, we can just run:

```bash
make install
make run
make test
make clean
```

##  5. **Conclusion**

Ubuntu stands out as one of the most reliable, user-friendly, and versatile Linux distributions available today. Whether you're a beginner exploring Linux for the first time, a developer building modern applications, or a system administrator managing large-scale infrastructure, **Ubuntu provides a powerful and secure environment** to get the job done.

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
| [Learn Makefiles](https://makefiletutorial.com/)  | Interactive tutorial on writing Makefiles.       |

---
