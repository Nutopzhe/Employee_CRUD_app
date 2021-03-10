package com.nikolayrybakov.spring.mvc.dao;

import com.nikolayrybakov.spring.mvc.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private  SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee",
                Employee.class).getResultList();
        return allEmployees;
    }

    @Override
    @Transactional
    public void addEmployee(Employee emp) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(emp);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee emp) {
        Session session = sessionFactory.getCurrentSession();
        session.update(emp);
    }

    @Override
    @Transactional
    public void removeEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee emp = session.get(Employee.class, id);
        if (emp != null) {
            session.delete(emp);
        }
    }
}
