package com.kce.fitness.bean;

public class member {
	String name;
	int age;
	long mobileNumber;

	public member(String name, int age, long mobileNumber) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		
	}
	public member() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
