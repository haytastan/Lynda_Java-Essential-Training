package com.example.java;

public class Main {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};
        
        	// incrementing loop
//        for (int i = 0; i < months.length; i++) { 
        // int i = 0: counter variable, starting point
        // i < months.length: condition
        // i++: incremental statement
//            System.out.println(months[i]);
//        }

//        for (int i = months.length-1; i >= 0; i--) {
//            System.out.println(months[i]);
//        }
        
        	// for-each loop
//        for (String month : months) {
//            System.out.println(month);
//        }

//        int counter = 0;
//        while (counter < months.length) {
//            System.out.println(months[counter]);
//            counter++;
//        }
        
        // used less commonly than others
        // do this, increment the value, check the condition
        int counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);


    }

}
/*
January
February
March
April
May
June
July
August
September
October
November
December 
 */
