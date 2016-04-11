// subclass can have specific info and override superclass methods/variables as well as set specific 
// values that a superclass method/constructor requires
package com.example.java.model;
// subclass yaratarak pratiklik kazanýlýr. misal Kalamata olive in miktarýný (2) veya constant name i (KALAMATA, PURPLE)
// deðiþtirmek istersek sadece bu subclass içerisinde modifiye etmek yeterli olacaktýr. 
public class Kalamata extends Olive {

	public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
    }
		// super kw superclass constructorýný çaðýrýr ise sub class constructorýnýn içerisinde ilk statement olmalýdýr.
		// super() is added in each class constructor automatically by compiler (unless we have super() as the first statement).
		// Fakat superclass default constructora sahip olmadýðý için 3 argumentli constructor call edildi.
		// superclass default constructora sahip olsa ve biz sadece default const. ý çaðýrmak istesek super kw'e gerek olmayacaktý
		// super kw'e gerek olmayacaðý için subclass'ta (Kalamata) const yaratmaya gerek olmayaktý, zira main method 
		// Kalamata'nýn default constructorýný çaðýrýyor ve default const sadece super classýn const ýný çaðýrýyor olacaktý

}
