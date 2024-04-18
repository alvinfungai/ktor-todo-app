FROM openjdk:21
EXPOSE 8080:8080
RUN mkdir /app
COPY ./build/libs/*-all.jar /app/ktor-todo-app.jar
ENTRYPOINT ["java","-jar","/app/ktor-todo-app.jar"]