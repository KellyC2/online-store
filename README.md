# Online Store - Microservices Architecture

## Overview
This repository contains a collection of microservices that together form the core of a distributed system. Each microservice is designed to handle a specific domain or functionality, promoting modularity, scalability, and maintainability.

## Structure
The project is organized as follows:


## Key Features
- **Modularity**: Each service operates independently, ensuring easier maintenance and scalability.
- **Dynamic Discovery**: Services register and discover each other using Eureka.
- **Centralized Configuration**: Configuration is managed via the Config Service for consistency across environments.
- **API Gateway**: Provides a unified entry point for clients with security and routing features.

## Technologies
- **Spring Boot**: Core framework for building each microservice.
- **Spring Cloud**: Provides tools for service discovery, configuration, and gateway.
- **Eureka**: For service registration and discovery.
- **Spring Security & OAuth2**: Secure the system with authentication and authorization.
- **MySQL & MongoDB**: Used for data persistence depending on the service.

## Prerequisites
- **Java 17** or higher.
- **Maven 3.6.0** or higher.
- **Docker** (optional) for containerized deployment.
- **Eureka Server** for service discovery.

## Running the Microservices
1. **Clone the repository**:
   ```bash
   git clone https://github.com/KellyC2/online-store.git
   cd microservices
