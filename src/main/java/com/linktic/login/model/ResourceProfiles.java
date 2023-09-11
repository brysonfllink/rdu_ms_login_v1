package com.linktic.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Table
@Entity(name = "resourceprofiles")
public class ResourceProfiles {

    @Id
    @Column(name = "IdProfile")
    private Integer idProfile;

    @Column(name = "ProfileName")
    private String profileName;

    @Column(name = "Description")
    private String description;

}
