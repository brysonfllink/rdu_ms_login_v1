package com.linktic.login.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LoginDTO {

    @JsonProperty
    private String username;

    @JsonProperty
    private String password;
    
    @JsonProperty
    private String profile;

}
