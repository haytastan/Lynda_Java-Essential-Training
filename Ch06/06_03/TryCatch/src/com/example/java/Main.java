package com.example.java;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length]; // runtime error verdiði line
            System.out.println(lastChar);
            
            // Exception is superclass of ArrayIndexOutOfBoundsException 
            // and many other classes. So, default Exception was replaced with 
            // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) { 
        	// ArrayIndexOutOfBoundsException: data type
        	// e: identifier, name
            e.printStackTrace();
            // if the catch block is reached it is 
            // because an exception has been thrown
        }

    }

}
/*
java.lang.ArrayIndexOutOfBoundsException: 8
	at com.example.java.Main.main(Main.java:11) 
// try-catch block kullanýlmasaydý:
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
// at com.example.java.Main.main(Main.java:10)

 */
