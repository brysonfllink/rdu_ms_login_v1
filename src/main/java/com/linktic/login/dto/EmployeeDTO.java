package com.linktic.login.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public class EmployeeDTO {

    @JsonProperty
    private ContactDTO contact;

    @JsonProperty
    private List<ResourceProfilesDTO> resourceProfiles;

}
