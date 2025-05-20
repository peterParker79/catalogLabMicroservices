package com.data.services.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentGradeDTO {
    private String name;
    private Integer age;
    private Double grade;
}