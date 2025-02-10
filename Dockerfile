# Usa una imagen base de Java
FROM openjdk:17-jdk-slim

# Crea un directorio para la app
WORKDIR /app

# Copia el JAR de la aplicación
COPY target/*.jar app.jar

# Expone el puerto donde corre Spring Boot
EXPOSE 8086

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
