package com.ssn.NestedClasses;


//Java program to demonstrate need for Anonymous Inner class
interface Age{
	int x = 21;
	void getAge();
}



//Myclass implement the methods of Age Interface
class MyClass implements Age{
	public void getAge() {
	   // printing the age
	   System.out.print("Age is "+x);
	}
}



public class Anemelous {

	public static void main(String[] args) {
		//1 traditional way
	/*	MyClass mc = new MyClass();
		mc.getAge();*/
		
		Age oj1 = new Age() {
	         
            public void getAge() {
                System.out.print("Age  From Inner class is "+x);
            }
        };
        oj1.getAge();

	}

}
