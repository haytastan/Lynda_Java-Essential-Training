	package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

// this class creates the olives and give their oil values
public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        Olive olive1 = new Olive();
        olives.add(olive1);
        Olive olive2 = new Olive();
        olive2.setOil(1);
        olives.add(olive2);
        Olive olive3 = new Olive();
        olive3.setOil(4);
        olives.add(olive3);

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
Kalamata
Ouch!
Total olive oil: 8
 */

