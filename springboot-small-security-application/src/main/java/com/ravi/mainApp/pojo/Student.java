package com.ravi.mainApp.pojo;

public class Student {
	
	private final long id;
	private final String name;
	
	
	public Student(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	

}
