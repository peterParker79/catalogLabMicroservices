package com.data.services.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class CourseDTO {
    private String courseCode;
    private String courseName;
}

