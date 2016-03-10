package com.example.java;

public class Main {

    static boolean bDef;
    // default value for boolean variable is false
    // we can reverse the value by prefixing with "!"

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is: " + b1);
        System.out.println("The value of b2 is: " + b2);
        System.out.println("The value of bDef is: " + bDef);

        boolean b3 = !b1;
        System.out.println("The value of b3 is: " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0); 
        // we can also create boolean values by expression
        System.out.println("The value of b4 is: " + b4);
      
        b4 = (i1 == 0); 
        // we can also create boolean values by expression
        System.out.println("The value of b4 is: " + b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean); 
        // Boolean: helper class for boolean data type
        // parseBoolean: method from Boolean class
        // sBoolean: parsed variable
        System.out.println("Parsed: " + parsed);

    }

}
/*
The value of b1 is: true
The value of b2 is: false
The value of bDef is: false
The value of b3 is: false
The value of b4 is: false
The value of b4 is: true
Parsed: true
*/