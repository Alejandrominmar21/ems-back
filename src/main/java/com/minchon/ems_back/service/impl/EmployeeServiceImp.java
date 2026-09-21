package com.minchon.ems_back.service.impl;

import com.minchon.ems_back.dto.EmployeeDto;
import com.minchon.ems_back.entity.Employee;
import com.minchon.ems_back.exception.ResourceNotFoundException;
import com.minchon.ems_back.mapper.EmployeeMapper;
import com.minchon.ems_back.repository.EmployeeRepository;
import com.minchon.ems_back.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImp implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmplyee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee =  employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {

        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee doesnt exists"));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
