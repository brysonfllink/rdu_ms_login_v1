package com.linktic.login.mapper;

import com.linktic.login.dto.CompanyDTO;
import com.linktic.login.model.Company;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CompanyMapper implements ICompanyMapper {

    @Override
    public CompanyDTO companyToCompanyDTO(Company company) {
        if (company == null)
            return null;

        return CompanyDTO.builder()
                .name(company.getName())
                .build();
    }

    @Override
    public List<CompanyDTO> companiesToListCompanyDTO(List<Company> companies) {
        return companies
                .stream()
                .map(this::companyToCompanyDTO)
                .collect(Collectors.toList());
    }
}
