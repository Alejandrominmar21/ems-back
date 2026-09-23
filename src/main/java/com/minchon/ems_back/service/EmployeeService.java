package com.minchon.ems_back.service;

import com.minchon.ems_back.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmplyee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);
}
