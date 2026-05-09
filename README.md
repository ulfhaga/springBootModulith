# springBootModulith

Sample Spring Boot Modulith application with two HTTP-facing modules and shared
domain events.

## Requirements

- Java 21
- Maven Wrapper (`./mvnw`)

## Build and test

```sh
./mvnw test
```

To run the Spring Modulith structural analysis directly:

```sh
./mvnw -q -DskipTests spring-modulith:analyze
```

## Run

```sh
./mvnw spring-boot:run
```

or:

```sh
./mvnw package
java -jar target/data-*.jar
```

Enable the local profile if you need the H2 browser console at `/h2-console`:

```sh
./mvnw spring-boot:run -Dspring-boot.run.profiles=local
```

## Endpoints

### Module A

```sh
curl -X POST http://localhost:8080/api/module-a/orders/123
```

Expected response:

```text
Order 123 processed by Module A
```

Processing an order publishes `OrderCreatedEvent`.

### Module B

```sh
curl -X POST http://localhost:8080/api/module-b/payments/456
```

Expected response:

```text
Payment 456 handled by Module B
```

Handling a payment publishes `PaymentHandledEvent`.

## Modulith structure

- `modulea` exposes the order endpoint and publishes shared order events.
- `moduleb` exposes the payment endpoint and publishes shared payment events.
- `shared.events` contains public event contracts exposed as a named interface.
- `eventlistener` centralizes event listeners for cross-module reactions.

## Reference Documentation

For further reference, please consider the following sections:

- [Spring Modulith](https://docs.spring.io/spring-modulith/reference/)
