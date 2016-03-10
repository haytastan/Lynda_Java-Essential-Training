package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1; // we are creating a copy rather than referencing
        System.out.println("The 2nd value is " + intValue2);

        long longValue1 = intValue1; // saðdaki soldakini etkiler
        System.out.println("The long value is " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int: " + intValue4);
        System.out.println((double) intValue4); 
        // downcasting olmamasýna raðmen "(double)" dendi
        //  alt: double newValue = intValue4;
        //  System.out.println(newValue);
        
        System.out.println(doubleValue); // eski haline döner
       

    }

}
/*
The 2nd value is 56
The long value is 56
The short value is 56
The byte value is 0
Double to int: 3
3.0
3.999999
 */
