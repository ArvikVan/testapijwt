FROM gradle:4.7.0-jdk8-alpine AS build
COPY settings.xml /usr/share/maven/conf/settings.xml
COPY . /home/app/src
WORKDIR /home/app/src
RUN --mount=type=cache,target=/root/.gradle ./gradlew clean build
RUN mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)



FROM openjdk:8-jdk-alpine
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/testapijwt.jar
ENTRYPOINT ["java",\
            "-XX:+UnlockExperimentalVMOptions",\
            "-XX:+UseCGroupMemoryLimitForHeap",\
            "-Djava.security.egd=file:/dev/./urandom",\
            "-jar",\
            "/app/testapijwt.jar"]
