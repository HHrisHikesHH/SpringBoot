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

<img width="431" alt="Screenshot 2023-03-15 at 8 56 34 PM" src="https://user-images.githubusercontent.com/100271790/225358556-c2c3f446-6ff1-4916-a7fb-9f33f6e8a5f2.png">


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

    Swagger Link -> http://3.139.88.52:8080/swagger-ui/index.html#/

### Project Result

➡️ : FindAll User : localhost:8080/api/v1/user/get-users

<img width="1440" alt="Screenshot 2023-03-10 at 11 48 35 AM" src="https://user-images.githubusercontent.com/100271790/224247619-a6bb6fff-a031-4ea6-be7c-5f087ca12c89.png">


➡️ : FindById User : localhost:8080/api/v1/user/get-users?userId=1

<img width="1440" alt="Screenshot 2023-03-10 at 11 48 52 AM" src="https://user-images.githubusercontent.com/100271790/224247696-2cf7d8e3-17f7-4269-a061-0d54cb9a95fc.png">


➡️ : Create User : localhost:8080/api/v1/user/create-user

<img width="1440" alt="Screenshot 2023-03-10 at 11 48 24 AM" src="https://user-images.githubusercontent.com/100271790/224247560-d93d69b3-049d-4428-bc05-dfed058be5f4.png">


➡️ : Update User : localhost:8080/api/v1/user/update-user/2

<img width="1440" alt="Screenshot 2023-03-10 at 12 02 42 PM" src="https://user-images.githubusercontent.com/100271790/224247772-b75c4f3e-b177-464a-bcf5-2b5a227241ea.png">


➡️ : Delete User : localhost:8080/api/v1/user/delete-user/2

<img width="1440" alt="Screenshot 2023-03-10 at 12 09 35 PM" src="https://user-images.githubusercontent.com/100271790/224247837-3d055f0a-8054-4f51-a590-6d97a88c503d.png">


➡️ : Create Status : localhost:8080/api/v1/status/create-status

<img width="1440" alt="Screenshot 2023-03-10 at 12 09 54 PM" src="https://user-images.githubusercontent.com/100271790/224247920-f277b18b-6838-4aac-a71b-cd20b82d8ded.png">


➡️ : Create ChatHistory : localhost:8080/api/v1/chat/send-message

<img width="1440" alt="Screenshot 2023-03-10 at 12 10 33 PM" src="https://user-images.githubusercontent.com/100271790/224248043-c894f192-cfa4-4656-bf18-292eb776e9f6.png">


➡️ : FindById ChatHistory : localhost:8080/api/v1/chat/s?senderId=3
<img width="1440" alt="Screenshot 2023-03-10 at 12 16 07 PM" src="https://user-images.githubusercontent.com/100271790/224248242-b8e1d17d-8a09-43f4-bc6f-b5b87417b4c0.png">


➡️ : FindAll ChatHistory : localhost:8080/api/v1/chat/get-conversation?user1=1&user2=3

<img width="1440" alt="Screenshot 2023-03-10 at 12 17 09 PM" src="https://user-images.githubusercontent.com/100271790/224248301-84065c15-1082-4688-9b75-3cc4ff4fa29b.png">

















