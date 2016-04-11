package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {
	// Main class creates the data (olive) and passes to the OlivePress for processing

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>(); // create an arraylist of Olive
        Olive olive1 = new Olive();
        olives.add(olive1); // we add olives to the list 
        Olive olive2 = new Olive();
        olives.add(olive2);
        Olive olive3 = new Olive();
        olives.add(olive3);

        OlivePress press = new OlivePress();
        press.getOil(olives);

    }

}
/*
Kalamata
Kalamata
Kalamata
 */

