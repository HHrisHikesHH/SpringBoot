package com.hrishikesh.AWS.deployment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor@AllArgsConstructor
@Table(name = "tbl_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Integer carId;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "colour")
    private String colour;
    @Column(name = "company_name")
    private String companyName;


}
