ARG baseimage=adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
FROM $baseimage
ARG JAR_FILE=./target/*.jar
ADD ${JAR_FILE} user-service.jar
ENTRYPOINT ["java","-jar", "user-service.jar"]

#FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
#     adoptopenjdk/openjdk11:jre11u-ubuntu-nightly
#ADD ./target/*.jar /user-service.jar

#Запуск с агрументами
#docker-compose build --build-arg baseimage="adoptopenjdk/openjdk11:jre11u-ubuntu-nightly"
#docker-compose up


