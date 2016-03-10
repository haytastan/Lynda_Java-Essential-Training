package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        String input1 = sc.nextLine(); // collecting the input
        double d1 = Double.parseDouble(input1);
        // normally we should have used exception in case user inputs string

        System.out.print("Enter a numeric value: ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;

        System.out.println("The answer is " + result);

    }
}
/*
Enter a numeric value: // 1234
Enter a numeric value: // 34
The answer is 1268.0
 */
