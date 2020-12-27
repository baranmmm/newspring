package com.cybertek;

import com.cybertek.entity.Employee;
import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.EmployeeRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueriesApplication {

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;



    public static void main(String[] args) {

        SpringApplication.run(DerivedqueriesApplication.class, args);
    }

    @PostConstruct
    public void testRegions(){

        System.out.println("-------------Regions start----------------");

        System.out.println(regionRepository.findByCountry("Canada"));
        System.out.println("regionRepository.findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("regionRepository.findByCountryContaining(\"United\") = " + regionRepository.findByCountryContaining("United"));
        System.out.println("regionRepository.findByCountryContainingOrderByCountry(\"United\") = " + regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("regionRepository.findTop2ByCountry(\"United States\") = " + regionRepository.findTop2ByCountry("United States"));


        System.out.println("-------------Regions finish----------------");

        System.out.println("-------------Departments start----------------");

        System.out.println("departmentRepository.findAllByDepartment(\"Furniture\") = " + departmentRepository.findAllByDepartment("Furniture"));
        System.out.println("departmentRepository.findByDivision(\"Health\") = " + departmentRepository.findByDivision("Health"));
        System.out.println("departmentRepository.findByDivisionIs(\"Health\") = " + departmentRepository.findByDivisionIs("Health"));
        System.out.println("departmentRepository.findByDivisionEquals(\"Health\") = " + departmentRepository.findByDivisionEquals("Health"));
        System.out.println("departmentRepository.findByDivisionEndingWith(\"ics\") = " + departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("departmentRepository.findDistinctTop3ByDivisionContains(\"Hea\") = " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));



        System.out.println("-------------Departments finish----------------");

        System.out.println("-------------Employees start----------------");

        System.out.println("employeeRepository.countByFirstNameIsNot(\"Sydney\") = " + employeeRepository.countByFirstNameIsNot("Sydney"));

        System.out.println("employeeRepository.findByEmailIsNull() = " + employeeRepository.findByEmailIsNull());

        System.out.println("-------------Employees finish----------------");


    }

}
