# Poetry Documentation
---
![image](https://th.bing.com/th/id/OIP.u0ITNfG1tfzVyuLcZWPWTAHaD4?w=343&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7)

---
##  Author Information
| Created     | Last updated | Version | Author         | Comment | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 17-04-2025  | 18-04-2025 | V1.1    | Prateek Rai |     Internal Review    | Siddharth Pawar    |
| 17-04-2025  | 18-04-2025 |  V2.1     | Prateek Rai |     L0 Review    | Shikha Tripathi    |
| 17-04-2025  | 22-04-2025 |  V3     | Prateek Rai |     L1 Review    | Kirti Nehra    |
| 17-04-2025  | 22-04-2025 |  V4     | Prateek Rai |     L2 Review    | Ashwani Singh    |
---

##  Table of Content

This documentation covers the following points:

- [Introdution](#introduction)
- [Why Poetry is used](#why-poetry)  
- [What Poetry is](#what-is-poetry)  
- [Key features of Poetry](#key-features)  
- [Comparison with `pip` and `venv`](#poetry-vs-pip--venv)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Best Practices](#best-practices)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [References](#references)
  
---

##  Introduction
 
This documentation is intended for developers working on a common stack who need a reliable and easy-to-understand approach to managing Python applications using Poetry. **Poetry** addresses these challenges by providing a unified, modern workflow that simplifies project setup, dependency management, and publishing.

---

##  Why Poetry?

Poetry solves common Python project issues like dependency conflicts and scattered setups.
It ensures consistent builds and makes project management easier across teams.
With automatic environment handling and reliable dependency resolution, it reduces manual effort. 

---

##  What is Poetry?

Poetry is a Python tool that manages dependencies, virtual environments, and packaging in one place.
It uses pyproject.toml to keep everything organized and simplifies building and publishing projects.
By combining multiple tools into one, it makes Python development cleaner and more efficient.
Poetry simplifies and modernizes Python development by combining the functionality of `pip`, `virtualenv`, and `setuptools` into a single tool.

---

##  Key Features

| Feature | Description |
|--------|-------------|
|  **Dependency Management** | Handles direct and transitive dependencies with a lock file (`poetry.lock`) |
|  **Packaging** | Build and distribute Python packages easily |
|  **Virtual Environments** | Automatically creates isolated environments per project |
|  **Unified Configuration** | Uses `pyproject.toml` for config, replacing `requirements.txt`, `setup.py`, etc. |
|  **Reproducibility** | Locks dependency versions for consistent installs |
|  **Testing Support** | Integrates with popular testing tools like `pytest` |
|  **PyPI Publishing** | Easily publish with `poetry publish` |

---

##  Poetry vs pip + venv

| Feature | `pip` + `venv` | `Poetry` |
|--------|------------------|-----------|
| **Dependency Installation** | `pip install <package>` | `poetry add <package>` |
| **Environment Management** | Manual via `venv` | Built-in and automatic |
| **Dependency Tracking** | `requirements.txt` | `pyproject.toml` + `poetry.lock` |
| **Dependency Resolution** | Manual | Automatic and reliable |
| **Project Metadata** | `setup.py`, `MANIFEST.in`, etc. | Centralized in `pyproject.toml` |
| **Reproducibility** | Manual pinning needed | Guaranteed with lock file |
| **Publishing to PyPI** | `twine upload` | `poetry publish` |

---

## Advantages 

| Advantage | Description |
| --- | --- |
| **All-in-One Tool** | Manages dependencies, virtual environments, and packaging from one interface. |
| **Reproducible Builds** | `poetry.lock` ensures consistent environments across machines. |
| **Automatic Environment Management** | Eliminates the need for manual `venv` creation and activation. |
| **Simplified Project Setup** | `pyproject.toml` centralizes configuration. No need for `setup.py`, `requirements.txt`, etc. |
| **Improved Dependency Resolution** | Smart and conflict-aware resolution of dependency trees. |
| **Built-in Publishing** | Direct publishing to PyPI with a simple command (`poetry publish`). |
| **Better Dev Workflow** | Supports commands like `poetry run`, `poetry shell`, improving script and tool execution. |

---

## Disadvantages

| Disadvantage | Description |
|--------------|-------------|
| **Learning Curve** | Initial setup and understanding `pyproject.toml` might take time for new users. |
| **Not Standard in Legacy Projects** | May not be compatible with older tools or workflows relying on `setup.py`. |
| **Limited Plugin Support** | Compared to `setuptools`, fewer third-party extensions. |
| **Performance Overhead** | Environment creation and dependency resolution can sometimes be slower. |
| **Hidden Virtual Environments** | Managing Poetry-created virtual environments manually might be non-intuitive. |
| **Windows Issues** | Occasional environment-related bugs or path issues on Windows systems. |

---

## Best Practices

| Area | Practice |
|------|----------|
| **Project Initialization** | Use `poetry new <project-name>` for a clean and structured start. |
| **Environment Handling** | Prefer `poetry shell` or `poetry run <cmd>` over manual activation. |
| **Dependency Management** | Use `poetry add` and `poetry remove` instead of editing `pyproject.toml` directly. |
| **Dev Dependencies** | Use `--group dev` or `--dev` to separate dev dependencies: `poetry add --group dev black`. |
| **Lock File Maintenance** | Always commit `poetry.lock` to version control for team consistency. |
| **Build & Publish** | Run `poetry build` before `poetry publish`, and test uploads with TestPyPI. |
| **Script Execution** | Run code via `poetry run python script.py` within the managed virtual environment. |
| **Version Pinning** | Pin versions for critical packages (e.g., `requests==2.31.0`) to avoid unexpected updates. |

---

##  Conclusion

Poetry streamlines Python development by combining environment setup, dependency management, and packaging into a single tool. It ensures clean project structure, reliable builds, and easy package distribution, making development faster and more consistent.  

---
##  Contacts

| Name | Email Address |
| --- | --- |
| Prateek Rai | prateek.rai.snaatak@mygurukulam.co |

---
 
##  References

| Link | Description |
| --- | --- |
| [Poetry Documentation](https://python-poetry.org/docs/) | Poetry official resorces |
| [pyproject.toml Reference](https://python-poetry.org/docs/pyproject/) | Poetry Project Overview |

---
