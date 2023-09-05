package com.example.demoJPA.service;

import com.example.demoJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demoJPA.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
