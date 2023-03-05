# Project : Custom Query & Query Annotation

## Frameworks and languages used
    ➡️ SpringBoot
    ➡️ Java
    ➡️ PostMan

## Data flow in the project
0. Model : We have Single model here namely Student:


<img width="486" alt="Screenshot 2023-03-05 at 8 44 41 PM" src="https://user-images.githubusercontent.com/100271790/222969103-d2d33cd0-90ce-4aa2-af93-b6a9e6c4798b.png">


1. Controller : In Controller pakage the StudentController is the gateWay to the API endpoints, Here we have provided many 
endpoints for different keywords of native SQL such as Between, Less than , order by etc.

  ### Followings are the Glimse of the some of EndPoints of the Controller:

<img width="1059" alt="Screenshot 2023-03-05 at 8 53 06 PM" src="https://user-images.githubusercontent.com/100271790/222969566-014d64fa-7b62-49a8-b30f-f862a43acfe1.png">

  ### To see Entire controller 
https://github.com/HHrisHikesHH/SpringBoot/blob/main/MAR/custom-finder-methods-Query-Annotation/src/main/java/com/hrishikesh/custom/finder/methods/Query/Annotation/controller/StudentController.java

2. Services : All the operations linked with controller is been implemented with additional logics in service layer, 
   service layer also interact with repository layer.
   
    ### Followings are the Glimse of the some of BussinessLogic Implemented in the Service:
    <img width="1022" alt="Screenshot 2023-03-05 at 9 04 38 PM" src="https://user-images.githubusercontent.com/100271790/222970134-7e037e3d-f95b-4d4b-a18a-3e866088efa4.png">
    <img width="1057" alt="Screenshot 2023-03-05 at 9 04 59 PM" src="https://user-images.githubusercontent.com/100271790/222970160-1f8f9ae1-b8a7-48a8-9b88-b5afb6732264.png">

     ### To see Entire Service
    https://github.com/HHrisHikesHH/SpringBoot/blob/main/MAR/custom-finder-methods-Query-Annotation/src/main/java/com/hrishikesh/custom/finder/methods/Query/Annotation/controller/service/StudentService.java
3. Repository : Repository layer interacts with Database(mySql) and persist the changes requested, We extend the JPA repository to get the 
   predefined function.
   Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods
   We can also customise our own methods like-wise we have done in these particular project.
   We can also access the repository data using @Query Annotation and need to write native or hibernate SQL query.
   
    ### Followings are the Glimse of the some of Custom methods Implemented in the Repository:
    <img width="1190" alt="Screenshot 2023-03-05 at 9 10 10 PM" src="https://user-images.githubusercontent.com/100271790/222970455-0900b23b-52c7-42ad-a444-83878af633cc.png">
    <img width="1143" alt="Screenshot 2023-03-05 at 9 10 52 PM" src="https://user-images.githubusercontent.com/100271790/222970493-fa27e49c-e453-4fd0-8368-ccd69992fbc1.png">

     ### To see Entire Repository
    https://github.com/HHrisHikesHH/SpringBoot/blob/main/MAR/custom-finder-methods-Query-Annotation/src/main/java/com/hrishikesh/custom/finder/methods/Query/Annotation/repository/IStudentRepository.java
4. DataBase : Here i have used mySql database.
   ### Table of Student contents
   <img width="622" alt="Screenshot 2023-03-05 at 10 29 35 PM" src="https://user-images.githubusercontent.com/100271790/222974762-bcba7f4a-47d1-4f82-8293-a0e3f13e8f98.png">


## Data Structure Used in Project
* ArrayList
* JSONObject and JSONArray
* String Array

## Project Summary





