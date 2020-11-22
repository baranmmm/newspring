package com.cybertek.controller;

import com.cybertek.datagenerator.DataGenerator;
import com.cybertek.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    List<Employee> employeeList=new ArrayList<>();
    @GetMapping("/register")
    public String registerForm(Model model){

        model.addAttribute("employee", new Employee());
        List<String> stateList = DataGenerator.getStateList();

        model.addAttribute("statelist", stateList);

        return "employee/register-form";

    }

    @PostMapping("/success")
    public String registeredForm(@ModelAttribute("employee") Employee employee, Model model){


        employeeList.add(employee);
        Integer age= LocalDate.now().getYear()-LocalDate.parse(employee.getBirthday()).getYear();
        employeeList.get(employeeList.size()-1).setAge(age);
        model.addAttribute("employees", employeeList);


        return "employee/registered";

    }

}
