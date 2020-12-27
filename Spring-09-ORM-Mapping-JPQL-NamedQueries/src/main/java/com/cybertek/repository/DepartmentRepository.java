package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    //Display all departments in the "Furniture" departments
    List<Department> findAllByDepartment(String department);

    //Display all departments in the Health Division WAY 1
    List<Department> findByDivision(String division);

    //Display all departments in the Health Division WAY 2
    List<Department> findByDivisionIs(String division);

    //Display all departments in the Health Division WAY 3
    List<Department> findByDivisionEquals(String division);

    //Display all departments with division name ends with "ics"
    List<Department> findByDivisionEndingWith(String pattern);


    //Display top 3 departments with division name includes "Hea", without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);




}
