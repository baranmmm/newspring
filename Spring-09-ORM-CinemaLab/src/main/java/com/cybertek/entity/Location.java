package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Location extends BaseEntity{

    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Integer postalCode;
    private String country;
    private String state;
    private String city;
    private String address;

}
