package com.ssn.enumtest;

public class Enum_methods_4 {

	
	enum ScreenColor{
	    RED, GREEN, BLUE;
	 
	    // enum constructor called separately for each constant
		// outpuds three colours  when loaded
	    private ScreenColor(){
	        System.out.println("Constructor called for : " +this.toString());      
	    }
	  // Only concrete (not abstract) methods allowed
	    public void colorInfo(){
	        System.out.println("Universal Color");
	    }
	}
	
	
	
	public static void main(String[] args) {
		
		ScreenColor c1 = ScreenColor.RED;
	        System.out.println(c1);
	        c1.colorInfo();

	}

}
