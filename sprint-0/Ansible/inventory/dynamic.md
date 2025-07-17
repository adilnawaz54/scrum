# Ansible Dynamic Inventory

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Ansible_logo.svg/1664px-Ansible_logo.svg.png" alt="Ansible Logo" width="130"/>
</p>

## **Author Information**
| Created     | Last updated | Version | Author         | Level | Reviewer |
|-------------|--------------|---------|----------------|-------|----------|
| 18-04-2025  | 18-04-2025   | V1      | Prince Batra   | Internal Review | Siddharth Pawar |
| 18-04-2025  | 20-04-2025   | V2      | Prince Batra   | L0 Review        | Shikha |
| 18-04-2025  | 21-04-2025 |  V3    | Prince Batra  |     L1 Review    | Kirti Nehra   |

---

## Table of Contents

1. [Introduction](#introduction)  
2. [Why Use Dynamic Inventory in Ansible?](#why-use-dynamic-inventory-in-ansible)  
3. [Advantages vs Disadvantages](#advantages-vs-disadvantages)  
4. [Best Practices](#best-practices)  
5. [Ansible Dynamic Inventory for Cloud Providers](#ansible-dynamic-inventory-for-cloud-providers)  
    - [AWS EC2 Dynamic Inventory](#aws-ec2-dynamic-inventory)  
    - [Azure VM Dynamic Inventory](#azure-vm-dynamic-inventory)  
    - [GCP Compute Engine Dynamic Inventory](#gcp-compute-engine-dynamic-inventory)  
6. [Custom Database Inventory ](#custom-database-inventory)  
7. [Conclusion](#conclusion)  
8. [Contact Information](#contact-information)  
9. [Reference Table](#reference-table)

---

## Introduction

This document outlines a step-by-step procedure for setting up Ansible’s dynamic inventory with AWS EC2 instances, fetching real-time host details. It eliminates the need for static inventory files and explores integrating custom databases for enhanced automation. The guide also covers best practices and examples for using dynamic inventory with various cloud platforms.

---

## Why Use Dynamic Inventory in Ansible?

| Cloud Provider  | Why Use It                                                                                                                                                                              |
| --------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **AWS EC2**     | Automatically retrieves all running EC2 instances, grouped by tags such as `Name` or `Environment`. This helps manage resources that change frequently, like in auto-scaling scenarios. |
| **Azure VM**    | Simplifies the management of virtual machines across different resource groups. Automatically updates inventory based on VM states and tags, reducing manual effort.                    |
| **GCP Compute** | Connects to Google Cloud projects and fetches VM details dynamically. Helps keep inventory up to date as instances are created or terminated in zones.                                  |

---

## Advantages vs Disadvantages

| Cloud Provider  | Advantages                                                                                                                        | Disadvantages                                                                               |
| --------------- | --------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| **AWS EC2**     | - Automatically tracks running EC2 instances<br>- Groups hosts by tags<br>- Can filter by region or instance state                | - Requires AWS credentials or IAM role<br>- Initial configuration of plugin needed          |
| **Azure VM**    | - Supports filtering by tags and resource group<br>- Works well with Azure Resource Manager<br>- Reduces manual inventory updates | - Needs Azure credentials (Service Principal)<br>- Slightly complex YAML structure          |
| **GCP Compute** | - Fetches VMs based on zone, labels, and metadata<br>- Supports custom host naming<br>- Good fit for scalable environments        | - Needs service account key file<br>- Can require custom filtering logic for large projects |

---

## Best Practices

| Cloud Provider  | Best Practice                                                  | Explanation                                                         |
| --------------- | -------------------------------------------------------------- | ------------------------------------------------------------------- |
| **AWS EC2**     | Use EC2 instance tags like `Environment`, `Name`               | Tags help group servers (e.g., dev, prod), making automation easier |
|                 | Define `ansible_host` using `compose:`                         | Ensures Ansible connects using public/private IPs correctly         |
|                 | Run `ansible-inventory --graph` regularly                      | Helps visualize how hosts are grouped dynamically                   |
| **Azure VM**    | Limit scope using specific resource groups                     | Keeps inventory output manageable and relevant                      |
|                 | Use tags for group separation (e.g., `Environment=dev`)        | Makes filtering easier in playbooks                                 |
|                 | Enable authentication using environment variables or Azure CLI | Avoids hardcoding credentials in files                              |
| **GCP Compute** | Store credentials securely (e.g., vault or env var)            | Protects your service account key used for dynamic inventory        |
|                 | Group by labels like `role=web` or `zone`                      | Simplifies playbook targeting across zones or environments          |
|                 | Periodically validate plugin config with `--list`              | Ensures your dynamic inventory script is working as expected        |

---

## Ansible Dynamic Inventory for Cloud Providers

Ansible supports dynamic inventory across multiple cloud platforms using dedicated inventory plugins. Below is a detailed overview for each supported cloud provider, explaining what information is fetched, how the plugin operates, and how it can be configured.

### AWS EC2 Dynamic Inventory

**How it works:**  
The `aws_ec2` plugin uses AWS API (via `boto3`) to fetch a list of EC2 instances across specified regions. You can filter by instance states (e.g., only `running`) and group hosts by tags like `Name` or `Environment`.

**What it fetches:**
- Public and private IP addresses  
- Instance ID, type, state  
- Tags (e.g., Name, Environment)  
- Region, availability zone  
- AMI ID  

**Use case:**  
Fetch all running EC2 instances with a specific tag and use their public IPs in Ansible playbooks.

**Example (`aws_ec2.yml`):**
```yaml
plugin: aws_ec2
regions:
  - us-east-1
filters:
  instance-state-name: running
hostnames:
  - public-ip-address
keyed_groups:
  - key: tags.Environment
```

---

### Azure VM Dynamic Inventory

**How it works:**  
The `azure_rm` plugin connects to Azure Resource Manager and collects VM details from selected resource groups or subscriptions. You can group by tags, OS types, or locations.

**What it fetches:**
- VM name, size, power state  
- Public/private IPs  
- Tags (e.g., app = web)  
- Resource group, region  
- OS details  

**Use case:**  
Manage only Linux VMs in a specific Azure Resource Group, grouped by environment tag.

**Example (`azure_rm.yml`):**
```yaml
plugin: azure_rm
include_vm_resource_groups:
  - MyResourceGroup
auth_source: auto
keyed_groups:
  - key: tags.Environment
```

---

### GCP Compute Engine Dynamic Inventory

**How it works:**  
The `gcp_compute` plugin connects using a service account and fetches VM instances in a given project and zone. Grouping is supported by labels or zones.

**What it fetches:**
- Internal and external IPs  
- VM name, zone  
- Labels, metadata  
- Machine type  
- Network interfaces  

**Use case:**  
Run patch management on all GCP VMs in `us-central1-a` zone.

**Example (`gcp_compute.yml`):**
```yaml
plugin: gcp_compute
projects:
  - my-gcp-project
zones:
  - us-central1-a
auth_kind: serviceaccount
service_account_file: /path/to/credentials.json
hostnames:
  - networkInterfaces[0].accessConfigs[0].natIP
```

---

### Custom Database Inventory 

#### What is it?
With Custom Database Inventory, you can use your own database (such as MySQL, PostgreSQL, etc.) to dynamically manage the servers Ansible should automate. This removes the need to manually maintain static inventory files.

#### What It Fetches from the Database
The database can provide various server-related information, including:  
- **Server IP addresses** or **hostnames**  
- **Group information** (e.g., `app`, `db`, `web`)  
- **Tags or roles** (e.g., `prod`, `dev`)  
- **Any other custom data** you store in your database, such as location or server type  

#### How It Works – Step-by-Step

1. **Store Server Info in Your Database**  
   Create a table in your database with necessary columns. For example:
   - **hostname**  
   - **IP address**  
   - **group_name** (e.g., `app`, `db`)  
   - **tags** (optional, e.g., `prod`, `dev`)  

2. **Write a Script (Usually Python)**  
   Create a Python script that:  
   - Connects to your database  
   - Fetches the required server details  
   - Outputs the data in **JSON format** (which Ansible can understand)

3. **Make Your Script Executable**  
   Use the following command to mark the script as executable:  
   ```bash
   chmod +x db_inventory.py
   ```

4. **Run the Script with Ansible**  
   Execute the script with Ansible to fetch the dynamic inventory:
   ```bash
   ansible-inventory -i db_inventory.py --list
   ```

---

## Conclusion

Dynamic Inventory in Ansible automates infrastructure management by fetching real-time host information from cloud platforms or custom databases, ensuring up-to-date data without manual updates. It simplifies managing dynamic and auto-scaling environments, improves automation, and supports grouping by tags or custom metadata. By adopting best practices, you can streamline automation and enhance scalability across multiple cloud providers.

---

## Contact Information

| Name           | Email Address                             |
|----------------|-------------------------------------------|
| Prince Batra   | prince.batra.snaatak@mygurukulam.co       |

---

## Reference Table

| Reference                               | Link                                                                 |
|-----------------------------------------|----------------------------------------------------------------------|
| AWS EC2 Inventory Plugin                | https://docs.ansible.com/ansible/latest/plugins/inventory/aws_ec2.html |
| Ansible Inventory User Guide            | https://docs.ansible.com/ansible/latest/user_guide/intro_inventory.html |
| Custom Inventory Script Dev Guide       | https://docs.ansible.com/ansible/latest/dev_guide/developing_inventory.html |
| AWS IAM Role for EC2 Dynamic Access     | https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html |
