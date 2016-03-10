package com.example.java;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//StringBuilder sb = new StringBuilder();
		String s = null;
		
		for (int i = 0; i < 1; i++) {
			  	System.out.println("Enter a numeric value: ");
			  	String input = scanner.nextLine(); 
			  	double input2 = Double.parseDouble(input);
			  	
			  	System.out.println("Enter a numeric value: ");
			  	String input3 = scanner.nextLine(); 
			  	double input4 = Double.parseDouble(input3);
			  	
			  	double input5 = input2 + input4;
			  	//sb.append(input5 + "\n");
			  	s = Double.toString(input5);
		}
		
		System.out.println("Result is " + s);
		//System.out.println("Result is " + sb);
		
	}
}
/*
Enter a numeric value: 
// 12
Enter a numeric value: 
// 34
Result is 46.0
*/