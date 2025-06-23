# Terraform Drift
<img src="https://github.com/user-attachments/assets/5791074d-c3e2-4b4b-8982-e088dc3cc95b" alt="image" width="500"/>




 ##  **Author Information**
 | Last Updated | Version | Author          | Comment           | Reviewer |
|--------------|---------|------------------|-------------------|----------|
| 23-06-2025   | V1.0    | Adil Nawaz   | Internal Review   | Pritam   |
| 00-06-2025   | V2.0    | Adil Nawaz   | L0                | Shreya   |
| 00-06-2025   | V3.0    | Adil Nawaz   | L1               | Abhishek V   |



##  Table of Contents

1. [Introduction](#introduction)
2. [What is Terraform Drift?](#what-is-terraform-drift)
3. [Why Detect Drift?](#why-detect--drift)
4. [Advantages](#advantages)
5. [Workflow](#workflow)
6. [Tools for Drift Detection](#tools-for-drift-detection)
7. [Best Practices](#best-practices)
8. [Conclusion](#conclusion)
9. [Contact Information](#contact-information)
10. [References](#references)





## Introduction
This document provides detailed information about the Terraform Drift, why we use it workflow and advantages.
Drift detection is crucial in maintaining infrastructure consistency, compliance, and predictability in IaC (Infrastructure as Code) environments.

## What is Terraform Drift?
Terraform Drift occurs when:
Resources are manually modified outside of Terraform (e.g., through the cloud console).
External systems alter resource properties (e.g., auto-scaling).
Infrastructure states become inconsistent with the .tfstate file.

## Why Detect  Drift?

| **Objective**                           | **Description**                                                               |
| --------------------------------------- | ----------------------------------------------------------------------------- |
| **Maintain Infrastructure Consistency** | Ensures that all environments follow the same configuration and standards.    |
| **Avoid Unexpected Failures**           | Prevents outages caused by drifted or misconfigured infrastructure.           |
| **Enhance Security & Compliance**       | Helps enforce security policies and compliance standards consistently.        |
| **Support Audits**                      | Provides traceability and evidence for infrastructure changes and compliance. |
| **Prevent Environment Deviation**       | Keeps development, staging, and production environments aligned.              |



## Advantages

| Advantage                  | Description                                                   |
| -------------------------- | ------------------------------------------------------------- |
|  **Improved Security**       | Ensures manual changes do not weaken infrastructure security. |
|  **Audit & Compliance**      | Verifies environment adheres to defined configurations.       |
|  **Faster Troubleshooting** | Highlights unexpected infrastructure behavior.                |
|  **Automation Ready**        | Can be integrated into CI/CD for continuous monitoring.       |


## Workflow
![image](https://github.com/user-attachments/assets/d1725e77-cdd1-4c81-bc6c-0529b100bcc2)


| Component                               | Description                                                                                 | Drift Involvement                            |
| --------------------------------------- | ------------------------------------------------------------------------------------------- | -------------------------------------------- |
| **User**                                | Writes and manages infrastructure as code using `.tf` files.                                | No drift yet.                                |
| **Terraform Configuration Files (.tf)** | Define the desired state of infrastructure resources (e.g., EC2, VPC, S3).                  | Source of truth for what should exist.       |
| **Terraform CLI**                       | Compares the desired state (`.tf`) and the real-world state using the Terraform state file. | Detects any differences (drift).             |
| **Terraform State File (.tfstate)**     | Tracks the last known applied state of infrastructure.                                      | Used to compare with actual infrastructure.  |
| **Real Cloud Resources**                | Represents the actual state of infrastructure running in the cloud.                         | May change outside Terraform, causing drift. |
| **Change**                              | Any manual or external changes to infrastructure not captured in `.tf` files.               | This creates Terraform drift.                |



## Tools for Drift detection

| Tool                               | Description                                                       |
| ---------------------------------- | ----------------------------------------------------------------- |
| **terraform plan**                   | Detects differences between actual infrastructure and `.tfstate`. |
| **terraform apply -refresh-only**    | Updates state file without changing infra.                        |
| **Custom Scripts + AWS CLI**           | For auditing and comparison.                                      |
| **CI tools (GitHub Actions, Jenkins)** | Automate and report drifts on schedule.                           |

## Best Practices

| **Best Practice**                                                              | **Description**                                                                         |
| ------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------- |
| **Use remote backends (S3 + DynamoDB lock) for consistent state**                  | Ensures shared, centralized, and locked state management across teams.                  |
| **Lock state during drift detection to avoid race conditions**                     | Prevents multiple operations from accessing/modifying state simultaneously.             |
| **Treat all infrastructure as immutable via Terraform**                            | Avoid manual changes; all infra should be version-controlled and reproducible via code. |
| **Alert only on real drift**          | Avoid false positives; notify only for meaningful changes.                              |



## Conclusion
Terraform drift detection is essential for maintaining consistent, secure, and predictable infrastructure. Implementing automated drift detection with the right tools and workflows ensures your infrastructure as code stays aligned with the reality in cloud environments.

## Contact Information

| Name | Email address|
|------|---------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co |

## References

| Links | Descriptions|
|------|---------------------|
| [Link](https://developer.hashicorp.com/terraform/docs) | Terraform official docs |
| [Link](https://www.hashicorp.com/en/blog/detecting-and-managing-drift-with-terraform)| Terraform Drift Official doc |
| [Link](https://www.hashicorp.com/en/blog/detecting-and-managing-drift-with-terraform) | Terraform Drift management |





