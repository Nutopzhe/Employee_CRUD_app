package com.nikolayrybakov.spring.mvc.service;

import com.nikolayrybakov.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    void addEmployee(Employee emp);

    void updateEmployee(Employee emp);

    void removeEmployee(int id);
}
