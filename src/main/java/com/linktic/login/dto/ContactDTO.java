package com.linktic.login.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ContactDTO {

    private String fullName;
    private String jobTitle;
    private String email;
    private CompanyDTO company;
    private List<EmployeeDTO> employees;

}
