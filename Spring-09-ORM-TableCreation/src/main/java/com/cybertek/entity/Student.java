package com.cybertek.entity;

import com.cybertek.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "students")    //This line changes the name of the table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName;
    private String lastName;
    private String email;

    @Transient
    private String city;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Temporal(TemporalType.TIME)
    private Date birthTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;


    @Column(columnDefinition = "DATE")
    private LocalDate localDate;

    @Column(columnDefinition = "TIME")
    private LocalDate localTime;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate localDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;




}
