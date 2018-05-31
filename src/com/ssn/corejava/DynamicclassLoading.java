package com.ssn.corejava;

public class DynamicclassLoading {

	public static void main(String[] args) {
	
		Class clasz;
		try {
			clasz = Class.forName("com.ssn.corejava.testClasses.TestClass");
			  Object obj = clasz.newInstance();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		}
      
	}

}
