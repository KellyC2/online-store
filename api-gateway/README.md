# API Gateway

## Overview
The **API Gateway** is a central entry point for managing and routing all incoming requests to the appropriate microservices in a distributed system. It provides functionalities such as routing, load balancing, authentication, and more.

## Key Features
- **Routing**: Forwards requests to appropriate microservices.
- **Load Balancing**: Distributes incoming requests across multiple instances.
- **Security**: Supports OAuth2 and integrates with Spring Security.
- **Discovery Client**: Works with Eureka for dynamic service discovery.
- **Scalability**: Can handle high volumes of traffic efficiently.

## Technologies Used
- **Spring Cloud Gateway**: Provides routing and load balancing features.
- **Eureka Client**: Enables service discovery.
- **Spring Security**: For securing the API Gateway.
- **OAuth2 Client**: Handles token-based authentication for secure communication.
- **Spring Boot Test**: Provides tools for testing the application.

## Prerequisites
- **Java 17** or higher.
- **Maven 3.6.0** or higher.
- **Eureka Server**: Required for service discovery.

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/KellyC2/online-store/api-gateway.git
   cd api-gateway
