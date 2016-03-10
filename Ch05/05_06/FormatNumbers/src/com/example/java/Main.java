package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale locale = new Locale("da", "DK");

        double doubleValue = 1_234_567.89;
        
        // we are getting reference variable's reference 
        // by calling a static method of the NumberFormat class
        NumberFormat numF = NumberFormat.getNumberInstance(locale); 
        // there is one getNumberInstance method without parameter and one method with locale parameter
        // (based on Denmark) periods for separators and commas for fractions
        System.out.println("Number: " + numF.format(doubleValue));
        // outputs as a formatted string

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleValue));
        
        // rounds the value before displaying
        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));


    }

}
/*
Number: 1.234.567,89
Currency: kr 1.234.567,89
Integer: 1.234.568
*/