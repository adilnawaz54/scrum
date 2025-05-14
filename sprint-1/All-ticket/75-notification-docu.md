## **Notification Application Document**

<p align="center">
  <img src="https://thaka.bing.com/th/id/OIP.g9SdunVmLqkrgtyX2RvRHgHaHa?w=173&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7" width="150">
</p>

## **Author Information**
| Created     | Last updated | Version | Author         | Level | Reviewer |
|-------------|--------------|---------|----------------|-------|----------|
| 25-04-2025  | 28-04-2025   | V1.1     | Prince Batra   | Internal Review | Siddharth Pawar |
| 25-04-2025  | 01-05-2025   | V2.1     | Prince Batra   | L0 Review        | Shikha |
| 25-04-2025  | 01-05-2025 |  V3    | Prince Batra  |     L1 Review    | Kirti Nehra   |

---

## **Table of Contents**

1. [Introduction](#introduction)  
2. [Why Need This Application?](#why-need-this-application)  
3. [Architecture](#architecture)  
4. [Workflow Diagram](#workflow-diagram)
5. [Step-by-step Setup of Notification API](#step-by-step-setup-of-notification-api)
6. [Contact Information](#contact-information)  
7. [Reference Table](#reference-table)  

---

## **Introduction**
The Notification Application is designed to send email notifications to employees regarding their salary slips. It fetches employee data from an Elasticsearch index and uses a configured SMTP service to deliver the emails. The application can run either on a scheduled basis or be triggered externally.

---

## Why Need This Application?

- To automate the notification process for informing employees about their salary slip generation.
- To integrate seamlessly with internal APIs, such as the Employee API, which provides employee data used by the notification service.
- To reduce manual effort required by HR or admin teams in sending repetitive emails.
- To ensure timely and consistent communication to all employees.
- To improve efficiency by using a scheduled Python script with SMTP integration.

---

## **Architecture**

![image](https://github.com/user-attachments/assets/ae8c7bcd-d6fc-43d0-9980-af33e58f32c2)

The architecture automates email notifications about salary slips by retrieving employee data from Elasticsearch, which is populated by the employee database. The notification service fetches this data and sends emails using an SMTP service, reducing manual effort and ensuring timely communication.

---

## **Workflow Diagram**

![1](https://github.com/user-attachments/assets/ae5d95a8-3914-40ea-bd3a-3aac571df734)

The employee database acts as the primary source and syncs email-related data to Elasticsearch (employee-management index). The Python notification script queries Elasticsearch to fetch the required data and sends email notifications using an SMTP service like Gmail or SendGrid, which delivers the emails to the respective employee inboxes.

---




## **Step-by-step Setup of Notification API**

For detailed information of Pre-requisites, Supported Features, Dependencies, Step-by-step Installation and testing the Application, please refer to the following resources

>  **Follow steps here**: [Refer this POC](https://github.com/snaatak-Downtime-Crew/Documentation/blob/prateek_scrums_74/ot-ms-understanding/applications/notification/poc/README.md#step-by-step-installation)

---


## **Contact Information**
| Name         | Email Address                                |
|--------------|----------------------------------------------|
| Prince Batra | prince.batra.snaatak@mygurukuam.co           |

---

### **Reference Table**

| Title                              | Link                                                                 | Description                                                                 |
|------------------------------------|----------------------------------------------------------------------|-----------------------------------------------------------------------------|
| Elasticsearch Installation Guide   | [elastic.co](https://www.elastic.co/downloads/elasticsearch)         | Installation guide for Elasticsearch, used to store and query employee data. |
| Gmail App Password Setup           | [google.com](https://support.google.com/accounts/answer/185833)      | Instructions to generate app password for Gmail SMTP usage.               |
| pip Documentation                  | [pip.pypa.io](https://pip.pypa.io/en/stable/installation/)           | Guide for installing and using pip, Python's package manager.              |
| Elasticsearch Python Client Docs  | [elastic.co](https://elasticsearch-py.readthedocs.io/en/v7.17.17/)   | Official Python client documentation for interacting with Elasticsearch.  |
| SMTP Overview                      | [wikipedia.org](https://en.wikipedia.org/wiki/Simple_Mail_Transfer_Protocol) | Background on how SMTP works for sending email.                     |
