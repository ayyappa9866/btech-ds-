package com.ayyappa.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ayyappa.beans.Student;
@Configuration
public class JavaConfigFile {
	@Bean("stuObj1")
	public Student createBeanObject() {
		Student s1 = new Student();
		s1.setRollNo(101);
		s1.setName("Ravi");
		s1.setDept("CSE");
		return s1;
	}
}
