package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

public class OlivePress {

	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) { // list bile�enlerine ayr�ld�
			totalOil += o.crush();
		}

		return totalOil;

	}

}
