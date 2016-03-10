package com.example.java;

import java.math.BigDecimal; 
// is not automatically imported like java.lang.Double

public class Main {

    public static void main(String[] args) {

        double value = .012;

        double pSum = value + value + value;

        System.out.println("Sum of primitives: " +pSum);
        // is not precise for big calculations

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);
        
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of BigDecimals: " + bSum.toString());
        // we are converting the bigdecimal to string with .toString() method

    }

}
/*
Sum of primitives: 0.036000000000000004
strValue: 0.012
Sum of BigDecimals: 0.036
*/