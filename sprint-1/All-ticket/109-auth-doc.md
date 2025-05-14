# Documentation: VCS Authentication

| Created     | Last Updated | Version | Author          | Comment         | Reviewer |
|-------------|--------------|---------|-----------------|-----------------|----------|
| 28-04-2025  |  28-04-2025  | V1      | Nishkarsh Kumar | Internal Review | Pritam   |
| 28-04-2025  |  03-05-2025  | V2.1      | Nishkarsh Kumar | L0 | Akshit    |
---

## Table of Contents  
1. [Introduction](#introduction)  
2. [Why Authentication?](#why-authentication)  
3. [Authentication Strategies](#authentication-strategies)  
   - [SSH Key-Based Authentication](#ssh-key-based-authentication)  
   - [OAuth 2.0 / OpenID Connect](#oauth-20--openid-connect)  
   - [Personal Access Tokens (PATs)](#personal-access-tokens-pats)  
   - [Username/Password (Basic Auth)](#usernamepassword-basic-auth)  
   - [Two-Factor Authentication (2FA)](#two-factor-authentication-2fa)  
4. [Comparison Table](#comparison-table)  
5. [Advantages & Disadvantages](#advantages--disadvantages)  
6. [Best Practices](#best-practices)  
7. [Conclusion](#conclusion)  
8. [Contact Information](#contact-information)  
9. [References](#references)  

---

## Introduction  
Authentication (Authn) is a critical component of Version Control System (VCS) security. This document outlines strategies for securing access to VCS platforms (e.g., GitLab, GitHub, Bitbucket) and compares different authentication methods.  

---

## Why Authentication?  
- Verifies user identity (e.g., ensuring a user is who they claim to be)  
- Prevents unauthorized access to repositories  
- Helps maintain compliance with security policies  

---

## Authentication Strategies  

### SSH Key-Based Authentication  
- Uses asymmetric cryptography (public/private keys)  
- Common for Git operations over SSH  
- Example: `ssh-keygen -t ed25519`  

### OAuth 2.0 / OpenID Connect  
- Delegated authentication (e.g., "Sign in with Google/GitHub")  
- Uses tokens (JWT) for stateless validation  
- Ideal for web-based VCS dashboards  

### Personal Access Tokens (PATs)  
- Token-based alternative to passwords  
- Scoped permissions (e.g., `repo:read`, `user:email`)  
- Example: GitHub PATs  

### Username/Password (Basic Auth)  
- Legacy method (discouraged due to security risks)  
- Requires HTTPS + rate limiting to mitigate brute-force attacks  

### Two-Factor Authentication (2FA)  
- Adds a second layer of security (TOTP app, SMS, security key, or passkey)  
- Strongly recommended by GitHub and other platforms  
- Required for many contributors as of March 2023  
- Can be used with username/password or PATs  
- Ensures user identity even if primary credentials are compromised  

---

## Comparison Table  

| Method               | Security | Ease of Use | Scalability | Recommended Use Case              |  
|----------------------|----------|-------------|-------------|-----------------------------------|  
| SSH Keys             | High     | Moderate    | High        | Developer CLI operations          |  
| OAuth 2.0 / OIDC     | High     | Easy        | High        | Web apps, third-party integrations|  
| PATs                 | Medium   | Easy        | Medium      | Automated scripts, CI/CD          |  
| Username/Password    | Low      | Easy        | Low         | Legacy systems (avoid)            |  
| Two-Factor Auth (2FA)| Very High| Moderate    | High        | All access (combined with other methods) |

---

## Advantages & Disadvantages  

### SSH Keys  
- **Advantages**: High security, no password phishing risk  
- **Disadvantages**: Key management overhead  

### OAuth 2.0  
- **Advantages**: Centralized identity management  
- **Disadvantages**: Dependency on third-party providers  

### PATs  
- **Advantages**: Fine-grained permissions  
- **Disadvantages**: Tokens must be securely stored  

### Basic Auth  
- **Advantages**: Simple to implement  
- **Disadvantages**: Vulnerable to brute-force attacks  

### 2FA  
- **Advantages**: Greatly improves account security, mitigates credential theft  
- **Disadvantages**: Additional setup step, recovery can be complex if device is lost  

---

## Best Practices  
1. **Prefer SSH/OAuth over passwords**  
2. **Enforce 2FA** for all users  
3. **Rotate tokens/keys** periodically  
4. **Use short-lived tokens** for OAuth  
5. **Audit logs** for all authentication attempts  

---

## Conclusion  
While several authentication strategies are available—SSH, OAuth, PATs—our project will **enforce Two-Factor Authentication (2FA)** for all team members and contributors to maximize account and repository security.  

We will integrate 2FA with GitHub using TOTP apps (like Google Authenticator or Authy) or hardware security keys. This will ensure that even if primary credentials are leaked or compromised, repository access remains protected.

---

## Contact Information  

| **Name**    | **Email**                |
|-------------|--------------------------|
| Nishkarsh Kumar     | nishkarsh.kumar.snaatak@mygurukulam.co  |

---

## References  

| Title                          | Link                                                                 |  
|--------------------------------|----------------------------------------------------------------------|  
| GitHub PAT Documentation | [Visit](https://docs.github.com/en/authentication)       |  
| GitHub 2FA Guide | [Visit](https://docs.github.com/en/authentication/securing-your-account-with-two-factor-authentication-2fa) |  
| OAuth 2.0 RFC | [Visit](https://tools.ietf.org/html/rfc6749) |

---
