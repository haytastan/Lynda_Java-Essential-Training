package com.example.java;

public class Main {

    public static void main(String[] args) {

        int monthNumber = 13;
        
        // conditions are wrapped in parenthesis and each 
        // condition must be valid boolean expression
        
        // if we only execute one statement (in curly par.) 
        // we don't need to write curly bracket
        if (monthNumber >= 1 && monthNumber <= 3) {
            System.out.println("You're in Quarter 1");
        } else if (monthNumber >= 4 && monthNumber <= 6) {
            System.out.println("You're in Quarter 2");
        } else if (monthNumber >= 7 && monthNumber <= 9) {
            System.out.println("You're in Quarter 3");
        } else if (monthNumber >= 10 && monthNumber <= 12) {
            System.out.println("You're in Quarter 4");
        } else { // else sta goes to the end
            System.out.println("That's an unknown month!");
        }

    }

}
/*
 That's an unknown month! 
 */
