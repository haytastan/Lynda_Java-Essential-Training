package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    	// hashmap is used to respresent unordered data collection
    	// diamond operator (<>) ise used to declare data types (of keys and values)
        Map<String, String> map = new HashMap<>();
        
        // put argument takes keys and values
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        // toString method is responsible for formatting 
        // for formatting keys and values
        
        // there is no order for hashmaps
        map.put("Alaska", "Juneau");
        System.out.println(map);
        
        // get argument takes keys
        String cap = map.get("Oregon");
        System.out.println("The capitol of Oregon is " + cap);
        
        // how to remove an item from the map
        map.remove("California");
        System.out.println(map);

    }

}
/*
{Oregon=Salem, California=Sacramento, Washington=Olympia}
{Oregon=Salem, Alaska=Juneau, California=Sacramento, Washington=Olympia}
The capitol of Oregon is Salem
{Oregon=Salem, Alaska=Juneau, Washington=Olympia} 
 */
