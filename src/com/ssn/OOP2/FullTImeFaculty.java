package com.ssn.OOP2;

public class FullTImeFaculty extends Faculty implements Staff ,BusUser{

	public FullTImeFaculty(String name, String id) {
		super(name, id);
		
	}

	@Override
	public String toString() {
		return "FullTImeFaculty [name=" + name + ", Id=" + Id + "]";
	}

	@Override
	public int takeAttendance(String day) {
		System.out.println("FullTImeFaculty taking attendance on " + day);
		return 0;
		
	}

	@Override
	public void getStaffID() {
		
		System.out.println("full time faculty staff ID : " + StaffId);
		
	}



	
	
}
