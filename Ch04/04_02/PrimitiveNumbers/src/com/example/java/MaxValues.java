package com.example.java;

public class MaxValues {

    public static void main(String[] args) {

        byte b = 127;
        System.out.println("Byte: " + b);

        if (b < Byte.MAX_VALUE) {
            b++; 
        }

        System.out.println("Byte: " + b); 
        
        b++; 
        
        System.out.println("Byte: " + b); 
      // byte'�n maximum de�eri olan 127 a��ld��� i�in 
      // minimum de�eri olan -128 olarak print edilir

    }

}
/*
Byte: 127
Byte: 127
Byte: -128
*/