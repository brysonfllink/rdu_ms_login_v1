package com.linktic.login.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Builder
public class ResourceProfilesDTO {

    @JsonProperty
    private String profileName;

}
