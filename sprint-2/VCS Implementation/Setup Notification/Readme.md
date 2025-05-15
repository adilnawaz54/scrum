# Setup notification for Branch Merge


##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 14-05-2025  | v1      | Adil Nawaz    |          | Internal Reviewer| Pritam        |
| 14-05-2025  | v2   | Adil Nawaz       |          | L0 Reviewer      | Shreya           |
| 14-05-2025  | v3    | Adil Nawaz      |          | L1 Reviewer      | Abhiskek V         |
| 14-05-2025  | v4    | Adil Nawaz      |          | L2 Reviewer      | Abhiskek D         |



## Table of Content 


1. [Introduction](#introduction)
2. [Pre-requisites](#pre-requisites)
3. [Workflow](#workflow)
4. [Steps to Set up Branch Merging Notification for Slack](#steps-to-set-up-branch-merging-notification-for-slack)
   * [1. Sign in to GitHub](#1-sign-in-to-github)
   * [2. Create a Repository](#2-create-a-repository)
   * [3. Open Repository Settings](#3-now-click-on-the-repository-you-created-and-navigate-to-the-settings-tab-at-the-top)
   * [4. Generate a Webhook URL for Slack](#4-generate-a-webhook-url-for-slack)
   * [5. Add Webhook to a Slack Channel](#5-add-webhook-for-a-channel)
   * [6. Create GitHub Actions Workflow](#6-create-github-actions-workflow-for-slack-notification-on-merge)
   * [7. Save Webhook URL in GitHub Secrets](#7-copy-the-webhook-url--save-it-in-github-secrets-as-slack_webhook_url)
   * [8. Commit and Push the Workflow File](#8-commit-and-push-the-workflow-file)
   * [9. Verify Slack Notification](#9-merge-notification-on-slack)
5. [Steps to Set up Branch Merging Notification for Email](#steps-to-set-up-branch-merging-notification-for-email)
6. [Conclusion](#conclusion)
7. [Contact Information](#contact-information)
8. [References](#references)

---



     
##  Introduction 
The purpose of this document is to set up automated notifications via email and Slack when a branch is merged into the main branch of a GitHub repository. It also defines how to restrict branch merges to specific authorized users, ensuring only designated contributors can merge branches into the main branch. Additionally, it outlines the process of configuring branch protection rules to enforce these restrictions.


##  Pre-requisites

| Requirement               | Description                                                  |
| ------------------------- | ------------------------------------------------------------ |
| GitHub Repository         | Hosted repo (public/private) on GitHub                       |
| Admin Access              | Required to configure branch protection rules                |
| Slack Workspace           | Access to the Slack workspace + incoming webhook integration |
| Email Addresses           | List of email recipients for merge alerts                    |

##  Workflow

<img width="521" alt="image" src="https://github.com/user-attachments/assets/3cfaa2bd-26d4-4e15-b503-122ea5c4ac1f" />



##  Steps to Set up Branch Merging Notification for Slack

### 1. **Sign in to GitHub**: Go to [GitHub](https://github.com) and log in to your account.

![image](https://github.com/user-attachments/assets/90deb434-b203-40a8-b1b0-9246c78751c1)


### 2. Create a repository for which you want to configure notifications for Branch Merge.

<img width="941" alt="image" src="https://github.com/user-attachments/assets/fc6628f0-6490-4be8-bcd4-468c17c87c36">


### 3. Now, click on the repository you created and navigate to the Settings tab at the top.

<img width="941" alt="image" src="https://github.com/user-attachments/assets/92f65faf-9314-4610-b4c7-dd7ec910d7a3">


### 4. Generate a Webhook Url for Slack

- **Go to** https://api.slack.com/apps

- **Create a new app → Enable Incoming Webhooks**

![image](https://github.com/user-attachments/assets/c6748ddc-c540-42a6-a32c-d879bf3a8c7f)

---

### 5. **Add webhook for a channel** 
![image](https://github.com/user-attachments/assets/cc0b7c72-9ff7-4d86-9511-990a31c9753b)

---

### 6. **Create GitHub Actions Workflow for Slack Notification on Merge**

   - Create the Workflow Directory and File in your repo  -->  **.github/workflows/notify-on-merge.yml**
 
   - **Add the Workflow Code**
     ![image](https://github.com/user-attachments/assets/1f495ea9-1e84-41bc-a775-79e4fbb40377)

---

### 7. **Copy the Webhook URL → Save it in GitHub Secrets as SLACK_WEBHOOK_URL**
![image](https://github.com/user-attachments/assets/3943acf4-2c02-4a91-bd3d-dbb3756e7f72)

---

 ### 8. **Commit and Push the Workflow File**

 
 -  ![Screenshot 2025-05-15 084754](https://github.com/user-attachments/assets/50143bfd-4de1-43db-9f5e-1f5d85a8ed6e)
 -  ![Screenshot 2025-05-15 084828](https://github.com/user-attachments/assets/ebb59264-85a5-4323-bb23-676791ed532e)

   



### 9. Verify Slack Notification

**Once you add the workflow file, every time a commit is pushed to the specified repo (e.g., branch-merge-notification-demo), the GitHub Action will send an slack notification on your channel.**
 


![image](https://github.com/user-attachments/assets/7b8c46f6-8400-483d-b095-3c29d5048ba7)

---

##  Steps to Set up Branch Merging Notification for Email

> 👉 **Follow Documentation**: [Email Setup](
https://github.com/snaatak-Downtime-Crew/Documentation/tree/SCRUMS-139-Vardaan/vcs_design%20%2B%20poc/implementation/notification/code-commit)



##  Conclusion

In this document, we implemented email and Slack notifications for branch merges into the main branch, with specific permissions for merging restricted to authorized users. We encountered a limitation in enforcing branch protection rules on private repositories under the free GitHub plan, which requires an upgrade to a GitHub Team or Enterprise account. As a workaround, manual review processes and Git hooks were suggested to control merges. The final setup ensures notifications and proper authorization for merging branches into the main branch.



## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |


 
#  References 
|links | Description |
|-------|------------|
|https://youtu.be/oMU9MUIXPyI?feature=shared|**Rainbow talks** |
|https://www.youtube.com/watch?v=qToZN5S67AM| **SDet Automation**|
|https://tinyurl.com/bdpf3ajc|**GIT**|





