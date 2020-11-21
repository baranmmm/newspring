package com.cybertek.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class Student {

    @GetMapping("/welcome")
    public String welcome(Model model){

        model.addAttribute("name", "mehmet");
        model.addAttribute("surname", "baran");
        model.addAttribute("age", "36");
        model.addAttribute("gender", "male");


        return "student/first";


    }
}
