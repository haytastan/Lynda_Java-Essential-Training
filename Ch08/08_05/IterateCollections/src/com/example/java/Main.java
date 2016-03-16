package com.example.java;

import java.util.*;
// imports all interfaces and classes from this package

public class Main {

    public static void main(String[] args) {

        System.out.println("Ordered data");
        List<String> list = new ArrayList<String>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        Iterator<String> iterator = list.iterator();
        // Iterator: interface
        // list.iterator: returns a reference to the Iterator object
        // that we can use to loop through the list
        while (iterator.hasNext()) {
        	// hasNext: checks whether there is available data in the object 
        	// that is being looped through
            String value = iterator.next();
            // next: moves to the next available object and returns a 
            // reference to it
            System.out.println(value);
        }
        System.out.println("");
        
        // with foreach loop we don't need the additional object
        // that the Iterator interface requires.
        // more memory efficient and takes less code
        System.out.println("ArrayList ForEach");
        for (String value : list) {
            System.out.println(value);
        }
        System.out.println("");
        
//     we call the forEach method of the ArrayList object
//     that accepts single string argument
//     most efficient
        System.out.println("Java 8 method reference");
        list.forEach(System.out::println);
        System.out.println("");

        System.out.println("Unordered data");
        Map<String, String> map = new HashMap<String, String>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println("");

        System.out.println("HashMap Iterator");
        // keySet method returns a set from Map interface
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
        System.out.println("");

        System.out.println("HashMap ForEach");
        for (String key : keys) {
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
        System.out.println("");

    }

}
/*
 Ordered data
toString() output
[California, Oregon, Washington]

ArrayList iterator
California
Oregon
Washington

ArrayList ForEach
California
Oregon
Washington

Java 8 method reference
California
Oregon
Washington

Unordered data
{Oregon=Salem, California=Sacramento, Washington=Olympia}

HashMap Iterator
The capitol of Oregon is Salem
The capitol of California is Sacramento
The capitol of Washington is Olympia

HashMap ForEach
The capitol of Oregon is Salem
The capitol of California is Sacramento
The capitol of Washington is Olympia
 */
