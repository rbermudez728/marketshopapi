FROM openjdk:8-jdk-alpine
LABEL publisher=riberos.ga
VOLUME ./tmp
EXPOSE 8080
ADD build/libs/marketshopapi-0.0.1-SNAPSHOT.jar marketshopapi.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/marketshopapi.jar"]