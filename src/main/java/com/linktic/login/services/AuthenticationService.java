package com.linktic.login.services;

import com.linktic.login.config.SecurityConfig;
import com.linktic.login.dto.ContactDTO;
import com.linktic.login.mapper.IContactMapper;
import com.linktic.login.model.Contact;
import com.linktic.login.model.Security;
import com.linktic.login.repository.IContactRepository;
import com.linktic.login.repository.ISecurityRepository;
import com.linktic.login.request.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements IAuthenticationService {

    private final ISecurityRepository securityRepository;
    private final IContactRepository contactRepository;

    private final IContactMapper contactMapper;

    private final SecurityConfig securityConfig;

    @Override
    public <T> ResponseEntity<T> validateUserAndPassword(LoginDTO login) {
        if (login == null)
            return ResponseEntity.badRequest().build();

        Optional<Security> security = securityRepository.getUserByUsername(login.getUsername());

        if (security.isPresent()) {
            if (securityConfig.passwordEncoder().matches(login.getPassword(), security.get().getPassword())) {
                Optional<Contact> contact = contactRepository.findById(security.get().getContact().getIdContact());

                if(contact.isPresent()) {
                    ContactDTO contactDTO = contactMapper.contactToContactDTO(contact.get());
                    return (ResponseEntity<T>) ResponseEntity.ok().body(contactDTO);
                } else {
                    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
                }
            }
        }

        return null;
    }
}
