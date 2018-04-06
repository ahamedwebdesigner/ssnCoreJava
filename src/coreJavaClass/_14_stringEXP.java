package coreJavaClass;

public class _14_stringEXP {

	public static void main(String[] args) {
		
		/*
		//1
		System.out.println(       "Hellow"+" Ahamed"       );
		System.out.println(       "Hellow".concat(" Syed")       );
		//2
		System.out.println(       new String("Hellow").concat(" Mustaq ")     );
		System.out.println(       new String("Hellow").concat(new String(" Prakesh"))     );
		//3 
		*/
		String s1 = "hellow";
		String s2= s1;
		
		System.out.println(s1);
		System.out.println(s2);
		
		s2.concat("world");
		System.out.println("======================");
		System.out.println(s1);
		System.out.println(s2);
		

		
		
	}

}
