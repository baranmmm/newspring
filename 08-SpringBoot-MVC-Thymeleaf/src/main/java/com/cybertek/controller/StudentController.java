package com.cybertek.controller;


import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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

        Student student1 = new Student(2,"Sedat Emre", "Baran");
        Student student2 = new Student(3, "Selcen Azra", "Baran");

        List<Student> studentList =new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        model.addAttribute("studentList", studentList);


        return "student/first";


    }

    @GetMapping("/goregister")
    public String home(){

        return "student/register";

    }
}
