package coreJavaClass;

public class _3_NumericLitreles {

	public static void main(String[] args) {
	
		
		// 1) int litreles
		System.out.println("===============example 1===================");
		int a = 101;    // decimal-form literal
        int b = 0100;   // octal-form literal
        int c = 0xFace; // Hexa-decimal form literal
        int d = 0b1111; // Binary literal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        //2) types of numeric litral
        System.out.println("===============example 2===================");
        int decVal = 26; // The number 26, in decimal
        int hexVal = 0x1a; //  The number 26, in hexadecimal
        int binVal = 0b11010;        // The number 26, in binary
        System.out.println("The value of <<decVal>> : "+ decVal);
        System.out.println("The value of <<hexVal>> : "+ hexVal);
        System.out.println("The value of <<binVal>> : "+ binVal);
        
        
        //3) floating-point literals
        System.out.println("===============example 3===================");
        double Fa = 101.230;  // decimal-form literal
        double Fb = 0123.222; // It also acts as decimal literal
        double Fc = 0x1.8p1;  // Hexa-decimal form  1.8hex × 21 = 1.5decimal × 2 = 3. 

        
        System.out.println(Fa);
        System.out.println(Fb);
        System.out.println(Fc);
      
        
        

	}

}
