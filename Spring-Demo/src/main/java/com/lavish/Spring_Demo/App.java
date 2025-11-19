package com.lavish.Spring_Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory bean=new ClassPathXmlApplicationContext("Spring.xml");
    	Student s=(Student)bean.getBean("Student");
        s.code();
    }
}
