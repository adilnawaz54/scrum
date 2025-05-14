# SSL Documentation

## Author Information

| **Created**       | **Version** | **Last Modified** | **Author**        | **Level**            | **Reviewer**  |
|--------------------|-------------|-------------------|-------------------|----------------------|---------------|
| 28-04-2025         |    V1       |  01-05-2025       |  Durgesh Sharma   | Internal review      | Pritam        |
| 28-04-2025         |    V1         |01-05-2025         |   Durgesh Sharma  | L0 Review            | Shreya Jaiswal|
| 28-04-2025         |             |                   | Durgesh Sharma   | L1 Review            | Abhishek V    |
| 28-04-2025         |             |                   |  Durgesh Sharma  | L2 Review            | Abhishek Dubey    |


## Table of Contents
1. [Introduction](#introduction)
2. [Why SSL is Important](#why-ssl-is-important)
3. [What is SSL?](#what-is-ssl)
4. [How SSL Works](#how-ssl-works)
5. [How to Get an SSL Certificate](#how-to-get-an-ssl-certificate)
6. [Different SSL provider](#different-ssl-provider)
7. [Comparison between SSL providers](#comparison-between-ssl-providers)
8. [Recommendations](#recommendations)
9. [Contact Information](#contact-information)
10. [References](#references)

## Introduction
This documentation provides an overview of SSL (Secure Sockets Layer), explaining its importance, functionality, and steps for implementation. It serves as a guide for understanding and deploying SSL effectively.

## Why SSL is Important
| Benefit            | Description                                                                   |
|--------------------|-------------------------------------------------------------------------------|
| **Data Protection**| Encrypts sensitive information such as credit card details, login credentials, and other personal data. |
| **Trust Building** | Displays a padlock symbol and "HTTPS," which boosts customer confidence.    |
| **SEO Benefits**   | Search engines like Google prioritize SSL-secured websites.                 |
| **Compliance**     | Meets industry standards and regulations for data security.                 |

## What is SSL?
SSL is a protocol that provides secure communications on the internet for web browsing, email, instant messaging, and other data transfers. It works by:
- Encrypting data to prevent interception during transmission.
- Authenticating the identity of the parties involved.
- Ensuring data integrity to detect tampering during transmission.

## How SSL Works

<img width="900" length="600" alt="Terraform" src="https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj95XIPTxkphSaWMEslV_s4axJxaj4XJ2-GIsHmC7_w5vJgEnwKgTOJFt9E5HRrBDNJfV5qus4khyx8G73TiWCAKebD6vwYrQsjF9qLpPqAsJjAn7KVfIkp4XjpRM9i4CVqpua91gIea9YPPXcup4wI5APIehSHcD8sRjvKwinGDCcxJwRJFKhR_D0g__Q/s16000/diagram-export-5-1-2025-2_45_20-PM.png">

---

# Client-Server Interaction

## Client-Server Communication

- A user (client) accesses the internet and communicates with a server (e.g., NGINX).
- The client sends a `GET` request, and the server responds.

## What could be the Potential Security Threat

- Without encryption, a third party (like a hacker) can intercept the communication (Man-in-the-Middle attack), exposing sensitive data.

## Encryption to Secure Communication

### Symmetric Encryption

- One key is used to both encrypt and decrypt data.
- The client generates a key to encrypt data.
- **Risk:** If the key is intercepted, the data can be decrypted.

### Asymmetric Encryption

- Two keys are used:
  - **Public Key:** Used to encrypt data.
  - **Private Key:** Used to decrypt data.
- The client uses the server's public key to encrypt the data.
- **Benefit:** Only the server’s private key can decrypt the data, ensuring security even if the public key is intercepted.

## Man-in-the-Middle Attack Prevention

- A hacker could replace the server’s public key with their own.
- This tricks the client into encrypting the data with the hacker’s public key.
- The hacker can then decrypt the data using their private key.

## SSL Certificates to Verify the Server

- An SSL certificate is issued by a trusted Certificate Authority (CA), like Let’s Encrypt.
- It ensures that the server’s public key belongs to the legitimate server.

## Process of SSL Certificate Creation by Let’s Encrypt

1. **Certificate Signing Request (CSR):**
   - The server generates a CSR, which includes:
     - The server’s public key.
     - Identifying information about the server (e.g., domain name).

2. **Submission and Validation:**
   - The server submits the CSR to Let’s Encrypt.
   - Let’s Encrypt verifies domain ownership using methods like:
     - **DNS Validation:** Verifying a specific DNS record.
     - **HTTP Validation:** Checking a file placed on the server at a specific URL.

3. **Issuance:**
   - After validation, Let’s Encrypt issues the SSL certificate, containing:
     - The server’s public key.
     - Information about the server and the issuing CA.
     - The digital signature of the CA.

## How the Server Sends the SSL Certificate to the Client

- When a client connects to a secure website (using HTTPS), the server sends the SSL certificate as part of the TLS handshake.
- The certificate includes the server’s public key.

## Client Verifies the SSL Certificate

Upon receiving the SSL certificate, the client performs these checks:

1. **Digital Signature:**
   - Verifies the certificate’s digital signature using the CA’s public key.
   - Ensures the certificate was issued by a trusted CA and hasn’t been tampered with.

2. **Validity Period:**
   - Checks if the certificate is still valid (current date is within the validity period).

3. **Domain Name:**
   - Ensures the certificate’s domain name matches the server’s domain name to prevent man-in-the-middle attacks.

4. **Revocation Status:**
   - Optionally checks if the certificate has been revoked using:
     - Certificate Revocation List (CRL).
     - Online Certificate Status Protocol (OCSP).

## Secure Connection Establishment

- If all checks pass, the client establishes a secure, encrypted connection with the server.


---



## How to Get an SSL Certificate
### Steps to Obtain an SSL Certificate:
Obtaining an SSL certificate involves several steps. Follow this guide for a smooth process:

Step 1. **Decide the Type of SSL Certificate You Need**
   - Single Domain: Protects one specific domain.
   - Multi-Domain (SAN): Covers multiple domains under one certificate.
   - Wildcard: Secures a domain and all its subdomains.

Step 2. **Generate a Certificate Signing Request (CSR)**
   - Use your server to create a CSR and a private key. Most hosting providers and server software provide tools for this.
   - The CSR includes information about your organization and domain.

Step 3. **Choose a Certificate Authority (CA)**
   - Examples: DigiCert, Let's Encrypt, GlobalSign, Comodo, and GoDaddy.
   - Compare prices, features, and validation levels (DV, OV, EV) before deciding.

Step 4. **Submit the CSR to the Chosen CA**
   - Log in to the CA’s portal and upload your CSR.
   - Complete the required details for verification.

Step 5. **Complete Domain Validation**
   - The CA verifies your control over the domain. This can be done through:
     - Email validation (a verification email is sent to a domain-related address).
     - DNS validation (adding a specific record to your domain’s DNS settings).
     - HTTP validation (uploading a specific file to your web server).

Step 6. **Receive and Install the SSL Certificate**
   - After validation, the CA will issue your certificate.
   - Download the certificate and install it on your server. Refer to your hosting provider or server documentation for installation instructions.

Step 7. **Test Your SSL Certificate**
   - Use online tools like SSL Labs to ensure your certificate is installed correctly and functions as expected

---
## Different SSL provider

| Certificate Authority | Official Documentation Link                                     |
|------------------------|---------------------------------------------------------------|
| DigiCert              | [Visit DigiCert Support](https://www.digicert.com/support)    |
| GlobalSign            | [Visit GlobalSign Support](https://support.globalsign.com/)   |
| Let's Encrypt         | [Learn About Let's Encrypt](https://letsencrypt.org/docs/)    |
| Comodo                | [Explore Comodo Resources](https://www.comodo.com/)   |
| GoDaddy               | [GoDaddy Help Center](https://www.godaddy.com/help/)          |



  
---

## Comparison between SSL providers

| Provider        | Cost           | Validation Types         | Features                    | Support       |
|-----------------|----------------|--------------------------|-----------------------------|---------------|
| DigiCert        | High           | DV, OV, EV               | High assurance, fast issuance | 24/7         |
| GlobalSign      | Medium         | DV, OV, EV               | Cloud-based management     | 24/7         |
| Let's Encrypt   | Free           | DV                       | Automated, renewable       | Community     |
| Comodo          | Low            | DV, OV, EV               | Budget-friendly            | 24/7         |
| GoDaddy         | Medium         | DV, OV                   | Simplified for small businesses | 24/7     |

---

## Recommendations
| Recommendation           | Details                                                                 |
|--------------------------|-------------------------------------------------------------------------|
| **Budget-Friendly Needs** | Use Let's Encrypt for free and automated SSL certificates.             |
| **High Assurance**        | Choose DigiCert or GlobalSign for enterprise-grade security.           |
| **Small Businesses**      | Opt for GoDaddy for its simplicity and tailored solutions.             |
| **Scalability**           | GlobalSign is ideal for organizations requiring flexible certificates. |
| **Ease of Use**           | GoDaddy and Comodo provide user-friendly interfaces and processes.     |


## Contact Information


| **Name**           | **Email Address**                                 |
|----------------|-----------------------------------------------|
| Durgesh Sharma | durgesh.sharma.snaatak@mygurukulam.co         |

## References
| Reference                 | Link                                                                     |
|---------------------------|--------------------------------------------------------------------------|
| SSL/TLS Overview          | [SSL/TLS Overview](https://www.digicert.com/what-is-ssl-tls-and-https)                   |
| GoDaddy    | [GoDaddy Help Center](https://www.godaddy.com/help/)                 |
| Let's Encrypt Documentation | [Let's Encrypt Documentation](https://letsencrypt.org/docs/)          |

