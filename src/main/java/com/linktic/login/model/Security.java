package com.linktic.login.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
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

    @OneToOne
    @JoinColumn(name = "idContact")
    private Contact contact;

}
