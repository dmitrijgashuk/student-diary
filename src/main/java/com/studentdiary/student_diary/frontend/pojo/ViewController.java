package com.studentdiary.student_diary.frontend.pojo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/")
    public String getGreetings(Model model) {
        model.addAttribute("subject", new Subject("1", "Math", "Subject for nature", "Jon Montesory"));
        model.addAttribute("user", "Olexa");
        return "index";
    }
}
