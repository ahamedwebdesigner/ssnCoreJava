package com.ssn.oops.ent;

public class RegularStudent extends Student {
	
	public int MinDaysToPresent = 100;
	public int bufferDays;
	
	public RegularStudent(String name, int iD,int bufferDays) {
		super(name, iD);
		super.MinDaysToPresent = this.MinDaysToPresent + bufferDays;
	}

	@Override
	public int getfee() {
		
		// some calculation is done 
		return 10000;
	}

}
