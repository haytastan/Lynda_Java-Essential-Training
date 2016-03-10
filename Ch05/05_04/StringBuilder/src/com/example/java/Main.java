package com.example.java;

import java.util.Scanner;

public class Main {
		
    public static void main(String[] args) {
    	
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);
        // lots of string concatenation cause problems with memory management
        // instead, usage of stringbuilder class is recommended 
        // since stringbuilder class is a member of java.lang package no need to make special import
        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        /*
           StringBuilder sb = new StringBuilder("Hello")
	       sb.append(", ");
	       sb.append("World");
	       sb.append("!");
         */
        // append method (and other methods of stringbuilder object)
        // returns a reference to that stringbuilder object
        // with stringbuilder we created 1 object instead of 3
        System.out.println(sb);
        
        // scanner class is a member of java.util package
        Scanner scanner = new Scanner(System.in);
        // System.in: collect the data from the console
        // System.out: outputs to the console
        System.out.print("Enter value: ");
        String input = scanner.nextLine();
        // nextLine method waits for the user to type in some text
        // after pressing enter key, whatever the input typed in 
        // will be returned from the method
        System.out.println(input);
        
        // combination of stringbuilder and scanner
        sb.delete(0, sb.length());
        // delete the stringbuilder object starting from the first to the last character
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine(); // we didn't create a new variable
            sb.append(input + "\n");
        }
        
        System.out.println(sb); // System.out.println(sb.toString);
        
    }
    
}
/*
Hello, World!
Hello, World!
Enter value: // 34
34
// 32
// 56
// 89
32
56
89
*/
