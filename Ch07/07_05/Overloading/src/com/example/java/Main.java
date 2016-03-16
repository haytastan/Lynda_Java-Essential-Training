package com.example.java;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result = addValues(s1, s2);
        System.out.println("The answer is " + result);

        double result2 = addValues(s1, s2, s3);
        System.out.println("The answer for 3 values is " + result2);

        double result3 = addValues(s1, s2, s3, s1, s2, s3);
        System.out.println("The answer for many values is " + result3);

    }

    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    static double addValues(String s1, String s2) { // input: String, output: double
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }
    
    // overloading occurs through no of arguments or arguments data types
    static double addValues(String s1, String s2, String s3) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result = d1 + d2 + d3;
        return result;
    }
    
    // how to create a method that receives unstated no of arguments
    static double addValues(String ... values) {
        double result = 0;
        for (String value : values) {
            double d = Double.parseDouble(value);
            result += d;
        }
        return result;
    }

}
/*
Enter value 1: 3
Enter value 2: 4
Enter value 3: 5
The answer is 7.0
The answer for 3 values is 12.0
The answer for many values is 24.0
*/