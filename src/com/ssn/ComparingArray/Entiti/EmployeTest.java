package com.ssn.ComparingArray.Entiti;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeTest {

	public static void main(String[] args) {
		
		
		Employe[] employees = new Employe[4];
		employees[0] = new Employe("scott", 45, 80000);
		employees[1] = new Employe("alex", 56, 75000);
		employees[2] = new Employe("cris", 30, 120000);
		employees[3] = new Employe("blake", 25, 60000);
		
		System.out.println("Before sorting: " + Arrays.toString(employees));
		//Arrays.sort(employees);
		Arrays.sort(employees,new EmployeeAgeComparator());
		System.out.println("Before sorting: " + Arrays.toString(employees));
	
	}

}


class Employe  implements Comparable<Employe>{
	private String name;
	private int age;
	private int salary;

	public Employe(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("(%s,  %d ,%d)", name, salary,age);
	}

	@Override
	
/*	1.compareTo(0) (return: 1)
	1.compareTo(1) (return: 0)
	0.comapreTo(1) (return: -1)*/
	public int compareTo(Employe obj1) {
		
		  return this.salary - obj1.salary;
	}
	
	
	
}




class EmployeeAgeComparator implements Comparator<Employe> {

	public int compare(Employe emp1, Employe emp2) {
		return emp1.getAge() - emp2.getAge();
	}
}
