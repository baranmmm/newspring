package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //Display all employees with email address
    List<Employee> findAllByEmail(String email);

    //Display all employees with first name "" and last name "", also show all employees with an email address ""
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);


    //Display all employees that first name is not ""
    Integer countByFirstNameIsNot(String firstName);

    //Display all employees where lat name starts with ""
    List<Employee> findByLastNameStartsWith(String pattern);


    //Display all employees with salaries higher than ""
    List<Employee> findBySalaryGreaterThan(Integer amount);


    //Display all employees with salaries less than ""
    List<Employee> findBySalaryLessThan(Integer amount);


    //Display all employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);


    //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThanEqual(Integer amount);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();






}
