FROM amazoncorretto:17

ARG JAR_FILE
ADD target/votingSystem.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]