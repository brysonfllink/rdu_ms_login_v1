package com.linktic.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity(name = "security")
public class Security {

    @Id
    @Column(name = "IdSec")
    private Integer idSec;

    @Column(name = "Login")
    private String login;

    @Column(name = "Password")
    private String password;

}
