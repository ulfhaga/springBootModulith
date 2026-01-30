# springBootModulith
Testing Spring Boot Modulith

# Run

	mvn spring-boot:run

or

	java -jar target/data-*.jar

# Test Module A
curl -X POST http://localhost:8080/api/module-a/orders/123

# Test Module B
curl -X POST http://localhost:8080/api/module-b/payments/456


## Troubleshooting

    ./mvnw -q -DskipTests spring-modulith:analyze

## Reference Documentation
For further reference, please consider the following sections:

* [Spring Modulith](https://docs.spring.io/spring-modulith/reference/)
