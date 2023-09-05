package com.example.demoJPA.repository;

import com.example.demoJPA.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
