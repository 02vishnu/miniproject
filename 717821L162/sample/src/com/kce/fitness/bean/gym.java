package com.kce.fitness.bean;

public class gym {
	String name;
	String branch;
	int no_of_trainers;
	public gym(String name, String branch, int no_of_trainers) {
		super();
		this.name = name;
		this.branch = branch;
		this.no_of_trainers = no_of_trainers;
	}
	public gym() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getNo_of_trainers() {
		return no_of_trainers;
	}
	public void setNo_of_trainers(int no_of_trainers) {
		this.no_of_trainers = no_of_trainers;
	}
}
	
