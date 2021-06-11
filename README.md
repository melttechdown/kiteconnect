# kiteconnect

## Prerequisites
Java 8.x.x above
Maven 3.6.x above

## How to Build

Add following jar in local maven m2 repository
```console
mvn install:install-file –Dfile=C:\Projects\Git\jars\kiteconnect.jar -DgroupId=com.zerodhatech.kiteconnect -DartifactId=kiteconnect -Dversion=3.1.14 -Dpackaging=jar
```

## Build the project jar
```console
mvn clean install -Dmaven.test.skip=true
```
## Run via either of below two methods
```console
1. mvn spring-boot:run -Dmaven.test.skip=true
2. java - jar target/kiteconnect-0.0.1.jar
```

## Open APIs / Swagger
http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/kite-controller

http://localhost:8080/h2-console/

## Description
To be updated

## Screenshots

![alt text](https://raw.githubusercontent.com/imdadareeph/kiteconnect/main/screenshot/1openapi.png "preview1")
![alt text](https://raw.githubusercontent.com/imdadareeph/kiteconnect/main/screenshot/2db.png "preview2")

