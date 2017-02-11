FROM alpine:3.5

RUN apk --update add openjdk8-jre

ADD gs-spring-boot-0.1.0.jar gs-spring-boot-0.1.0.jar

EXPOSE 8080

CMD ["java", "-jar", "gs-spring-boot-0.1.0.jar"]

