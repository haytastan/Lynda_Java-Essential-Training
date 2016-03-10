package com.example.java;

public class Main {

    public static void main(String[] args) {

        String s1 = "Welcome to California!";
        System.out.println("Length of string: " + s1.length());

        int position = s1.indexOf("California"); // queries index
        System.out.println("Position of substring: " + position);
        // index position of 11 is corresponds to 12th character for the substring

        String sub = s1.substring(11); // queries substring
        System.out.println(sub);
        // index 11 = substring c..........
        
        String sub3 = s1.substring(11, 15);
        System.out.println(sub3);

        String s2 = "Welcome!         ";
        int len1 = s2.length();
        System.out.println(len1);
        String s3 = s2.trim();
        System.out.println(s3.length());

    }

}
/*
 Length of string: 22
Position of substring: 11
California!
Cali
17
8
 */
