package com.ssn.OOP2;

public class TestAPp {

	public static void main(String[] args) {
		
		FullTImeFaculty f1 = new FullTImeFaculty("JOhn","FC007");
		f1.takeAttendance("monday");
		f1.getStaffID();
		System.out.println(f1);
		System.out.println(f1.getClass());
	}

}
