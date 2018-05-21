package com.ssn.collections.Chapter1;

import java.util.Vector;

class StudentVec{
	String name;
	public StudentVec(String name) {this.name = name;}
	@Override
	public String toString() {
		return " [name=" + name + "]";
	}
	
}

public class VactorEG3 {
	public static void main(String[] args) {
		Vector<StudentVec> stuVac = new Vector<StudentVec>();
		stuVac.add(new StudentVec("syed"));
		stuVac.add(new StudentVec("scott"));
		stuVac.add(new StudentVec("sander"));
		
		System.out.println(stuVac);
	}
}
