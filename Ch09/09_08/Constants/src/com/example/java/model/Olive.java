package com.example.java.model;

public class Olive {

	// constants prevent errors that literal strings are prompted to and they
	// can help code more quickly
	public static final String KALAMATA = "Kalamata";
	public static final String LIGURIAN = "Ligurian";

	private String name = "Kalamata"; 
    private long color = 0x2E0854;
    private int oil = 3;
    /* default constructor çaðrýlýp setter metodlar call 
    edilmezse default value olsun diye field valuelarý var */
    
    public Olive(){} 

	public Olive(String name, long color, int oil) {
		this.name = name;
		this.color = color;
		this.oil = oil;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getColor() {
		return color;
	}

	public void setColor(long color) {
		this.color = color;
	}

	public int crush() {
		System.out.println("Ouch!");
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
}
