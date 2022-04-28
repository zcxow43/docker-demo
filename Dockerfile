FROM java:8
EXPOSE 8080
ADD target/rest-0.0.1-SNAPSHOT.jar docker-demo.jar
ENTRYPOINT ["java","-jar","docker-demo.jar"]