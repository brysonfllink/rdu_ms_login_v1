package com.linktic.login.services;

import com.linktic.login.dto.CompanyDTO;

import java.util.List;

public interface IAuthenticationService {

    List<CompanyDTO> getCompanies();

}
