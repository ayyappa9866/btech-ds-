package com.ayyappa.backend;
public class Student {
	private int rollNo;
	private String name;
	private String dept;
	Student(int rollNo,String name,String dept){
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
}
