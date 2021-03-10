package com.nikolayrybakov.spring.mvc.dao;

import com.nikolayrybakov.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployee();

    void addEmployee(Employee emp);

    void updateEmployee(Employee emp);

    void removeEmployee(int id);

}