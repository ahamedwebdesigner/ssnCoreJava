package com.ssn.dates;

//3) elapse time 
public class Date3 {

	public static void main(String[] args) {
		 long start = System.currentTimeMillis( );
		 
		 try {
			Thread.sleep(5*60*10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		 long end = System.currentTimeMillis( );
         long diff = end - start;
         System.out.println("Difference is : " + diff);

	}

}
