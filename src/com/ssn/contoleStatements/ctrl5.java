package com.ssn.contoleStatements;

import java.util.Scanner;

public class ctrl5 {

	public static void main(String[] args) {
		int age;  
        Scanner inputDevice = new Scanner( System.in );  
        System.out.print( "Please enter Age: " );  
        age = inputDevice.nextInt();  
        switch ( age ){  
            case 18:  {
                System.out.println( "age 18" );  
            }
                break;  
            case 19:  
                System.out.println( "age 19" );  
                break;  
            default:  
                System.out.println( "not matched" );  
                break;  
        }  

	}

}
