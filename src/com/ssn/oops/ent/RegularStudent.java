package com.ssn.oops.ent;

public class RegularStudent extends Student {
	
	//public int MinDaysToPresent = 120;
	
	public RegularStudent(String name, int iD) {
		super(name, iD);
		MinDaysToPresent = 100;
	}

	@Override
	public int getfee() {
		
		// some calculation is done 
		return 10000;
	}

}
