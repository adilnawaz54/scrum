# Install ScyllaDB 

## Step 1: Install a repo file and add the ScyllaDB APT repository to your system.
```
sudo mkdir -p /etc/apt/keyrings
```



###  Breakdown:

| Part                  | Explanation                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| `sudo`                | Runs the command with **superuser (admin) privileges**                     |
| `mkdir`               | Stands for **“make directory”** — creates a new directory                   |
| `-p`                  | **Parent flag**: creates **parent directories as needed**, and **no error if it already exists** |
| `/etc/apt/keyrings`   | The **path** where **APT GPG keyrings** are stored (used to verify repos)   |



###  Why it's used:

This is often run **before adding a GPG key** for a custom APT repository, so the key can be stored securely in `/etc/apt/keyrings/`.  

---

## Step 2: Add GPG key for a custom APT repository

```
sudo gpg --homedir /tmp --no-default-keyring --keyring /etc/apt/keyrings/scylladb.gpg --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys a43e06657bac99e3
```

###  In plain terms:
This command **downloads and stores ScyllaDB's GPG public key** into your system's keyring directory, so that Ubuntu can **verify the authenticity of ScyllaDB packages** before installing them.



###  Detailed Breakdown:

| Part | Description |
|------|-------------|
| `sudo` | Run with root permissions — required to write to system directories like `/etc/apt/keyrings` |
| `gpg` | GNU Privacy Guard — tool for handling GPG (encryption/signing) keys |
| `--homedir /tmp` | Temporarily uses `/tmp` as the GPG home directory — avoids affecting your default GPG setup |
| `--no-default-keyring` | Prevents GPG from using default keyrings (we're specifying our own) |
| `--keyring /etc/apt/keyrings/scylladb.gpg` | Path where the downloaded ScyllaDB key will be stored |
| `--keyserver hkp://keyserver.ubuntu.com:80` | The public key server to fetch the key from (HTTP-based, port 80) |
| `--recv-keys a43e06657bac99e3` | The specific **ScyllaDB public key ID** to fetch and trust |



###  Why it matters:
APT packages (like ScyllaDB) are **signed with GPG keys**. This command ensures:

✅ Ubuntu **trusts** packages from the ScyllaDB repo  
✅ You're protected against **tampered or malicious packages**

---

## Step 3: adds the ScyllaDB APT repository to your system

```
sudo wget -O /etc/apt/sources.list.d/scylla.list http://downloads.scylladb.com/deb/debian/scylla-6.2.list
```


###  Breakdown:

| Part | Meaning |
|------|---------|
| `sudo` | Run as superuser (root), needed for writing to system directories |
| `wget` | A command-line utility to **download files from the web** |
| `-O /etc/apt/sources.list.d/scylla.list` | Save the downloaded file as `scylla.list` inside APT sources directory |
| `http://downloads.scylladb.com/deb/debian/scylla-6.2.list` | URL pointing to the **ScyllaDB repository list file** for version 6.2 |


###  What it *actually* does:
It **adds the ScyllaDB APT repository** to your system, so you can install Scylla packages using `apt`.

You're telling Ubuntu:
> “Hey, here’s a new source of packages (ScyllaDB). Download this list file and add it to the system.”

This command sets up **ScyllaDB's APT repo** on your system, allowing you to install and update ScyllaDB packages directly using `apt`.

---

## Step 4: Update the system
```
sudo apt-get update
```

## Step 5: Install ScyllaDb
```
sudo apt-get install -y scylla
```

## Step 6: To install a specific patch version, list all the available patch versions
```
apt-cache madison scylla
```
### Then install the selected patch version:
```
apt-get install scylla{,-server,-tools,-tools-core,-kernel-conf,-node-exporter,-conf,-python3}=<your patch version>
```

```
apt-get install scylla{,-server,-tools,-tools-core,-kernel-conf,-node-exporter,-conf,-python3}=5.2.3-0.20230608.ea08d409f155-1
```
---

## Step 7: Install Java in your system
```
sudo apt-get update
sudo apt-get install -y openjdk-11-jre-headless
sudo update-java-alternatives --jre-headless -s java-1.11.0-openjdk-amd64
```

## Configure and Run ScyllaDB

1. Configure the following parameters in the /etc/scylla/scylla.yaml configuration file.

 - cluster_name - The name of the cluster. All the nodes in the cluster must have the same cluster name configured.

  - seeds - The IP address of the first node. Other nodes will use it as the first contact point to discover the cluster topology when joining the cluster.

  - listen_address - The IP address that ScyllaDB uses to connect to other nodes in the cluster.

  - rpc_address - The IP address of the interface for CQL client connections.

2. Run the scylla_setup script to tune the system settings and determine the optimal configuration.
```
sudo scylla_setup
```
  - The script invokes a set of scripts to configure several operating system settings; for example, it sets RAID0 and XFS filesystem.

  - The script runs a short (up to a few minutes) benchmark on your storage and generates the /etc/scylla.d/io.conf configuration file. When the file is ready, you can start ScyllaDB. ScyllaDB will not run without XFS or io.conf file.

  - You can bypass this check by running ScyllaDB in developer mode. We recommend against enabling developer mode in production environments to ensure ScyllaDB’s maximum performance.

3. Run ScyllaDB as a service (if not already running).
```
sudo systemctl start scylla-server
```
