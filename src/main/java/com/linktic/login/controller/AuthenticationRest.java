package com.linktic.login.controller;

import com.linktic.login.dto.CompanyDTO;
import com.linktic.login.request.LoginDTO;
import com.linktic.login.services.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
@RequiredArgsConstructor
public class AuthenticationRest {

    private final IAuthenticationService authenticationService;

    @PostMapping("validate")
    public <T> ResponseEntity<T> login(@RequestBody LoginDTO login) {
        return authenticationService.validateUserAndPassword(login);
    }

}
