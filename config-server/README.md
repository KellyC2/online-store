# Config Service

## Description
The **Config Service** is a centralized configuration server for managing external properties for applications across all environments. It allows microservices to fetch their configuration from a centralized source, making it easy to manage configurations for multiple services.

## Technologies
- **Java**
- **Spring Boot**
- **Spring Cloud Config Server**
- **Maven**

## Dependencies
- **Spring Cloud Config Server**: Provides configuration management capabilities.
- **Spring Boot Actuator**: Enables monitoring and management of the application.
- **Spring Boot Starter Test**: Provides testing utilities for unit and integration tests.
- **Spring Cloud Dependencies**: Ensures compatibility among Spring Cloud components.

## Features
- Centralized configuration management.
- Environment-specific configurations.
- Secure and efficient configuration retrieval.
- Integration with Git or file system as a backend.

## Prerequisites
- **Java 21** or higher
- **Maven 3.8.0** or higher
- A Git repository or file system for storing configuration files.

## Installation and Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/KellyC2/online-store/config-server.git

