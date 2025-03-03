**Abriga Gatos - Projeto Integrador - Final** 

<img src="https://s2.loli.net/2022/04/06/xn5fLWwQHtMe2ph.png" alt="Abriga_Gatos" style="zoom:30%;" />

*Resumo ( Via ChatGPT)*
O projeto Abriga Gatos visa criar um site para a gestão e apresentação dos trabalhos de uma ONG dedicada ao resgate de gatos de rua, oferecendo um ambiente seguro para os animais. Desenvolvido por Fábio José Pereira Lima como parte do curso de Técnico de Informática em Internet (Full Stack) no SENAI Anchieta, o site utiliza tecnologias como Java, Spring Boot, MySQL, Bootstrap e API REST. A plataforma permite cadastro de parceiros, gerenciamento de doações e administração da ONG. O código-fonte está disponível no GitHub e o acesso ao sistema ocorre via localhost:8080 em diferentes seções para usuários e administradores.


**Aluno** : Fábio José Pereira Lima

**Objetivo do Site** : Apresentar e gerir trabalhos de uma ONG cujo a ação é retirar gatos da rua , dando um lugar mais adequados a segurança de vidas dos animais. 

**Objetivo** **do projeto** : Criar site, utilizando as várias técnicas e habilidades aprendidas durante o curso de Técnico de Informática em Internet (Full Stack) do SENAI  Anchieta . em São Paulo-SP . 

**Status atual** : projeto em desenvolvimento 

**Repositório Git Hub** : https://github.com/Fabiojpl1907/Site_Abriga_Gatos

**Acesso ao site** 

- Carregar projeto no Intellij ou em sua IDE preferida

- Rodar a classe "*AbrigagatosApplication*" em *src/main/java/com/br/senai/pi/abrigagatos/*

- No browse carregar para acesso publico : "*localhost:8080/index"*

- No browse carregar para acesso de administrador  : "*localhost:8080/adm"*

- Coleta de Doações - API Rest - em ferramenta Postman ou similar acessar : "*localhost:8080/doadores"*

  

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

​		*Doações  (Pagina)* - apresenta as varias formas de doações que podem ser feitas . 

​						Montada com  Modal do Bootstrap. 

​					*Doações (Coleta)* : a titulo de aprendizado foi considerado que a coleta de doações serão
​													administradas por uma empresa parceira, que envia para o banco de dados
​													 AbrigaGatos, via uma api Rest, as doações coletadas em formato JSON
​													 (ver seção JSON+Postman ao final do readme) . 



​	*Contato* - Apresenta formas de contato com Abriga Gatos 

​						Formulario de contato desenvolvido em HTML ( <form> )



​		*Quem somos* -  em construção - mostrará dados sobre a empresa

​					no projeto tem a função de mostrar o conceito de aviso de páginas em construção

​	

​	**Administração** - parte do projeto pensada para a gestão da ONG 

​		*Gerenciar Parceiros* - Apresenta listagem dos Parceiros cadastrados , 

​		contem a funcionalidade  - para atualizar ou deletar desenvolvida em java/mvc/Banco de dados/JPA

​		

**Técnicas e Tecnologias utilizadas** **durante o projeto** 

| Linguagens, IDEs & Cia                                       | Frameworks,Ferramentas & Modelos |
| ------------------------------------------------------------ | -------------------------------- |
| HTML                                                         | Bootstrap 5                      |
| CSS                                                          | Google Fontes                    |
| Java 17                                                      | Spring boot 2.6.6 - Maven        |
| Javascript                                                   | MVC                              |
| JSON                                                         | CRUD                             |
| IDE Intellij Community 202103 <br />Back-End e consolidação do projeto | API REST                         |
| VSCode ( Front End - HTML + CSS + Bootstrap)                 | Thymeleaf                        |
| Typora - Editor markdown para criar readme                   | Spring Web                       |
| MySQL - Banco de Dados Relacional                            | Spring Dev tools                 |
| Git Hub - repositorio do projeto                             | Lombok                           |
|                                                              | JPA                              |
|                                                              | Javax                            |
|                                                              | Tomcat - Web Server              |

**Persistencia de dados**

- Utilizado o MySQL
- Caso não exista o sistema cria o banco de dados "*abrigaGatos*" e suas tabelas
- Ajustar usuario  e senha para cessso ao SGBD no arquivo "*application.properties*" em src/main/resources/

**Estrutura do Projeto**

<img src="https://s2.loli.net/2022/04/06/YenPyH8Ao2DvV7t.png" alt="projeto_1" style="zoom:50%;" />



<img src="https://s2.loli.net/2022/04/06/ae12xLDd4iJo6CE.png" alt="projeto_2" style="zoom:50%;" />



**Documentos de referencia das tecnologias utilizadas** 

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/#build-image)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [HTML](https://www.w3schools.com/html/html_intro.asp)  
* [CSS](https://developer.mozilla.org/en-US/docs/Web/CSS) 
* [Bootstrap](https://getbootstrap.com/docs/5.1/getting-started/introduction/) 
* [Lombok](https://projectlombok.org/) 
* [REST API](https://www.redhat.com/en/topics/api/what-is-a-rest-api) 
* [MVC](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller) 
* [CRUD](https://en.wikipedia.org/wiki/Create,_read,_update_and_delete) 
* [Google Fonts](https://fonts.google.com/) 

**Guias**

Os guias a seguir ilustram como usar alguns recursos de forma concreta:

* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Springboot + Thymeleaf](https://github.com/hendisantika/springboot-thymeleaf-employee-crud)
* [Statics Files (css/img/etc) in Springboot](https://stackoverflow.com/questions/27170772/where-to-put-static-files-such-as-css-in-a-spring-boot-project)
* [Redirect HTMl in Springboot+THymeleaf](https://pt.stackoverflow.com/questions/315346/redirecionar-para-uma-html-com-spring-boot)
* [REST API - CRUD](https://www.bezkoder.com/spring-boot-jpa-crud-rest-api/>)



**JSON+Postman**

Acesar por :  "*localhost:8080/doadores"*

1. Exemplo de JSON consumido via API

   ```
   {
       "id": 1,
       "nome": "Maria",
       "cpf": "11111111100",
       "endereco": "Rua Da Paz, 100 - Centro - SP-SP",
       "email": "maria@email.com.br",
       "telefone": "99766665541",
       "doacaoMaterial": "20 sacos com 10kg cada - ração para gatos",
       "doacaoValor": "200.00"
   }
   
   {
       "id": 3,
       "nome": "João",
       "cpf": "111.222.333-44",
       "endereco": "Rua Oxalá, 1 - Centro - SP-SP",
       "email": "pedro@dominio.com.br",
       "telefone": "1191111-3333",
       "doacaoMaterial": "1 saco de 10 kilos - ração para gatos",
       "doacaoValor": "100.00"
   }
   ```

   ​		

2. Teste de envio utilizando ferramenta  Postman 

<img src="https://s2.loli.net/2022/04/06/SYwgnsvLWHbuVdP.png" alt="post_1" style="zoom:80%;" />



<img src="https://s2.loli.net/2022/04/06/c4ZOgjdk1vWEXqK.png" alt="post_2" style="zoom:80%;" />
