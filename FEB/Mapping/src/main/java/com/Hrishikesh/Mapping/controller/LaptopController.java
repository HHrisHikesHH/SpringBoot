package com.Hrishikesh.Mapping.controller;

import com.Hrishikesh.Mapping.model.Laptop;
import com.Hrishikesh.Mapping.service.LaptopService;
import jakarta.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/laptop")
public class LaptopController {
    @Autowired
    LaptopService service;
    @PostMapping("saveLaptop")
    private ResponseEntity<String> saveLaptop(@RequestBody Laptop laptop, @RequestParam Integer studentId){
        String response = service.saveLaptop(laptop, studentId);
        if(response != null)
            return new ResponseEntity<>(response + "Laptop saved!", HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Laptop already exist!", HttpStatus.BAD_REQUEST);
    }
    @GetMapping("getLaptop")
    private ResponseEntity<String> getLaptop(@Nullable @RequestParam Integer laptopId,
                                             @Nullable @RequestParam Integer studentId) throws JSONException {
        JSONArray response = service.getLaptop(laptopId, studentId);
        if(response.length() != 0)
            return new ResponseEntity<>(response.toString(), HttpStatus.OK);
        else return new ResponseEntity<>("Laptop not found!", HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("updateLaptop")
    private ResponseEntity<String> updateLaptop(@RequestParam Integer laptopId){
        String response = service.updateLaptop(laptopId);
        if(response != null)
            return new ResponseEntity<>(response + " Laptop deleted!", HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Laptop already exist!", HttpStatus.BAD_REQUEST);
    }
}
