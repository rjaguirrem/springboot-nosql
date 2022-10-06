# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/#build-image)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#data.nosql.mongodb)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#using.devtools)

### Intellij configuration

- Environment variables:
> spring.profiles.active=mongodb

### Docker command lines

- MongoDB
```sh
# Run in cmd:
$ docker run -p 27017:27017 -d --name mongodb mongo
# Run in docker terminal:
$ mongosh --port 27017
# MySql commands:
> show dbs;
> show collections;
```
Systems Engineer: Raúl J. Aguirre M.