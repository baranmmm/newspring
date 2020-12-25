package com.cybertek.bootstrap;

import com.cybertek.entity.Department;
import com.cybertek.entity.Employee;
import com.cybertek.entity.Region;
import com.cybertek.enums.Gender;
import com.cybertek.repository.DepartmentService;
import com.cybertek.repository.EmployeeService;
import com.cybertek.repository.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;
//    WE DON'T NEED departmentService and @Repository if we use Cascading.

    @Autowired
    RegionService regionService;


    @Override
    public void run(String... args) throws Exception {

        Employee e1=new Employee("mehmet","baran","m.barann84@gmail.com", LocalDate.parse("1984-07-30"), Gender.MALE,12345);
        Employee e2=new Employee("sati","baran","sati@gmail.com", LocalDate.parse("1988-08-20"), Gender.FEMALE,12345);
        Employee e3=new Employee("sedat emre","baran","sedat@gmail.com", LocalDate.parse("2013-03-11"), Gender.MALE,12345);
        Employee e4=new Employee("selcen azra","baran","azra@gmail.com", LocalDate.parse("2015-06-02"), Gender.FEMALE,12345);

        Department d1=new Department("Computers", "Electronics");
        Department d2=new Department("Gardening", "Home");
        Department d3=new Department("Movies", "Entertainment");
        Department d4=new Department("First Aid", "Health");

        Region r1=new Region("Southwest", "United States");
        Region r2=new Region("Northwest", "United States");
        Region r3=new Region("Central", "Asia");
        Region r4=new Region("Quebec", "Canada");

        regionService.save(r1);
        regionService.save(r2);
        regionService.save(r3);
        regionService.save(r4);

        departmentService.save(d1);
        departmentService.save(d2);
        departmentService.save(d3);
        departmentService.save(d4);

        employeeService.save(e1);
        employeeService.save(e2);
        employeeService.save(e3);
        employeeService.save(e4);

        e1.setDepartment(d1);
        e2.setDepartment(d1);
        e3.setDepartment(d1);
        e4.setDepartment(d4);

        e1.setRegion(r1);
        e2.setRegion(r2);
        e3.setRegion(r3);
        e4.setRegion(r4);

        employeeService.save(e1);
        employeeService.save(e2);
        employeeService.save(e3);
        employeeService.save(e4);

        employeeService.delete(e1);





    }
}
