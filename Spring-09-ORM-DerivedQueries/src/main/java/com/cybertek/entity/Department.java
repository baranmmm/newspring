package com.cybertek.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    private String department;

    private String division;


}
