# React JS Application installation via Bash Script

![React Logo](https://th.bing.com/th/id/OIP.QdIrCNdF2ZVylABjjes1LAHaGq?rs=1&pid=ImgDetMain)

---

## Author Information

| Created     | Last updated | Version | Author         | Comment | Reviewer |
|-------------|-----------|---------|----------------|---------|----------|
| 18-04-2025  | 19-04-2025 | V1.1    | Prateek Rai |     Internal Review    | Siddharth Pawar    |
| 18-04-2025  | 19-04-2025 |  V2     | Prateek Rai |     L0 Review    | Shikha Tripathi    |
| 18-04-2025  | 19-04-2025 |  V3     | Prateek Rai |     L1 Review    | Kirti Nehra    |
| 18-04-2025  | 19-04-2025 |  V4     | Prateek Rai |     L2 Review    | Ashwani Singh    |



---

## Table of Content

This document covers the following:

- [Introduction](#introduction)
- [Why Use a Bash Script for React Setup](#why-use-a-bash-script)
- [What the Script Does](#what-the-script-does)
- [Key Features](#key-features)
- [Script Usage](#script-usage)
- [Customizing React Version](#customizing-react-version)
- [Upgrade React Version](#upgrade-react-version)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [References](#references)

---

## Introduction

This guide is for developers who want to quickly and consistently set up a React.js project using a **bash script**. The script automates the environment setup, React installation, and supports **multiple versions** including **upgrade capability**.

---

## Why Use a Bash Script?

Manual setup of React projects can be:

- Time-consuming
- Error-prone
- Inconsistent across environments

Using a **bash script** helps to:

- Standardize installations across machines and teams
- Quickly initialize projects with any specified React version
- Make upgrades smoother by abstracting commands

---

## What the Script Does

The bash script performs:

- Node.js and npm installation (if not present). For more info [visit](https://github.com/snaatak-Downtime-Crew/Documentation/blob/nishkarsh_scrums_33/common_stack/application/reactjs/installation/guide/README.MD#prerequisites) 
- React project creation using `npx create-react-app`
- Optional version specification (default: latest)
- Supports project upgrade to a newer version of React

---

## Key Features

| Feature | Description |
|--------|-------------|
|  Node & npm Check | Automatically installs Node.js if not installed |
|  React App Init | Creates project with `create-react-app` |
|  Version Control | Allows installing a specific version |
|  Reusability | Generic across environments |
|  Upgrade Support | Supports upgrading React version later |
|  Customizable | Easy to modify or extend for extra tooling |

---

## Script Usage

### Step 1: Save the Script

Create a file named `react-setup.sh`:

```bash
#!/bin/bash

# React install/upgrade bash script
# Usage: ./install_or_upgrade_react.sh <project_name> <react_version>
# Example: ./install_or_upgrade_react.sh 18.2.0 my-app

set -e

PROJECT_NAME=$1
REACT_VERSION=$2

if [ -z "$PROJECT_NAME" ] || [ -z "$REACT_VERSION" ]; then
  echo "Usage: $0 <project_name> <react_version>"
  exit 1
fi

echo "Checking for Node.js..."
if ! command -v node >/dev/null 2>&1; then
  echo "Installing Node.js..."
  curl -fsSL https://deb.nodesource.com/setup_18.x | sudo -E bash -
  sudo apt-get install -y nodejs
else
  echo "Node.js already installed: $(node -v)"
fi

# Check if project directory exists
if [ -d "$PROJECT_NAME" ]; then
  echo "Project '$PROJECT_NAME' already exists."
  echo "Upgrading React to version $REACT_VERSION..."
  cd "$PROJECT_NAME"

  npm install react@$REACT_VERSION react-dom@$REACT_VERSION
  echo "React has been upgraded to version $REACT_VERSION"
else
  echo "Creating new React app '$PROJECT_NAME' with React version $REACT_VERSION..."
  npx create-react-app@$REACT_VERSION "$PROJECT_NAME"
  echo "React app created successfully"
fi

# Display installed versions
cd "$PROJECT_NAME"
echo ""
echo "Installed versions:"
npm list react | grep react@
npm list react-dom | grep react-dom@

```

### Step 2: Make it Executable

```bash
chmod +x react-setup.sh
```

### Step 3: Run the Script

```bash
./react-setup.sh my-app 18.2.0
# Or use latest version with default project name
./react-setup.sh
```

---

## Customizing React Version

You can pass any available version on [npm](https://www.npmjs.com/package/react) as an argument:

```bash
./react-setup.sh 17.0.2 cool-react-app
```

- If no version is provided, it will install the latest.

---

## Upgrade React Version

To upgrade an existing project manually:

```bash
npm install react@latest react-dom@latest
npm audit fix --force
```

- You can integrate this into the script if needed.

---

## Conclusion

This bash script streamlines the React project setup by automating environment checks, version control, and project initialization—ensuring consistency and saving valuable developer time across systems. 

---

## Contacts

| Name | Email Address |
|------|----------------|
| Prateek Rai | prateek.rai.snaatak@mygurukulam.co |

---

## References

| Link | Description |
|------|-------------|
| [React Docs](https://react.dev/) | Official React documentation |
| [Create React App](https://create-react-app.dev/) | Toolchain for React apps |
| [Node.js Setup](https://github.com/nodesource/distributions) | Node.js setup on Linux |
