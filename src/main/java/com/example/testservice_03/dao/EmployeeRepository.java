package com.example.testservice_03.dao;

import com.example.testservice_03.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    Employee findByEmail(String email);
}
