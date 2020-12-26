package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address extends BaseEntity{

    private String street;
    private String zipCode;

    @ManyToOne
    private Person person;


    public Address(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }
}
