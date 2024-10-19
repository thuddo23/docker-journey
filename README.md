> Docker is a tool that lets you package software into these standardized containers. Each container has everything the software needs to run: code, libraries, system tools, etc. It's like a self-sufficient unit.
>

simple summarize:  A tool that package software to enable it to run on any hardware.

## Key Components

### Dockerfile

- This is a simple text file that contains instructions for building a Docker image. It specifies the base image, the application code, dependencies, and other configurations

simple summarize: Think like a blueprint to create image

[Docker Image](https://www.notion.so/Docker-Image-12272d29d50f8042b46ef40efff5ec14?pvs=21)

- **Read-only templates:** Think of them as templates for creating containers. They contain the application code, libraries, dependencies, and other files needed to run the software.
- **Layered structure:** Images are built in layers, where each layer represents a change to the image. This makes them efficient to store and transfer, as only changed layers need to be transmitted.
- **Immutable:** Once created, an image cannot be modified. This ensures consistency and reliability.

simple summarize: Think like a template

### Container

- **Runnable instances of images:** When you run an image, you create a container. It's a lightweight, standalone, executable package of software.
- **Isolated environment:** Each container runs in its own isolated environment with its own file system, processes, and network resources.
- **Dynamic and ephemeral:** Containers can be created, started, stopped, and deleted as needed. They are designed to be ephemeral, meaning they can be easily replaced.
- Different from VMs


    | Feature | Virtual Machine | Container |
    | --- | --- | --- |
    | Definition | A software-based computer that runs on a hypervisor. | A software package that contains everything needed to run an application. run on Runtime engine |
    | Isolation | Provides complete isolation of the guest OS and applications. | Shares the host OS's kernel, but provides isolation at the process level. |
    | Resource management | Each VM has its own dedicated resources, such as CPU, memory, and disk space. | Containers share the host's resources, but their usage can be limited through resource quotas. |
    | Portability | Can be easily migrated between different hosts. | Can be run on any platform that supports the container runtime environment. |
    | Performance | Generally slower than physical machines due to the overhead of the hypervisor. | Faster than VMs because they don't need a separate guest operating system. |
    | Cost | More expensive than containers, especially for large deployments. | Less expensive than VMs, especially for small deployments. |
    | Complexity | More complex to manage than containers. | Easier to manage than VMs. |
    
    primary points: containers run on runtime engine, shared the host OS’s kernel, isolation at the process level. it’s much faster and lighter than VMs


simple summarize: When you run an image, you create a container.

## Benefits

**1. Portability:**

- Docker containers package everything to an application needs to run, highly portable across different environments.
- This allows for easy application migration between environments, from local development to cloud deployment, without compatibility concerns.

**2. Consistency:**

- Docker ensures that your application runs the same way regardless of the underlying infrastructure.

**3. Efficiency:**

- Docker containers are lightweight, share the host OS kernel, and use resources more efficiently than virtual machines.
- This translates to lower costs and improved performance.

**4. Isolation:**

- Docker containers isolate applications from each other and the host system, enhancing security and stability.
- This prevents conflicts, enhances security, and ensures that one application's failure doesn't affect others.

**5. Scalability:**

- Docker makes it easy to scale applications horizontally by creating and managing multiple containers.
- This is particularly useful for handling fluctuating workloads and ensuring high availability.

**6. Version control and rollback, faster development and deployment, etc**

### Questions:

- **Q**: What is Docker?

  **A**: Traditionally, deploying software to servers or the cloud was very difficult and complex, requiring extensive setup and configuration of OS, libs, and frameworks. Docker is a tool that packages all dependencies (code, libraries, frameworks, languages, system components, etc.) together, allowing the software to run on any server with Docker's runtime engine installed.

  shorter:  A tool that package software to enable it to run on any hardware.

- **Q**: What is the difference between container and VM?

  **A**: Both containers and VMs serve similar purposes, but containers share the host OS's kernel while providing isolation at the process level, then it’s faster and lighter. While both use virtualization concepts, containers don't provide complete virtualization like VMs do.

- **Q**: What if we run a docker ubuntu on window OS server?

  **A**: The key is compatibility.

        Yes,  Linux-base containers can run on Windows because window have WSL, which provides a full Linux environment.
    
       However, Windows-based Docker images can't run directly on Linux. To run Windows containers on Linux, you'd need to install a Windows VM and run the container within it.

- **Q**: What is docker Image?

  **A**: A snapshot, contains everything that needed to build, run program, like os, libs, frameworks, versions, and instructions, steps, …

- **Q:** How many way to run a program on Linux:
    - First: Manually set up the environment. You need to configure the OS, install necessary libraries, and adapt the system to meet program requirements. Then, you run each part of the program step by step.
    - Second: Use a VM. You already have all the necessary configurations, but you still need to run each part of the program step by step.
    - Third: Docker, which only requires running an image.
- Q: How to interact with software inside container:

  A: use mapping port like 8080:80 or 3606:3606

- Q: How to software in different containers interact with?

  A: By default, Docker creates a `bridge` network that new containers join. However, you can create your own networks (e.g., `my-network`) and specifically assign containers to them. This provides better isolation and organization.