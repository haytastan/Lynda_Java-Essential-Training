package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        
//        alt: 
//        Olive olive1 = new Olive("Kalamata", 0x2E0854, 3);
//        olives.add(olive1);
//        without having to assing another reference variable
//        we are pasting the Olive objects into the olives arraylist.
//        we are not reducing the no of objects being created but
//        no of reference variables that are pointing to them
        olives.add(new Olive("Kalamata", 0x2E0854, 3));
        olives.add(new Olive("Kalamata", 0x2E0854, 3));
        olives.add(new Olive("Ligurian", 0x000000, 2));
        olives.add(new Olive("Ligurian", 0x000000, 2));
        olives.add(new Olive("Ligurian", 0x000000, 2));
        olives.add(new Olive("Ligurian", 0x000000, 2));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);

    }

}
/*
Kalamata
Ouch!
Kalamata
Ouch!
Ligurian
Ouch!
Ligurian
Ouch!
Ligurian
Ouch!
Ligurian
Ouch!
Total olive oil: 14
 */


