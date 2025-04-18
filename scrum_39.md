#  Documentation: Operating System - Ubuntu


| Created     | Version | Author        | Comment             | Reviewer         |
|-------------|---------|---------------|---------------------|------------------|
| 15-04-2025  | V1.2    | Adil Nawaz    |Internal Review      | Pritam           |
---

##  1. **Introduction**


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
Originally built for compiling C/C++ programs, `make` tracks which files have changed and only rebuilds what’s necessary.  

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
Instead of learning all the internal commands.

---

### 2.5. **Lightweight & Built-in**
- No need to install extra tools — `make` is usually already available on Unix-based systems
- Cross-compatible and scriptable

---

##  What is `make`?

**`make`** is a **build automation tool** that automatically builds and manages dependencies for our project, most often used in **C/C++**, but also useful in **Python**, **Go**, **Docker**, and more.

It's driven by a special file called a **Makefile**.

---

##  What is a Makefile?

A **Makefile** is just a text file that defines:
- What commands to run
- When to run them (based on dependencies)
- Targets like `build`, `run`, `test`, or `clean`

---

###  Think of it like:
A **to-do list for your project**, where `make` figures out **what needs to be done** and does it efficiently.

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
