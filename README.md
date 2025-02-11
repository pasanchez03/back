# Microservicios con Spring Boot y Docker

Este proyecto implementa una arquitectura de microservicios con Spring Boot, Docker y Kafka.

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **PostgreSQL**
- **Docker & Docker Compose**
- **Kafka**

## Configuración y despliegue con Docker

### Levantar los servicios con Docker Compose

```sh
docker-compose up --build
```

Esto iniciará:

- **PostgreSQL** en el puerto `5432`
- **Kafka y Zookeeper**
- **Account** en el puerto `8081`
- **Client** en el puerto `8080`

### Verificar los contenedores

```sh
docker ps
```

Esto mostrará los contenedores en ejecución.