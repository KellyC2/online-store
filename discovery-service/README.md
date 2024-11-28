# Discovery Service

## Description
The **Discovery Service** is a central component in a microservices architecture, implemented using **Netflix Eureka Server**. It serves as a service registry, enabling dynamic discovery of microservices and facilitating efficient communication between them.

## Technologies
- **Java**
- **Spring Boot**
- **Netflix Eureka Server**
- **Maven**

## Dependencies
- **Spring Cloud Netflix Eureka Server**: Implements the Eureka Server.
- **Spring Boot Starter Test**: Provides testing utilities for unit and integration tests.
- **Spring Cloud Dependencies**: Ensures compatibility between Spring Cloud components.

## Features
- **Service Registration**: Microservices automatically register themselves with the discovery server.
- **Service Discovery**: Enables microservices to discover and communicate with each other without hardcoded network locations.
- **High Availability**: Supports clustering to provide fault tolerance and ensure availability.

## Prerequisites
- **Java 21** or higher
- **Maven 3.8.0** or higher

## Installation and Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/KellyC2/online-store/discovery-service.git
