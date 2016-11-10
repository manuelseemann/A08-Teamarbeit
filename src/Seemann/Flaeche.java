package Seemann;

import java.lang.Math;

/**
* Klasse Flaeche, zur Berechnung der Flächen von Rechtecken, Kreisen und Dreiecken
* 
* @author Paul Mazzolini
* @version 2016-11-10
*/
public class Flaeche extends Zahlen implements IFlaeche{
	private String form; //Welches geometrische Object
	private double r; //Radius
	private double a; //a Seite
	private double b; //b Seite (für Dreieck & Rechteck)
	private double c; //c Seite (für Dreieck)
	
	/**
	 * Konstruktor
	 * 
	 * @param ar Seite a bei Dreieck und Rechteck, Radius bei Kreis
	 * @param b Seite b bei Dreieck und Rechteck, 0 bei Kreis
	 * @param c Seite c bei Dreieck, 0 bei Rechteck und Kreis 
	 * @throws InvalidInputException 
	 */
	public Flaeche(String form){
		super();
		this.form = form;
	}
	
	/**
	 * Methode getFlaeche, berechnet und returnt die Fläche der Figur
	 * 
	 * @return double Wert mit Flächeninhalt der erstellten Figur
	 */
	public double getFlaeche(){
		if(this.form.equals("Rechteck")){
			this.a = super.getZahlen(0);
			this.b = super.getZahlen(1);
			return (this.a*this.b);
		}
		
		if(this.form.equals("Kreis")){
			this.r = super.getZahlen(0);
			return this.r*this.r*Math.PI;
		}
		
		if(this.form.equals("Dreieck")){
			this.a = super.getZahlen(0);
			this.b = super.getZahlen(1);
			this.c = super.getZahlen(2);
			double s = (this.a+this.b+this.c)/2;
			return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		}
		
		return 0;
	}
}
