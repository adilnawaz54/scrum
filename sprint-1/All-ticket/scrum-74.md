# POC of Notification-API

![Image](https://thaka.bing.com/th/id/OIP.g9SdunVmLqkrgtyX2RvRHgHaHa?w=173&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7)

---

## Author Information

| Created | Modified | Version | Author       | Comment         | Internal Reviewer    |
|---------|---------|---------|--------------|------------------|----------------------|
| 24-04-2025 | 28-04-2025      | V1.1     | Prateek Rai  | Initial Commit   | Siddharth Pawar      |
| 24-04-2025 | 28-04-2025      | V2     | Prateek Rai  | L0   | Shikha Tripathi      |
| 24-04-2025 | 28-04-2025      | V3     | Prateek Rai  | L1   | Kirti Nehra      |
| 24-04-2025  | 28-04-2025 | V4      | Prateek Rai |     L2     | Ashwani Singh |


---

## Table of Contents

- [Introduction](#introduction)
- [Supported Features](#supported-features)
- [Pre-requisites](#pre-requisites)
- [Dependencies](#dependencies)
- [Step-by-step Installation](#step-by-step-installation)
  - [Update System and Install Dependencies](#update-system-and-install-dependencies)
  - [Verify Python and pip](#verify-python-and-pip)
  - [Clone the Repository](#clone-the-repository)
  - [Set Up Virtual Environment](#set-up-virtual-environment)
  - [Install Python Dependencies](#install-python-dependencies)
  - [Install Elasticsearch](#install-elasticsearch)
- [Configure & Run the Application](#configure--run-the-application)
  - [Configure YAML](#configure-configyaml)
  - [Add Test Data](#add-test-data)
  - [Run the Notification Service](#run-the-notification-service)
- [Testing the Application](#testing-the-application)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [References](#references)

---

## Introduction

This POC outlines the setup of the `Notification API`. It leverages Python, Elasticsearch, and local system services to run the application as intended.

---

## Supported Features

- Sends Email notifications based on data
- Integration with Elasticsearch to fetch records
- Configurable SMTP via YAML
- CLI mode selection for flexibility (`external` / `cron`)

---
## **Pre-requisites**

- A valid SMTP email configuration.
- Elasticsearch installation with an employee database containing employee emails.
- Python 3.8+ for scripting the notification logic.  
- pip 20+ for managing Python dependencies.  
- Operating System: Ubuntu 22.04 for system compatibility.
  
---

## **Dependencies**

### Run Time Dependencies
| Name           | Version  | Description                            | 
|----------------|----------|----------------------------------------|
| Python         | 3.10+    | Main programming language              | 
| pip            | latest   | For managing Python packages           | 
| Elasticsearch  | 7.17.17  | Used for indexing and querying employee data from the employee database    |

### Other Dependencies
| Name           | Description                                 | Why It’s Needed                                         |
|----------------|---------------------------------------------|--------------------------------------------------------|
| SMTP Email     | Used for sending scheduled notifications    | Sends email notifications                               |

**Important Ports**
| Inbound Traffic | Description                      |
|------------------|----------------------------------|
| 9200             | Elasticsearch HTTP Interface     |

**Others**
| Configuration         | Description                           |
|------------------------|---------------------------------------|
| App password / API key | Required for authenticating with SMTP |

---

## Step-by-step Installation

### Update System and Install Dependencies

#### System Update Command
>  **Follow Step 3 here**: [System Update Command](https://github.com/snaatak-Downtime-Crew/Documentation/tree/main/common_stack/operating_system/ubuntu/sop/commoncommands)

![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/sudo-apt-update.png?raw=true)

```
sudo apt install python3 python3-pip python3-venv curl wget git -y 

```
![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/python-setup.png?raw=true)

---

### Verify Python and pip

```bash
python3 --version
pip3 --version
```
![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/pyhton-version.png?raw=true)

---

### Clone the Repository

```bash
git clone https://github.com/OT-MICROSERVICES/notification-worker.git
cd notification-worker/
```
![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/git-clone.png?raw=true)

---

### Set Up Virtual Environment

```bash
python3 -m venv venv
source venv/bin/activate
```

---

### Install Python Dependencies

```bash
pip install -r requirements.txt
```
![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/venv-setup-requirement.txt.png?raw=true)

---

### Install Elasticsearch

```bash
wget https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-7.17.17-amd64.deb
sudo dpkg -i elasticsearch-7.17.17-amd64.deb
sudo systemctl enable elasticsearch
sudo systemctl start elasticsearch
```
![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/elasticsearch-setup.png?raw=true)

---

### Verify Elasticsearch

```bash
curl http://localhost:9200
```

You should receive a JSON response from Elasticsearch like given below.

![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/elasticsearch-status.png?raw=true)

---

## Configure & Run the Application

---

### Configure `config.yaml`

Edit `config.yaml` to match your credentials and environment setup:

```yaml
smtp:
  from: "your-real-email@gmail.com"
  username: "your-real-email@gmail.com"
  password: "your-app-password"     # Use App Password, not Gmail password
  smtp_server: "smtp.gmail.com"
  smtp_port: "587"

elasticsearch:
  username: "elastic"
  password: "elastic"
  host: "localhost"
  port: 9200
```

> 💡 **Tip**: You must use a Gmail **App Password**. [How to create one](https://support.google.com/accounts/answer/185833)

---

### Add Test Data

Run the following command to insert test data into Elasticsearch:

```bash
curl -X POST "localhost:9200/employee-management/_doc/1" -H 'Content-Type: application/json' -u elastic:elastic -d'
{
  "name": "Your Name",
  "email_id": "your-real-email@gmail.com"
}'
```
![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/data-pushed.png?raw=true)

---

### Run the Notification Service

```bash
export CONFIG_FILE=./config.yaml
python3 notification_api.py --mode external
```
![image](https://github.com/Raisahab1905/Snaaak-demo/blob/prateek_scrums_74/runs-service.png?raw=true)

- Email has been succesfully sent to particular employee with the help of Notification-API.
  

---

## Testing the Application

- Observe terminal logs for successful email dispatch.
- Ensure you receive the email in your inbox.
- Troubleshoot using logs if not delivered. 
- For troubleshooting go through this [link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-75-PRINCE/ot-ms-understanding/applications/notification/documentation/README.md#troubleshooting).

---

## Conclusion

The Notification-API has been successfully installed and tested locally using Python, Elasticsearch, and Gmail SMTP.

---

## **Contacts**
| Name         | Email Address                                |
|--------------|----------------------------------------------|
| Prateek Rai | prateek.rai.snaatak@mygurukuam.co           |

---

## **References**
| Title                              | Link                                                                   |
|------------------------------------|------------------------------------------------------------------------|
| Ubuntu Official Docs               | https://help.ubuntu.com                                               |
| Elasticsearch Installation Guide   | https://www.elastic.co/downloads/                                     |
| Gmail App Password Setup           | https://support.google.com/accounts/answer/185833                     |
| SendGrid SMTP Guide                | https://www.geeksforgeeks.org/simple-mail-transfer-protocol-smtp/     |

