FROM openjdk:8-jre-alpine

ENV APPLICATION_USER worker
RUN adduser -D -g '' $APPLICATION_USER

RUN mkdir /app
RUN chown -R $APPLICATION_USER /app

USER $APPLICATION_USER

COPY ./build/libs/entur-mock-kafka-producer-fat-1.0.0-SNAPSHOT.jar /app/entur-producer.jar
WORKDIR /app

CMD ["java", "-jar", "entur-producer.jar"]
