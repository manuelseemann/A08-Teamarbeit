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
			this.setR(super.getZahlen(0));
			return this.getR()*this.getR()*Math.PI;
		}
		
		//Rechteck, bei 2 Angaben
		if(size==2){
			this.setA(super.getZahlen(0));
			this.setB(super.getZahlen(1));
			return (this.getA()*this.getB());
		}
		
		//Dreieck, bei 3 Angaben oder mehr
		if(size>=3){
			this.setA(super.getZahlen(0));
			this.setB(super.getZahlen(1));
			this.setC(super.getZahlen(2));
			double s = (this.getA()+this.getB()+this.getC())/2;
			return Math.sqrt(s*(s-this.getA())*(s-this.getB())*(s-this.getC()));
		}
		
		System.out.println("Fehler");
		return 0;
	}

	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}

	/**
	 * @return the a
	 */
	public double getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public double getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(double c) {
		this.c = c;
	}
}