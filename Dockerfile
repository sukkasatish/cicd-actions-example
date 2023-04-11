FROM openjdk:17
EXPOSE 8080
ADD target/docker-repository-example1.jar docker-repository-example1.jar
ENTRYPOINT ["java" ,"-jar","docker-repository-example1.jar"]