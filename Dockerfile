FROM openjdk:11

COPY target/sb_docker_app.jar /usr/app/

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT ["java","-jar","sb_docker_app.jar"]