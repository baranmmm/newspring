package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Getter
@Setter
@ToString

@NamedQuery(name = "Department.findByDivisions",
            query = "select d from Department d where d.division=?1")
@NamedNativeQuery(name = "Department.retrieveAllDepartments",
                  query = "SELECT * FROM DEPARTMENTS",
                  resultClass= Department.class)
public class Department {

    @Id
    private String department;

    private String division;


}
