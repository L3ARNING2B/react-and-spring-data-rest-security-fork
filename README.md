# react-and-spring-data-rest-security-fork

## Installation
1. git clone
2. open in IntelJ (use maven / auto import)
3. run bash : 
<b>$ npm install</b>
<b>$ npm install -g webpack</b>
<b>$ webpack</b>
<b>$ webpack --watch -d</b>
               
4. run apps ( allready configured on localhost:8080)

## Run Spring Boot
<b>$ ./mvnw spring-boot:run</b>


## BDD

### Install bdd (Docker mariaDB)
docker file: </b>/docker-compose.xml</b>
<b>$ vim docker-compose.xml</b>
<b>$ dc up -d && dc ps</b>

### Configure BDD (on Spring)
1. Create model (unified with your sql table, i.e customer.java)
2. Create it repository (i.e customerRepository.java
3. Configure (or create): src/resources/application.yml
4. Configure (or create): src/main/java/com.greglturnquist.payroll.DatabaseLoader.java

Note : table will be automatically updated (created/updated/deleted...etc...) after reboot (re-run) of the apps (see # Run Spring Boot). 


## Sources:
- Acl Import:
https://github.com/lordlothar99/strategy-spring-security-acl

- Spring Security Module:
https://github.com/spring-projects/spring-security

- Original Project:
https://github.com/spring-guides/tut-react-and-spring-data-rest