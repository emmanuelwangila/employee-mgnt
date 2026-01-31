# Employee Management Microservices

## Overview
This project is a microservices-based Employee Management system built using Spring Boot. The system provides a robust and scalable solution for managing employee information, including CRUD operations, authentication, and authorization.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Architecture](#architecture)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [License](#license)

## Features
- Employee CRUD operations (Create, Read, Update, Delete)
- Authentication and Authorization
- Service Discovery and Load Balancing
- API Gateway
- Centralized Configuration Management
- Distributed Tracing and Monitoring

## Technologies Used
- **Kotlin**: The primary programming language
- **Spring Boot**: Framework for building microservices
- **Spring Cloud**: Tools for microservice architecture
- **Spring Data JPA**: For database access
- **Spring Security**: For authentication and authorization
- **Eureka**: Service discovery
- **Zuul**: API Gateway
- **Hystrix**: Circuit Breaker
- **Zipkin**: Distributed tracing
- **Docker**: Containerization

## Architecture
The application is structured into several microservices, each responsible for a specific domain of the Employee Management system. The main components are:
1. **Employee Service**: Manages employee data.
2. **Auth Service**: Handles authentication and authorization.
3. **Config Service**: Centralized configuration management.
4. **Eureka Server**: Service registry for service discovery.
5. **API Gateway**: Routing and load balancing.

## Getting Started
### Prerequisites
- Kotlin 1.9 or higher
- Java 17 or higher (required by Spring Boot 3.x)
- Maven
- Docker

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/emmanuelwangila/employee-mgnt.git
   cd employee-mgnt
