package com.example.demoJPA.service;

import com.example.demoJPA.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demoJPA.model.Enrollment;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;


    public Enrollment enrollStudentInCourse(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }
}
