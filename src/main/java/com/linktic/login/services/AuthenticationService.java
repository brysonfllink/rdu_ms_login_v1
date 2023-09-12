package com.linktic.login.services;

import com.linktic.login.config.SecurityConfig;
import com.linktic.login.dto.SecurityDTO;
import com.linktic.login.mapper.ICompanyMapper;
import com.linktic.login.mapper.IResourceProfilesMapper;
import com.linktic.login.mapper.ISecurityMapper;
import com.linktic.login.model.Contact;
import com.linktic.login.model.Employee;
import com.linktic.login.model.Security;
import com.linktic.login.repository.IContactRepository;
import com.linktic.login.repository.IEmployeeRepository;
import com.linktic.login.repository.ISecurityRepository;
import com.linktic.login.request.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements IAuthenticationService {

    private final IResourceProfilesMapper resourceProfilesMapper;
    private final ISecurityRepository securityRepository;
    private final IContactRepository contactRepository;
    private final IEmployeeRepository employeeRepository;

    private final SecurityConfig securityConfig;

    @Override
    public <T> ResponseEntity<T> validateUserAndPassword(LoginDTO login) {
        if (login == null)
            return ResponseEntity.badRequest().build();

        Optional<Security> security = securityRepository.getUserByUsername(login.getUsername());

        if (security.isPresent()) {
            if (securityConfig.passwordEncoder().matches(login.getPassword(), security.get().getPassword())) {
                List<Contact> result = contactRepository.findAllById(Collections.singleton(security.get().getContact().getIdContact()));
                //List<Employee> result = employeeRepository.findEmployeesByContactId(security.get().getContact().getIdContact());

                return (ResponseEntity<T>) ResponseEntity.ok().body(result);
            }
        }

        return null;
    }
}
