FROM openjdk:21
COPY target/ClownServer-1.0-SNAPSHOT.jar clown.jar
ENTRYPOINT ["java","-jar","clown.jar"]