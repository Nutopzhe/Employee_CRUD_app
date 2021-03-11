package com.nikolayrybakov.spring.mvc.service;

import com.nikolayrybakov.spring.mvc.dao.EmployeeDAO;
import com.nikolayrybakov.spring.mvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee emp) {
        employeeDAO.saveEmployee(emp);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee emp) {

    }

    @Override
    @Transactional
    public void removeEmployee(int id) {

    }
}
