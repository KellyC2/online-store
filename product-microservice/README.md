# Product Microservice

## Description

**Product Microservice** is part of an e-commerce application, providing a robust and scalable solution to manage product-related data. It utilizes **Spring Boot** for building a RESTful API that interacts with **MongoDB** for storing product data. The service supports features like product management, integration with other microservices, and authentication using OAuth2 for secure access.

## Features
- CRUD operations for managing products.
- Integration with **Spring Cloud Config** for centralized configuration management.
- **MongoDB** as the database for persistent storage.
- **Spring Security** for authentication and authorization.
- **Spring Cloud** integration for microservice discovery with **Netflix Eureka** and **Spring Cloud Bus**.
- API security with **OAuth2** resource server.

## Technologies Used
- **Java 21**
- **Spring Boot** (version 3.x)
- **MongoDB**: NoSQL database for storing product data.
- **Spring Cloud**: Microservice architecture components.
- **Spring Security**: For securing the microservice APIs.
- **OAuth2**: Authentication for securing endpoints.
- **Lombok**: To reduce boilerplate code.

## Dependencies
- **spring-boot-starter-data-mongodb**: MongoDB integration for Spring Boot.
- **spring-boot-starter-web**: To create RESTful web services.
- **spring-cloud-starter-netflix-eureka-client**: For service registration and discovery with Eureka.
- **spring-cloud-config-client**: To fetch configuration from the Spring Cloud Config server.
- **spring-cloud-starter-bootstrap**: For early application configuration setup.
- **spring-cloud-starter-vault-config**: For integrating with HashiCorp Vault for secrets management.
- **spring-cloud-starter-bus-amqp**: Event-driven architecture for communication across microservices.
- **spring-boot-starter-oauth2-resource-server**: To secure REST endpoints using OAuth2.
- **spring-security-oauth2-jose**: To enable OAuth2 token validation using JWT.
- **spring-boot-starter-security**: For security-related features like authentication and authorization.

## Prerequisites
- **Java 21** or higher.
- **Maven 3.6.0** or higher.
- **MongoDB**: You must have a running MongoDB instance.

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/KellyC2/online-store/product-microservice.git
