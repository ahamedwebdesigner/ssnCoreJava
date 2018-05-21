package com.ssn.enumtest;

/*
 * We can declare main() method inside enum. 
 * Hence we can invoke enum directly from the Command Prompt
 * run this enum like java class
 */
enum Color_4{
    RED, GREEN, BLUE;
 
    // Driver method
    public static void main(String[] args){
    	Color_4 c1 = Color_4.RED;
        System.out.println(c1);
    }
}

