package com.linktic.login.controller;

import com.linktic.login.services.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class AuthenticationRest {

    private final IAuthenticationService authenticationService;

    @PostMapping
    public String validUser() {
        return "Hola";
    }

    @GetMapping("/companies")
    public ResponseEntity<String> getAllCompaniesAndRoles() {
        return ResponseEntity.ok().body("Hola");
    }

}
