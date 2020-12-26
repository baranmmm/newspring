package com.cybertek.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user_account")
public class User extends BaseEntity{

    private String email;
    private String password;
    private String username;


    @OneToOne
    @JoinColumn(name = "account_details_id")
    private Account account;

}