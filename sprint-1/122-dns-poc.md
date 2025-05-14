# POC for DNS(Domain Name System)

## Author
| Created     | Version    | Author       | Modifed    | Comment           | Reviewer         |
|-------------|------------|--------------|------------|-------------------|------------------|
| 02-05-2025  |  V1        | Yuvraj Singh |            | Internal Review   | Siddharth Pawar  |
| 05-05-2025  |  V2        | Yuvraj Singh |            | L0 Review         | Naveen Haswani |
| 06-05-2025  |  V3        | Yuvraj Singh |            | L1 Review         | Deepak Nishad |
|             |  V4        | Yuvraj Singh |            | L2 Review         | Ashwani Singh |

## Table of Contents

<details>
<summary>1. Introduction</summary>

- [Introduction](#introduction)  
- [DNS Documentation](#dns-documentatiion)
</details>

<details>
<summary>2. Steps of Conduct</summary>

- [Step 1: Go to Namecheap](#step-1)  
- [Step 2: Sign Up and Sign In](#step-2)  
- [Step 3: Search and Select Domain](#step-3)  
- [Step 4: Checkout and Confirm Order](#step-4)  
- [Step 5: Make the Payment](#step-5)  
- [Step 6: Go to Domain List](#step-6)  
- [Step 7: Manage Your Domain](#step-7)  
- [Step 8: Access Advanced DNS](#step-8)  
- [Step 9: Configure DNS Records](#step-9)  
- [Step 10: Verify Domain Mapping](#step-10)

</details>

<details>
<summary>3. Wrap-up</summary>

- [Conclusion](#conclusion)  
- [Contact](#contact)  
- [References](#references)

</details>

## Introduction

This document provides a structured guide for configuring a custom domain purchased from Namecheap to point to an AWS EC2 instance using DNS (Domain Name System). Following a step-by-step approach, it walks through domain registration, DNS record setup, and validation, ensuring users can seamlessly link their domain to a cloud-hosted application.

## DNS Documentation

To get a detailed documentation for DNS [click here.](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-122-Vardaan/domain-security/dns-ssl/dns%20documentation/README.md)

## Steps of conduct

### Step 1

*Go to [namecheap.com](namecheap.com)*

![image](https://github.com/user-attachments/assets/9bf84de9-96ab-42ac-b00b-f0cfbe4d1679)

### Step 2

*Sign up and sign in to your account*

![image](https://github.com/user-attachments/assets/aa20dfd6-9073-40bc-aff2-818cabbab53d)

### Step 3 

*Search for you desired domain name and select the one that meets your requirement (downtimecrew)*

![image](https://github.com/user-attachments/assets/a29cf543-7501-48c3-886d-4a358493103c)

### Step 4

*Checkout and confirm order*

![image](https://github.com/user-attachments/assets/ed2a236f-64d8-49c2-a3fc-6c416fe92d17)

### Step 5

*Make the payment*

![image](https://github.com/user-attachments/assets/b1813611-29ac-4372-ba70-de4c5eb6ca22)

### Step 6 

*After payment is complete, go to **Account** > **Domain List*** 

![image](https://github.com/user-attachments/assets/a693b442-e8fb-41c4-87ee-c3a7aef7c554)

### Step 7

*Select the domain you just purchased then click **Manage***

![image](https://github.com/user-attachments/assets/02cfd252-8229-44d8-8255-eb94185d433f)

### Step 8

*Go to **Advance DNS** tab*

![image](https://github.com/user-attachments/assets/b40770dc-4be9-43c8-a58c-f252bb235b05)

### Step 9

*Delete any existing default records and create 2 new records*

| Type     | Host | Value             | TTL       |
| -------- | ---- | ----------------- | --------- |
| A Record | @    | public-ip of application instance    | Automatic | # To bind instance with DNS
| CNAME Record    | www  | downtimecrew.xyz | Automatic | # To make the webpage available with www.

- Make sure that the service is up and running to the instance you're providing the public ip for

![image](https://github.com/user-attachments/assets/d911cc61-5877-4750-83b1-a4c1d7ad2b2c)

### Step 10 

*Visit your domain using your web browser to confirm the changes*
(http://www.downtimecrew.xyz/) (http://downtimecrew.xyz/)

![image](https://github.com/user-attachments/assets/d0ced70b-a11c-4e1a-87a2-4e41cfac07fd)


## Conclusion

This setup enables seamless access to deployed applications via a human-readable domain name rather than relying on public IPs. Proper DNS configuration not only improves accessibility but also lays the foundation for implementing SSL certificates, load balancers, and scalable infrastructure in the future.



## Contact

| Name| Email Address      |
|-----|--------------------------|
| Yuvraj Singh | yuvraj.singh.snaatak@mygurukulam.co |


## References

| Source                    | Description             |
|---------------------------|-------------------------|
| NameCheap    | [Visit](https://www.namecheap.com/)   |
| What is DNS - CloudFlare | [Visit](https://www.cloudflare.com/learning/dns/what-is-dns/) | 
| AWS EC2 doc | [Visit](https://docs.aws.amazon.com/ec2/) |
