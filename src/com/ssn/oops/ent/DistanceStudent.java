package com.ssn.oops.ent;

public class DistanceStudent extends Student {

	
	public int MinDaysToPresent = 60;
	
	public DistanceStudent(String name, int iD) {
		super(name, iD);
		
	}

	@Override
	public int getfee() {
		// do some calculations 
		return 5000;
	}

}
