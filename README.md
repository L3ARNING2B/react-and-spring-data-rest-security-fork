# react-and-spring-data-rest-security-fork

## Installation
1. git clone
2. open in IntelJ (use maven / auto import)
3. run bash : <br>
$ npm install<br>
$ npm install -g webpack<br>
$ webpack<br>
$ webpack --watch -d    
4. run apps ( allready configured on localhost:8080)

## Run Spring Boot
$ ./mvnw spring-boot:run<br>


## BDD

### Install bdd (Docker mariaDB)
docker file: /docker-compose.xml<br>
$ vim docker-compose.xml<br>
$ dc up -d && dc ps<br>

### Configure BDD (on Spring)
1. Create model (unified with your sql table, i.e customer.java)
2. Create it repository (i.e customerRepository.java
3. Configure (or create): src/resources/application.yml
4. Configure (or create): src/main/java/com.greglturnquist.payroll.DatabaseLoader.java

Note : table will be automatically updated (created/updated/deleted...etc...) after reboot (re-run) of the apps (see # Run Spring Boot). 


## Sources:
- [Acl Import](https://github.com/lordlothar99/strategy-spring-security-acl)
- [Spring Security Module](https://github.com/spring-projects/spring-security)
- [Original Project](https://github.com/spring-guides/tut-react-and-spring-data-rest)