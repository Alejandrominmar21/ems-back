package com.minchon.ems_back.service;

import com.minchon.ems_back.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmplyee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

}
