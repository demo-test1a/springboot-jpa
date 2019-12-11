FROM openjdk:8-jdk-alpine
RUN  adduser -D barath
USER barath
ADD target/spring-boot-jpa-demo-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
