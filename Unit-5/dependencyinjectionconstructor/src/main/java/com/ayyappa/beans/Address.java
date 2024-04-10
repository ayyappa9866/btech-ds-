package com.ayyappa.beans;

public class Address {
	private int houseNo;
	private String city;
	private int pinCode;
	public Address(int houseNo,String city,int pinCode) {
		this.city = city;
		this.houseNo = houseNo;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
}
