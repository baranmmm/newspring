package com.cybertek.services;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentService extends JpaRepository<Department, Integer> {
}
