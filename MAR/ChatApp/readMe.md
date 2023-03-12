# Project : Chat Application

## Frameworks/Tools and languages used
    ➡️ SpringBoot
    ➡️ Java
    ➡️ PostMan
    ➡️ MySQL DataBase
--------------------------------------------------------------------------------------------------------------------
## Data flow in the project
 ### 0. Model : We have 3 models here namely Users, ChatHistory & Status:

 #### Followings are the Glimse of the Models:

##### 0.1  Users ⬇️

<img width="611" alt="Screenshot 2023-03-10 at 12 25 06 PM" src="https://user-images.githubusercontent.com/100271790/224245026-c72f2e94-863d-4712-bacd-7da4cf502461.png">

##### 0.2  ChatHistory ⬇️

<img width="661" alt="Screenshot 2023-03-10 at 12 26 11 PM" src="https://user-images.githubusercontent.com/100271790/224245200-d21a5831-d230-4017-8a4b-8e9a95df51b7.png">

##### 0.2  Status ⬇️

<img width="544" alt="Screenshot 2023-03-10 at 12 26 38 PM" src="https://user-images.githubusercontent.com/100271790/224245303-5b961351-003c-4537-bd5b-3b490c815367.png">

 #### To see Models
 
https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ChatApp/src/main/java/com/geekster/chatApplication/model
 
--------------------------------------------------------------------------------------------------------------------

### 1. Controller : In Controller package the UserController is the gateWay to the API endpoints, Here we have provided many APIs perfrorm basic CRUD Operations on ToDo

  #### Followings are the Glimse of the some of EndPoints of the Controller:
 
##### 1.1  Users ⬇️  

  <img width="885" alt="Screenshot 2023-03-10 at 12 27 39 PM" src="https://user-images.githubusercontent.com/100271790/224245489-6d6c2bc9-711a-41a7-aeba-8ec297ff3a2d.png">

##### 1.2  ChatHistory ⬇️

<img width="842" alt="Screenshot 2023-03-10 at 12 28 18 PM" src="https://user-images.githubusercontent.com/100271790/224245611-c8d83b52-2aaf-4800-af3a-e857b94a2d10.png">

##### 1.2  Status ⬇️

<img width="863" alt="Screenshot 2023-03-10 at 12 28 48 PM" src="https://user-images.githubusercontent.com/100271790/224245724-440929aa-be8e-4e88-afe4-edab9ca087bf.png">

  #### To see Entire controller 
https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ChatApp/src/main/java/com/geekster/chatApplication/controller

--------------------------------------------------------------------------------------------------------------------

### 2. Services : All the operations linked with controller is been implemented with additional logics in service layer, service layer also interact with repository layer.
   
   #### Followings are the Glimse of the some of BussinessLogic Implemented in the Service:
   
##### 2.1  Users ⬇️  

<img width="852" alt="Screenshot 2023-03-10 at 12 29 47 PM" src="https://user-images.githubusercontent.com/100271790/224245892-55a2ff07-4c4c-46b6-9957-4d786c2670c8.png">

##### 2.2  ChatHistory ⬇️ 

<img width="810" alt="Screenshot 2023-03-10 at 12 32 42 PM" src="https://user-images.githubusercontent.com/100271790/224246393-4072ead8-1bd2-43cb-80ce-316a509ec2e6.png">

##### 2.2  Status ⬇️

<img width="499" alt="Screenshot 2023-03-10 at 12 32 11 PM" src="https://user-images.githubusercontent.com/100271790/224246308-c1522928-8adb-4e0c-ac25-4f48dcfa6e3c.png">

#### To see Entire Service

https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ChatApp/src/main/java/com/geekster/chatApplication/service

--------------------------------------------------------------------------------------------------------------------

### 3. Repository : Repository layer interacts with Database(MySQL) and persist the changes requested, We extend the JPA repository to get the predefined function.Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods
   
#### Followings are the Glimse of the some of Custom methods Implemented in the Repository:

##### 3.1  Users ⬇️  
<img width="970" alt="Screenshot 2023-03-10 at 12 34 19 PM" src="https://user-images.githubusercontent.com/100271790/224246679-2a102da8-6faf-4e2c-b69d-3fc2a89cf970.png">


##### 3.2  ChatHistory ⬇️ 
<img width="952" alt="Screenshot 2023-03-10 at 12 34 50 PM" src="https://user-images.githubusercontent.com/100271790/224246778-e298a830-6971-4026-8e46-5c9eb5da9f8a.png">


##### 2.2  Status ⬇️
<img width="677" alt="Screenshot 2023-03-10 at 12 34 36 PM" src="https://user-images.githubusercontent.com/100271790/224246736-0670951d-052a-4b8d-bd32-f5ba20be06c9.png">


#### To see Entire Repository

https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ChatApp/src/main/java/com/geekster/chatApplication/dao

--------------------------------------------------------------------------------------------------------------------

### 4. DataBase : Here i have used mySQL : This database persist data even when the program is re-run.
   #### Table of User contents
<img width="1147" alt="Screenshot 2023-03-10 at 12 36 06 PM" src="https://user-images.githubusercontent.com/100271790/224247023-11980e9a-3a46-4be5-a068-96ae19f9f20b.png">

 #### Table of Status contents
<img width="404" alt="Screenshot 2023-03-10 at 12 36 23 PM" src="https://user-images.githubusercontent.com/100271790/224247088-25cd823f-b938-467b-83fa-c7083df7d251.png">

#### Table of ChatHistory contents
<img width="753" alt="Screenshot 2023-03-10 at 12 36 43 PM" src="https://user-images.githubusercontent.com/100271790/224247151-53e84497-40da-40ab-bbf2-46e4c1091f2d.png">

## Data Structure Used in Project
* ArrayList
* JSONArray
* JSONObject

## Project Summary

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

















