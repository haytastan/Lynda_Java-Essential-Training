package com.example.java.model;
// this class tells how much oil the olive has
// and tells the names of the olives
public class Olive {

    private String name = "Kalamata";
    private long color = 0x2E0854;
    private int oil = 3;

    public String getName() { // accessor method
        return name;
    }

    public void setName(String name) { // modifier method
    	// setters receive an argument
        this.name = name;
        // this kw is used to distinguish the variable that is a member of the instance
        // from the argument which has the same name. we assing the argument to the 
        // instance variable
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        System.out.println("Ouch!"); // anýnda print edilir
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
