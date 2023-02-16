package com.hrishikesh.UserManagementSystem.controller;

import com.hrishikesh.UserManagementSystem.model.UMmodel;
import com.hrishikesh.UserManagementSystem.service.UMservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("MyApi/UserManagement/")
public class UMcontroller {
//    @Autowired
    private final UMservice service;

    public UMcontroller(UMservice service) { this.service = service;}
    //    addUser
    @PostMapping("addUser") //create
    public String addUser(@RequestBody UMmodel model){
        service.addUser(model);
        return "Added";
    }
//    getUser/{userid}
    @GetMapping("getUser/{userid}") //
    public UMmodel addUserById(@PathVariable int userid){
        return service.getModelByID(userid);
    }

//    getAllUser
    @GetMapping("getAllUser") //
    public List<UMmodel> getAllUser(@RequestBody UMmodel model){ return service.getModel(); }

//    updateUserInfo
    @PutMapping("updateUserInfo/{id}") //
    public String updateUserInfo(@RequestBody UMmodel model, @PathVariable int id){
        service.update(model, id);
        return "Updated";
    }

//    deleteUser
    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        service.delete(id);
        return "Deleted";
    }

}
