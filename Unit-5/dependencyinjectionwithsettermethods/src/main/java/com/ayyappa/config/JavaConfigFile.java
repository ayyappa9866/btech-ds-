package com.ayyappa.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ayyappa.beans.Address;
import com.ayyappa.beans.Student;
@Configuration
public class JavaConfigFile {
	@Bean
	public Address createAddressObject() {
		Address a1 = new Address();
		a1.setHouseNo(622);
		a1.setCity("Vijayawada");
		a1.setPinCode(523002);
		return a1;
	}
	@Bean
	public Student createStudentObject() {
		Student s1 = new Student();
		s1.setRollNo(205010501);
		s1.setName("Avain");
		s1.setAddress(createAddressObject());// DI Manually
		return s1;
	}	
}
