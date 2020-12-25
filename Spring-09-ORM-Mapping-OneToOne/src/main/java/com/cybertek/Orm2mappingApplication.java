package com.cybertek;

import com.cybertek.entity.Department;
import com.cybertek.entity.Employee;
import com.cybertek.enums.Gender;
import com.cybertek.repository.DepartmentService;
import com.cybertek.repository.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication
public class Orm2mappingApplication {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	DepartmentService departmentService;

	public static void main(String[] args) {

		SpringApplication.run(Orm2mappingApplication.class, args);
	}

	@PostConstruct
	public void createEmployees(){


	}

}
