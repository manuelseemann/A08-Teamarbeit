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
		this.setZahlen(new ArrayList<Double>());
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
		for(int i = 0; i < this.getZahlen().size(); i++){
			summe += this.getZahlen().get(i);
		}
		return summe;
	}

	/**
	 * Diese Methode gibt das kleinste Element der Arraylist zur�ck.
	 * @return das kleinste Element der Arraylist
	 */
	@Override
	public double getMinimum() {
		return Collections.min(this.getZahlen());
	}

	/**
	 * Diese Methode gibt das gr��te Element der Arraylist zur�ck.
	 * @return das gr��te Element der Arraylist
	 */
	@Override
	public double getMaximum() {
		return Collections.max(this.getZahlen());
	}

	/**
	 * Diese Methode f�gt ein Element zur Arraylist hinzu.
	 * @param value ist der Wert den das Element, welches hinzugef�gt wird, haben soll
	 */
	@Override
	public void add(double value) {
		this.getZahlen().add(value);
	}
	
	/**
	 * Diese Methode gibt die Gr��e der Arraylist zur�ck
	 * @return die L�nge
	 */
	public int getSize(){
		return this.getZahlen().size();
	}

	/**
	 * @return the zahlen
	 */
	public ArrayList<Double> getZahlen() {
		return zahlen;
	}

	/**
	 * @param zahlen the zahlen to set
	 */
	public void setZahlen(ArrayList<Double> zahlen) {
		this.zahlen = zahlen;
	}
	
}