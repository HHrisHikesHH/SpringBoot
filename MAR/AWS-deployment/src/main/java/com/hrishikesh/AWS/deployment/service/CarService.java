package com.hrishikesh.AWS.deployment.service;

import com.hrishikesh.AWS.deployment.model.Car;
import com.hrishikesh.AWS.deployment.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository repository;

    public String saveCar(Car car) {
        return repository.save(car).getModelName();
    }

    public List<Car> getCar() {
        return repository.findAll();
    }

    public Car getCarById(Integer carId) {
        if(repository.findById(carId).isPresent())
            return repository.findById(carId).get();
        else
            return null;
    }
}
