package com.data.services.catalog.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class GradeDTO {
    private Long id;
    private Double grade;
    private Long studentId;
    private CourseDTO course;
}
