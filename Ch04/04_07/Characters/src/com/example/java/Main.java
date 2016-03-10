package com.example.java;

public class Main {

    public static void main(String[] args) {

    	// character which is a primitive data type can consist of single character
        char c1 = '1'; // strings are double quotes, chars are single quotes
        char c2 = '2';
        char c3 = '3';
        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

        char dollarSign = '\u0024'; // unicode number for the dollar sign character
        System.out.println("Currency: " + dollarSign);
        // we can turn characters into string

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        // we are manipulating the characters using the helper class for the 
        // car data type
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

    }

}
/*
Char 1: 1
Char 2: 2
Char 3: 3
Currency: $
ABC
*/