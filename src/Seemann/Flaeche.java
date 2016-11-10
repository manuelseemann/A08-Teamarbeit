package Seemann;

import java.lang.Math;

/**
* Klasse Flaeche, zur Berechnung der Flächen von Rechtecken, Kreisen und Dreiecken
* 
* 
* 
* @author Paul Mazzolini
* @version 2016-11-10
*/
public class Flaeche implements IFlaeche{
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
	public Flaeche(double ar, double b, double c){
		this.form = "";
		this.r = 0;
		this.a = 0;
		this.b = 0;
		this.c = 0;
		
		if((a!=0)&&(b==0)&&(c==0)){
			this.form = "Kreis";
			this.r = ar;
		}
		if((a==0)&&(b!=0)&&(c==0)){
			this.form = "Kreis";
			this.r = b;
		}
		if((a==0)&&(b==0)&&(c!=0)){
			this.form = "Kreis";
			this.r = c;
		}
		
		if((a!=0)&&(b!=0)&&(c==0)){
			this.form = "Rechteck";
			this.a = ar;
			this.b = b;
		}
		if((a==0)&&(b!=0)&&(c!=0)){
			this.form = "Rechteck";
			this.a = b;
			this.b = c;
		}
		if((a!=0)&&(b==0)&&(c!=0)){
			this.form = "Rechteck";
			this.a = ar;
			this.b = c;
		}
		
		if((a!=0)&&(b!=0)&&(c!=0)){
			this.form = "Dreieck";
			this.a = ar;
			this.b = b;
			this.c = c;
		}
		
		/*if(!((form.equals("Rechteck"))||(form.equals("Kreis"))||(form.equals("Dreieck")))){
			//System.out.println("Die Angabe der Form war inkorrekt");
			this.form = "";
			this.a = 0;
			this.b = 0;
			this.c = 0;
		}*/
	}
	
	/**
	 * Methode getFlaeche, berechnet und returnt die Fläche der Figur
	 * 
	 * @return double Wert mit Flächeninhalt der erstellten Figur
	 */
	public double getFlaeche(){
		if(this.form.equals("Rechteck")){
			return (this.a*this.b);
		}
		
		if(this.form.equals("Kreis")){
			return this.r*this.r*Math.PI;
		}
		
		if(this.form.equals("Dreieck")){
			double s = (this.a+this.b+this.c)/2;
			return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		}
		
		return 0;
	}
}