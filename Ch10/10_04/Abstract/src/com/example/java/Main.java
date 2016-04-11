package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
/*
Kalamata, from Greece: 2 units
Kalamata, from Greece: 2 units
Ligurian, from Italy: 5 units
Ligurian, from Italy: 5 units
Ligurian, from Italy: 5 units
Ligurian, from Italy: 5 units
You got 24 units of oil
 */
