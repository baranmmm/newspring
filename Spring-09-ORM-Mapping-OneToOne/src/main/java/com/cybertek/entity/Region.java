package com.cybertek.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Region extends BaseEntity{

    private String region;
    private String country;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }
}
