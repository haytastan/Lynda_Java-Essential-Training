package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

public class OlivePress {
	// OlivePress class has a method that process the data (oil)
	// it manages processing
	
	// getOil method receives a list of olives
    public int getOil(List<Olive> olives) {

        for (Olive o : olives) {
        	// data type is Olive for the o variable
        	// olives: the collection we are iterating through 
        	// ("olives" names can change because they have local scope)
        	
            System.out.println(o.name);
        }

        return 0;

    }

}
