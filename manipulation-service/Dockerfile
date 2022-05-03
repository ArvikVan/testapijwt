FROM gradle:4.7.0-jdk8-alpine AS build
COPY settings.xml /usr/share/maven/conf/settings.xml
COPY . /home/app/src
WORKDIR /home/app/src
RUN --mount=type=cache,target=/root/.m2 gradle dependency:go-offline
RUN --mount=type=cache,target=/root/.m2 gradle -pl manipulation-service clean package



FROM openjdk:8-jre-slim
EXPOSE 8095
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/testapijwt.jar
ENTRYPOINT ["java",\
            "-XX:+UnlockExperimentalVMOptions",\
            "-XX:+UseCGroupMemoryLimitForHeap",\
            "-Djava.security.egd=file:/dev/./urandom",\
            "-jar",\
            "/app/testapijwt.jar"]
