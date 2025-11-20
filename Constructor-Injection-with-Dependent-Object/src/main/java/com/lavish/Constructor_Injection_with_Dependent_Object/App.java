package com.lavish.Constructor_Injection_with_Dependent_Object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
        BeanFactory factory= new ClassPathXmlApplicationContext("applicationContext.xml");  
          
        Employee s=(Employee)factory.getBean("e");  
        s.show();  
    }
}
