## Configuring and Managing Log Rotation using Logrotate on Ubuntu

<p align="center">
  <img src="https://www.pc-freak.net/images/logrotate-linux-logo.png" alt="Logrotate Logo" width="150"/>
</p>

---

## Author Information
| Created | Version | Last Modified | Author | Comment | Reviewer |
| --- | --- | --- | --- | --- | --- |
| 14-04-2025 | V1.1 | 17-04-2025 | Shivani Narula | Internal Review | Siddharth Pawar |
| 17-04-2025 | V2 | 17-04-2025 | Shivani Narula | L0 Review | Naveen Haswani |
| 20-04-2025 | V3 | 22-04-2025 | Shivani Narula | L1 Review | Deepak Nishad |
| 22-04-2025 | V4.1 | 30-04-2025 | Shivani Narula | L2 Review | Ashwani Singh |

## Table of Contents

- [Introduction](#introduction)
- [What is Logrotate?](#what-is-logrotate)
- [Why Use Log Rotation?](#why-use-log-rotation)
- [Prerequisites & Setup](#prerequisites--setup)
  - [Prerequisites](#prerequisites) 
  - [Step 1: Check & Install Logrotate](#step-1-check--install-logrotate)
  - [Step 2: Create Log File for Your App](#step-2-create-log-file-for-your-app)
- [Logrotate Configuration](#-logrotate-configuration)
  - [File Locations](#file-locations)
  - [Understanding Rotation Frequency & Retention](#understanding-rotation-frequency--retention)
  - [Step 3: Configuration Steps](#step-3-configuration-steps)
- [Testing Setup](#testing-setup)
  - [Step 4: Test the Setup](#step-4-test-the-setup)
- [Continuous Rotation](#continuous-rotation)
  - [Step 5: Add More Logs and Rotate Again](#step-5-add-more-logs-and-rotate-again)
- [Troubleshooting Tips](#troubleshooting-tips)
- [Best Practices](#best-practices)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [Reference Table](#reference-table)

---

## Introduction

This SOP guides you through configuring **Logrotate** on Ubuntu — a built-in utility for automating log file management. You’ll learn why log rotation is important, what Logrotate does, and how to configure it step by step using a sample custom log file.

As applications generate logs, these files can grow large and clutter your storage if not managed properly. To keep systems clean, efficient, and compliant, **automated log rotation** is essential.

---

## What is Logrotate?

**Logrotate** is a Linux utility that manages the automatic rotation and compression of log files. It prevents log files from consuming excessive disk space by rotating, compressing, and eventually deleting old logs.

---

## Why Use Log Rotation?
Log rotation prevents logs from consuming excessive disk space, improves system performance, and ensures compliance by retaining logs only as long as required. It also simplifies debugging with organized historical logs.

---

## Prerequisites & Setup

### Prerequisites
> N/A — No additional tools or dependencies are required prior to installing Logrotate.

Before you begin configuring Logrotate, it's important to ensure that the tool is installed and up to date on your system. This step will guide you through checking for existing installation and installing it only if required.

---

## Step 1: Check & Install Logrotate

### First, check if Logrotate is already installed:
```
logrotate --version
````

> **Note:** If the command returns a version (e.g., logrotate 3.19.0), Logrotate is already installed. You can skip to [Step 2: Create Log File for Your App](#step-2-create-log-file-for-your-app)

---

### If not installed, update the system and install Logrotate:

> 1️⃣ **Step 1: System Update Command**  
> Before proceeding, it's **highly recommended** to follow the update instructions from the official documentation.  
> 👉 **Follow Step 3 here**: [Ubuntu Basic System Commands](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_3/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#1-basic-system-commands)
>
> ---
>
> 2️⃣ **Step 2: Install Logrotate**  
> ```bash
> sudo apt install logrotate
> ```
> 
> **Note:** Installs the Logrotate tool on your system.
>
> ---
> 
> 3️⃣ **Step 3: After installation, verify again:**
>```
>logrotate --version
>```
>
> **Note:** Confirms Logrotate is installed.
>
---

## Step 2: Create Log File for Your App

Let’s assume your app writes logs to `/var/log/myapp/myapp.log`.

1️⃣ **Create a directory named `myapp`:**
>  
> 👉 **Follow Step 1 here**: [Create myapp directory](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_3/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#3-directory-commands)
>
>
```bash
sudo mkdir -p /var/log/myapp
```
> 
> **Note:** This command creates the directory where your application logs will be stored, ensuring the required directory structure is in place.
>
2️⃣ **Create log file:**

>  **Step to create a file :**  
>  
> 👉 **Follow Step 2 here**: [Create service file with Vi](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_3/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#2-file-commands)
>
> 
```bash
sudo touch /var/log/myapp/myapp.log
```
> 
> **Note:** This creates an empty log file named myapp.log inside the /var/log/myapp directory, where your application will write logs.
>
3️⃣ **Set proper ownership**  
 ```bash
 # Set log file ownership to root and adm group for secure access
 sudo chown root:adm /var/log/myapp/myapp.log
 ```
> 
> **Note:** This sets the ownership of the log file to root and assigns it to the adm group, which is commonly used for managing log files.
>

---
## 📁 Logrotate Configuration 

### File Locations
- **Main config file**: `/etc/logrotate.conf`  
- **Custom per-app configs**: `/etc/logrotate.d/<your-app>`
> **Note:** This shows the locations where Logrotate configuration files are stored. The main config file can include custom configurations for specific apps.

---

### Understanding Rotation Frequency & Retention
  To effectively manage log files, **Logrotate** allows setting how **often** logs are rotated and how **many** old logs are retained. Here's how it works:

 - #### Rotation Frequency Options

  >This determines **how often** log files are rotated:
  >```bash
  >daily      # Rotate logs every day  
  >weekly     # Rotate once a week  
  >monthly    # Rotate once a month  
  >size 100M  # Rotate when log exceeds 100MB (size-based rotation)
  >```

  You can choose **time-based** or **size-based** rotation depending on your application’s log volume.

 - #### Retention Policy

  >This defines **how many old log files** are retained before deletion:
  >```bash
  >rotate 7   # Keep 7 old log files, then delete the oldest
  >```

**Example**: If you use `daily` and `rotate 7`, Logrotate will keep logs from the **last 7 days** and remove anything older.

---

## Step 3: Configuration Steps

1️⃣ **Create Logrotate Config**

>  **Step to create a file :**  
>  
> 👉 **Follow Step 2 here**: [Create service file with Vi](https://github.com/snaatak-Downtime-Crew/Documentation/blob/durgesh_scrums_3/common_stack/operating_system/ubuntu/sop/commoncommands/README.md#2-file-commands)
>
> 
```bash
sudo nano /etc/logrotate.d/myapp
```
> 
> **Note:** This command opens the Logrotate configuration file for your app. You can edit it to specify the log rotation rules.
>
> 
2️⃣ Paste this content:

```
/var/log/myapp/myapp.log {

    # Rotate the log file daily
    daily

    # Keep a maximum of 5 old log files
    rotate 5

    # Do not show an error if the log file is missing
    missingok

    # Compress the old log files
    compress

    # Delay compression by one rotation cycle
    delaycompress

    # Do not rotate the log file if it is empty
    notifempty

    # After rotation, create a new log file with these permissions and ownership
    # adm is a standard system group used for managing access to log files securely.
    create 0640 root adm
}
```

✅ This configuration:
- Rotates log **daily**
- Keeps last **5 logs**
- Compresses old logs (with 1-cycle delay)
- Skips rotation if log is empty
- Recreates the log file with correct permission

---

## Testing Setup
---

### Step 4: Test the Setup

#### a) Add a test log entry

```bash
echo "Test log entry - $(date)" | sudo tee -a /var/log/myapp/myapp.log
```
> 
> **Note:** This command appends a test log entry with the current date and time to the myapp.log file to simulate log data.
>
> 
#### b) Simulate Log Rotation (Dry Run)

```bash
sudo logrotate -d /etc/logrotate.d/myapp
```
> 
> **Note:** This performs a dry run of Logrotate, which shows what would happen if the rotation were executed, without making any actual changes.
>
> 
#### c) Force Log Rotation

```bash
sudo logrotate -f /etc/logrotate.d/myapp
```
> 
> **Note:** Forces Logrotate to immediately rotate the log files, even if it's not yet time for a scheduled rotation.
>
> 
Check the log folder:

```bash
ls -l /var/log/myapp/
```
> 
> **Note:** Lists the files in the myapp log directory to confirm that rotation occurred and the new log file was created.
>
> 
Expected output after first rotation:

```
myapp.log
myapp.log.1
```

---

## Continuous Rotation

---

### Step 5: Add More Logs and Rotate Again

```bash
# Add another test entry to the log for rotation testing
echo "Another log entry - $(date)" | sudo tee -a /var/log/myapp/myapp.log
```
> 
> **Note:** Appends a new log entry to the myapp.log file to simulate more log data.
>
```bash
sudo logrotate -f /etc/logrotate.d/myapp
```
> 
> **Note:** Forces another rotation after adding the new log data.
>
> 
Check again:

```bash
ls -l /var/log/myapp/
```

Expected output after running logrotate twice:

```
myapp.log
myapp.log.1       ← latest rotated log (uncompressed)
myapp.log.2.gz    ← previous log, now compressed
```

---

### Troubleshooting Tips

| Issue | Solution |
|-------|----------|
| Logs not rotating | Check paths, permissions |
| Rotation too frequent | Verify interval and timestamps |
| App not logging | Use `create` and `postrotate` to reopen file handles |
| Rotation skipped	| Ensure log is not empty if notifempty is set |
| Logs still writing to old file after rotation	 | Restart app or use postrotate to reopen log handles          |

---

### Best Practices

| Practice                                      | Description                                                                 |
|----------------------------------------------|-----------------------------------------------------------------------------|
| `compress` and `delaycompress`               | Save disk space by compressing old logs efficiently                        |
| Always test with `-d`                        | Use dry-run mode before applying changes to ensure no errors               |
| Set retention based on space and compliance  | Configure log retention to match system capacity and policy requirements   |
| Use postrotate to reload apps that keep file handles open (e.g., Nginx, Apache)    | Gracefully restart services after log rotation when necessary              |

---

## Conclusion

Logrotate is a powerful utility that automates log file management on Ubuntu systems. It simplifies system maintenance by automatically rotating, compressing, and deleting logs based on defined policies. With customizable schedules and retention rules, it helps maintain system efficiency and reduces the need for manual intervention.

---

## Contacts

| Name | Email Address |
| --- | --- |
| Shivani Narula | shivani.narula.snaatak@mygurukulam.co |

---

## Reference Table

| Links                                                                                                                             | Descriptions                          |
|-----------------------------------------------------------------------------------------------------------------------------------|---------------------------------------|
| [https://linux.die.net/man/8/logrotate](https://linux.die.net/man/8/logrotate)                                                   | man logrotate                         |
| [https://betterstack.com/community/guides/logging/how-to-manage-log-files-with-logrotate-on-ubuntu-20-04/#getting-started-with-logrotate](https://betterstack.com/community/guides/logging/how-to-manage-log-files-with-logrotate-on-ubuntu-20-04/#getting-started-with-logrotate) | Manage Log Files with logrotate       |
