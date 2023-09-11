package com.linktic.login.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/login")
public class AuthenticationRest {


    @PostMapping
    public String validUser() {
        return "Hola";
    }

}
