// subclass can have specific info and override superclass methods/variables as well as set specific 
// values that a superclass method/constructor requires
package com.example.java.model;
// subclass yaratarak pratiklik kazan�l�r. misal Kalamata olive in miktar�n� (2) veya constant name i (KALAMATA, PURPLE)
// de�i�tirmek istersek sadece bu subclass i�erisinde modifiye etmek yeterli olacakt�r. 
public class Kalamata extends Olive {

	public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
    }
		// super kw superclass constructor�n� �a��r�r ise sub class constructor�n�n i�erisinde ilk statement olmal�d�r.
		// super() is added in each class constructor automatically by compiler (unless we have super() as the first statement).
		// Fakat superclass default constructora sahip olmad��� i�in 3 argumentli constructor call edildi.
		// superclass default constructora sahip olsa ve biz sadece default const. � �a��rmak istesek super kw'e gerek olmayacakt�
		// super kw'e gerek olmayaca�� i�in subclass'ta (Kalamata) const yaratmaya gerek olmayakt�, zira main method 
		// Kalamata'n�n default constructor�n� �a��r�yor ve default const sadece super class�n const �n� �a��r�yor olacakt�

}
