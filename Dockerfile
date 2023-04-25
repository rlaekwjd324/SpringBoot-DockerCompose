FROM adoptopenjdk:11-jdk-hotspot

CMD ./gradlew build

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} hello.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "hello.jar"]