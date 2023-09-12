package com.linktic.login.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Table
@Entity(name = "contact")
public class Contact {

    @Id
    @Column(name = "IdContact")
    private Integer idContact;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "JobTitle")
    private String jobTitle;

    @OneToOne
    @JoinColumn(name = "IdCompany")
    private Company company;

    @OneToMany(mappedBy = "contact")
    private List<Employee> employees;

}
