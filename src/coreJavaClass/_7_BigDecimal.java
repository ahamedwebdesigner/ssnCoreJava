package coreJavaClass;

import java.math.BigDecimal;

public class _7_BigDecimal {

	public static void main(String[] args) {
		
		  //1 working with big decimal class
		  final BigDecimal TWO = new BigDecimal("2");
		  BigDecimal HUNDRED = new BigDecimal("100");
		  BigDecimal PERCENTAGE = new BigDecimal("5.25");
		  
		 
		  System.out.println(TWO);
		  System.out.println(HUNDRED);
		  System.out.println(PERCENTAGE);
		  
		  // convertions for BigDecimal to other formates
		  System.out.println(TWO.doubleValue());
		  System.out.println(TWO.longValue());
		  System.out.println(TWO.doubleValue());
		  System.out.println(TWO.toEngineeringString());
		  System.out.println(TWO.toPlainString());

	}

}
