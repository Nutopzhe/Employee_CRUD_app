package com.nikolayrybakov.spring.mvc.controller;

import com.nikolayrybakov.spring.mvc.entity.Employee;
import com.nikolayrybakov.spring.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeService.getAllEmployee();
        model.addAttribute("employees", allEmployees);

        return "allEmployees";
    }
}
