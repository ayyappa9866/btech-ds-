package com.ayyappa.springdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayyappa.springdemo2.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s1 = (Student)context.getBean("stu1");
        s1.display();
    }
}
