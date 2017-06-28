# SpringAddressBook

This is an Spring Framework example project using:
 * Spring Boot 1.3.3
 * Spring MVC 4.3.4
 * Spring Data 1.7.2
 * Hibernate 4.3.8
 * H2 DB 1.4.185
 * MongoDB
 * Gradle
 * Maven
 
# Requirements

 * IntelliJ or Eclipse
 * JDK 1.8 or later
 * Maven 3.0+ or Gradle 2.3+

# Execution

* Run with Gradle: 
    'gradle clean build && java -jar build/libs/springAddressBook-0.1.0.jar'

* Run with Maven: 
    'mvn clean package spring-boot:repackage && java -jar target/springAddressBook-0.1.0.jar'
    
* App with h2 profile:
    * DB config & view: 
        'localhost:8080/console'