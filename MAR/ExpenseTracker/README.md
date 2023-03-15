# Project : Chat Application
----------------------------

## Frameworks/Tools and languages used
    ➡️ SpringBoot
    ➡️ Java
    ➡️ PostMan
    ➡️ MySQL DataBase
    ➡️ Swagger 
--------------------------------------------------------------------------------------------------------------------
## Data flow in the project
 ### 0. Model : We have 2 models here namely User, Product:

 #### Followings are the Glimse of the Models:

##### 0.1  User ⬇️

<img width="531" alt="Screenshot 2023-03-15 at 8 39 29 PM" src="https://user-images.githubusercontent.com/100271790/225353205-3cecbe88-3ca4-4475-a151-103f0c80217b.png">

##### 0.2  Product ⬇️

<img width="533" alt="Screenshot 2023-03-15 at 8 38 42 PM" src="https://user-images.githubusercontent.com/100271790/225353002-414666d0-2dc5-4a0e-be55-a9ae6345d6d1.png">

 #### To see Models
 
 https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ExpenseTracker/src/main/java/com/hrishikesh/ExpenseTracker/model 
 
--------------------------------------------------------------------------------------------------------------------

### 1. Controller : In Controller package the UserController is the gateWay to the API endpoints, Here we have provided many APIs perfrorm basic CRUD Operations on ToDo

  #### Followings are the Glimse of the some of EndPoints of the Controller:
 
##### 1.1  User ⬇️  

<img width="1081" alt="Screenshot 2023-03-15 at 8 42 02 PM" src="https://user-images.githubusercontent.com/100271790/225353982-f9479bbf-696d-4fc4-baaa-3e8af2e81374.png">

##### 1.2  Product ⬇️

   <img width="800" alt="Screenshot 2023-03-15 at 8 42 52 PM" src="https://user-images.githubusercontent.com/100271790/225354216-6e1c5bfa-f5e9-42fb-b6d9-7130f37dce53.png">

#### To see Entire controller 

https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ExpenseTracker/src/main/java/com/hrishikesh/ExpenseTracker/controller

--------------------------------------------------------------------------------------------------------------------

### 2. Services : All the operations linked with controller is been implemented with additional logics in service layer, service layer also interact with repository layer.
   
   #### Followings are the Glimse of the some of BussinessLogic Implemented in the Service:

##### 2.1  User ⬇️  

<img width="739" alt="Screenshot 2023-03-15 at 8 46 04 PM" src="https://user-images.githubusercontent.com/100271790/225355246-ad002a81-0865-4bda-8f06-598ed87ef539.png">

##### 2.2  Product ⬇️ 

<img width="763" alt="Screenshot 2023-03-15 at 8 47 21 PM" src="https://user-images.githubusercontent.com/100271790/225355652-cf5b2ed8-93f5-43b5-a17e-316fe0a4c2f2.png">

#### To see Entire Service

https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ExpenseTracker/src/main/java/com/hrishikesh/ExpenseTracker/service

--------------------------------------------------------------------------------------------------------------------

### 3. Repository : Repository layer interacts with Database(MySQL) and persist the changes requested, We extend the JPA repository to get the predefined function.Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods
   
#### Followings are the Glimse of the some of Custom methods Implemented in the Repository:

##### 3.1  User ⬇️  

<img width="657" alt="Screenshot 2023-03-15 at 8 51 03 PM" src="https://user-images.githubusercontent.com/100271790/225356776-9d87df77-b182-4c3b-b169-0a67c662c140.png">

##### 3.2  Product ⬇️ 

<img width="834" alt="Screenshot 2023-03-15 at 9 57 31 PM" src="https://user-images.githubusercontent.com/100271790/225376045-214db89e-990a-4e41-b368-56a60785c713.png">

#### To see Entire Repository

https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ExpenseTracker/src/main/java/com/hrishikesh/ExpenseTracker/repository 

--------------------------------------------------------------------------------------------------------------------

### 4. DataBase : Here i have used mySQL : This database persist data even when the program is re-run.
 #### Table of User contents
   
<img width="805" alt="Screenshot 2023-03-15 at 8 55 29 PM" src="https://user-images.githubusercontent.com/100271790/225358321-51a16ad6-b78d-4c4e-995a-775e447d2f1c.png">

 #### Table of Product contents
 
<img width="431" alt="Screenshot 2023-03-15 at 8 56 34 PM" src="https://user-images.githubusercontent.com/100271790/225358556-c2c3f446-6ff1-4916-a7fb-9f33f6e8a5f2.png">

## Data Structure Used in Project
* ArrayList

## Project Summary

### Project Demo

#### Swagger Link

    http://3.139.88.52:8080/swagger-ui/index.html#/

### Project Result and Video Explaination


















