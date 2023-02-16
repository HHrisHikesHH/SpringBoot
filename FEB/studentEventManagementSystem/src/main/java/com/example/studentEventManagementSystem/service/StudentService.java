package com.example.studentEventManagementSystem.service;

import com.example.studentEventManagementSystem.model.Student;
import com.example.studentEventManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
//    private static List<Student> students = new ArrayList<>();
//    private static int id = 0;

//    static{
//        students.add(new Student(++id, "Hrishikesh", "Kalekinge", 24, "ECE"));
//        students.add(new Student(++id, "Aniket", "Kumar", 22, "ECE"));
//        students.add(new Student(++id, "Sumit", "Patil", 23, "CSE"));
//        students.add(new Student(++id, "Adesh", "Sonawane", 23, "IT"));
//        students.add(new Student(++id, "Aditya", "Saraf", 22, "EE"));
//    }

    @Autowired
    StudentRepository repository;

    public String addStudent(Student student) {
        repository.save(student);
        return student.getFirst_name() + " " + student.getLast_name() + " Added Successfully!";
    }

    public String updateByDept(Student newStudent, String department) {
        List<Student> students = repository.findAll();
        for (Student student: students) if(student.getDepartment().equals(department)) {
            repository.delete(student);
            repository.save(newStudent);
            return "Student with Department " + department + " Updated Successfully!";
        }
        return "Student with Department " + department + " Not Found! Please Add student first";
    }

    public String deleteById(int id) {
        try{
            repository.deleteById(id);
            return "Student with ID " + id + " Deleted Successfully!";
        }
        catch (Exception e){
            return "Student with ID " + id + "Not Found! Please Add student first";
        }
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public List<Student> getByID(int id) {
        List<Integer>ids = new ArrayList<>();
        ids.add(id);
        return repository.findAllById(ids);
    }
}
