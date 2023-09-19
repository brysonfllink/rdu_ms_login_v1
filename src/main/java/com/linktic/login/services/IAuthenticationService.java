package com.linktic.login.services;

import com.linktic.login.request.LoginDTO;
import org.springframework.http.ResponseEntity;

public interface IAuthenticationService {

    <T> ResponseEntity<T> validateUserAndPassword(LoginDTO login);
    
    ResponseEntity<?> saveLoginLog(LoginDTO request);

}
