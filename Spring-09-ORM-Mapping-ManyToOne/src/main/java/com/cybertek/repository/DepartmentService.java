package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentService extends JpaRepository<Department, Integer> {
}
