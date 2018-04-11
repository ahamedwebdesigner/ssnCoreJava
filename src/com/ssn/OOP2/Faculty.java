package com.ssn.OOP2;

public abstract class Faculty {
	public String name;
	public String Id;
	
	public abstract int takeAttendance(String day);
	
	public Faculty(String name, String id) {
		this.name = name;
		Id = id;
	}
	
}
