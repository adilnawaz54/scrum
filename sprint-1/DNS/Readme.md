# Implementation of DNS(Domain Name System)

## Author
| Created     | Version | Author        | Modifed | Comment           | Reviewer   |
|-------------|---------|---------------|-------|------------|------------------|
| 04-05-2025  | V1      | Adil Nawaz |  | Internal Review   | Pritam  |

## Table of Contents

1. [Introduction](#introduction)  
2. [Implementation](#implementation)  
   - [Step 1: Purchase DNS](#step-1-purchase-dns)  
   - [Step 2: Access Domain List](#step-2)  
   - [Step 3: Manage Purchased Domain](#step-3)  
   - [Step 4: Open Advanced DNS](#step-4)  
   - [Step 5: Add DNS Records](#step-5)  
   - [Step 6: Verify Domain](#step-6)  
3. [Conclusion](#conclusion)  
4. [Contact](#contact)  
5. [References](#references)

---

## Introduction

This document provides a structured guide for configuring a custom domain purchased from Namecheap to point to an AWS EC2 instance using DNS (Domain Name System). Following a step-by-step approach, it walks through domain registration, DNS record setup, and validation, ensuring users can seamlessly link their domain to a cloud-hosted application.


## Implementation

### Step 1: Purchase DNS

> 👉 **Follow Steps here**: [DNS](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-123-YUVRAJ/domain-security/dns-ssl/poc%20of%20dns/README.md)


### Step 2 

*After payment is complete, go to **Account** > **Domain List*** 

![image](https://github.com/user-attachments/assets/a693b442-e8fb-41c4-87ee-c3a7aef7c554)

### Step 3

*Select the domain you just purchased then click **Manage***

![image](https://github.com/user-attachments/assets/02cfd252-8229-44d8-8255-eb94185d433f)

### Step 4

*Go to **Advance DNS** tab*

![image](https://github.com/user-attachments/assets/b40770dc-4be9-43c8-a58c-f252bb235b05)

### Step 5

*Delete any existing default records and create 2 new records*

| Type     | Host | Value             | TTL       |
| -------- | ---- | ----------------- | --------- |
| A Record | @    | public-ip of application instance    | Automatic | # To bind instance with DNS
| CNAME Record    | www  | downtimecrew.xyz | Automatic | # To make the webpage available with www.

- Make sure that the service is up and running to the instance you're providing the public ip for

![image](https://github.com/user-attachments/assets/f64e38ed-c293-4ac4-b0ff-af8bae642a3c)


### Step 6 

*Visit your domain using your web browser to confirm the changes*
(http://www.downtimecrew.xyz/) (http://downtimecrew.xyz/)

![image](https://github.com/user-attachments/assets/d0ced70b-a11c-4e1a-87a2-4e41cfac07fd)


## Conclusion

This setup enables seamless access to deployed applications via a human-readable domain name rather than relying on public IPs. Proper DNS configuration not only improves accessibility but also lays the foundation for implementing SSL certificates, load balancers, and scalable infrastructure in the future.



## Contact

| Name| Email Address      |
|-----|--------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co |


## References

| Source                    | Description             |
|---------------------------|-------------------------|
| NameCheap    | [Visit](https://www.namecheap.com/)   |
| What is DNS - CloudFlare | [Visit](https://www.cloudflare.com/learning/dns/what-is-dns/) | 
| AWS EC2 doc | [Visit](https://docs.aws.amazon.com/ec2/) |
| DNS Purchase | [DNS](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-123-YUVRAJ/domain-security/dns-ssl/poc%20of%20dns/README.md) |
