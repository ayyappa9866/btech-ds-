package com.ayyappa.springdemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ayyappa.beans.Student;
import com.ayyappa.config.JavaConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
        Student s1 = (Student)context.getBean("stuObj1");
        s1.display();
    }
}
