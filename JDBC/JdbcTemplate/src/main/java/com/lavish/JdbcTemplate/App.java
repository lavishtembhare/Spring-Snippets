package com.lavish.JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext ctx = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao = ctx.getBean("empDao", EmployeeDao.class);

        // Insert
        Employee e = new Employee(101, "Lavish", 50000);
        dao.saveEmployee(e);
        System.out.println("Employee Saved");

        // Update
        e.setName("Lavish T");
        e.setSalary(60000);
        dao.updateEmployee(e);
        System.out.println("Employee Updated");

        // Delete
        dao.deleteEmployee(101);
        System.out.println("Employee Deleted");
    }
}
