FROM openjdk:17

WORKDIR /app

COPY rdu_ms_login_v1-0.0.1-SNAPSHOT.jar .
EXPOSE 8080

ENTRYPOINT ["java", "-Ddb.name=${DB_NAME}", "-Ddb.host=${DB_HOST}", "-Ddb.user=${DB_USER}", "-Ddb.password=${DB_PASS}", "-jar", "rdu_ms_login_v1-0.0.1-SNAPSHOT.jar"]
