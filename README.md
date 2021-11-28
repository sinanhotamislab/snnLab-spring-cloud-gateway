# snnLab Project - API Gateway

* This project provides the Gateway needs on snnLab Microservice Architecture experimental.
* application.yaml is important for router, predicate and any filter configurations.
* Api Gateway provides Token Relay flow as Resource Server integrating with Okta.
* To be added Spring Security, Cors Config must be added on SecurityConfig class.
* To be added spring-cloud-starter-circuitbreaker-reactor-resilience4j for all gateway router circuit breaker needs.
* Service discovery is provided by server on snnlab-service-discovery repository.

# Subscribed Services

* snnlab-ms1  (https://github.com/sinanhotamis/snnlab-ms1)

# Technologies

* Spring Cloud Gateway
* Spring Security
* Okta Spring  
* Embedded Netty Server
* spring-cloud-starter-circuitbreaker-reactor-resilience4j
* Eureka Client

