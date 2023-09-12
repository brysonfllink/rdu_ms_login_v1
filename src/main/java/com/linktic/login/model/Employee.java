package com.linktic.login.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Table
@Entity(name = "employee")
public class Employee {

    @Id
    @Column(name = "idEmployee")
    private Integer idEmployee;

    @OneToOne
    @JoinColumn(name = "IdProfile")
    private ResourceProfiles profile;

    @ManyToOne
    @JoinColumn(name = "IdContact")
    private Contact contact;

}
