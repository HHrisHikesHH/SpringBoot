package com.hrishikesh.AWS.deployment.controller;

import com.hrishikesh.AWS.deployment.model.Car;
import com.hrishikesh.AWS.deployment.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/car")
public class CarController {
    @Autowired
    CarService service;

    @PostMapping(value = "saveCar")
    private ResponseEntity<String> saveCar(@RequestBody Car car){
        String response = service.saveCar(car);
        return new ResponseEntity<>("Car with Model name " + response + " Saved!", HttpStatus.CREATED);
    }

    @GetMapping(value = "getCar")
    private ResponseEntity<List<Car>> getCar(){
        List<Car> response = service.getCar();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "getCar/{carId}")
    private ResponseEntity<Car> getCarById(@PathVariable Integer carId){
        Car response = service.getCarById(carId);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
