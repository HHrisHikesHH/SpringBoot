package com.hrishikesh.SimpleErpApp.controller;

import com.hrishikesh.SimpleErpApp.dto.StudentPercentageDto;
import com.hrishikesh.SimpleErpApp.model.Student;
import com.hrishikesh.SimpleErpApp.service.ErpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ERP")
public class ErpController {

    @Autowired
    private ErpService service;

    @PostMapping("add") // add student ✅
    public String addStudent (@RequestBody Student student){
        return service.addStudent(student);
    }

    @PutMapping("update/name/{name}") // update student by name ✅
    public String updateStudent (@RequestBody Student student, @PathVariable String name){
        return service.updateStudent(student, name);
    }

    @PutMapping("update/id/{id}") // update student by id ✅
    public String updateStudent (@RequestBody Student student, @PathVariable int id){
        return service.updateStudent(student, id);
    }

    @GetMapping("get") // get all students ✅
    public List<Student> getStudents (){
        return service.getStudents();
    }

    @GetMapping("get/id/{id}") // get student by ID ✅
    public Student getStudent (@PathVariable int id){
        return service.getStudent(id);
    }
    @GetMapping("get/name/{name}") // get student by Name ✅
    public Student getStudent (@PathVariable String name){
        return service.getStudent(name);
    }

    @DeleteMapping("delete/name/{name}") // delete student by name ✅
    public String deleteStudent (@PathVariable String name){
        return service.deleteStudent(name);
    }

    @DeleteMapping("delete/id/{id}") // delete student by id ✅
    public String deleteStudent (@PathVariable int id){
        return service.deleteStudent(id);
    }

    @GetMapping("percentage") //get all students percentage
    public List<StudentPercentageDto> getPercentages(){
        return service.getPercentages();
    }

    @GetMapping("percentage/name/{name}") //get students percentage by name
    public StudentPercentageDto getPercentage(@PathVariable String name){
        return service.getPercentage(name);
    }

    @GetMapping("topper")
    public Student getTopper(){
        return service.getTopper();
    }
    @GetMapping("loser")
    public Student getLoser(){
        return service.getLoser();
    }

}
