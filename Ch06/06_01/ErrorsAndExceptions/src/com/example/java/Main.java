package com.example.java;

public class Main {

    public static void main(String[] args) {

        String s = null;
        // String s = Null; denseydi syntax error verecekti

        System.out.println(s);

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray(); // create an array of characters
        char lastChar = chars[chars.length - 1]; // get last character in the array
        System.out.println(lastChar);
        
        lastChar = chars[chars.length]; // gives runtime exception
        // we tried to reference the character in an index position
        // where the index is the same number returned by the length property
        System.out.println(lastChar);
        
    }

}
/*
null
!
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
	at com.example.java.Main.main(Main.java:17)
*/