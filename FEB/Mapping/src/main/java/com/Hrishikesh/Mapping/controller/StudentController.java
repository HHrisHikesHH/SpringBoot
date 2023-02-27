package com.Hrishikesh.Mapping.controller;

import com.Hrishikesh.Mapping.model.Student;
import com.Hrishikesh.Mapping.service.StudentService;
import jakarta.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("saveStudent") // ✅
    private ResponseEntity<String> saveStudent(@RequestBody Student student){
        String response = service.saveStudent(student); // response = student name
        return new ResponseEntity<>("Student with name " + response + " saved!", HttpStatus.CREATED);
    }

    @GetMapping("getStudent") // ✅
    private ResponseEntity<String> getStudent(@Nullable @RequestParam Integer studentId) throws JSONException {
        JSONArray response = service.getStudent(studentId);
        if(response != null)
            return new ResponseEntity<>(response.toString(), HttpStatus.OK);
        else return new ResponseEntity<>("Student not found!", HttpStatus.NOT_FOUND);
    }

    @PutMapping("updateStudent") // ✅
    private ResponseEntity<String> updateStudent(@RequestBody Student student, @RequestParam Integer studentId) throws JSONException {
        JSONObject response = service.updateStudent(student,studentId);
        if(response != null)
            return new ResponseEntity<>("Student with name " + response.get("name") + " updated!", HttpStatus.CREATED);
        else return new ResponseEntity<>("Student not found!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("deleteStudent") // ✅
    private ResponseEntity<String> deleteStudent(@RequestParam Integer studentId) throws JSONException {
        String response = service.deleteStudent(studentId); // response = student name
        if(response != null)
            return new ResponseEntity<>("Student with name " + response + " deleted!", HttpStatus.OK);
        else return new ResponseEntity<>("Student not found!", HttpStatus.NOT_FOUND);
    }

}
