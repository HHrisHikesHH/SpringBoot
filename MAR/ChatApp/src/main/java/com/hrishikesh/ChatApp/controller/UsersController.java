package com.hrishikesh.ChatApp.controller;

import com.hrishikesh.ChatApp.model.Users;
import com.hrishikesh.ChatApp.service.UsersService;
import com.hrishikesh.ChatApp.util.UsersUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {
    @Autowired
    UsersUtil util;
    @Autowired
    UsersService service;

    @PostMapping("saveUser")
    private ResponseEntity<String> saveUser(@RequestBody String userData){
        JSONObject isValid = util.validateUser(userData);
        if(isValid.keySet().isEmpty()){
            Users users = util.stringToJsonToUsers(userData);
            Users response = service.saveUser(users);
            return new ResponseEntity<>("Users with userName " + response.getUsername(), HttpStatus.CREATED);
        }
        else return new ResponseEntity<>("Users with userName " + isValid.toString(), HttpStatus.BAD_REQUEST);
    }

}
