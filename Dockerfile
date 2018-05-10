FROM openjdk:8-jdk-alpine
VOLUME /tmp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","code/redis-0.0.1-SNAPSHOT.jar"]