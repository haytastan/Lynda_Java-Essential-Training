package com.example.java;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello"; 
        // compiler instead of creating a new object, 
        // pointed the second reference variable to the original object
        // (for primitive data types a copy is created and variable stores the value)

        if (str1 == str2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String str3 = "hello";
        // compiler didn't find a match and created a new object
        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String part1 = "Hello ";
        String part2 = "WORLD";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        
        if (str4 == str5) { 
        	// the compiler doesn't know if str4 and str5 matches each other
        	// due to lack of info and compilation time
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
        
        // in order to do an accurate comparison of strings
        // we need equals or equalsIgnoreCase methods
        if (str4.equals(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
        
        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
    }
}
/*
They match!
They don't match!
They don't match!
They don't match!
They match!
*/