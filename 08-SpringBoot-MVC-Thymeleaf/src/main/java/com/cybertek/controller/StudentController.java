package com.cybertek.controller;


import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String welcome(Model model){

        model.addAttribute("name", "mehmet");
        model.addAttribute("surname", "baran");
        model.addAttribute("age", "36");
        model.addAttribute("gender", "male");


        //we can pass object through controller
        Student student=new Student(1,"Mehmet", "Baran");
        model.addAttribute("student", student);


        return "student/first";


    }
}
