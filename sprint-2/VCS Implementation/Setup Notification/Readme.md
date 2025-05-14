# Setup notification for Branch Merge


##  **Author Information**
| Created     | Version | Author        | Last Updated       | Comment          | Reviewer         |
|-------------|---------|---------------|--------------------|------------------|------------------|
| 14-05-2025  | v1      | Adil Nawaz    |          | Internal Reviewer| Pritam        |
| 14-05-2025  | v2   | Adil Nawaz       |          | L0 Reviewer      | Shreya           |
| 14-05-2025  | v3    | Adil Nawaz      |          | L1 Reviewer      | Abhiskek V         |
| 14-05-2025  | v4    | Adil Nawaz      |          | L2 Reviewer      | Abhiskek D         |



## Table of Content 
1. [🔍 Purpose](#-purpose)
2. [🎨 Workflow](#-workflow)
3. [🌟 Pre requisites](#-pre-requisites)
4. [📋 Steps to Set up Branch Merging Notificatin](#-steps-to-set-up-branch-merging-notification)
5. [📜 Conclusion](#-conclusion)
6. [📚 References](#-references ) 
7. [📧 Contact Information ](#-contact-information )
   

     
##  Introduction 
The purpose of this document is to set up automated notifications via email and Slack when a branch is merged into the main branch of a GitHub repository. It also defines how to restrict branch merges to specific authorized users, ensuring only designated contributors can merge branches into the main branch. Additionally, it outlines the process of configuring branch protection rules to enforce these restrictions.

##  Workflow

![BranchMerge drawio](https://github.com/user-attachments/assets/c2a33fdf-e42a-4116-ad10-ec6346069578)


##  Pre-requisites

| Requirement               | Description                                                  |
| ------------------------- | ------------------------------------------------------------ |
| GitHub Repository         | Hosted repo (public/private) on GitHub                       |
| Admin Access              | Required to configure branch protection rules                |
| Slack Workspace           | Access to the Slack workspace + incoming webhook integration |
| Email Addresses           | List of email recipients for merge alerts                    |


#   Steps to Set up Branch Merging Notification

### 1. **Sign in to GitHub**: Go to [GitHub](https://github.com) and log in to your account.

![image](https://github.com/user-attachments/assets/90deb434-b203-40a8-b1b0-9246c78751c1)


### 2. Create a repository for which you want to configure notifications for Branch Merge.

<img width="941" alt="image" src="https://github.com/user-attachments/assets/fc6628f0-6490-4be8-bcd4-468c17c87c36">


### 3. Now, click on the repository you created and navigate to the Settings tab at the top.

<img width="941" alt="image" src="https://github.com/user-attachments/assets/92f65faf-9314-4610-b4c7-dd7ec910d7a3">


### 4. Generate an App Password for Gmail & Webhook Url for Slack: 

**If you are using Gmail, you'll need to generate an App Password for your Google account:**

**Go to your Google Account.**

**Navigate to Security -> Signing in to Google -> App Passwords.**

**Choose Mail and select your device, then generate a password and copy it.**

**Generate Slack Webhook Url**

![for scerate password](https://github.com/user-attachments/assets/2eb0cdfd-be36-47fa-bce4-8f9011e89e35)

![webhook-slack](https://github.com/user-attachments/assets/fa54739f-063a-405a-ad83-b81ed18e5edd)


### 5. Add Gmail Credentials to GitHub Secrets:

**Go to your GitHub repository.** **Click on Settings -> Secrets -> Actions -> New repository secret,**Add two secrets:**

**EMAIL_USERNAME: Your Gmail address (e.g., your-email@gmail.com).**

**EMAIL_PASSWORD: The App Password you generated earlier from Gmail.**

**Add Slack Webhook Url in your GitHub Repo.**

<img width="942" alt="image" src="https://github.com/user-attachments/assets/ae706d0c-dc40-4706-9bc6-480301232dbf">

![slack](https://github.com/user-attachments/assets/7d6f63a7-4952-4f86-82b3-01183bc4f0a8)

### 6. Set up GitHub Action Workflow:

**Create a GitHub Actions workflow file in your repository to send an email when a Branch- create, Merge & Delete.**

**In your GitHub repository, create a workflow file in .github/workflows/ (e.g., send-email-on-Branch-notification.yml):**

<img width="929" alt="image" src="https://github.com/user-attachments/assets/b4d55ffe-1950-4947-9fed-41637491a0ee">


### 7. Commit and Push the Workflow File:

**Once you add the workflow file, every time a commit is pushed to the specified repo (e.g., Branch-Notification-demo), the GitHub Action will send an email with the details of the commit (message, author, and URL).**

<img width="629" alt="image" src="https://github.com/user-attachments/assets/177f9db4-a4b7-4031-bbd9-86e65d94e53c">

<img width="943" alt="image" src="https://github.com/user-attachments/assets/48ee9352-06d8-49e9-83f8-b73a5b2aa771">

<img width="947" alt="image" src="https://github.com/user-attachments/assets/2de9546c-6f32-4d01-8cea-ecae6c533be3">

<img width="593" alt="image" src="https://github.com/user-attachments/assets/073a2c00-bdc4-44a9-9ba5-6e89ac1ee0a7">

<img width="476" alt="image" src="https://github.com/user-attachments/assets/a03f517a-2625-40f4-b7a0-e90da9de5d1a">



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





