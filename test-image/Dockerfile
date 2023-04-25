FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app

COPY target/test-image-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "test-image-0.0.1-SNAPSHOT.jar"]