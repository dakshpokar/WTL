package com.main.pkg;

public class Student {
	private String name;
	private String rollno;
	private String branch;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(String name, String rollno, String branch, Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
		this.address = address;
	}
	
	
}
