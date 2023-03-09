package com.hrishikesh.ChatApp.controller;

import com.hrishikesh.ChatApp.model.Status;
import com.hrishikesh.ChatApp.service.StatusService;
import com.hrishikesh.ChatApp.util.StatusUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/status")
public class StatusController {
    @Autowired
    StatusService service;
    @Autowired
    StatusUtil util;
    @PostMapping("saveStatus")
    private ResponseEntity<String> saveStatus(@RequestBody String statusData){
        Status status = util.stringToJsonToStatus(statusData);
        Status response = service.saveStatus(status);
        return new ResponseEntity<>("Status with statusName " + response.getStatusName(), HttpStatus.CREATED);
    }

}
