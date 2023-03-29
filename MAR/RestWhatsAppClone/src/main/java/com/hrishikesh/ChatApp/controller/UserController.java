package com.hrishikesh.ChatApp.controller;

import com.hrishikesh.ChatApp.exceptionHandler.UserNotFoundException;
import com.hrishikesh.ChatApp.model.User;
import com.hrishikesh.ChatApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("signUp")//✅
    private ResponseEntity<String> saveUser(@Valid @RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user).getUserName() + " saved",
                HttpStatus.CREATED);
    }
    @PostMapping("logIn")
    private ResponseEntity<String> logIn(@RequestParam Integer userId) throws UserNotFoundException {
        String response = userService.logIn(userId);
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }

    //log out
    //log in
    //solve login problem
    @GetMapping("showProfile")//✅
    private ResponseEntity<List<User>> showProfile
    (@Nullable String adminPassword) throws UserNotFoundException {
        List<User> userList= userService.getUser(adminPassword);
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
    @DeleteMapping("deleteProfile")//✅
    private ResponseEntity<String> deleteUser(@RequestParam Integer userId) throws UserNotFoundException {
        String response = userService.deleteUser(userId);
        return new ResponseEntity<>(response + " deleted", HttpStatus.OK);
    }

    @PutMapping("updateUser")//✅
    private ResponseEntity<String> updateUser(@RequestParam Integer userId, @RequestBody User user) throws UserNotFoundException {
        return new ResponseEntity<>(userService.updateUser(userId, user).getUserName() + " updated",
                HttpStatus.OK);
    }
    @PostMapping("addContact")//✅
    private Map<String, List<Integer>> addContact(@RequestParam Integer userId,
                                           @RequestParam String contactIds) throws UserNotFoundException {
        return userService.addContact(userId, contactIds);
    }

    // Create Delete Contact
}
