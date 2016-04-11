package com.example.java;

import com.example.java.model.*;
// package implement edilmiþ

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// List of Olive Object
		List<Olive> olives = new ArrayList<>();
		olives.add(new Kalamata());
		olives.add(new Kalamata());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());

		Press press = new OlivePress();
		// instance of Press interface created
		// with polymorphism we guarantee that setOil and getOil methods exist
		press.setOil(5);
		int totalOil = press.getOil(olives);

		System.out.println("You got " + totalOil + " units of oil");

		// interface being instantiated directly (by anonymous class)
		// anonymous classýn sað tarafýný sub class gibi düþün (polymorphism yüzünden)
		// (Press press = new OlivePress(); e göre)
//		Press p2 = new Press() {
//			private int currentOil;
//
//			public int getOil(List<Olive> olives) {
//
//				int totalOil = currentOil;
//				for (Olive o : olives) {
//					totalOil += o.crush();
//				}
//
//				return totalOil;
//
//			}
//
//			@Override
//			public void setOil(int oil) {
//				currentOil = oil;
//			}
//		};
//
//		p2.setOil(5);
//		int totalOil1 = p2.getOil(olives);
//
//		System.out.println("You got " + totalOil1 + " units of oil");

	}

}
/*
Kalamata: 2 units
Kalamata: 2 units
Ligurian: 5 units
Ligurian: 5 units
Ligurian: 5 units
Ligurian: 5 units
You got 29 units of oil
 */
