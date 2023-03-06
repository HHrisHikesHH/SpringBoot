# Project : Custom Query & Query Annotation

## Frameworks/Tools and languages used
    ➡️ SpringBoot
    ➡️ Java
    ➡️ PostMan
    ➡️ H2 DataBase

## Data flow in the project
0. Model : We have Single model here namely user:


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

### Project Result

➡️ http://localhost:8080/api/v1/student/getActiveStudent

<img width="1440" alt="Screenshot 2023-03-05 at 10 43 31 PM" src="https://user-images.githubusercontent.com/100271790/222975372-9a82f284-64df-4fd1-b8d6-8e9aa4fc1ecc.png">



➡️http://localhost:8080/api/v1/student/getInactiveStudent

<img width="1440" alt="Screenshot 2023-03-05 at 10 44 14 PM" src="https://user-images.githubusercontent.com/100271790/222975414-d4df1615-1b4e-430e-8b4c-65f2bf881208.png">



➡️http://localhost:8080/api/v1/student/findByLastNameAndFirstName?firstName=Aniket&lastName=Kumar

<img width="1440" alt="Screenshot 2023-03-05 at 10 45 49 PM" src="https://user-images.githubusercontent.com/100271790/222975485-8d011113-5057-42a8-9156-5d55ca5953c4.png">




➡️http://localhost:8080/api/v1/student/findByLastNameOrFirstName?firstName=Sumit&lastName=Patil

<img width="1440" alt="Screenshot 2023-03-05 at 10 49 00 PM" src="https://user-images.githubusercontent.com/100271790/222975649-486162b4-0de0-421f-a2b9-a2e9b49550dc.png">




➡️http://localhost:8080/api/v1/student/findByFirstNameEquals?firstName=Shruti

<img width="1440" alt="Screenshot 2023-03-05 at 10 50 56 PM" src="https://user-images.githubusercontent.com/100271790/222975724-091e99df-f154-4e37-8814-9aa52fab98c6.png">




➡️http://localhost:8080/api/v1/student/findByAgeBetween?lowerLimit=20&upperLimit=25

<img width="1440" alt="Screenshot 2023-03-05 at 10 53 12 PM" src="https://user-images.githubusercontent.com/100271790/222975824-c96554b0-45ab-4ac7-bfbc-a648cce513c4.png">




➡️http://localhost:8080/api/v1/student/findByAgeLessThan?limit=20

<img width="1440" alt="Screenshot 2023-03-05 at 10 55 46 PM" src="https://user-images.githubusercontent.com/100271790/222975947-c7dcec68-c2b5-4a82-92ae-249738cad586.png">




➡️http://localhost:8080/api/v1/student/findByAgeGreaterThan?limit=30

<img width="1440" alt="Screenshot 2023-03-05 at 10 56 54 PM" src="https://user-images.githubusercontent.com/100271790/222975995-e7964ae2-f243-4a16-a17b-ce67d125f12a.png">




➡️http://localhost:8080/api/v1/student/findByAgeGreaterThanEqual?limit=30

<img width="1440" alt="Screenshot 2023-03-05 at 10 59 18 PM" src="https://user-images.githubusercontent.com/100271790/222976129-e647d2ed-3b25-4376-bade-0387625fc951.png">




➡️http://localhost:8080/api/v1/student/findByFirstNameLike?firstName=ity

<img width="1440" alt="Screenshot 2023-03-05 at 11 01 15 PM" src="https://user-images.githubusercontent.com/100271790/222976228-0c20823a-c789-4b40-9d18-3171cdd35266.png">




➡️http://localhost:8080/api/v1/student/findByFirstNameStartingWith?firstName=Shru

<img width="1440" alt="Screenshot 2023-03-05 at 11 03 34 PM" src="https://user-images.githubusercontent.com/100271790/222976342-163159c5-d099-4b11-91fa-899c65f51517.png">




➡️http://localhost:8080/api/v1/student/findByFirstNameContaining?firstName=des

<img width="1440" alt="Screenshot 2023-03-05 at 11 06 16 PM" src="https://user-images.githubusercontent.com/100271790/222976455-5139dac0-e26d-4d46-b269-533d84a533ec.png">




➡️http://localhost:8080/api/v1/student/findByFirstNameEndingWith?firstName=ket

<img width="1440" alt="Screenshot 2023-03-05 at 11 09 30 PM" src="https://user-images.githubusercontent.com/100271790/222976613-d53a7298-483a-4d14-b9d0-4d13aaa9381a.png">




➡️http://localhost:8080/api/v1/student/findByAgeGreaterThanOrderByLastNameDesc?limit=30

<img width="1440" alt="Screenshot 2023-03-05 at 11 12 56 PM" src="https://user-images.githubusercontent.com/100271790/222976779-bc3b71c9-ab26-4e18-ad2a-7f721e89e981.png">

## Project Demo

Due to size constraint of GitHub video is uploaded at Drive and Link given below
https://drive.google.com/file/d/1sNXOaqonAea4qZkwI4EyFQnwR9XJJRdP/view?usp=share_link
























