FROM bellsoft/liberica-openjdk-alpine:17

CMD ["./gradlew", "clear", "build"]

VOLUME /tmp

ARG JAR_FILE=build/libs/sf-backend-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ADD ${JAR_FILE} sf-backend-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]