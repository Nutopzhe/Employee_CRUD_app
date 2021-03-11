package com.nikolayrybakov.spring.mvc.dao;

import com.nikolayrybakov.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployee();

    void saveEmployee(Employee emp);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}
