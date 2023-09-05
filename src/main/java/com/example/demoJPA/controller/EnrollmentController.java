package com.example.demoJPA.controller;

import com.example.demoJPA.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoJPA.model.Enrollment;
@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment enrollStudentInCourse(@RequestBody Enrollment enrollment) {
        return enrollmentService.enrollStudentInCourse(enrollment);
    }
}