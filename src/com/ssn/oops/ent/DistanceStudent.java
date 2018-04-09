package com.ssn.oops.ent;

public class DistanceStudent extends Student {

	
	public int MinDaysToPresent = 60;
	public int bufferDays;
	
	public DistanceStudent(String name, int iD ,int bufferDays) {
		super(name, iD);
		super.MinDaysToPresent = this.MinDaysToPresent+bufferDays;
	}

	@Override
	public int getfee() {
		// do some calculations 
		return 5000;
	}

}
