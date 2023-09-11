package com.linktic.login.services;

import com.linktic.login.dto.CompanyDTO;
import com.linktic.login.repository.ICompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements IAuthenticationService {

    private final ICompanyRepository companyRepository;

    @Override
    public List<CompanyDTO> getCompanies() {
        return companyRepository.findAll();
    }
}
