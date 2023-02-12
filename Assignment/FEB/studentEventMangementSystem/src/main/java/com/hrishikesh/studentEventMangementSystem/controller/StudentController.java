package com.hrishikesh.studentEventMangementSystem.controller;

import com.hrishikesh.studentEventMangementSystem.model.Student;
import com.hrishikesh.studentEventMangementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("add")
    public String addStudent(@RequestBody Student student){// ✅
        return service.addStudent(student);
    }

    @PutMapping("update/department/{department}")// ✅
    public String updateByDept(@RequestBody Student student, @PathVariable String department){
        return service.updateByDept(student, department);
    }

    @DeleteMapping("delete/id/{id}")// ✅
    public String deleteById(@PathVariable int id){
        return service.deleteById(id);
    }
    @GetMapping("get")
    public List<Student> getAll(){// ✅
        return service.getAll();
    }
    @GetMapping("get/id/{id}")// ✅
    public Student getByID(@PathVariable int id){
        return service.getByID(id);
    }
}

//    Add student
//    update student department
//    delete student
//    Get all students
//    Get student by Id