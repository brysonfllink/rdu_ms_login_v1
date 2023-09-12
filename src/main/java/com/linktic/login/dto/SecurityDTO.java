package com.linktic.login.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class SecurityDTO {

    @JsonProperty
    private ContactDTO contact;

}
