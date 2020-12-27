package com.cybertek.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String region;
    private String country;



}
