package com.eidiko.employee_management_systems.repository;


import com.eidiko.employee_management_systems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}