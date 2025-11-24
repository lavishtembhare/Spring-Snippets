package com.lavish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);

        Employee e = new Employee();
        e.setName("Varun");
        e.setSalary(50000);

        dao.saveEmployee(e);

        System.out.println("Employee inserted successfully!");
    }
}
