package com.example.java.model;

public class Olive {
	// OliveName: enum/enum class (also data type), name: variable of OliveName type
	// KALAMATA: special object of OliveName type (enum constant)
    // name'in variable olduðuna ve OliveName.KALAMATA ya eþit olduðuna dikkat
    private OliveName name = OliveName.KALAMATA; // default
    // enum (OliveName) becomes type of its own (like String)
    // as well as enum class name
    private long color = 0x2E0854;
    private int oil = 3;
    /* default constructor çaðrýlýp setter metodlar call 
    edilmezse default value olsun diye field valuelarý var */

    public Olive(){}

    public Olive(OliveName name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() {
        return name; // enum'daki toString metodu içindeki return edilir (?)
    }

    public void setName(OliveName name) {
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
