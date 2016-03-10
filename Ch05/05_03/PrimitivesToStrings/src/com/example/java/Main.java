package com.example.java;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000; // underscore only makes more readable
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);
        
        String long1 = Long.toString(longValue);
        System.out.println(long1);

    }

}
/*
42
true
10.000.000
10000000
*/