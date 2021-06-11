FROM openjdk:8-jdk-alpine
MAINTAINER melttechdown <melttechdown@gmail.com>
EXPOSE 8080
ARG JAR_FILE=target/kiteconnect-0.0.1.jar
ADD ${JAR_FILE} kiteconnect-0.0.1.jar
ENTRYPOINT ["java","-jar","/kiteconnect-0.0.1.jar"]

#Final image
#docker pull melttechdown/kiteconnect:latest

#Create docker image manually and run
#docker build --tag=kiteconnect:latest .
#docker run -it -p8080:8080 kiteconnect:latest

#Or Use Docker Compose yml to run
#docker-compose up -d
#docker ps -a

#to push to dockerhub use version instead of latest
#sudo docker login -u melttechdown
#melttechdown:kiteconnect melttechdown docker tag kiteconnect:latest melttechdown/kiteconnect:latest
#melttechdown:kiteconnect melttechdown docker push melttechdown/kiteconnect:latest


#Usefull Docker commands
#docker images
#docker ps -a
#docker build -t kiteconnect .
#docker-compose up -d
#docker-compose start
#docker-compose stop
#docker-compose down
#docker container rm  containerid,containerid,...
#docker image rm imageid
#docker container ls -a
#docker build --tag=kiteconnect:latest .
#docker run -p8887:8888 kiteconnect:latest
#docker stop containerid
