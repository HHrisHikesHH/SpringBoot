# Project : Instagram Application

## Frameworks/Tools and languages used
    ➡️ SpringBoot
    ➡️ Java
    ➡️ PostMan
    ➡️ MySQL DataBase
--------------------------------------------------------------------------------------------------------------------
## Data flow in the project
 ### 0. Model : We have Two models here namely User & Post:

 #### Followings are the Glimse of the Models:

##### 0.1  USER ⬇️

<img width="528" alt="Screenshot 2023-03-06 at 9 08 55 PM" src="https://user-images.githubusercontent.com/100271790/223157682-a19386d6-eb30-4003-a8ba-cc45165e9825.png">

##### 0.2  POST ⬇️

<img width="717" alt="Screenshot 2023-03-06 at 9 10 13 PM" src="https://user-images.githubusercontent.com/100271790/223158030-df967733-16ae-4287-80b8-5adab97c8a33.png">

 #### To see Models
 https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/Instagram/src/main/java/com/hrishikesh/Instagram/model

--------------------------------------------------------------------------------------------------------------------

### 1. Controller : In Controller package the UserController is the gateWay to the API endpoints, Here we have provided many APIs perfrorm basic CRUD Operations on ToDo

  #### Followings are the Glimse of the some of EndPoints of the Controller:
 
##### 1.1  USER ⬇️  
  
<img width="997" alt="Screenshot 2023-03-06 at 9 18 40 PM" src="https://user-images.githubusercontent.com/100271790/223160512-c4e69bcf-fe91-4597-9460-7433db5a682e.png">

##### 1.2  POST ⬇️
  
<img width="1000" alt="Screenshot 2023-03-06 at 9 18 03 PM" src="https://user-images.githubusercontent.com/100271790/223160351-f5dcffe5-0ae3-4df2-9453-a35c025f5cbb.png">


  #### To see Entire controller 
[https://github.com/HHrisHikesHH/SpringBoot/edit/main/FEB/todo/src/main/java/com/hrishikesh/todo/controller/ToDoController.java](https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/Instagram/src/main/java/com/hrishikesh/Instagram/controller)

--------------------------------------------------------------------------------------------------------------------

### 2. Services : All the operations linked with controller is been implemented with additional logics in service layer, service layer also interact with repository layer.
   
   #### Followings are the Glimse of the some of BussinessLogic Implemented in the Service:
   
##### 2.1  USER ⬇️  

<img width="727" alt="Screenshot 2023-03-06 at 9 34 13 PM" src="https://user-images.githubusercontent.com/100271790/223164852-213ee5bb-106d-4b4d-80b0-524e070f0721.png">

 
##### 2.2  POST ⬇️ 

 <img width="782" alt="Screenshot 2023-03-06 at 9 31 51 PM" src="https://user-images.githubusercontent.com/100271790/223164178-a0240b6c-6572-4a90-823b-63ed7032aff1.png">


#### To see Entire Service
[[  https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/todo/src/main/java/com/hrishikesh/todo/service](https://github.com/HHrisHikesHH/SpringBoot/blob/main/FEB/todo/src/main/java/com/hrishikesh/todo/service/ToDoService.java)](https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/Instagram/src/main/java/com/hrishikesh/Instagram/service)

--------------------------------------------------------------------------------------------------------------------

### 3. Repository : Repository layer interacts with Database(MySQL) and persist the changes requested, We extend the JPA repository to get the predefined function.Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods
   
#### Followings are the Glimse of the some of Custom methods Implemented in the Repository:

##### 3.1  USER ⬇️  

<img width="648" alt="Screenshot 2023-03-06 at 9 37 02 PM" src="https://user-images.githubusercontent.com/100271790/223165577-8d7f8553-0cbd-4562-a112-6982c3fc382a.png">


##### 3.2  POST ⬇️ 

<img width="653" alt="Screenshot 2023-03-06 at 9 37 18 PM" src="https://user-images.githubusercontent.com/100271790/223165647-bc130c04-32b1-4df0-9715-7f876324647f.png">


#### To see Entire Repository
[https://github.com/HHrisHikesHH/SpringBoot/blob/main/FEB/todo/src/main/java/com/hrishikesh/todo/repository/ITodoRepository.java](https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/Instagram/src/main/java/com/hrishikesh/Instagram/repository)

--------------------------------------------------------------------------------------------------------------------

### 4. DataBase : Here i have used mySQL : This database persist data even when the program is re-run.
   #### Table of User contents
  <img width="403" alt="Screenshot 2023-03-06 at 4 37 32 PM" src="https://user-images.githubusercontent.com/100271790/223093896-271c4c30-c152-42a7-b149-f182237da890.png">

## Data Structure Used in Project
* ArrayList

## Project Summary

### Project Result
➡️ : FindAll Todos : localhost:8081/api/v1/ToDo/findAll

<img width="1440" alt="Screenshot 2023-03-06 at 4 07 48 PM" src="https://user-images.githubusercontent.com/100271790/223094523-74f1faec-2801-4ba0-b666-9f0e1c3c8a2a.png">

➡️ : FindById Todos : localhost:8081/api/v1/ToDo/find/id/3

<img width="1440" alt="Screenshot 2023-03-06 at 4 10 38 PM" src="https://user-images.githubusercontent.com/100271790/223094562-79dbb63b-c94e-4282-b8d5-cc8326744eeb.png">

➡️ : Create Todo : localhost:8081/api/v1/ToDo/add

<img width="1440" alt="Screenshot 2023-03-06 at 4 12 11 PM" src="https://user-images.githubusercontent.com/100271790/223094605-15d816ce-d9e7-4ef0-b8da-3f5a0feab2bb.png">

➡️ : Update Todo : localhost:8081/api/v1/ToDo/put/id/6

o<img width="1440" alt="Screenshot 2023-03-06 at 4 12 34 PM" src="https://user-images.githubusercontent.com/100271790/223094671-f8b1e907-0e5c-4870-9427-ef5f24b52510.png">

➡️ : Delete Todo : localhost:8081/api/v1/ToDo/delete/id/7

<img width="1440" alt="Screenshot 2023-03-06 at 4 13 04 PM" src="https://user-images.githubusercontent.com/100271790/223094778-8fd17b68-bd52-40c5-b8d4-4042c6a46864.png">

## Project Demo

https://user-images.githubusercontent.com/100271790/223099082-55a02d6b-a208-41c3-ac60-fdb65f2bce0a.mp4










