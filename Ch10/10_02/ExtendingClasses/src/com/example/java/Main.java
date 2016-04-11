package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Olive> olives = new ArrayList<>();
		olives.add(new Kalamata()); 
		// Olive super class array list e Kalamata sub class'ýn instance ý eklendi
		// old version: olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
		// instead of passing an instance of Olive and explicitly setting olive name,
		// olive color and amount of oil values each time
		// we create a special subclass for each type of olive and that subclass
		// already knows those values
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
Kalamata: 2 units
Kalamata: 2 units
Ligurian: 5 units
Ligurian: 5 units
Ligurian: 5 units
Ligurian: 5 units
You got 24 units of oil
 */
