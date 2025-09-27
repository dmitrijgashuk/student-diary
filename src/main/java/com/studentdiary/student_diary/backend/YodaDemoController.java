package com.studentdiary.student_diary.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yoda/hello")
public class YodaDemoController {

    @GetMapping("/yoga")
    public String getTestYoga(){
        return "Hello, yoga!";
    }
}
