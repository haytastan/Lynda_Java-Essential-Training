package com.example.java.model;
// enumun avantaj� value'nun tek bir yerde toplanmas� 
// ve metodlar ile istedi�imiz bi�imde print etmektir
// An enum type is a special data type that enables for a variable 
// to be a set of predefined constants
public enum OliveName { // OliveName: enum/enum class
	KALAMATA("Kalamata"), LIGURIAN("Ligurian");  
	// LIGURIAN() veya LIGURIAN olsayd� default constructor gerekecekti
	// KALAMATA: enum constant, object
	// "Kalamata": value, argument
	// enum objects call its own constructor

	private String name;

	OliveName(String name) { 
		// constructors can only be called by the enum class itself
		// so we cannot put the public kw
		this.name = name;
	}

	@Override
	public String toString() { // outputs the name variable
		return name;
	}
}
