package com.hrishikesh.AWS.deployment.repository;


import com.hrishikesh.AWS.deployment.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
