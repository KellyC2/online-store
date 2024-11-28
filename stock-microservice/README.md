# Stock Microservice

## Description

**Stock Microservice** is part of a larger e-commerce platform that manages the inventory and stock levels of products. This microservice handles operations such as tracking product quantities, updating stock levels, and ensuring synchronization with other services in the ecosystem. It integrates with databases and other services using Spring Cloud components and OAuth2 for secure API access.

The Stock Microservice leverages Spring Boot, Spring Cloud, MySQL, and JPA to provide a scalable and secure solution for managing stock data.

## Features

- CRUD operations for managing stock items.
- Integrates with **Spring Cloud Config** for centralized configuration management.
- **MySQL** for persistent storage of stock-related data.
- **Spring Security** and **OAuth2** for securing the microservice endpoints.
- Service registration and discovery with **Netflix Eureka**.
- Integration with **Spring Cloud Bus** for event-driven architecture.
- Vault integration for managing secrets and sensitive information.
- Spring Boot Actuator for monitoring and managing the application.

## Technologies Used

- **Java 21**
- **Spring Boot** (version 3.x)
- **Spring Cloud** (for microservices architecture)
- **JPA**: Java Persistence API for data persistence.
- **MySQL**: Relational database for storing stock information.
- **Spring Security**: For securing APIs and enabling OAuth2 authentication.
- **Spring Cloud Config**: For centralized configuration management.
- **Spring Cloud Vault**: For secure management of sensitive information.
- **Spring Cloud Bus**: Event-driven communication between services.
- **Lombok**: Reduces boilerplate code.

## Dependencies

- **spring-boot-starter-data-jpa**: JPA support for database access and persistence.
- **spring-boot-starter-oauth2-resource-server**: OAuth2 resource server for securing APIs.
- **spring-boot-starter-security**: Provides Spring Security for authentication and authorization.
- **spring-boot-starter-web**: To build RESTful web services.
- **spring-cloud-starter-bus-amqp**: For event-driven architecture using AMQP.
- **spring-cloud-config-client**: To fetch configuration from the Spring Cloud Config server.
- **spring-cloud-starter-netflix-eureka-client**: For service discovery and registration with Eureka.
- **spring-cloud-starter-vault-config**: For integrating with Vault for sensitive data management.
- **mysql-connector-j**: MySQL database connector.
- **lombok**: To reduce boilerplate code in model classes.
- **spring-boot-starter-test**: For unit and integration testing.
- **spring-security-test**: For testing security features.
- **spring-cloud-starter-bootstrap**: For early-stage application configuration loading.

## Prerequisites

- **Java 21** or higher.
- **Maven 3.6.0** or higher.
- **MySQL**: A running MySQL instance.

## Installation

Follow these steps to set up the **Stock Microservice**:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/KellyC2/online-store/stock-microservice.git
