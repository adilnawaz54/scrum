# Documentation: VCS Authorization

![Image](https://cdn1.iconfinder.com/data/icons/business-marketing-37/64/-_authentication_15-256.png)

---

| Created     | Last Updated | Version | Author          | Comment         | Reviewer |
|-------------|--------------|---------|-----------------|-----------------|----------|
| 02-05-2025  | 05-05-2025   | V1.1    | Prateek Rai | Initial Draft   | Siddharth Pawar |
| 02-05-2025  | 05-05-2025         | V2         | Prateek Rai | L0 review | Shikha Tripathi |
| 02-05-2025 | 05-05-2025      | V3     | Prateek Rai  | L1   | Kirti Nehra      |
| 02-05-2025 | 05-05-2025      | V4     | Prateek Rai  | L2   | Ashwani Singh      |


---

## Table of Contents

1. [Introduction](#introduction)
2. [What is Authorization?](#what-is-authorization)
3. [Why Authorization?](#why-authorization)
4. [Access Levels](#access-levels)
5. [Audit Trails](#audit-trails)
6. [Benefits of Audit Trails](#benefits-of-audit-trails)
7. [Integration with Identity Providers](#integration-with-identity-providers)
8. [Types of Authorization](#types-of-authorization)
9. [Advantages & Disadvantages](#advantages--disadvantages-authz)
10. [Best Practices](#best-practices)
11. [Conclusion](#conclusion)
12. [Contact Information](#contact-information)
13. [References](#references)

---

## Introduction

Authorization (Authz) governs **what** authenticated users are allowed to do within the Version Control System (VCS). It defines the scope of access across teams, repositories, and environments, ensuring secure, principle-driven operations.

---

## What is Authorization?

Authorization (Authz) refers to the process of determining **what actions** an authenticated user is allowed to perform in a system after their identity has been verified (authentication). It ensures that users can only access resources that they are explicitly allowed to, based on their roles, permissions, or attributes.  

---

## Why Authorization?

- Enforces least privilege access, ensuring users can only access resources necessary for their roles.
- Mitigates risks from internal and external threats.
- Aligns with compliance frameworks (e.g., SOC2, ISO27001).
- Supports scalable, role-based development practices, promoting security and operational efficiency.

---

## Access Levels

| Role         | Permissions                                               |
|--------------|-----------------------------------------------------------|
| **Owner**    | Full access, including billing and settings               |
| **Maintainer** | Repo creation/deletion, branch protection, CI management |
| **Developer** | Code commit, pull/merge requests, read/write access      |
| **Reporter**  | Read-only access to code, CI/CD logs                     |
| **Guest**     | Minimal view-only access                                 |

---

## Audit Trails

Audit trails provide a chronological record of all actions performed within the VCS, focusing on user access, changes, and configuration adjustments. These logs help maintain security, accountability, and transparency within the system.

## Key Features of Audit Trails

| **Feature**             | **Description**                                                                 |
|-------------------------|---------------------------------------------------------------------------------|
| **User Actions Logging** | Logs actions like repository creation, commits, pushes, pulls, and merge requests. |
| **Access Logging**       | Tracks failed authentication attempts, successful logins, and changes in user access permissions. |
| **Change Tracking**      | Logs every change made to files or configurations, including commit author and timestamps. |
| **Permissions Changes**  | Tracks modifications to user roles and permissions, including who granted or modified access. |
| **Security Events**      | Logs suspicious activities such as multiple failed login attempts, IP address anomalies, and other security events. |

---

## Benefits of Audit Trails

| **Benefit**           | **Description**                                                                 |
|------------------------|---------------------------------------------------------------------------------|
| **Security Monitoring** | Quickly identify unauthorized access attempts or malicious activities.         |
| **Compliance Reporting** | Generate audit reports for regulatory and internal compliance.                |
| **Transparency**       | Provides clear visibility into who did what and when, enhancing accountability. |
| **Forensic Analysis**  | Useful in post-incident investigations to trace security breaches or operational errors. |

---

## Integration with Identity Providers

Integrating your VCS with an Identity Provider (IdP) is essential for managing authentication and authorization efficiently. Enterprise-level IdP integration ensures consistent user management, centralized access control, and supports compliance with organizational security policies.

### Types of IdP Integration

| **Integration Type**             | **Description**                                                                                 | **Benefits**                                                                 |
|----------------------------------|-------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| **Single Sign-On (SSO)**         | Enables users to log into the VCS system using corporate credentials via SSO (e.g., AD, Okta). | Simplifies user login, centralizes authentication, reduces password fatigue. |
| **OAuth 2.0 / OpenID Connect**   | Enables secure and modern token-based authentication for VCS systems and external IdPs.        | Widely used in services like GitHub, GitLab, Bitbucket for enterprise auth. |
| **Active Directory / LDAP Integration** | Connect VCS systems to AD or LDAP to manage user roles and permissions centrally.           | Seamless user provisioning and centralized access control.                   |
| **Group-Based Permissions**      | VCS systems can map IdP groups to system roles (e.g., "Developers" group = Contributor access).| Automates user role assignment, streamlining access control.                |

---

## Types of Authorization

This document outlines various authorization models commonly used in access control systems. Each model has distinct mechanisms and use cases depending on the security requirements of the application or system.

| **Authorization Model**           | **Description**                                                                 |
|----------------------------------|---------------------------------------------------------------------------------|
| **Role-Based Access Control (RBAC)**  | Access granted based on assigned roles with predefined permissions.             |
| **Attribute-Based Access Control (ABAC)** | Access granted based on dynamic attributes (e.g., user, resource, environment). |
| **Discretionary Access Control (DAC)** | Resource owners have control over permissions for other users.                 |
| **Mandatory Access Control (MAC)**    | Access determined by security policies, not the resource owner.                |
| **Identity-Based Access Control (IBAC)** | Access based on individual user identities.                                    |
| **Time-Based Access Control (TBAC)**   | Access granted based on time or scheduled windows.                             |
| **Geolocation-Based Access Control (GeoAC)** | Access granted based on user's physical location (e.g., IP address or GPS).    |
| **OAuth**                            | Token-based authorization for third-party apps to access resources without sharing credentials. |
| **OpenID Connect (OIDC)**            | Authentication and authorization standard based on OAuth 2.0, allowing users to log in and grant access to resources. |

---

## Advantages & Disadvantages (Authz)

| Model | Advantages | Disadvantages |
|-------|------------|---------------|
| **RBAC** | - Easy to implement, clear boundaries, widely supported | - Limited flexibility, needs manual updates |
| **ABAC** | - Fine-grained, dynamic, automatable | - Complex to configure and maintain |
| **MAC (Mandatory Access Control)** | - High security through strict policies <br> - Ideal for classified environments | - Inflexible <br> - Resource owner has no control over access                 |
| **DAC (Discretionary Access Control)** | - Simple and user-friendly <br> - Resource owners manage access directly | - Susceptible to human error <br> - Weaker control in large organizations     |
| **IBAC (Identity-Based Access Control)** | - Tailored access per individual <br> - Good for small systems | - Hard to scale <br> - Tedious to manage many users                          |
| **TBAC (Time-Based Access Control)** | - Useful for scheduled or temporary access <br> - Enhances security posture | - Not suitable for all workflows <br> - Requires time sync and monitoring     |
| **GeoAC (Geolocation-Based Access Control)** | - Enforces location-based policies <br> - Useful for region-specific compliance | - May need IP/GPS integration <br> - Vulnerable to spoofing or VPN evasion    |

---

## Best Practices 

- **Follow Principle of Least Privilege (PoLP)** – Grant users only the minimum access required for their tasks.
-  Use **RBAC with group mapping** from Identity Providers (IdP) to streamline role assignment.
- Set up **branch protection rules** and **required approvals** for sensitive branches.
- Review access quarterly or during employee offboarding to ensure only active contributors have access.
- Enable **repository visibility restrictions** (e.g., private by default) to prevent unauthorized access.

---

## Conclusion

After evaluating available strategies, we will adopt the **Role-Based Access Control (RBAC)** model integrated with our Identity Provider (e.g., Okta/Azure AD) using SSO and SCIM for group-based permission mapping.

This approach is:
- Easy to implement and manage.
- Compatible with GitHub/GitLab's built-in model.
- Scalable across teams.
- Secure by design when paired with Two-Factor Authentication (2FA) and audit trails.

---

## Contact Information

| **Name**    | **Email**                                      |
|-------------|------------------------------------------------|
| Prateek Rai | prateek.rai.snaatak@mygurukulam.co   |

---

## References

| Title                        | Link                                                                 |
|------------------------------|----------------------------------------------------------------------|
| GitHub Permissions Overview  | [Visit](https://docs.github.com/en/get-started/learning-about-github/access-permissions-on-github) |
| GitLab User Permissions      | [Visit](https://docs.gitlab.com/ee/user/permissions.html)           |
| Azure AD Role-Based Access Control | [Visit](https://learn.microsoft.com/en-us/azure/active-directory/role-based-access-control-what-is) |
| Open Policy Agent (OPA)      | [Visit](https://www.openpolicyagent.org/)                           |
| SAML 2.0 Overview            | [Visit](https://en.wikipedia.org/wiki/SAML_2.0)                     |
| SCIM Integration with Okta   | [Visit](https://help.okta.com/)                                     |

