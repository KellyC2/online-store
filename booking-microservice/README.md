# Booking Microservice

## Description
The **Booking Microservice** is a core component of an online store application that manages product bookings, reservations, or appointments. It allows users to book products or services, while also managing booking statuses and customer interactions. This microservice integrates with various other services in a cloud-native, distributed environment to ensure availability and scalability.

---

## Features
- **Booking management**: Allows customers to book products, services, or appointments.
- **Product availability**: Ensures product availability before confirming bookings.
- **Service discovery**: Automatically registers with a **Netflix Eureka** server for dynamic discovery by other microservices.
- **Configuration management**: Uses **Spring Cloud Config** to pull configuration settings from a centralized config server.
- **Secure storage**: Fetches secrets (e.g., API keys, database credentials) securely using **Spring Cloud Vault**.
- **Resilience**: Implements **Resilience4j** for circuit breaking to ensure fault tolerance.
- **Event-driven communication**: Sends booking-related events through **AMQP** (Advanced Message Queuing Protocol) for communication with other services.

---

## Technologies

The **Booking Microservice** leverages the following technologies:

- **Java 21**: The latest version of Java for performance and modern language features.
- **Spring Boot**: A framework to create production-ready applications with ease. It is used for:
    - **spring-boot-starter-data-jpa**: Integrates Java Persistence API (JPA) to work with relational databases like MySQL.
    - **spring-boot-starter-web**: Builds RESTful APIs for booking operations.
    - **spring-boot-starter-actuator**: For production-ready features like health checks and metrics.
- **Spring Cloud**: For building robust microservices:
    - **spring-cloud-starter-netflix-eureka-client**: Service discovery with Netflix Eureka.
    - **spring-cloud-config-client**: Manages external configurations from a Spring Cloud Config Server.
    - **spring-cloud-starter-vault-config**: Securely fetches secrets from HashiCorp Vault.
    - **spring-cloud-starter-bus-amqp**: For inter-service communication using AMQP.
    - **spring-cloud-starter-feign**: Simplifies REST client communication between services.
    - **spring-cloud-starter-circuitbreaker-resilience4j**: Adds fault tolerance to prevent cascading failures in the system.
- **MySQL**: Used as the relational database for storing booking data.
    - **mysql-connector-j**: Provides JDBC connectivity to MySQL.
- **Lombok**: A library that reduces boilerplate code by generating getters, setters, constructors, and other methods.
- **Maven**: Dependency management and build tool.

---

## Requirements

To get started with the **Booking Microservice**, make sure you have the following installed:

- **Java 21** or higher.
- **Maven 3.6.0** or higher.
- **MySQL** database setup.
- **Docker** (optional) for containerization.

---

## Installation

Follow these steps to set up and run the **Booking Microservice** locally:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/KellyC2/online-store/booking-microservice.git
