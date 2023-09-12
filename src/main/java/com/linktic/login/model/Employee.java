package com.linktic.login.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Table
@Entity(name = "employee")
public class Employee {

    @Id
    private Integer idEmployee;

    @OneToOne
    @JoinColumn(name = "IdContact")
    private Contact contact;

    @OneToMany
    @JoinColumn(name = "IdProfile")
    private List<ResourceProfiles> profiles;
}
