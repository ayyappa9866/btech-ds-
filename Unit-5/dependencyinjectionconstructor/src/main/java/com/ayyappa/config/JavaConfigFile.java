package com.ayyappa.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ayyappa.beans.Address;
import com.ayyappa.beans.Student;
@Configuration
public class JavaConfigFile {
	@Bean
	public Address createAddressObject() {
		Address a1 = new Address(6227,"Chennai",600062);
		return a1;
	}
	@Bean
	public Student createStudentObject() {
		Student s1 = new Student(205,"XYZ",createAddressObject());
		return s1;
	}	
}
