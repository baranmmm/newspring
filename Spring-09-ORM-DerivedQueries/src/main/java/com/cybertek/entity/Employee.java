package com.cybertek.entity;

import com.cybertek.enums.Gender;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private BigDecimal salary;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;



}
