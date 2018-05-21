# person-repository

## Installation
Clone the project and run this command

`mvn spring-boot:run`

For packaging and testing the project run the following command

`mvn clean package` 

For running the project after packaging use the following command

` java -jar target/procedure-scheduling.jar 
` 
## Technology stack
**Java 8**

**Maven**

**SpringBoot 1.4.7**

**Project Lombok**

**MySQL**

## Prerequisites
**Maven**

**JDK 8**

## Description
 Flyway added for database migration and versioning.
 
 HSQL as embedded database for testing.
 MySQL for development. 
 
 There are three profiles for application (**prod**,**dev**,**test**), the default 
 profile is **dev**. To change the profile use the command line arguments :
 
` java -jar target/procedure-scheduling.jar -Dspring.profiles.active=prod
`

