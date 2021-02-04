# hibernatejpa-mhajwsbi100s
## Repositorio del curso
```
https://github.com/in28minutes/jpa-with-hibernate
```

## Introduccion a Spring Boot
```
Features:
- Quick Starter Projects with auto configuration:Web,JPA
- Embedded Servers tomacat jetty or undertow
- Production-ready features:
	- metrics and health checks
	- externalized configuration	 

```

## Desarrollar aplicaciones sin SpringBoot
```
- Que framework debo usar?
- Que versiones usar y si son compatibles
- Implement exception handling
- Create Spring configuration file
- Component scan
- Configure ViewResolver
- Configure web.xml
- Configure DispatServlet
- Configure Spring Security
```
## Spring Initializr
```
- Ir a start [Spring Initializr](https://start.spring.io/) 
```

## @SpringBootApplication
```
- Indica que es una archivo del contexto de Spring
- activa AutoConfiguration
- activa el ComponentScan
```
## Setting up JDBC,JPA,H2 AND WEB DEPENDENCIES
```
- maven project
- java
- spring boot version
- dependencies:jpa,h2,jdbc,web
```
## Launching up H2 Console
```
Al correr tu aplicacion de Spring boot
	http://localhost:8081/h2-console/

Saved Settings : Generic H2
Setting Name: Generic H2
Driver class: org.h2.Driver

La URL se muestra en consola, como es una base temporal se modifica cada vez que se despliega la aplicación
jdbc url: jdbc:h2:mem:testdb 
jdbc url: jdbc:h2:~/test

Default:
user:sa
password:[vacio]
En mi caso:
user:[vacio]
password:[vacio]
```

## File data.sql
```
Este archivo se crea para generar nuestros scripts de H2 por default
```

## Testing
```
Testing is done to make sure that the funcionality of the application is as expected,check whether the application is behaving as expected.
```

## Unit testing
```
is testing a specific method or a class
```







