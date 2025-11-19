package com.lavish.Dependency_Injection_by_Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lavish.Dependency_Injection_by_Constructor.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory bean=new ClassPathXmlApplicationContext("Spring.xml");
    	Employee e=(Employee)bean.getBean("Employee");
        e.show();
    }
}
