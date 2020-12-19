package com.cybertek;

import com.cybertek.entity.Department;
import com.cybertek.entity.Employee;
import com.cybertek.enums.Gender;
import com.cybertek.services.DepartmentService;
import com.cybertek.services.EmployeeService;
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

		Employee e1=new Employee("mehmet","baran","m.barann84@gmail.com", LocalDate.parse("1984-07-30"), Gender.MALE,12345);
		Employee e2=new Employee("sati","baran","sati@gmail.com", LocalDate.parse("1988-08-20"), Gender.FEMALE,12345);
		Employee e3=new Employee("sedat emre","baran","sedat@gmail.com", LocalDate.parse("2013-03-11"), Gender.MALE,12345);
		Employee e4=new Employee("selcen azra","baran","azra@gmail.com", LocalDate.parse("2015-06-02"), Gender.FEMALE,12345);

		employeeService.save(e1);
		employeeService.save(e2);
		employeeService.save(e3);
		employeeService.save(e4);


		Department d1=new Department("Computers", "Electronics");
		Department d2=new Department("Gardening", "Home");
		Department d3=new Department("Movies", "Entertainment");

		departmentService.save(d1);
		departmentService.save(d2);
		departmentService.save(d3);

	}

}
