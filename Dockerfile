# Establecer la imagen base de Java
FROM openjdk:17

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR del proyecto al contenedor
COPY target/rdu_ms_login_v1-0.0.1-SNAPSHOT.jar .
#COPY rdu_ms_projects-0.0.1-SNAPSHOT.jar .
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot cuando se inicie el contenedor
CMD ["java", "-jar", "rdu_ms_login_v1-0.0.1-SNAPSHOT.jar"]
