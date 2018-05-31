package com.ssn.IQ.array;

public class PyramidOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int noOfRows =10;
		int rowCount = 1;
		for (int i = noOfRows; i > 0; i--) {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
 
            //Printing 'rowCount' value 'rowCount' times at the end of each row
 
            for (int j = 1; j <= rowCount; j++) {
                //System.out.print(rowCount+" ");
                System.out.print(String.format("%2d", rowCount)+" ");
               
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }

	}

}
