package com.ssn.contoleStatements;

public class ctrlLoop4 {
	public static void main(String []arg) {
/*		  
 * for (int i = 0; i < 10; i++) {
	     
	            if (i%2 == 0)
	                continue;
	             System.out.print(i + " "); 
	        }
		  */

int m;
for(m = 0; m < 5; m++){
    int n;
    for(n = 0; n < 5; ++n) {
        break;
    }
    System.out.println(n);
}
System.out.println(m);
		  
		  
	}
}
