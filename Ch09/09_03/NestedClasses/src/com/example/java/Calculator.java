package com.example.java;

import com.example.java.utilities.MathHelper;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate();
    }

    protected void calculate() {

        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter a numeric value: ");
        String s2 = helper.getInput("Enter a numeric value: ");
        String op = helper.getInput("Choose an operation (+ - * /):");

        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.subtractValues(s1, s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    class InputHelper { // this nested class is only available to the Calculator class
        private String getInput(String prompt) { 
        	// part of the InputHelper class. 
        	// despite being private accessible by the Calculator class
            System.out.print(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }

}
