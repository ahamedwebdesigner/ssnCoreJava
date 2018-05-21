package com.ssn.enumtest;


/*
 * public enum  must be declared inits own file
 * - Day enum is declared in DAY.Java as public
 * - Day enum is used in enum test 
 */
public class EnumTest_3 {
	 Day day;
	    
	    public EnumTest_3(Day day) {
	        this.day = day;
	    }
	    
	    public void tellItLikeItIs() {
	        switch (day) {
	            case MONDAY:
	                System.out.println("Mondays are bad.");
	                break;
	                    
	            case FRIDAY:
	                System.out.println("Fridays are better.");
	                break;
	                         
	            case SATURDAY: case SUNDAY:
	                System.out.println("Weekends are best.");
	                break;
	                        
	            default:
	                System.out.println("Midweek days are so-so.");
	                break;
	        }
	    }
	    
	    public static void main(String[] args) {
	    	EnumTest_3 firstDay = new EnumTest_3(Day.MONDAY);
	        firstDay.tellItLikeItIs();
	        
	        EnumTest_3 thirdDay = new EnumTest_3(Day.WEDNESDAY);
	        thirdDay.tellItLikeItIs();
	        
	        EnumTest_3 fifthDay = new EnumTest_3(Day.FRIDAY);
	        fifthDay.tellItLikeItIs();
//	        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
//	        sixthDay.tellItLikeItIs();
//	        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
//	        seventhDay.tellItLikeItIs();
	    }
}
