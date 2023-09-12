package com.linktic.login.mapper;

import com.linktic.login.dto.CompanyDTO;
import com.linktic.login.model.Company;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ICompanyMapper {

    CompanyDTO companyToCompanyDTO(Company company);

    List<CompanyDTO> companiesToListCompanyDTO(List<Company> companies);

}
