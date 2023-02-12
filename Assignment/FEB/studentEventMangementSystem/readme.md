# Student- Event Management System
    This Project stores the data of student and the college events and perform all of the crud operations on both the models

## Frameworks and language used 
    SpringBoot Framework is used to design these project with JAVA as the programming language.

## Data-Flow
    The Model or Event and Student is made separately
    They do not interact with each other, they have separate controller and service layers
    When the RequestApi + respective operation API (Get/Put/Post/Delete) is hit the SpringBoot 
    makes the object of controller and go to particular Mapping and calls the respective service 
    layer in which all the business logics is been written and return the required Model Data.

## DataStructures used in projects
    List is used for storing the Model objects.

## Project Summary
    This project Manages the Students data and Events Data and perfroms the following CRUD Operations when hit the API's  
    We can perform following operations on Students data
        Add student // Adds new Student
        update student department // Updates existing student
        delete student // Delets existing student
        Get all students  // Displays all students data in JSON format
        Get student by Id // Displays student woth entered ID
    We can perform following operations on Event data
        Add event // Adds new Event
        Update event // Updates the existing Event
        Delete event // Deletes the existing Enent
        Get All event by date // Diplays all the events with common entered dates


## Video Explaination
