# **Terragrunt: Documentation**

# **Table of Contents**

1. [Introduction](#introduction)
2. [Purpose of Terragrunt](#purpose-of-terragrunt)
3. [Key Features of Terragrunt](#key-features-of-terragrunt)
4. [Recommended Directory Structure](#recommended-directory-structure)
5. [Terragrunt HCL Example](#terragrunt-hcl-example)
   * [Root terragrunt.hcl](#root-terragrunthcl)
   * [Child terragrunt.hcl](#child-terragrunthcl)
6. [Usage Examples](#usage-examples)
7. [Prerequisites](#prerequisites)
8. [Best Practices](#best-practices)
9. [Terragrunt vs Terraform Comparison](#terragrunt-vs-terraform-comparison)
10. [Conclusion](#conclusion)
11. [Contact / Contributors](#contact--contributors)
12. [References](#references)



## Introduction
This document is about Terragrunt and it's uses in Terraform. It also aims to reduce boilerplate code, promote best practices, and simplify configuration management and DRY (Don't Repeat Yourself) principles.
## **What is Terragrunt**?
**Terragrunt** is a thin wrapper over Terraform that provides extra tools for managing multiple Terraform modules, especially in large, complex infrastructures. 


## **Purpose of Terragrunt**

| **Purpose**                 | **Description**                                                                                                      |
| --------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| **Reusable Modules**        | Manage reusable Terraform modules across multiple environments and teams.                                            |
| **Remote State Management** | Simplify and standardize backend configuration (e.g., S3 + DynamoDB) for storing Terraform state.                    |
| **Dependency Handling**     | Support dependencies across modules with explicit and automatic ordering of resources.                               |
| **DRY Configuration**       | Reduce duplication by inheriting shared configurations using `include` and common `terragrunt.hcl` files.            |


---

## **Key Features of Terragrunt**

| Feature                                | Description                                                          |
| -------------------------------------- | -------------------------------------------------------------------- |
| `Keep Your Terraform DRY`              | Share common code via `terragrunt.hcl` configuration files.          |
| `Built-in Dependency Management`       | Supports explicit dependencies between modules.                      |
| `Before/After Hooks`                   | Automate additional actions around Terraform commands.               |
| `Multi-Environment Support`            | Promote code between dev, staging, prod easily.                      |
| `CLI Inheritance and Overlays`         | Reuse configurations with includes and inheritance.                  |


---

## **Recommended Directory Structure**

```
infrastructure-live/
├── terragrunt.hcl              # Root configuration
├── dev/
│   └── vpc/
│       └── terragrunt.hcl
├── staging/
│   └── vpc/
│       └── terragrunt.hcl
├── prod/
│   └── vpc/
│       └── terragrunt.hcl

infrastructure-modules/
└── vpc/
    ├── main.tf
    ├── variables.tf
    └── outputs.tf
```

* `infrastructure-modules/`: Contains reusable Terraform modules.
* `infrastructure-live/`: Contains environment-specific configurations using Terragrunt.

---

## **Terragrunt HCL Example**

### Root `terragrunt.hcl`

```hcl
locals {
  region = "us-east-1"
}

remote_state {
  backend = "s3"
  config = {
    bucket         = "my-terraform-state"
    key            = "${path_relative_to_include()}/terraform.tfstate"
    region         = local.region
    dynamodb_table = "terraform-locks"
    encrypt        = true
  }
}
```

### Child `terragrunt.hcl` (e.g., `dev/vpc/terragrunt.hcl`)

```hcl
include {
  path = find_in_parent_folders()
}

terraform {
  source = "../../modules/vpc"
}

inputs = {
  name       = "dev-vpc"
  cidr_block = "10.0.0.0/16"
}
```


## **Usage Examples**

### Initialize:

```bash
terragrunt init
```

### Plan:

```bash
terragrunt plan
```

### Apply:

```bash
terragrunt apply
```

### Destroy:

```bash
terragrunt destroy
```

### Run All (in subdirectories):

```bash
terragrunt run-all apply
```



## **Prerequisites**

| Tool               | Version                       |
| ------------------ | ----------------------------- |
| **Terraform**          | v1.x.x                        |
| **Terragrunt**         | v0.55+                        |
| **AWS CLI**  | Configured for backend access |
| **Git**                | For module version control    |
| **S3 + DynamoDB**      | For remote state and locking  |

---

## **Best Practices**

| **Best Practice**                    | **Description**                                                                                                            |
| ------------------------------------ | -------------------------------------------------------------------------------------------------------------------------- |
| **Use Remote State with Locking**    | Always configure the backend with S3 and DynamoDB to ensure safe and consistent state storage with locking.                |
| **Separate Live vs Module Code**     | Keep `infrastructure-live` and `infrastructure-modules` in different directories to maintain clear separation of concerns. |
| **Use `include {}` for Reusability** | Share common configuration like backend and providers using the `include` block in `terragrunt.hcl`.                       |
| **Keep Modules Generic**             | Avoid hardcoding values inside modules; make them reusable across environments through variables.                          |
| **Use `inputs = {}` in Terragrunt**  | Define input variables inside `terragrunt.hcl` instead of using CLI flags like `-var`.                                     |
| **Explicit Dependencies**            | Declare inter-module dependencies using the `dependencies` block to ensure correct resource order.                         |
| **Test in Dev Before Prod**          | Validate all changes in development before promoting them to higher environments.                                          |
| **Lint and Validate**                | Use tools like `terragrunt hclfmt` and `terragrunt validate` in CI pipelines to ensure quality and correctness.            |
| **Use `run-all` Cautiously**         | Run Terragrunt commands across multiple modules only in well-structured folders to avoid accidental changes.               |
| **Version Locking**                  | Pin specific versions of Terraform and Terragrunt using `.terraform-version` or documentation to ensure consistency.       |


---

## **Terragrunt vs Terraform Comparison**

| Feature                   | Terraform        | Terragrunt                |
| ------------------------- | ---------------- | ------------------------- |
| **DRY Principle**             | No               | Yes                       |
| **Remote State Management**   | Manual setup     | Auto-configured           |
| **Multi-Environment Support** | Manual scripting | Built-in                  |
| **Dependency Graph**          | Limited          | Native dependency support |
| **Before/After Hooks**        | No               | Yes                       |
| **CLI Simplicity**            | Simple           | Slightly more complex     |


## **Conclusion**

Terragrunt enhances Terraform by enabling DRY configurations, automating backend setups, managing complex dependencies, and facilitating multi-environment infrastructure. For teams managing large infrastructure footprints, Terragrunt is a must-have layer to organize and streamline Terraform usage beyond expectations.

## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |



## **References**

| **Reference**                                                        | **Description**                                                                  |
| -------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| [Link](https://terragrunt.gruntwork.io/)     | **Official Terragrunt Docs**              |
| [Link](https://developer.hashicorp.com/terraform/docs) | **Terraform Docs** |
