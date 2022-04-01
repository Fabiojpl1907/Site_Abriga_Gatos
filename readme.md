**Abriga Gatos - Projeto Integrador - Final** 



<img src="https://s2.loli.net/2022/04/01/ZXzf2mxcRT6UvbO.png" alt="Abriga_Gatos" style="zoom:30%;" />

Readme : Versão 1.1 - em construção 

**Objetivo do Site** : Apresentar e gerir trabalhos de uma ONG cujo a ação é retirar gatos da rua , dando um lugar mais adequados a segurança de vidas dos animais. 

**Objetivo** **do projeto** : Site criado para utilizar as várias técnicas e habilidades aprendidas durante o curso de Técnico de Informática em Internet (Full Stack) do SENAI  Anchieta . em São Paulo-SP

**Repositório Git Hub** : https://github.com/Fabiojpl1907/Site_Abriga_Gatos

**Técnicas e Tecnologias utilizadas** **durante o projeto** 

- HTML
-  Bootstrap 5 
- CSS
- JavaScript
- Spring Boot 2.6.6

- Modelo MVC
- Modelo CRUD 
- API REST 
- Maven
- Java 17
- Thymeleaf
- Spring Web
- Spring Dev tools
- Lombok
- Banco de Dados Mysql
- JPA 
- Web Server Tomcat
- IDE Intellij Community 202103
- Editor VSCode

**Estrutura do Projeto** 

- Controller : Contem metodos que recebe a pagina desejada pelo usuário  e mapeia para o arquivo html referente

- Entity : Contem as classes que possue as entidade abstraidas ( Parceiros )  

- Templates : Contem as view ( .html ) de apresentação ao usuário

- Statics : Contem arquivos auxiliares a construção das views ( imagens , css, etc )

- Repository : classe extende os metodos de persistencia do JPA

  

**Acesso ao site** 

- Carregar projeto no Intellij ou em sua IDE preferida
- Rodar a classe "*AbrigagatosApplication*" em *src/main/java/com/br/senai/pi/abrigagatos/*
- No browse carregar "*Localhost:8080/index"*



**Persistencia de dados**

- Uilizado o MySQL
- Caso não exista o sistema cria o banco de dados "*abrigaGatos*" e suas tabelas
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

