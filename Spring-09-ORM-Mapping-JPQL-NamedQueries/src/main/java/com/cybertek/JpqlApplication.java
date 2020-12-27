package com.cybertek;

import com.cybertek.entity.Employee;
import com.cybertek.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JpqlApplication {

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpqlApplication.class, args);


    }

    @PostConstruct
    public void testEmployee(){


        System.out.println("-------------Employee Queries Starting--------------");

        System.out.println(employeeRepository.getEmployeeSalary());
        System.out.println(employeeRepository.getEmployeeDetails());

        System.out.println(employeeRepository.getEmployeeByEmailAndSalary("jhookd@booking.com", 126588));

        System.out.println("-------------Employee Queries Finishing--------------");


    }
}
