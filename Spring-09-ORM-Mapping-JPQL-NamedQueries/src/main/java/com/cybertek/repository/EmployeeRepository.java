package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select e from Employee e where e.email='dtrail8@tamu.edu'")
    Employee getEmployeeDetails();

    @Query("select e.salary from Employee e where e.email='dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    @Query("select e from Employee e where e.email=?1")
    Optional<Employee> getEmployeeByEmail(String email);

    @Query("select e from Employee e where e.email=?1")
    Employee getEmployeeByEmail1(String email);



    //Single bind parameter
    @Query("select e from Employee e where e.salary=?1")
    Employee getEmployeeBySalaryBindParameter(Integer salary);

    //Single named parameter
    @Query("select e from Employee e where e.salary=:salary")
    Employee getEmployeeBySalaryNamedParameter(@Param("salary") Integer salary);

    //Multiple bind parameter
    @Query("select e from Employee e where e.email=?1 and e.salary=?2")
    Employee getEmployeeByEmailAndSalary(String email, Integer salary);

    @Query("select e from Employee e where e.email=:email and e.salary=:salary")
    Employee getEmployeeByEmailAndSalaryNamedParameter(@Param("salary") Integer salary, @Param("email") String email);










}
