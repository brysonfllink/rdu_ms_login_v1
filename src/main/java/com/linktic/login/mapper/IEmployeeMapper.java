package com.linktic.login.mapper;

import com.linktic.login.dto.EmployeeDTO;
import com.linktic.login.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface IEmployeeMapper {

    EmployeeDTO employeeToEmployeeDTO(Employee employee);

    List<EmployeeDTO> employeesToEmployeesDTO(List<Employee> employees);

}
