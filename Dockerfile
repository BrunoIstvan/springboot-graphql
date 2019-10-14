FROM openjdk:8-jdk-alpine

RUN mkdir /springboot-graphql

COPY target/springboot-graphql*.jar /springboot-graphql/app.jar

WORKDIR /springboot-graphql

CMD ["sh", "-c", "java -Dspring.profiles.active=$JAVA_ENV -jar app.jar"]