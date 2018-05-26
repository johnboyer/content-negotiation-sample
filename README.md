# content-negotiation-sample

This project is a simple demo of content negotiation in Spring Boot.

## Build and Run

```
$ ./gradlew build
```
```
$ java -jar build/libs/content-negotiation-sample-1.0-SNAPSHOT.jar
```

## Usage

```
$ curl -X GET \
       http://localhost:8080/ \
       -H 'Accept: text/vnd.example.v2+plain'
$ Hello from version 2.
```

```
$ curl -X GET \
       http://localhost:8080/ 
$ Hello from version 1.
```
