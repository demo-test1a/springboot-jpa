FROM openjdk:8-jdk-alpine
RUN  adduser -D bhavani
USER bhavani
ADD target/spring-boot-jpa-demo-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
