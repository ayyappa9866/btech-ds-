package com.ayyappa.beans;

public class Student {
	private int rollNo;
	private String name;
	private Address address;
	public Student(int rollNo,String name,Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println("ROLLNO : "+rollNo);
		System.out.println("NAME : "+name);
		System.out.println("ADDRESS : "+address);
	}
}
