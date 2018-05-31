package com.ssn.IQ;

public class LowMemoryExample {

	public static void main(String[] args) {
		//java.lang.OutOfMemoryError: Java heap space at com.ssn.IQ.LowMemoryExample.main(LowMemoryExample.java:6)
		Integer[] array = new Integer[1000*1000*100*1000*1000*100];
		System.out.println("Done");

	}

}
