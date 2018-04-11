package com.ssn.OOP2;

public class PartTimeFaculty extends Faculty {

	public PartTimeFaculty(String name, String id) {
		super(name, id);
		
	}

	@Override
	public String toString() {
		return "PartTimeFaculty [name=" + name + ", Id=" + Id + "]";
	}

	@Override
	public int takeAttendance(String day) {
		System.out.println("PartTimeFaculty taking attendance on " + day);
		return 0;
		
	}


	
	
}
