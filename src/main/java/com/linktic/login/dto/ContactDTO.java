package com.linktic.login.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class ContactDTO {

    @JsonProperty
    private String fullName;

    @JsonProperty
    private String jobTitle;

    @JsonProperty
    private CompanyDTO company;

}
