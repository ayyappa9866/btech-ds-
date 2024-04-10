package com.ayyappa.springdemo1.beans;
public class Employee {
	private int empId;
	private String name;
	private long phone;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void display() {
		System.out.println("EMPID : "+empId);
		System.out.println("NAME : "+name);
		System.out.println("PHONE : "+phone);
	}
}
