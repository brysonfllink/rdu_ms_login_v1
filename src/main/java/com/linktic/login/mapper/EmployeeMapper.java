package com.linktic.login.mapper;

import com.linktic.login.dto.EmployeeDTO;
import com.linktic.login.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class EmployeeMapper implements IEmployeeMapper {

    private final IResourceProfilesMapper resourceProfilesMapper;

    @Override
    public EmployeeDTO employeeToEmployeeDTO(Employee employee) {
        if (employee == null)
            return null;

        return EmployeeDTO.builder()
                .resourceProfile(resourceProfilesMapper.resourceProfilesToResourceProfilesDTO(employee.getProfile()))
                .build();
    }

    @Override
    public List<EmployeeDTO> employeesToEmployeesDTO(List<Employee> employees) {
        return employees.stream()
                .map(this::employeeToEmployeeDTO)
                .collect(Collectors.toList());
    }
}
