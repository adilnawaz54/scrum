
 ##  **Author Information**
 | Last Updated | Version | Author          | Comment           | Reviewer |
|--------------|---------|------------------|-------------------|----------|
| 12-05-2025   | V1.0    | Adil Nawaz   | Internal Review   | Pritam   |
| 20-05-2025   | V2.1    | Adil Nawaz   | L0                | Shreya   |
| 00-05-2025   | V3.0    | Adil Nawaz   | L1               | Abhishek V   |


## Introduction
This document provides detailed information about the Terraform Drift, why we use it workflow and advantages.
Drift detection is crucial in maintaining infrastructure consistency, compliance, and predictability in IaC (Infrastructure as Code) environments.

## What is Terraform Drift?
Terraform Drift occurs when:
Resources are manually modified outside of Terraform (e.g., through the cloud console).
External systems alter resource properties (e.g., auto-scaling).
Infrastructure states become inconsistent with the .tfstate file.

## Why Detect Terraform Drift?
 - Maintain Infrastructure Consistency
 - Avoid Unexpected Failures
 - Enhance Security & Compliance
 - Support Audits
 - Prevent Environment Deviation


## Advantages

| Advantage                  | Description                                                   |
| -------------------------- | ------------------------------------------------------------- |
|  **Improved Security**       | Ensures manual changes do not weaken infrastructure security. |
|  **Audit & Compliance**      | Verifies environment adheres to defined configurations.       |
|  **Faster Troubleshooting** | Highlights unexpected infrastructure behavior.                |
|  **Automation Ready**        | Can be integrated into CI/CD for continuous monitoring.       |


## Workflow

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





