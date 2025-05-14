# SSL POC

---

## Author Information

| **Created**   | **Version** | **Last Modified** | **Author**            | **Level**        | **Reviewer** |
|---------------|-------------|-------------------|------------------------|------------------|--------------|
| 01-05-2025    | V1.1        | 04-05-2025         | Harsh Wardhan Singh    | Internal Review  | Pritam       |

---

## Table of Contents

- [Introduction](#introduction)
- [Why Use Certbot](#why-use-certbot)
- [Step-by-Step Guide](#step-by-step-guide)
  - [Step 1: Update System Packages](#step-1-update-system-packages)
  - [Step 2: Install Certbot and Nginx Plugin](#step-2-install-certbot-and-nginx-plugin)
  - [Step 3: Configure Nginx for Your Domain](#step-3-configure-nginx-for-your-domain)
  - [Step 4: Obtain SSL Certificate Using Certbot](#step-4-obtain-ssl-certificate-using-certbot)
  - [Step 5: Verify HTTPS in Browser](#step-5-verify-https-in-browser)
  - [Step 6: Test Automatic Renewal](#step-6-test-automatic-renewal)
- [Certificate File Locations](#certificate-file-locations)
- [Additional Notes](#additional-notes)
- [Conclusion](#conclusion)
- [Contacts](#contacts)
- [References](#references)

---

## Introduction

This Proof of Concept (POC) demonstrates how to secure a website hosted on an **Nginx web server** using **Certbot**, a free tool by **Let’s Encrypt**. The objective is to enable HTTPS through automatically renewable, trusted SSL certificates.

---

## Why Use Certbot

- Free and Open Source  
- Automated Setup and Renewal  
- Easy to Use for Beginners  
- Trusted by All Major Browsers  
- Compatible with Popular Web Servers (e.g., Nginx, Apache)  
- Strong Community and Documentation Support  
- Boosts Site Security and SEO  

---

## Step-by-Step Guide




---

### Step 1: Install nginx

```bash
sudo apt install nginx -y
```

![Screenshot from 2025-05-02 16-37-50](https://github.com/user-attachments/assets/dc2e165e-4636-4220-baf2-38ea0fbaffe2)

---

### Step 2: Install Certbot and Nginx Plugin

```bash
sudo apt install certbot python3-certbot-nginx -y
```

---

### Step 3: Configure Nginx for Your Domain

#### 1. Create a Server Block

```bash
sudo nano /etc/nginx/sites-available/downtimecrew.xyz
```




![Screenshot from 2025-05-03 02-04-01](https://github.com/user-attachments/assets/efa5d0b0-837f-452b-80f6-c74dfa3590cc)

#### 2. Add Configuration:

```nginx
server {
        listen 80;
        listen [::]:80;

        root /var/www/html;
        index mycustom.html;

        server_name your_domain www.your_domain;

        location / {
                try_files $uri $uri/ =404;
        }
}
```

![Screenshot from 2025-05-05 18-39-11](https://github.com/user-attachments/assets/2ca25331-c3c8-4743-8985-099902e116a9)



#### 3. Enable the Site

```bash
sudo ln -s /etc/nginx/sites-available/downtimecrew.xyz /etc/nginx/sites-enabled/
sudo nginx -t
sudo systemctl reload nginx
```


![Screenshot from 2025-05-03 02-04-01](https://github.com/user-attachments/assets/3cdcb7f3-948b-4124-b16c-4063a4d0c4fd)

#### 4. Create a Custom HTML Page

```bash
sudo nano /var/www/html/mycustom.html
```

Add:
**Note:Add your custom template of HTML**
```html
<!DOCTYPE html>
<html>
<head>
  <title>Downtime Crew</title>
  <style>
    body, html {
      margin: 0;
      padding: 0;
      height: 100%;
      display: flex;
      justify-content: center;
      align-items: center;
      background-color: #f0f0f0;
    }
    .container {
      position: relative;
      width: 100%;
      height: 100%;
    }
    img {
      width: 100%;
      height: 100%;
      object-fit: cover;
    }
    .text-overlay {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      color: white;
      font-size: 36px;
      font-weight: bold;
      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);
    }
  </style>
</head>
<body>
  <div class="container">
    <img src="op.png" alt="Team Banner" />
    <div class="text-overlay">Team DownTime Crew</div>
  </div>
</body>
</html>
```

---

### Step 4: Obtain SSL Certificate Using Certbot

```bash
sudo certbot --nginx -d downtimecrew.xyz -d www.downtimecrew.xyz
```

Follow the interactive prompts to complete SSL setup.

---

### Step 5: Verify HTTPS in Browser

Visit:

```
https://downtimecrew.xyz
```

You should see a padlock icon and your custom HTML page at left side of opposite direction arrows.


![Screenshot from 2025-05-07 00-47-09](https://github.com/user-attachments/assets/eb395b2a-3f8f-46bb-be23-4afda23f9210)




![Screenshot from 2025-05-02 21-17-44](https://github.com/user-attachments/assets/7702a880-efdc-4865-af46-a2a83d2f7a92)


---


---

## Certificate File Locations

| File           | Path                                                      |
|----------------|-----------------------------------------------------------|
| Full Chain     | /etc/letsencrypt/live/downtimecrew.xyz/fullchain.pem     |
| Private Key    | /etc/letsencrypt/live/downtimecrew.xyz/privkey.pem       |
| Renewal Config | /etc/letsencrypt/renewal/downtimecrew.xyz.conf           |

---


## Conclusion

Certbot with Nginx offers a streamlined, secure, and free method for implementing HTTPS on your site. This setup improves security, trust, and SEO, while requiring minimal maintenance thanks to auto-renewal support.

---

## Contacts

| Name                | Email Address                            |
|---------------------|-------------------------------------------|
| Harsh Wardhan Singh | harsh.singh.snaatak@mygurukulam.co       |

---

## References

| Title            | Description             | Link                                                                 |
|------------------|-------------------------|----------------------------------------------------------------------|
| Certbot Docs     | Official Documentation  | [Certbot Docs](https://certbot.eff.org/docs/)                        |
| Let’s Encrypt    | Certificate Authority   | [https://letsencrypt.org](https://letsencrypt.org)                  |
| Internal Docs    | SSL POC Documentation   | [Internal SSL Doc](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-125-Durgesh/domain-security/dns-ssl/ssl%20documentation/README.md) |
