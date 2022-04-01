**Abriga Gatos - Projeto Integrador - Final** 

Readme : Versão 1.0 - em construção 

**Objetivo** : Criar site utilizando funcionalidades do Spring MVC dentro do modelo CRUD

**Tecnologias utilizadas**

- Spring Boot 2.6.6
- Maven
- Java 17
- Thymeleaf
- Spring Web
- Spring Dev tools
- Lombok
- Mysql
- JPA 
- Tomcat
- Intellij 

**Estrutura do Projeto** 

- Controller : Contem metodos que recebe a pagina desejada pelo usuário  e mapeia para o arquivo html referente

- Entity : Contem as classes que possue as entidade abstraidas ( Parceiros )  

- Templates : Contem as view ( .html ) de apresentação ao usuário

- Statics : Contem arquivos auxiliares a construção das views ( imagens , css, etc )

- Repository : classe extends os metods de persistencia do JPA

  

**Acesso ao site** 

- Carregar projeto no Intellij ou em sua IDE preferida
- Rodar a classe "*AbrigagatosApplication*" em *src/main/java/com/br/senai/pi/abrigagatos/*
- No browse carregar "*Localhost:8080/index"*



**Persistencia de dados**

- Uilizado o MySQL
- Caso não exista o sistema cria o banco de dados "*abrigaGatos*" 
- Ajustar usuario  e senha para cessso ao SGBD no arquivo "*application.properties*" em src/main/resources/



**Documentos de referencia das tecnologias utilizadas** 

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/#build-image)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)

**Guias**

Os guias a seguir ilustram como usar alguns recursos de forma concreta:

* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

