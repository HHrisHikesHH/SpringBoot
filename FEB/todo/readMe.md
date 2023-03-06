# Project : TODO Application

## Frameworks/Tools and languages used
    ➡️ SpringBoot
    ➡️ Java
    ➡️ PostMan
    ➡️ H2 DataBase

## Data flow in the project
0. Model : We have Single model here namely ToDo:

<img width="742" alt="Screenshot 2023-03-06 at 4 16 54 PM" src="https://user-images.githubusercontent.com/100271790/223088972-d940201c-7c3f-49d5-afc2-9e0973b0d04d.png">

1. Controller : In Controller package the UserController is the gateWay to the API endpoints, Here we have provided many APIs perfrorm basic CRUD Operations on ToDo

  ### Followings are the Glimse of the some of EndPoints of the Controller:
<img width="687" alt="Screenshot 2023-03-06 at 4 21 20 PM" src="https://user-images.githubusercontent.com/100271790/223090084-1b6c302c-968c-4bec-9778-032cd4e101ac.png">



  ### To see Entire controller 
https://github.com/HHrisHikesHH/SpringBoot/edit/main/FEB/todo/src/main/java/com/hrishikesh/todo/controller/ToDoController.java

2. Services : All the operations linked with controller is been implemented with additional logics in service layer, 
   service layer also interact with repository layer.
   
    ### Followings are the Glimse of the some of BussinessLogic Implemented in the Service:
   <img width="833" alt="Screenshot 2023-03-06 at 4 30 08 PM" src="https://user-images.githubusercontent.com/100271790/223092165-07822f00-904b-4099-9ed4-01a9114e6d06.png">


     ### To see Entire Service
[  https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/todo/src/main/java/com/hrishikesh/todo/service](https://github.com/HHrisHikesHH/SpringBoot/blob/main/FEB/todo/src/main/java/com/hrishikesh/todo/service/ToDoService.java)

3. Repository : Repository layer interacts with Database(H2:DB) and persist the changes requested, We extend the JPA repository to get the 
   predefined function.
   Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods
   
### Followings are the Glimse of the some of Custom methods Implemented in the Repository:

<img width="700" alt="Screenshot 2023-03-06 at 4 39 02 PM" src="https://user-images.githubusercontent.com/100271790/223094102-16664b4a-4929-430f-99ad-cdd61cb92d36.png">

### To see Entire Repository
https://github.com/HHrisHikesHH/SpringBoot/blob/main/FEB/todo/src/main/java/com/hrishikesh/todo/repository/ITodoRepository.java

4. DataBase : Here i have used H2 : database.
which is an in memory database stores all the data in RAM and as soon as program is re-run it refresh that 
memory as a result the data is lost.
   ### Table of Student contents
  <img width="403" alt="Screenshot 2023-03-06 at 4 37 32 PM" src="https://user-images.githubusercontent.com/100271790/223093896-271c4c30-c152-42a7-b149-f182237da890.png">

## Data Structure Used in Project
* ArrayList

## Project Summary

### Project Result

<img width="1440" alt="Screenshot 2023-03-06 at 4 07 48 PM" src="https://user-images.githubusercontent.com/100271790/223094523-74f1faec-2801-4ba0-b666-9f0e1c3c8a2a.png">

<img width="1440" alt="Screenshot 2023-03-06 at 4 10 38 PM" src="https://user-images.githubusercontent.com/100271790/223094562-79dbb63b-c94e-4282-b8d5-cc8326744eeb.png">

<img width="1440" alt="Screenshot 2023-03-06 at 4 12 11 PM" src="https://user-images.githubusercontent.com/100271790/223094605-15d816ce-d9e7-4ef0-b8da-3f5a0feab2bb.png">

o<img width="1440" alt="Screenshot 2023-03-06 at 4 12 34 PM" src="https://user-images.githubusercontent.com/100271790/223094671-f8b1e907-0e5c-4870-9427-ef5f24b52510.png">

<img width="1440" alt="Screenshot 2023-03-06 at 4 13 04 PM" src="https://user-images.githubusercontent.com/100271790/223094778-8fd17b68-bd52-40c5-b8d4-4042c6a46864.png">

## Project Dem

Due to size constraint of GitHub video is uploaded at Drive and Link given below
https://drive.google.com/file/d/1sNXOaqonAea4qZkwI4EyFQnwR9XJJRdP/view?usp=share_link
























