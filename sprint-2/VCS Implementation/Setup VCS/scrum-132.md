#  Setup Version Control System - GITHUB

![image](https://github.com/user-attachments/assets/3a170719-a472-4a0c-8a38-1906e6bc461e)

##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 12-05-2025  | v1      | Adil Nawaz    |          | Internal Reviewer| Pritam        |
| 12-05-2025  | v2   | Adil Nawaz       |          | L0 Reviewer      | Shreya           |
| 12-05-2025  | v3    | Adil Nawaz      |          | L1 Reviewer      | Abhiskek V         |
| 12-05-2025  | v4    | Adil Nawaz      |          | L2 Reviewer      | Abhiskek D         |

## Table of Contents



1. [Introduction](#introduction)
2. [Pre-requisites](#pre-requisites)
3. [Setting Up GitHub Version Control](#setting-up-github-version-control)
4. [SaaS Solutions vs Local Setup (On-Prem)](#saas-solutions-vs-local-setupon-prem)
5. [When to Choose SaaS](#when-to-choose-saas)
   * [Limitations of SaaS](#limitations-of-saas)
6. [When to Choose On-Prem](#when-to-choose-on-prem)
   * [Limitations of On-Prem](#limitations-of-on-prem)
7. [Conclusion](#conclusion)
8. [Contact Information](#contact-information)
9. [Reference](#reference)



## Introduction

The purpose of this document is to guide users in setting up and managing a version control system using GitHub. As we progress in our sprints, we will have multiple micro-repositories that will reflect team collaboration. Therefore, we are adopting GitHub, which will be more beneficial for our team and facilitate better maintenance of repositories.

## Pre-requisites

| License Type        | Description                                             | Commercial Use | Open Source |
|---------------------|---------------------------------------------------------|----------------|-------------|
| GitHub Free / Paid Plans | Offers free public/private repositories; paid plans offer more features. | Yes            | Yes         |


## Setting Up GitHub Version Control

> 👉 **Setup Github VCS**: [Setup](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-96-YUVRAJ/vcs_design%20+%20poc/features%20of%20vcs/detail%20document/README.md)


## SAAS Solutions vs Local Setup(On Prem)


| **Aspect**                   | **SaaS (Cloud)**                                             | **Local Setup (On-Prem)**                                  |
| ---------------------------- | ------------------------------------------------------------ | ---------------------------------------------------------- |
| **Infrastructure Ownership** | Hosted and managed by vendor                                 | Fully owned and managed by your team                       |
| **Setup Time**               | Very fast                                 | Slower - requires installation and configuration           |
| **Maintenance**              | Vendor handles updates, patches, scaling                     | You are responsible for updates, backups, monitoring       |
| **Cost**                     | Subscription-based , predictable                       | Requires hardware + maintenance (CAPEX)                    |
| **Scalability**              | Easy to scale, elastic resources                             | Limited by internal infrastructure                         |
| **Security Control**         | Shared responsibility — depends on vendor                    | Full control — you manage all access and data protection   |
| **Access**                   | Global access via internet                                   | Restricted to internal network unless VPN/port opened      |
| **Customization**            | Limited to vendor-provided features                          | Highly customizable — integrate with internal tools easily |
| **Examples**                 | GitHub, GitLab.com, Bitbucket, Jenkins Cloud                 | GitLab CE, Jenkins, Bitbucket Server, Jenkins Server         |

---

##  **When to Choose SaaS**

* When we want Fast Setup and Minimal Maintenance
* When you don't handles authentication, data, security, and updates
* Small to medium teams with **no dedicated ops team**
* Project doesn't require **custom integrations** or **strict compliance**
  Example: Github, Slack, Salesforce(CRM), Zoom, Google Docs

> ### **Limitations of SaaS**

| Limitation               | Explanation                                            |
| ------------------------ | ------------------------------------------------------ |
|  Less Control          | You depend on the vendor for uptime and security       |
|  Data Compliance       | May not meet strict data residency requirements        |
|  Limited Customization | Can't fully tailor the backend logic or UI             |
|  Internet Dependency   | No access during outages unless offline support exists |


##  **When to Choose On-Prem**

* Your organization has **compliance requirements** (e.g., banking, healthcare)
* You need **full control** over data, plugins, and network
* You have **existing internal infrastructure** or cloud deployments to integrate

> ### Limitations of On-Prem

| Limitation                 | Explanation                                                                      |
| -------------------------- | -------------------------------------------------------------------------------- |
|  Maintenance Overhead   | You must manage patches, updates, monitoring, logging, and troubleshooting       |
|  High Costs      | Requires investment in hardware, networking, backups, and licenses               |
|  Skilled Manpower     | Needs system administrators and DevOps engineers to manage infrastructure        |
|  Scalability Challenges  | Scaling requires manual provisioning of servers or VMs                           |
|  Slower Upgrades         | Testing and applying updates is manual and time-consuming                        |
|  Security Responsibility | You're responsible for securing the environment (firewalls, certs, audits)       |



##   Conclusion
This document provides a comprehensive guide for setting up and managing a version control system using GitHub. By following the outlined steps and implementing security recommendations, we can effectively collaborate and maintain our codes which we will be using our sprints micro repositories.

## Contact Information


| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

##  Reference

| Title                                 | Link                                                                                           |
|---------------------------------------|------------------------------------------------------------------------------------------------|
| Git Installation                      | [Git Downloads](https://git-scm.com/downloads)                                              |
| GitHub Account Creation               | [Create a GitHub Account](https://github.com/join)   |
| Features of VCS                       | [Feature of VCS](https://github.com/mygurukulam-p10/Documention/blob/main/VCS%20Design%20%2B%20POC/Features%20of%20VCS/POC%20to%20setup%20recommeded%20VCS%20as%20per%20conclusion%20doc/README.md) |

