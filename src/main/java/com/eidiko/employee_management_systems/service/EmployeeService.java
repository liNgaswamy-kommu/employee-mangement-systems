package com.eidiko.employee_management_systems.service;
import com.eidiko.employee_management_systems.entity.Employee;
import com.eidiko.employee_management_systems.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee update(Long id, Employee employee) {
        employee.setId(id);
        return repository.save(employee);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
