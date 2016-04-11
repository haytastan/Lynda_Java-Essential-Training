package com.example.java;

import com.example.java.model.Olive;

import java.util.List;
// this class knows how to process the oil
public class OlivePress {

    public int getOil(List<Olive> olives) {

        int totalOil = 0;
        for (Olive o : olives) {
            System.out.println(o.getName()); 
            totalOil += o.crush(); 
            // we extract the oil from the olive by calling the crush method
        }
 
        return totalOil;

    }

}
