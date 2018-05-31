package com.ssn.collections.Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




class StudentArrayList {
	String name;

	public StudentArrayList(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentArrayList other = (StudentArrayList) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.trim().equals(other.name.trim()))
			return false;
		return true;
	}


	
}




public class ArrayListEG4 {

	public static void main(String[] args) {
		
	/*	
		//1) array list with multiple different values
		
		ArrayList eg1 = new ArrayList();
		eg1.add("one");
		eg1.add("two");
		eg1.add("three");
		eg1.add("three");
		eg1.add("three");
		eg1.add("three");
		eg1.add("three");
		eg1.add(null);
		eg1.add(null);
		eg1.add(null);
		eg1.add(1000);
		eg1.add(new StudentArrayList("supraja"));
		
		//System.out.println(eg1);
		*/
		
		
		
/*		
		// 2) arrayList using Generics to carete custom values
		ArrayList<String> eg2 = new ArrayList<String>();
		
		eg2.add("one");
		eg2.add("two");
		eg2.add("three");
		//eg2.add(1000); //error
		//System.out.println(eg2);
		*/
		
	/**/ArrayList<StudentArrayList> eg3 = new ArrayList<StudentArrayList>();
	
		eg3.add(new StudentArrayList("supraja"));
		eg3.add(new StudentArrayList("mamatha"));
		eg3.add(new StudentArrayList("nirmala"));
		eg3.add(new StudentArrayList("vivek"));
		eg3.add(new StudentArrayList("yashodhar"));
		eg3.add(new StudentArrayList("ahamed"));
		System.out.println(eg3);
		
		//In order to sort collecton the object must be comparable
		//Collections.sort(eg3);
		
		
		ArrayList<StudentArrayList> test = new ArrayList<StudentArrayList>(5);
		test.add(new StudentArrayList("supraja"));
		test.add(new StudentArrayList("mamatha    "));
		
		//# serching 
		System.out.println(eg3.contains(new StudentArrayList("ahamed"))); //searching sile objet in collection
		System.out.println(eg3.containsAll(test));  //to check presence of multiple elements in arrayList
		
		
		System.out.println(eg3.indexOf(new StudentArrayList("ahamed"))); // index is 5
		
	
		
		//Converting to Array
		
		String[] eg3element = (String[]) eg3.toArray();
		//System.out.println(eg3element.toString());
		System.out.println(Arrays.toString(eg3element));
		
		
		

		
	}

}
