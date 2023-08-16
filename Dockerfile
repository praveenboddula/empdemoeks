FROM openjdk:8-alpine

EXPOSE 8080

ADD target/springbootjdbc-1.0.0.jar emp-demo.jar

ENTRYPOINT ["java" ,"-jar","emp-demo.jar"]