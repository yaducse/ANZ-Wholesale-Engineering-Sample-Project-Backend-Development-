# ANZ Wholesale Engineering Sample Project (Backend Development)

This application contains the backend REST APIs needed to support a web application that allows a user to view accounts and subsequently view transactions on any of the accounts they hold.

## Functional Requirements

1. View Account List
2. View Account Transactions
## Database setup
MySQL is used as a database service for this project. Enter your MySQL credentials in [application.properties](https://github.com/yaducse/ANZ-Wholesale-Engineering-Sample-Project-Backend-Development-/blob/main/src/main/resources/application.properties) file as :
```
spring.datasource.username=//Enter your username here
spring.datasource.password=//Enter your password here
```

## Running the application

This is Spring boot based project so select the [AnzWholesaleEngineeringSampleProjectBackendApplication.java](https://github.com/yaducse/ANZ-Wholesale-Engineering-Sample-Project-Backend-Development-/blob/main/src/main/java/com/anz/sample/AnzWholesaleEngineeringSampleProjectBackendApplication.java) file and run as spring boot app (on **STS IDE**) or run as maven application (on **Eclipse IDE**) to run the application.

## Viewing the output
1. View Account List :
```
http://localhost:8080/anzsample/accounts/
```
2. View Account Transactions :
```
http://localhost:8080/anzsample/transactions/{accountNumber}
```
