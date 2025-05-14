
# Proof of Concept Pull Request on GitHub

![image](https://github.com/user-attachments/assets/26c757c0-8b3d-458c-8d0f-e29003d470ed)


### Author
| Created     | Version | Author        | Modifed | Comment           | Reviewer   |
|-------------|---------|---------------|-------|------------|------------------|
| 28-04-2025  |  V1.1      | Yuvraj Singh | 29-04-2025 | Internal Review   | Siddharth Pawar  |
| 01-05-2025  |  V2.1      | Yuvraj Singh | 07-05-2025 | L0 Review         | Naveen Haswani |
|             |  V3        | Yuvraj Singh |            | L1 Review         | Deepak Nishad |
|             |  V4        | Yuvraj Singh |            | L2 Review         | Ashwani Singh |

## Table of Content
<details>
<summary>1. Introduction</summary>

- [Introduction](#introduction)
- [What is Pull Request](#what-is-pull-request)

</details>
  
<details>
<summary>2. Pull Request via GitHub GUI</summary>

- [Pull Request via GitHub GUI (Web Interface)](#pull-request-via-github-gui-web-interface)  
  - [Step 1: Clone a GitHub Repository](#step-1-clone-a-github-repository)  
  - [Step 2: Create a New Branch](#step-2-create-a-new-branch)  
  - [Step 3: Make Changes](#step-3-make-changes)  
  - [Step 4: Push Your Branch](#step-4-push-your-branch)  
  - [Step 5: Open GitHub Website](#step-5-open-github-website)  
  - [Step 6: Fill in PR Details](#step-6-fill-in-pr-details)

</details>

<details>
<summary>3. Pull Request via GitHub CLI</summary>

- [Pull Request via GitHub CLI (`gh`)](#pull-request-via-github-cli-gh)  
  - [Step 1: Install and Authenticate GitHub CLI](#step-1-install-and-authenticate-github-cli)  
  - [Step 2: Setup](#step-2-setup)  
  - [Step 3: Create Pull Request Using `gh`](#step-3-create-pull-request-using-gh)  
  - [Step 4: Confirm](#step-4-confirm)

</details>

<details>
<summary>4. Comparison & Wrap-up</summary>

- [Quick Comparison Table](#quick-comparison-table)  
- [Conclusion](#conclusion)  
- [Contact](#contact)  
- [References](#references)

</details>

----
## Introduction

This guide focuses on the process of creating Pull Requests using both the GitHub web interface (GUI) and the GitHub Command Line Interface (CLI), providing step-by-step instructions for each method to facilitate efficient collaboration and code integration.

---

## What is Pull Request

For detailed documentation about Pull Request [click here](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-106-Adil/vcs_design%20+%20poc/pr/pr%20documentation/README.md) 

---
## Pull Request via GitHub GUI (Web Interface)

In this section, we demonstrate how to initiate and manage pull requests using the GitHub web interface. By following the intuitive web-based workflow, you can propose, review, and merge code changes without leaving your browser, making it ideal for users who prefer graphical tools and visual feedback.

### Step 1: Clone a GitHub Repository

```
git clone git@github.com:G1tGeek/hello.git
cd hello
```

![image](https://github.com/user-attachments/assets/fb06d5b6-1590-4c8f-b29f-cf52ab7d94f4)


### Step 2: Create a New Branch

```
git checkout -b demo_pr
```

![image](https://github.com/user-attachments/assets/03ed374f-b79f-419d-bc61-ed4deba150b5)

### Step 3: Make Changes
Example:
```
echo "Hello World!" > hello.txt
```

![image](https://github.com/user-attachments/assets/d74ce1e3-a571-49ed-ae12-bc53b189046b)

```
git add hello.txt
```

![image](https://github.com/user-attachments/assets/0457cc73-149a-40a2-85ae-44d1c2965151)

```
git commit -m "Add hello.txt file"
```

![image](https://github.com/user-attachments/assets/6a6648ad-73bf-42d8-ba51-c5ae507db839)

### Step 4: Push Your Branch

```
git push origin demo_pr
```

![image](https://github.com/user-attachments/assets/bcaa4a03-7672-4f48-bf4d-37c61a37e22c)


### Step 5: Open GitHub Website
- Navigate to your repository on GitHub.
- GitHub will show a banner with a "Compare & pull request" button. Click it.

![image](https://github.com/user-attachments/assets/d0151fd9-9b9e-4f39-93c2-8072810c17e6)

Alternatively:
- Go to the **Pull Requests** tab.
- Click **New Pull Request**.
- Choose **base branch** (e.g., `main`) and **compare branch** (`feature/my-new-feature`).
- Click **Create Pull Request**.

### Step 6: Fill in PR Details
- Title: `Add hello.txt file`
- Description: `Created a simple hello.txt file.`
- Click **Create Pull Request**.

Pull Request creation is complete.

![image](https://github.com/user-attachments/assets/22b05e42-9e3c-4f5f-b7a2-6775b70ffa06)

---

## Pull Request via GitHub CLI (`gh`)

This section covers the creation of pull requests through the GitHub Command Line Interface. The gh tool enables developers to create, view, and manage pull requests directly from the terminal, offering a fast, scriptable, and automation-friendly approach to code collaboration.

### Step 1: Install and Authenticate GitHub CLI
Install:

**Follow Step 1 here**: [Software Install Commands](https://github.com/snaatak-Downtime-Crew/Documentation/tree/main/common_stack/operating_system/ubuntu/sop/softwaremanagement#3-Install-a-Software)

```
sudo apt install gh
```
![image](https://github.com/user-attachments/assets/202c4bba-7603-42c5-af51-a2a860bb7bf0)

> **Note** Commands for other Operatiing Systems
```
brew install gh              # For MacOS
choco install gh             # For Windows
```

Login:
```
gh auth login
```
Follow the prompts to authenticate.

![image](https://github.com/user-attachments/assets/dab3d738-4c2e-4d66-897c-bdc0c0715886)

### Step 2: Setup
- Create a branch
- Make changes
- Push the branch to GitHub

(Steps are identical to those mentioned above.)

![image](https://github.com/user-attachments/assets/ed874968-fb08-4dd4-8ca5-841feb1bece4)

### Step 3: Create Pull Request Using `gh`

Simple interactive mode:
```
gh pr create
```
- It will ask for:
  - Base branch (e.g., `main`)
  - Head branch (e.g., `feature/my-new-feature`)
  - PR title and body

![image](https://github.com/user-attachments/assets/f8d2387f-e945-45cb-a051-4a6c9478fa58)

Or, non-interactive command:

```
gh pr create --base main --head feature/my-new-feature --title "Add hi.txt file" --body "Created a simple hi.txt file."
```

### Step 4: Confirm
You can view the PR in a browser:

```
gh pr view --web
```

![image](https://github.com/user-attachments/assets/8ef24cb3-bc2b-43e9-97ee-9472aa738d81)


![image](https://github.com/user-attachments/assets/1d54634b-4378-4a18-96bf-5271ac349223)

Pull Request creation is complete.

---

## Quick Comparison Table

| Step                   | GitHub GUI                                  | GitHub CLI (`gh`)                               |
|-------------------------|--------------------------------------------|-------------------------------------------------|
| Push branch             | Push normally                              | Push normally                                  |
| Create PR               | Website ➔ Compare & PR button              | `gh pr create` or `gh pr create --base --head`  |
| Fill PR details         | Web form                                   | Command line flags or interactive prompts       |
| View PR                 | On GitHub website                         | `gh pr view --web`                              |

---

## Conclusion
Both these approaches enable developers to contribute changes efficiently, with the CLI offering a faster, scriptable method especially useful for power users and automated workflows.
Understanding both methods ensures flexibility and productivity, depending on the development environment and use case.

---

## Contact

| Name| Email Address      |
|-----|--------------------------|
| Yuvraj Singh | yuvraj.singh.snaatak@mygurukulam.co |

---

## References

| Source                                                                                     | Description                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------ |
| GitHub Docs - About Pull Requests | [visit](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests) |
| GitHub CLI Documentation | [visit](https://cli.github.com/manual/) | 
| GitHub Docs - Creating a Pull Request | [visit](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request) | 
