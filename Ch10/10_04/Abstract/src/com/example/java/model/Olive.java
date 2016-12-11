package com.example.java.model;

// abstract classes (and interfaces) cannot be directly instantiated, 
// but their subclasses can be instantiated
// abstract class, interface'in alternatifidir, abstract class daha fazla flexibility saðlar
// abstract class, fully implemented metoda ve abstract metoda sahip olabilir
// interface'de abstract metoda sahipti
// abstract metodlar subclass tarafýndan ya implement edilir ya da subclasslar da 
// abstract olur
public abstract class Olive {

    private OliveName name;
    private OliveColor color;
    private int oil;

    public Olive(OliveName name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    // Olive class itself calls the getOrigin() method, but it doesn't know
    // what the result will be because subclass has that specific info
    public int crush() {
        String msg = name + ", from " + getOrigin() +
                ": " + oil + " units";
        System.out.println(msg);
        return oil;
    }
    // OlivePress'den, (Olive) arraylist'teki her bir (Olive Subclass) object için 
    // (abstract olan) getOrigin() metoduna super class üzerinden ulaþýlabilmesine dikkat

    public void setOil(int oil) {
        this.oil = oil;
    }

    public abstract String getOrigin();
    // every subclass of this class must declare its own origin

    @Override
    public String toString() {
        return name.toString();
    }

}