package com.ayyappa.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int rollNo;
	private String name;
	@Autowired
	private Address address;
	public Student(int rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
//		this.address = address;
	}
	public void display() {
		System.out.println("ROLLNO : "+rollNo);
		System.out.println("NAME : "+name);
		System.out.println("ADDRESS : "+address);
	}
}
