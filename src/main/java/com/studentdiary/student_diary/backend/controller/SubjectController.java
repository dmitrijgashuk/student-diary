package com.studentdiary.student_diary.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectController {
    @GetMapping("/subject")
    public String getSubject(Model module){
        return "main";
    }
}
