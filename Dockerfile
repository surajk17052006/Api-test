FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN chmod +x gradlew && ./gradlew bootJar -x test

EXPOSE 8080

CMD ["sh", "-c", "java -jar build/libs/punedemo2-0.0.1-SNAPSHOT.jar"]