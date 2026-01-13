# Product Service

Product Service is a Spring Boot microservice responsible for managing
product data such as price, quantity, and discount.

It is consumed by Order Service to validate product availability before
placing an order.

---

## Tech Stack
- Java
- Spring Boot 2.7.x
- Spring Data JPA
- MySQL
- Eureka Client

---

## Responsibilities
- Manage product information
- Provide product price, discount, and available quantity
- Validate product availability for orders

---

## APIs
- `GET /product?id={productId}`
  - Returns product details
  - Used by Order Service during order placement

---

## Inter-Service Communication
- Exposes REST APIs consumed by **Order Service**
- Registered with Eureka Server for service discovery

---

## Exception Handling
- Handles product not found scenarios
- Global exception handling using `@RestControllerAdvice`
- Returns consistent error responses

---

## How to Run
1. Start Eureka Server
2. Start Product Service
3. Verify registration in Eureka Dashboard
4. Test APIs using Postman

---
## Related Repositories
- Service Registry: https://github.com/sakshi-athare/service-registry
- User Service: https://github.com/sakshi-athare/user-service
- Order Service: https://github.com/sakshi-athare/order-service


## Future Improvements
- Inventory management enhancements
- Add product categories
- Implement caching for frequently accessed products
