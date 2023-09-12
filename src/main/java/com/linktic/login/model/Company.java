package com.linktic.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "company")
public class Company {

    @Id
    @Column(name = "IdCompany")
    private Integer idCompany;

    @Column(name = "Name")
    private String name;

}
