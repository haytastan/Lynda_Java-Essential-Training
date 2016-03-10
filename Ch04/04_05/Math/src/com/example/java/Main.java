package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2++); //postfix yapýlmýþ
        // ++result2 (prefix) denseydi þimdiden "Subtraction: 15" olarak print edecekti
        System.out.println(result2); 

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);
        
        // in a mathematical operation the result is will be a data 
        // type that matches the widest data type of any of the parts
        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result4);

        double result5 = (double) intValue1 % intValue2;
        System.out.println("Remainder: " + result5);
        
        // mathclass is used for complex operations and imported by default
        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        // methods of math class is all static
        // meaning that we can directly call the methods without creating instance
        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute: " + absValue);

    }

}
/*
Addition: 98
Subtraction: 14
15
Multiplication: 2352
Division: 1.3333333333333333
Remainder: 14.0
Rounded: -4
Absolute: 3.99999
*/

