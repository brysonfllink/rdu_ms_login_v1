package com.linktic.login.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class EmployeeDTO {

    @JsonProperty
    private ResourceProfilesDTO resourceProfile;

}
