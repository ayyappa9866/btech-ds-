package com.ayyappa.springdemo2.beans;
public class Student {
	private int rollNo;
	private String name;
	private String dept;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void display() {
		System.out.println("ROLLNO :"+rollNo);
		System.out.println("NAME : "+name);
		System.out.println("DEPT : "+dept);
	}
}
