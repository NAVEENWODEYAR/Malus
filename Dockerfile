# Dockerfile - 

FROM openjdk:21

RUN mkdir /usr/app/ 

COPY target/Malus_Domestica_App.jar /usr/app

WORKDIR /usr/app/ 

ENTRYPOINT [ "java","-jar","Malus_Domestica_App.jar" ]