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
<img width="710" alt="Screenshot 2023-03-06 at 10 31 23 PM" src="https://user-images.githubusercontent.com/100271790/223179483-f5998f2c-a99a-4797-b847-888bc94ae3ac.png">

 #### Table of Post contents

<img width="755" alt="Screenshot 2023-03-06 at 10 32 30 PM" src="https://user-images.githubusercontent.com/100271790/223179732-63a9df82-3715-4150-be7f-b041a04126fb.png">

### 5. Util : Here i have done StringToJSONObjectTo{requiredObject} : 

#### Followings are the Glimse of the util:

<img width="675" alt="Screenshot 2023-03-07 at 3 34 24 PM" src="https://user-images.githubusercontent.com/100271790/223389830-43d5fd74-8dc3-482c-931b-1f2d788b56bb.png">

#### To see Entire util

https://github.com/HHrisHikesHH/SpringBoot/blob/main/FEB/Instagram/src/main/java/com/hrishikesh/Instagram/util/Util.java


## Data Structure Used in Project
* ArrayList
* JSONArray
* JSONObject

## Project Summary

### Project Result
➡️ : FindAll Users : localhost:8080/api/v1/user/get

<img width="1440" alt="Screenshot 2023-03-06 at 9 03 14 PM" src="https://user-images.githubusercontent.com/100271790/223180261-762b3ef3-13f6-423a-8708-5f2f6c49c745.png">

➡️ : FindAll Active Users : localhost:8080/api/v1/user/get?password=pass

<img width="1440" alt="Screenshot 2023-03-06 at 10 35 26 PM" src="https://user-images.githubusercontent.com/100271790/223180374-2195975b-afb8-49e5-85d5-bd5d7048f70f.png">


➡️ : FindById User : localhost:8080/api/v1/user/get?userId=10

<img width="1440" alt="Screenshot 2023-03-06 at 10 37 40 PM" src="https://user-images.githubusercontent.com/100271790/223180901-2e187c39-915c-49ec-adaf-c928a4805fc7.png">


➡️ : Create User : localhost:8080/api/v1/user/save

<img width="1440" alt="Screenshot 2023-03-06 at 9 02 33 PM" src="https://user-images.githubusercontent.com/100271790/223180691-ac4e8282-1eb7-4a7e-bdd7-2d4ae76e2d85.png">


➡️ : Update User : localhost:8080/api/v1/user/update?userId=14

<img width="1440" alt="Screenshot 2023-03-06 at 9 02 42 PM" src="https://user-images.githubusercontent.com/100271790/223180738-18bbaa90-79e7-4cc2-8298-0944da5d2161.png">


➡️ : Delete User : localhost:8080/api/v1/user/delete?userId=14

<img width="1440" alt="Screenshot 2023-03-06 at 9 03 09 PM" src="https://user-images.githubusercontent.com/100271790/223181116-cde67e0d-30a4-433b-b78c-4ec940bd9ce4.png">

➡️ : FindAll Posts : localhost:8080/api/v1/post/get

<img width="1440" alt="Screenshot 2023-03-06 at 10 42 20 PM" src="https://user-images.githubusercontent.com/100271790/223182741-caeb3c65-e763-4348-a5a5-9a464c80c60a.png">

➡️ : FindById Posts : localhost:8080/api/v1/post/get?postId=4

<img width="1440" alt="Screenshot 2023-03-06 at 10 42 41 PM" src="https://user-images.githubusercontent.com/100271790/223182864-e23f51d5-8f95-458e-9f83-dcbea42c0a5c.png">

➡️ : Create Post : localhost:8080/api/v1/post/save

<img width="1440" alt="Screenshot 2023-03-06 at 10 52 37 PM" src="https://user-images.githubusercontent.com/100271790/223185248-ee4eb439-5c21-46ac-b891-60b557b0e681.png">

➡️ : Update Post : localhost:8080/api/v1/post/update?postId=11

<img width="1440" alt="Screenshot 2023-03-06 at 10 54 15 PM" src="https://user-images.githubusercontent.com/100271790/223185180-a4cb4607-5e2c-40ad-8ef7-a695a9c26f5d.png">

➡️ : Delete Post : localhost:8080/api/v1/post/delete?postId=10

<img width="1440" alt="Screenshot 2023-03-06 at 10 52 18 PM" src="https://user-images.githubusercontent.com/100271790/223185416-0c43f50d-a08c-47df-ae66-bc2e4879cd83.png">












