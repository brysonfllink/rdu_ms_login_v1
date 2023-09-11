package com.linktic.login.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class CompanyDTO {

    @JsonProperty
    private String name;

}
