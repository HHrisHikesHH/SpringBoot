# Project : RestWhatsAppClone


## Frameworks/Tools and languages used
    ➡️ SpringBoot
    ➡️ Java
    ➡️ PostMan
    ➡️ MySQL DataBase
--------------------------------------------------------------------------------------------------------------------
## Data flow in the project
 ### 0. Model : We have 4 models here namely Users, Chat, Message, Dummy User:

 #### Followings are the Glimse of the Models:

##### 0.1  Users ⬇️

<img width="544" alt="Screenshot 2023-04-16 at 9 28 35 PM" src="https://user-images.githubusercontent.com/100271790/232325062-72c2dc97-ae11-4ed7-b778-7fba8307afcc.png">


##### 0.2  Chat ⬇️

<img width="523" alt="Screenshot 2023-04-16 at 9 29 16 PM" src="https://user-images.githubusercontent.com/100271790/232325094-58e531d9-d0bc-499b-be1f-3bcb97bf3e31.png">

##### 0.3  Message ⬇️

<img width="580" alt="Screenshot 2023-04-16 at 9 30 08 PM" src="https://user-images.githubusercontent.com/100271790/232325152-75787675-3528-47cc-b2d9-eccdf7c6289e.png">

##### 0.4  Dummy User ⬇️

<img width="548" alt="Screenshot 2023-04-16 at 9 33 25 PM" src="https://user-images.githubusercontent.com/100271790/232325389-6c52331c-ad08-4b49-90ba-15f6ba22ac96.png">

 #### To see Models
    https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/RestWhatsAppClone/src/main/java/com/hrishikesh/ChatApp/model
 
--------------------------------------------------------------------------------------------------------------------

### 1. Controller : In Controller package the UserController is the gateWay to the API endpoints, Here we have provided many APIs perform the operations that some of the features provided by whatsapp like add contact, get chats, login, delete message etc. 

  #### Followings are the Glimse of the some of EndPoints of the Controller:
 
##### 1.1  Users ⬇️

<img width="990" alt="Screenshot 2023-04-16 at 9 36 42 PM" src="https://user-images.githubusercontent.com/100271790/232325575-2526f9af-5159-46c6-94e6-ede911ba9539.png">

##### 1.2  Message ⬇️

<img width="1045" alt="Screenshot 2023-04-16 at 9 35 58 PM" src="https://user-images.githubusercontent.com/100271790/232325533-3cb0a1cb-ee4c-4357-8803-1b07f54788b6.png">

  #### To see Entire controller 
    https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/ChatApp/src/main/java/com/geekster/chatApplication/controller

--------------------------------------------------------------------------------------------------------------------

### 2. Services : All the operations linked with controller is been implemented with additional logics in service layer, service layer also interact with repository layer.
   
   #### Followings are the Glimse of the some of BussinessLogic Implemented in the Service:
   
##### 2.1  Users ⬇️  

<img width="782" alt="Screenshot 2023-04-16 at 9 51 50 PM" src="https://user-images.githubusercontent.com/100271790/232326344-67acdf24-b843-4504-98b8-4130a5f824c4.png">

##### 2.2  Chat ⬇️ 

<img width="621" alt="Screenshot 2023-04-16 at 9 53 23 PM" src="https://user-images.githubusercontent.com/100271790/232326430-0f8637b6-c4ad-441c-ab9f-0c0d738e486b.png">


##### 2.3  Message ⬇️

<img width="953" alt="Screenshot 2023-04-16 at 9 52 37 PM" src="https://user-images.githubusercontent.com/100271790/232326385-4748267c-a072-43d8-a488-6ea5ca933da4.png">

#### To see Entire Service

    https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/RestWhatsAppClone/src/main/java/com/hrishikesh/ChatApp/service

--------------------------------------------------------------------------------------------------------------------

### 3. Repository : Repository layer interacts with Database(MySQL) and persist the changes requested, We extend the JPA repository to get the predefined function.Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods
   
#### Followings are the Glimse of the some of Custom methods Implemented in the Repository:

##### 3.1  Users ⬇️  

<img width="586" alt="Screenshot 2023-04-16 at 9 54 17 PM" src="https://user-images.githubusercontent.com/100271790/232326478-e11f14d4-4acf-46d2-9f28-88a4c06803a4.png">

##### 3.2  Chat ⬇️ 

<img width="573" alt="Screenshot 2023-04-16 at 9 54 45 PM" src="https://user-images.githubusercontent.com/100271790/232326499-e36beb7a-2ec1-4613-8a12-71838d29a4be.png">

##### 3.3  Message ⬇️

<img width="877" alt="Screenshot 2023-04-16 at 9 55 19 PM" src="https://user-images.githubusercontent.com/100271790/232326534-90f25988-51f7-4160-b319-5084b548e187.png">

##### 3.4  DummyUser ⬇️

<img width="673" alt="Screenshot 2023-04-16 at 9 55 43 PM" src="https://user-images.githubusercontent.com/100271790/232326545-0500ee1d-d012-48b2-af44-614b1b5f3297.png">

#### To see Entire Repository

    https://github.com/HHrisHikesHH/SpringBoot/tree/main/MAR/RestWhatsAppClone/src/main/java/com/hrishikesh/ChatApp/dao
    
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

















