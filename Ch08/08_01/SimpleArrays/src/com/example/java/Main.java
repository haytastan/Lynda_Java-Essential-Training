package com.example.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	
    	// arrays are complex objects, but can point to any kind of value
    	// primitives or objects
    	
    	// array size is not resizable
        System.out.println("Array of primitives");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for (String color : strings) {
            System.out.println(color);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        // assign value / initialize
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }
        // print
        for (int value : sized) {
            System.out.println(value);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 4);
        // 0: beginning index, 4: length, no of items
        for (int value : copied) {
            System.out.println(value);
        }
    }

}
/*
Array of primitives
3
6
9
Array of strings
Blue
Green
Red
Setting an initial size
0
100
200
300
400
500
600
700
800
900
Copying an array
500
600
700
800
0 
 */
