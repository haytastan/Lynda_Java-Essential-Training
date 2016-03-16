package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	
//    	arraylist and hashmap classes respectively implement array and map interfaces.
    	
        List<String> list = new ArrayList<>();
        // "List": interface
        // "<>" : diamond operator
        // diamond operator i�erisinde primitive data type kullan�l�rsa 
        // helper class kullan�lmal�d�r (Integer)
        // "ArrayList": implementing class
        // new ArrayList<String>(); olarak da yaz�labilirdi
        // we don't need to specify the values in the constructor
        
        
        list.add("California");
        list.add("Oregon");
        list.add("Washington");
        
        System.out.println(list); 
        // we are calling the toString method of the object
        
        list.add("Alaska");
        System.out.println(list);
        
        list.remove(0);
        System.out.println(list);
        
        // how to access single item in the list
        // get argument takes indexes
        String state = list.get(1);
        System.out.println("The second state is " + state);
        // we are using index value of one but outputting 2nd state
        // that is because the zero based indexing 
        
        // how to find a position of an item in the list
        // indexOf argument takes values
        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position " + pos);

    }

}
/*
[California, Oregon, Washington]
[California, Oregon, Washington, Alaska]
[Oregon, Washington, Alaska]
The second state is Washington
Alaska is at position 2
 */
