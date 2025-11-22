package com.lavish;

import java.util.List;   // <-- IMPORTANT
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  

        EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");  

        List<Employee> list = dao.getAllEmployees();  

        for (Employee e : list) { 
            System.out.println(e);
        }
    }
}
