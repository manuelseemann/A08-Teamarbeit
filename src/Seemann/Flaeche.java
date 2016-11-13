package Seemann;

import java.lang.Math;

/**
* Klasse Flaeche, zur Berechnung der Flächen von Rechtecken, Kreisen und Dreiecken
* 
* @author Paul Mazzolini
* @version 2016-11-10
*/
public class Flaeche extends Zahlen implements IFlaeche{
	private double r; //Radius
	private double a; //a Seite
	private double b; //b Seite (für Dreieck & Rechteck)
	private double c; //c Seite (für Dreieck)
	
	/**
	 * Konstruktor
	 */
	public Flaeche(){
		super();
	}
	
	/**
	 * Methode getFlaeche, berechnet und returnt die Fläche der Figur, je nach dem wie viele Werte geaddet wurden
	 * 
	 * @return double Wert mit Flächeninhalt der erstellten Figur, bei Fehler 0.0
	 */
	public double getFlaeche(){
		int size = super.getSize(); //Size der ArrayList
		
		//Nichts geaddet
		if(size==0){
			System.out.println("Sie haben keine Zahlen geaddet");
			return 0;
		}
		
		//Kreis, bei 1 Angabe
		if(size==1){
			this.r = super.getZahlen(0);
			return this.r*this.r*Math.PI;
		}
		
		//Rechteck, bei 2 Angaben
		if(size==2){
			this.a = super.getZahlen(0);
			this.b = super.getZahlen(1);
			return (this.a*this.b);
		}
		
		//Dreieck, bei 3 Angaben oder mehr
		if(size>=3){
			this.a = super.getZahlen(0);
			this.b = super.getZahlen(1);
			this.c = super.getZahlen(2);
			double s = (this.a+this.b+this.c)/2;
			return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		}
		
		System.out.println("Fehler");
		return 0;
	}
}