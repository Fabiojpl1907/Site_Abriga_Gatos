**Abriga Gatos - Projeto Integrador - Final** 



<img src="https://s2.loli.net/2022/04/01/ZXzf2mxcRT6UvbO.png" alt="Abriga_Gatos" style="zoom:30%;" />

Readme e sistema :  em construção 

**Objetivo do Site** : Apresentar e gerir trabalhos de uma ONG cujo a ação é retirar gatos da rua , dando um lugar mais adequados a segurança de vidas dos animais. 

**Objetivo** **do projeto** : Site em criação, utilizando as várias técnicas e habilidades aprendidas durante o curso de Técnico de Informática em Internet (Full Stack) do SENAI  Anchieta . em São Paulo-SP

**Repositório Git Hub** : https://github.com/Fabiojpl1907/Site_Abriga_Gatos

**Acesso ao site** 

- Carregar projeto no Intellij ou em sua IDE preferida

- Rodar a classe "*AbrigagatosApplication*" em *src/main/java/com/br/senai/pi/abrigagatos/*

- No browse carregar para acesso publico - "*Localhost:8080/index"*

- No browse carregar para acesso de administrador  - "*Localhost:8080/adm"*

  

**Estrutura do site**

​	**User Interface** - parte do projeto pensada para ser acessada pelo cliente, parceiros e usuários

​		*Index*  - Apresenta menu inicial com opções do site .

​						apresenta um modal construido em javascript que traz o motivo de abrigar os gatos de rua. 

​		

​		*Parceiros* - Apresenta informações sobre os parceiros e permite cadastro de novos parceiros.

​				O cadastro de novos parceiros esta estruturado em  : 

​					java + mvc+ persistencia  de dados

​					validar preenchimento dos campos -  javascript

​					validar CPF / CNPJ -  javascript

​					pesquisar endereço a partir do cep - javascript

​		

​		*Doações* - Pagina que apresenta as varias formas de doações que podem ser feitas . 

​						Montada com  Modal do Bootstrap. 



​		*Contato* - Apresenta formas de contato com Abriga Gatos 

​						Formulario de contato desenvolvido em HTML ( <form> )



​		*Quem somos* -  em construção - mostrará dados sobre a empresa

​					no projeto tem a função de mostrar o conceito de aviso de páginas em construção

​	

​	**Administração** - parte do projeto pensada para a gestão da ONG 

​		*Gerenciar Parceiros* - Apresenta listagem dos Parceiros cadastrados , 

​		contem a funcionalidade  - para atualizar ou deletar desenvolvida em java/mvc/Banco de dados/JPA

​		

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

