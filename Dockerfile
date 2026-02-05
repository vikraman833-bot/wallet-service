FROM openjdk:17
COPY targe/app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
