package com.linktic.login.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class LoginDTO {

    @JsonProperty
    private String username;

    @JsonProperty
    private String password;

}
