package com.ssn.oops.ent;

public abstract class Student {
	
	public String name;
	public int ID;
	public int MinDaysToPresent =200;
	
	public abstract int getfee();
	
	
	public String isElegibleForExam() {
		
		System.out.println("========================= ");
		System.out.println("MinDaysToPresent " + MinDaysToPresent);
		System.out.println("========================= ");
		if(getNoDaysPresent() > MinDaysToPresent) {
			return "elegible" ;
		}
		return "not elegible" ;
		
		
		
	}
	public int getNoDaysPresent() {
	  
		// fetch data from DB
		return 100;
		
	}
	
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
