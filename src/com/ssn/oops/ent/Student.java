package com.ssn.oops.ent;

public class Student {
	public String name;
	public int ID;
	public String getName() {
		return name;
	}
	
	public Student(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + "]";
	}
	
	

}
