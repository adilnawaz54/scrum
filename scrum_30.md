# Golang Installation Documentation

---
## **Author Information**
| Created     | Version | Author        | Comment                 | Reviewer         |
|-------------|---------|---------------|-------------------------|------------------|
| 18-04-2025  | V1      | Adil Nawaz    |   Internal Reviewer     | Pritam           |

---





## 📘 Table of Contents

1. [Introduction](#introduction)  
2. [Why Go?](#why-go)  
3. [What is Go?](#what-is-go)  
4. [Golang Installation Guide (Step by Step)](#golang-installation-guide-step-by-step)  
    4.1. [Download Go](#1-download-go)  
    4.2. [Linux Installation](#2-linux-installation)  
    4.3. [Setup Workspace](#3-setup-workspace)  
    4.4. [Test Installation](#4-test-installation)  
    4.5. [Confirm Everything Works](#5-confirm-everything-works)  
5. [Conclusion](#conclusion)  
6. [Contact](#contact)  
7. [References](#references)  

---



## Introduction
This documentation outlines the core concepts and practical value of the Go programming language (Golang), highlighting why it was created, what it offers, and step by step installation guide.

---

## Why Go?

Go was created to address common problems faced in software development, especially at scale. Some reasons for its creation and widespread adoption:

> - **Simplicity:** Easy to learn, read, and write.
> - **Performance:** Compiles to machine code, offering near-C performance.
> - **Concurrency:** First-class support for concurrent programming with Goroutines.
> - **Compilation Speed:** Very fast build times, aiding rapid development.
> - **Scalability:** Ideal for large codebases, microservices, and cloud-native applications.
> - **Cross-Platform:** Compile once, run anywhere (Linux, Windows, macOS, etc.).
> - **Open Source:** Backed by Google and a vibrant open-source community.

---

## What is Go?

> Go (or Golang) is a statically typed, compiled programming language designed for efficiency, simplicity, and reliability. It supports procedural as well as concurrent programming paradigms.

**Metadata**

| Field          | Detail                         |
|----------------|--------------------------------|
| Language       | Go (Golang)                    |
| Designed By    | Robert Griesemer, Rob Pike, Ken Thompson |
| Developed At   | Google                         |
| First Released | March 2012                     |
| Current Version| `go version` (Check in terminal) |
| Website        | [https://golang.org](https://golang.org) |


---

##  Golang Installation Guide (Step by Step)

---

##  1. Download Go

Choose the installer for your OS:
- Linux `.tar.gz`

---

##  2. Linux Installation

### Manual Method:

1. Download `.tar.gz` from [https://go.dev/dl/](https://go.dev/dl/)
2. Extract it:
```bash
tar -C /usr/local -xzf go1.x.x.linux-amd64.tar.gz
```
3. Add Go to your `PATH`:

```bash
export PATH=$PATH:/usr/local/go/bin
```

Add the line to your `~/.bashrc`, `~/.zshrc`, or `~/.profile` to make it permanent.

To verify:
```bash
go version
```

---

##  3. Setup Workspace

Go recommends a directory structure like:

```bash
~/go/          # GOPATH
├── bin/
├── pkg/
└── src/
```

Set environment variables in `.bashrc` or `.zshrc`:

```bash
export GOPATH=$HOME/go
export PATH=$PATH:$GOPATH/bin
```

---

##  4. Test Installation

Create a test file:
```bash
mkdir -p ~/go/src/hello
cd ~/go/src/hello
```

Create `main.go`:
```go
package main

import "fmt"

func main() {
    fmt.Println("Hello, World!")
}
```

Run it:
```bash
go run main.go
```

You should see:
```
Hello, World!
```

---

##  5. Confirm Everything Works

Run:
```bash
go env
```

It should show your Go environment:
- `GOROOT` – Go installation path
- `GOPATH` – Workspace path
- `GOOS`, `GOARCH`, etc.

---

## Conclusion

Golang is a modern, efficient, and powerful language built with real-world software engineering in mind. Its clean syntax, fast performance, and built-in concurrency make it an excellent choice for scalable and maintainable software systems — especially in the era of microservices and cloud computing.

---

## Contact

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz   | adil.nawaz.snaatak@mygurukulam.co             |
---

## References


| **Title**                        | **Link**                                                                                      |
|----------------------------------|-----------------------------------------------------------------------------------------------|
| Official Go Documentation  | [Link](https://golang.org/doc/) |
| Go official | [https://go.dev/dl/](https://go.dev/dl/) |
