package com.nikolayrybakov.spring.mvc.service;

import com.nikolayrybakov.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    void saveEmployee(Employee emp);

    Employee getEmployeeById(int id);

    void removeEmployee(int id);
}
