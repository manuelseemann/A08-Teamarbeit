package Seemann;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Diese Klasse enth�lt Methoden zum Berechnen der Summe,
 * zum Ausgaben des Gr��ten/Kleinsten Werts und zum Hinzuf�gen einer Zahl.
 * 
 * @author Alexander Hasenberger
 * @version 2016-11-10
 */
public class Zahlen implements IZahlen{
	/**
	 * Attribute
	 */
	private ArrayList<Double> zahlen;
	
	/**
	 * Konstruktor
	 */
	public Zahlen(){
		this.zahlen = new ArrayList<Double>();
	}
	
	/**
	 * Get Methode f�r die Arraylist Zahlen
	 * @param index ist die Stelle an dem das Element ausgegeben werden kann
	 * @return das Element an der Stelle index
	 */
	public double getZahlen(int index) {
		return zahlen.get(index);
	}
	
	/**
	 * Diese Methode gibt die Summe der Elemente der Arraylist zur�ck.
	 * @return die Summe der Elemente der Arraylist
	 */
	@Override
	public double getSumme() {
		double summe = 0;
		for(int i = 0; i < this.zahlen.size(); i++){
			summe += this.zahlen.get(i);
		}
		return summe;
	}

	/**
	 * Diese Methode gibt das kleinste Element der Arraylist zur�ck.
	 * @return das kleinste Element der Arraylist
	 */
	@Override
	public double getMinimum() {
		return Collections.min(this.zahlen);
	}

	/**
	 * Diese Methode gibt das gr��te Element der Arraylist zur�ck.
	 * @return das gr��te Element der Arraylist
	 */
	@Override
	public double getMaximum() {
		return Collections.max(this.zahlen);
	}

	/**
	 * Diese Methode f�gt ein Element zur Arraylist hinzu.
	 * @param value ist der Wert den das Element, welches hinzugef�gt wird, haben soll
	 */
	@Override
	public void add(double value) {
		this.zahlen.add(value);
	}
	
	/**
	 * Diese Methode gibt die Gr��e der Arraylist zur�ck
	 * @return die L�nge
	 */
	public int getSize(){
		return this.zahlen.size();
	}
}