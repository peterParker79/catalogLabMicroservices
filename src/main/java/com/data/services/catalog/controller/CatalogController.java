package com.data.services.catalog.controller;

import com.data.services.catalog.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/catalog")
@RequiredArgsConstructor

public class CatalogController {

    private final RestTemplate restTemplate;




    @GetMapping("/{courseCode}")
    public CatalogDTO getCourseFromGrade(@PathVariable String courseCode) {
        System.out.println("ESTO ES COURSE CODE: " + courseCode);
        CourseDTO courseDTO= restTemplate.getForObject("http://grades-data-service/courses/" + courseCode, CourseDTO.class);

        CatalogDTO catalogDTO=new CatalogDTO();
        catalogDTO.setCourseName(courseDTO.getCourseName());
        return catalogDTO;
//        // notas del curso
//        GradeDTO[] grades = restTemplate.getForObject(
//                "http://grades-data-service/courses/" + courseCode + "/grades",
//                GradeDTO[].class
//        );
//
//        // 3. Para cada nota, obtener el estudiante asociado
//        List<StudentGradeDTO> studentGrades = Arrays.stream(grades)
//                .map(grade -> {
//                    StudentDTO student = restTemplate.getForObject(
//                            "http://student-info-service/students/" + grade.getStudentId(),
//                            StudentDTO.class
//                    );
//                    return new StudentGradeDTO(student.getName(), student.getAge(), grade.getGrade());
//                })
//                .toList();


        // return new CatalogDTO(course.getCourseName(), studentGrades);

    }

}

