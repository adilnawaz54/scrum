# ReactJS Installation Guide

| Created     | Last Updated | Version | Author          | Comment         | Reviewer |
|-------------|--------------|---------|-----------------|-----------------|----------|
| 14-04-2025  |  14-04-2025  | V1      | Nishkarsh Kumar | Internal Review | Pritam   |
| 14-04-2025  |  18-04-2025  | V2      | Nishkarsh Kumar | L0              | Akshit   |
| 14-04-2025  | 23-04-2025 |  V3   | Nishkarsh Kumar |     L1 Review    | Abhishek V    |

## Introduction
This guide provides a step-by-step process for setting up a ReactJS development environment.

## Table of Contents

1. [Why ReactJS?](#why-reactjs)
2. [What is ReactJS?](#what-is-reactjs)
3. [Prerequisites](#prerequisites)
4. [Step-by-step-installation-guide](#step-by-step-installation-guide)
     - [Update system packages](#1-update-system-packages)
     - [Install nodejs and npm](#2-install-nodejs-and-npm)
     - [Create a React App with Vite](#3-create-a-react-app-with-vite)
     - [Install Dependencies](#4-install-dependencies)
     - [Start-the-local-development-server](#5-start-the-local-development-server)
5. [Troubleshooting](#troubleshooting)
     - [Permission Denied](#if-you-encounter-permission-errors)
     - [Other Error](#if-the-app-doesnt-start)
6. [Contacts](#contacts)
7. [References](#references)

---

## Why ReactJS?
**To explore benefits of ReactJS**: [ReactJS Intro Documentation](https://github.com/snaatak-Downtime-Crew/Documentation/blob/harsh_scrums_32/common_stack/application/reactjs/introduction/README.md#why-use-react)

## What is ReactJS?
**To get an overview of ReactJS**: [ReactJS Intro Documentation](https://github.com/snaatak-Downtime-Crew/Documentation/blob/harsh_scrums_32/common_stack/application/reactjs/introduction/README.md#what-is-react-js)

## Prerequisites
Before installing ReactJS, ensure you have the following installed on your Ubuntu system:
 - Node.js (version 14 or later recommended)
 - npm (comes with Node.js) 

**To know more about npm**: [npm Documentation](https://github.com/snaatak-Downtime-Crew/Documentation/blob/prince_scrums_35/common_stack/application/reactjs/npm/documentation/README.md#what-is-npm)

## Step-by-Step Installation Guide

### 1. Update System Packages

**To update your package list to latest version, Follow step 3**: [SOP for common commands](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_3/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#1-basic-system-commands)

### 2. Install Node.js and npm
React requires Node.js to run.

**To install nodejs package and verify it's installation**: [SOP's for npm](https://github.com/snaatak-Downtime-Crew/Documentation/blob/shivani_scrums_36/common_stack/application/reactjs/npm/sop/README.MD#%EF%B8%8F-step-1-check--install-nodejs-and-npm)

```bash
sudo apt install npm
```

Verify the installation:

```bash
npm --version
```

### 3. Create a React App with Vite
Create React App is the official way to create single-page React applications.

```bash
npm create vite@latest my-react-app -- --template react
```

### 4. Install Dependencies
Navigate to your development directory and create a new React app:

```bash
npm install
```

### 5. Start the local Development Server

```bash
npm run dev
```
This will start the development server at http://localhost:5173.

## Troubleshooting

### If you encounter permission errors:
```bash
sudo chown -R $(whoami) ~/.npm
```
### If the app doesn't start:
 - Ensure you're in the correct directory (the one with package.json)
 - Try clearing npm cache:

      ```bash
       npm cache clean --force
      ```
 - Reinstall dependencies:

      ```bash
       rm -rf node_modules
       npm install
      ```

## Contacts

| Name            | Email Address                                 |
|-----------------|-----------------------------------------------|
| Nishkarsh Kumar | nishkarsh.kumar.snaatak@mygurukulam.co        |


## References

| **Title**                              | **Link**                                                                                            |
|----------------------------------------|-----------------------------------------------------------------------------------------------------|
| React Official Documentation           | [Visit](https://reactjs.org/docs/getting-started.html)                                              |
| Node.js Official Installation Guide    | [Visit](https://nodejs.org/en/download/package-manager/#debian-and-ubuntu-based-linux-distributions)|

---
