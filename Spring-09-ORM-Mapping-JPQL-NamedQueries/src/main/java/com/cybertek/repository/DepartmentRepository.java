package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    List<Department> retrieveDepartmentByDivision(String division);

    List<Department> findByDivisions(String division);

    List<Department> retrieveAllDepartments();


    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContains(String pattern);

}
