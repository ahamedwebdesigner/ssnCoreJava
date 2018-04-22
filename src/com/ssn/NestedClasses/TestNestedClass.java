package com.ssn.NestedClasses;

import com.ssn.NestedClasses.OuterClass.StaticNestedInner;

public class TestNestedClass {

	public static void main(String[] args) {
		  
		
		//1 static inner calls
//		StaticNestedInner nestedObject = new OuterClass.StaticNestedInner();
//	    nestedObject.display();
		
		//2 inner class
//		OuterClassTwo outerObject = new OuterClassTwo();
//		OuterClassTwo.InnerClass innerObject = outerObject.new InnerClass();
//	    innerObject.display();
	    
	    //3
		LocalInnerCLass lIC= new LocalInnerCLass();
		lIC.getValue();
		
	}

}
