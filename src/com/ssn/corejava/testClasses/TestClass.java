package com.ssn.corejava.testClasses;


/*
 * This class is loaded dynamically in /ssnCoreJava/src/com/ssn/corejava/DynamicclassLoading.java
 */
public class TestClass {
	static {
		System.out.println("Static block called");
	}

	public TestClass() {
		System.out.println("Inside Test class constructor");
	}
}
