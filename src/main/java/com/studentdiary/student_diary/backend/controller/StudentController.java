package com.studentdiary.student_diary.backend.controller;

import com.studentdiary.student_diary.backend.entity.Student;
import com.studentdiary.student_diary.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    public List<Student> gelAllActiveStudent(){
        return studentRepository.findByIsActiveTrue();
    }
}
