package com.hrishikesh.SimpleErpApp.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Data
public class Student {
    private int rollNum;
    private String name;
    private List<Integer> marks;
    private String city;
    private String gender;
}
