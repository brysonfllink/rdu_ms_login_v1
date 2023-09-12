package com.linktic.login.services;

import com.linktic.login.config.SecurityConfig;
import com.linktic.login.dto.SecurityDTO;
import com.linktic.login.mapper.ICompanyMapper;
import com.linktic.login.mapper.IResourceProfilesMapper;
import com.linktic.login.mapper.ISecurityMapper;
import com.linktic.login.model.Employee;
import com.linktic.login.model.Security;
import com.linktic.login.repository.ICompanyRepository;
import com.linktic.login.repository.IEmployeeRepository;
import com.linktic.login.repository.ISecurityRepository;
import com.linktic.login.request.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements IAuthenticationService {

    private final IResourceProfilesMapper resourceProfilesMapper;
    private final ISecurityRepository securityRepository;
    private final IEmployeeRepository employeeRepository;

    private final SecurityConfig securityConfig;

    @Override
    public <T> ResponseEntity<T> validateUserAndPassword(LoginDTO login) {
        if (login == null)
            return ResponseEntity.badRequest().build();

        Optional<Security> security = securityRepository.getUserByUsername(login.getUsername());

        if (security.isPresent()) {
            if (securityConfig.passwordEncoder().matches(login.getPassword(), security.get().getPassword())) {
                List<Employee> employees = employeeRepository.findEmployeesByContactId(security.get().getContact().getIdContact());

                System.out.println(employees);

                return (ResponseEntity<T>) ResponseEntity.ok().body(employees);
            }
        }

        return null;
    }
}
