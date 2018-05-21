package com.ssn.dates;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class GetLocals {

	public static void main(String[] args) {
		//returns array of all locales
        Locale locales[] = SimpleDateFormat.getAvailableLocales();
		
		//iterate through each locale and print 
		// locale code, display name and country
        for (int i = 0; i < locales.length; i++) {
		    System.out.printf("%10s - %s, %s \n" , locales[i].toString(), locales[i].getDisplayName(), locales[i].getDisplayCountry());
        }

	}

}
