package com.ayyappa.springdemo1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ayyappa.springdemo1.beans.Employee;
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
        Employee s1 = (Employee)context.getBean("emp1");
        s1.display();
    }
}
