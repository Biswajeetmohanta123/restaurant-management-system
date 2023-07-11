<h1 align="center"> 
Restaurant Management</h1>

* This repository contains the code for a Restaurant Management System. The system includes functionality for managing restaurants, as well as for user authentication and authorization.

* The restaurant management system is a web-based application that uses Spring Boot. It 
helps streamline restaurant data management and provides an easy-to-use interface for 
restaurant managers to manage food item details and other information. The application 
also allows restaurants to view and update their personal details

* Implemented CRUD operations with data validation, MySQL database configuration, 
Swagger integration, authentication and established table relationships, authentication 
using “MD-5” algorithm

* Tech stack used: Spring Boot, Hibernate, MySQL, OOPs, Postman, Swagger, and Java
>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)


* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

>## Installation

To run this application locally, you will need to have Java and MySQL installed on your machine.

* Clone the repository to your local machine.
* Create a new MySQL database called `restaurant_management`
* Update the `application.properties` file in the `src/main/resources` directory to include your MySQL username and password
* Run the application using your IDE or by running the command `mvn spring-boot:run` in the project directory
* Access the APIs using any HTTP client such as Postman or cURL.
>## Data flow
 The application is built using the SpringBoot framework and consists of four layers: DTO, model, service, and repository.-

* **DTO** -The DTO layer consists of classes that are used to transfer data between different layers of the application
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## API Documentation
The API endpoints will be available at http://localhost:8080.

#### Endpoints
Restaurant-controller
* GET
/restaurants/{id}

* PUT
/restaurants/{id}

* DELETE
/restaurants/{id}

* GET
/restaurants

* POST
/restaurants

Restaurant-management-controller

* PUT /restaurantmanagement/restaurantid/{restaurantEmployeeRecordId}

* GET /restaurantmanagement/restaurantid/{restaurantid}

User-controller

* POST
/user/signup

* POST
/user/signin

* GET
/user/food

>### Schemas
Food

* id

* foodName	

* foodPrice

* Restaurant	Restaurant

Restaurant

* RestaurantId	

* RestaurantName

* RestaurantAddress

* Menu

* PersonalDetails	

RestaurantManagement

* RestaurantManagementRecordId

* RestaurantDescription

* RestaurantHeadChefName

* RestaurantHeadChefSalary

* RestaurantStaffsNumber

* RestaurantStaffTotalExpense

* Restaurant	Restaurant

SignUpInput

* userFirstName	

SignUpOutput

* status

* message

SignInInput

* userEmail	
* serPassword

SignInOutput

* status	
* token	

>## Contributors

Suvadip Majhi(suvadipmajhi1997)

>## Project Summary
This application has a well-defined architecture with clear separation of concerns. Each layer has its own set of responsibilities and communicates with other layers in a decoupled way. This makes the application modular and easy to maintain.

