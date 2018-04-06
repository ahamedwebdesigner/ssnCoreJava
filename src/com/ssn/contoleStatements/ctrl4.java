package com.ssn.contoleStatements;

public class ctrl4 {

	public static void main(String[] args) {
		String ilike ="Tea";
		String flevor ="other";
		if(ilike.equals("Tea")) {
			System.out.println(" I like Tea");
			if(flevor.compareToIgnoreCase("gREEn") == 0) {
				System.out.println("I like green Tea");
			}else {
				System.out.println("I like Lemon Tea");
			}
				
		}

	}

}
