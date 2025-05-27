
# **Document: React Code Compilation**

<img src="https://github.com/user-attachments/assets/30d6675c-f4ea-4bdb-95eb-9ad4b2ae3b20" width="300"/>








##  **Author Information**
| Last Updated | Version | Author          | Comment           | Reviewer |
|--------------|---------|------------------|-------------------|----------|
| 21-05-2025   | V1.1    | Adil Nawaz   | Internal Review   | Pritam   |
| 22-05-2025   | V2.0    | Adil Nawaz   | L0                | Shreya   |
| 00-05-2025   | V3.0    | Adil Nawaz   | L1               | Abhishek V   |



## **Table of Contents**

1. [Introduction](#introduction)
2. [What is Code Compilation?](#what-is-code-compilation)
3. [Why Code Compilation Important?](#why-code-compilation-important)
4. [Workflow Diagram](#workflow-diagram)
5. [Different Tools for Compilation Checks](#different-tools-for-compilation-checks)
6. [Tool Comparison Table](#tool-comparison-table)
7. [Advantages of Compilation Checks](#advantages-of-compilation-checks)
8. [Proof Of Concept (POC)](#proof-of-concept-poc)
9. [Best Practices](#best-practices)
10. [Conclusion](#conclusion)
11. [Contact Information](#contact-information)
12. [References](#references)

---





## **Introduction**

This documentation explains how to perform compile code analysis on a React project. It covers setup, execution, and how to review results to ensure code quality and maintainability.

## **What is Code Compilation?**
Code compilation is the process of converting source code written in a programming language into executable machine code. In React, this process involves using tools like Babel and Webpack (or Vite) to transform modern JavaScript/JSX into browser-compatible JavaScript.


## **Why Code Compilation Important?**

| Reason                         | Explanation                                                                                   |
| ------------------------------ | --------------------------------------------------------------------------------------------- |
|  **JSX to JavaScript**        | JSX is not valid JavaScript. Compilation converts it to `React.createElement()` calls.        |
|  **Browser Compatibility**   | Converts modern JS (e.g., `let`, `async/await`, optional chaining) to ES5 for older browsers. |
|  **Module Bundling**         | Merges hundreds of JS files/modules into efficient bundles to load in browsers.               |
|  **Performance Optimization** | Tools like Webpack or Vite optimize code for production (tree-shaking, minification).         |
|  **Early Error Detection**   | Compilation errors alert you to invalid syntax or incompatible code before runtime.           |



---

## **Workflow Diagram**

![React drawio](https://github.com/user-attachments/assets/97f087b2-992e-4713-bc72-20697d77abac)


| Tool        | Role                                                                                                                                       |
| ----------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
| **Babel**   | Converts modern JavaScript (ES6+) and JSX into plain JavaScript (ES5) that browsers can understand.                                        |
| **Webpack** | Bundles all your project files (JavaScript, CSS, images, etc.) into optimized files (e.g., `bundle.js`) that can be loaded by the browser. |




| **Command**         | **Description**                                                                                                                                                                                                                                  |
| ------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| **`npm install`**   | Installs all dependencies listed in `package.json`. Creates a `node_modules` folder for installed packages and a `package-lock.json` file to lock versions. Also installs transitive (nested) dependencies.                                      |
| **`npm run build`** | Executes the `build` script from `package.json`, usually using tools like Babel and Webpack. It transpiles, bundles, and optimizes code by removing comments, whitespace, and unused code. Generates a `build` folder for production deployment. |



## **Different Tools for Compilation Checks**

| Tool               | Description                                     |
| ------------------ | ----------------------------------------------- |
| **Babel**          | Transpiles JSX and modern JS to older versions  |
| **Webpack**        | Bundles JS modules and assets                   |
| **Vite**           | Fast dev server and bundler for modern projects |
| **ESBuild**        | Extremely fast bundler/transpiler               |
| **CRA** | CRA uses Webpack and Babel under the hood. |
---

## **Tool Comparison Table**

| **Tool**                               | **Used With**                    | **Setup**            | **Speed**   | **Customization** | **Production Ready** | **Use Case**                                         |
| -------------------------------------- | -------------------------------- | -------------------- | ----------- | ----------------- | -------------------- | ---------------------------------------------------- |
| **Create React App** (`react-scripts`) | Beginners, small–medium projects | Zero config          | Medium      | Limited           | Yes                  | Easiest way to start React projects with defaults    |
| **Vite**                               | Modern React, Vue, etc.          | Minimal config       | Very Fast   | High              | Yes                  | Modern dev experience and lightning-fast HMR         |
| **Webpack**                            | Advanced React apps              | Manual config        | Slower      | Very High         | Yes                  | Full control over bundling, used in large codebases  |
| **Parcel**                             | Small to medium apps             | Zero config          | Fast        | Moderate          | Yes                  | Good balance between config-free and performance     |
| **Next.js**                            | React + SSR/SPAs                 | Slightly opinionated | Medium      | High              | Yes                  | Ideal for SSR, hybrid static & dynamic React sites   |

---

## **Advantages of Compilation Checks**

| Benefit    | Description                            |
| ---------- | -------------------------------------- |
| **Detection**  | Detect syntax/structural issues early. |
| **Efficiency** | Save QA/testing time and effort.       |
| **Automation** | Eliminate manual compilation.          |

---
## **Proof Of Concept (POC)**
> **NOTE:**   
> We are using **Frontend** for React Code Compilation.  
> Refer to the official POC documentation for complete steps: [Code Compilation POC](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-150-Adil/application-ci/checks/react/code-compilation/poc/README.md) 



## **Best Practices**

| Best Practice      | Description                                                   |
| ------------------ | ------------------------------------------------------------- |
| **Include Build**      | Always include `npm run build` in CI pipelines.               |
| **No Cache**           | Use `--no-cache` to avoid stale build artifacts.              |
| **Commit Lockfile**    | Ensure `package-lock.json` is committed.                      |
| **Cache Dependencies** | Isolate `node_modules` and cache intelligently.               |


---

## **Conclusion**

Create React App (CRA) uses Webpack and Babel under the hood to handle code compilation. When you run the build process, the source files inside the `src/` directory are transpiled, bundled, and optimized. The final output is placed in the `build/` directory, which contains static assets ready to be deployed to any web server.


---
## Contact Information

| Name         | Email Address                                 |
|--------------|-----------------------------------------------|
| Adil Nawaz | adil.nawaz.snaatak@mygurukulam.co           |

---

## **References**
| **Resource**          | **Link**                                                                                       |
| --------------------- | ---------------------------------------------------------------------------------------------- |
| React Official Docs   | [link](https://reactjs.org/docs/getting-started.html) |
| Babel Documentation   | [link](https://babeljs.io/docs/)                                           |
| Webpack Documentation | [link](https://webpack.js.org/)                                             |
| Vite Documentation    | [link](https://vitejs.dev/)                                                     |
| ESBuild Docs          | [link](https://esbuild.github.io/)                                       |
| Code Compilation POC |  [link](https://github.com/snaatak-Downtime-Crew/Documentation/blob/SCRUMS-150-Adil/application-ci/checks/react/code-compilation/poc/README.md) |






