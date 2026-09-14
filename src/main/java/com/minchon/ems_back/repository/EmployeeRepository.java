package com.minchon.ems_back.repository;

import com.minchon.ems_back.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
