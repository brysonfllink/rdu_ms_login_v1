package com.linktic.login.rest;

import com.linktic.login.request.LoginDTO;
import com.linktic.login.services.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
@CrossOrigin("*")
@RequiredArgsConstructor
public class AuthenticationRest {

    private final IAuthenticationService authenticationService;

    @PostMapping("validate")
    public <T> ResponseEntity<T> login(@RequestBody LoginDTO login) {
        return authenticationService.validateUserAndPassword(login);
    }
    
    @PostMapping("log")
    public ResponseEntity saveLoginLog(@RequestBody LoginDTO request) {
		return authenticationService.saveLoginLog(request);
    }

}
