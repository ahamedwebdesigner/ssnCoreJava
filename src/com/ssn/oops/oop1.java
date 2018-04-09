package com.ssn.oops;

import com.ssn.oops.ent.DistanceStudent;
import com.ssn.oops.ent.RegularStudent;
import com.ssn.oops.ent.Student;

public class oop1 {

	public static void main(String[] args) {
		Student s1 = new RegularStudent("syed",10,3);
		System.out.println(s1);
		System.out.println(s1.getfee());
		System.out.println(s1.getNoDaysPresent());
		System.out.println(s1.isElegibleForExam());
		
		
		
		Student d1 = new DistanceStudent("ahamed",100,5);
		System.out.println(d1);
		System.out.println(d1.getfee());
		System.out.println(d1.getNoDaysPresent());
		System.out.println(d1.isElegibleForExam());

	}

}
