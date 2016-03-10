package com.example.java;

public class Main {

    public static void main(String[] args) {

        String s1 = "This is a String!"; 
        // assigning the value with a literal
        System.out.println(s1);

        String s2 = new String("This is also a String!"); 
        // assignment with class constructor syntax
        System.out.println(s2);
        
        String s3 = "Shirt size: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Qty: " + 4;
        // concatenation of the strings
        // numbers automatically turn into strings 
        System.out.println(s5);

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s6 = new String(chars);
        // array of chars to string
        System.out.println(s6);

        char[]  chars2 = s6.toCharArray();
        // string to char
        for (char c : chars2) { 
        	// char: data type, c: variable name, chars2: name of the array
        	// for each character in the chars2 array will have a data type of
        	// char and a name of c and it will be keep on looping as long as
        	// items available in the array
            System.out.println(c);
        }

        System.out.println(chars2);
    }

}
/*
This is a String!
This is also a String!
Shirt size: M, Qty: 4
Hello
H
e
l
l
o
Hello
*/