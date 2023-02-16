package com.hrishikesh.SimpleErpApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentPercentageDto {
    private String name;
    private int mark;
    private double percentage;
}
