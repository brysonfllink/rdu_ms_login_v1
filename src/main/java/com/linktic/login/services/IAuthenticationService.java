package com.linktic.login.services;

import com.linktic.login.exceptions.NoUserException;
import com.linktic.login.request.LoginDTO;
import org.springframework.http.ResponseEntity;

public interface IAuthenticationService {

    <T> ResponseEntity<T> validateUserAndPassword(LoginDTO login);

}
