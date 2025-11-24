package com.lavish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EmployeeDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void saveEmployee(Employee e) {
        sessionFactory.getCurrentSession().persist(e);
    }

    @Transactional
    public void updateEmployee(Employee e) {
        sessionFactory.getCurrentSession().merge(e);
    }

    @Transactional
    public void deleteEmployee(Employee e) {
        sessionFactory.getCurrentSession().remove(e);
    }

    @Transactional(readOnly = true)
    public Employee getById(int id) {
        return sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Transactional(readOnly = true)
    public List<Employee> getEmployees() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Employee", Employee.class)
                .list();
    }
}
