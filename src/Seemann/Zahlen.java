package Seemann;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Diese Klasse enthält Methoden zum Berechnen der Summe,
 * zum Ausgaben des Größten/Kleinsten Werts und zum Hinzufügen einer Zahl.
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
	 * Get Methode für die Arraylist Zahlen
	 * @param index ist die Stelle an dem das Element ausgegeben werden kann
	 * @return das Element an der Stelle index
	 */
	public double getZahlen(int index) {
		return zahlen.get(index);
	}
	
	/**
	 * Diese Methode gibt die Summe der Elemente der Arraylist zurück.
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
	 * Diese Methode gibt das kleinste Element der Arraylist zurück.
	 * @return das kleinste Element der Arraylist
	 */
	@Override
	public double getMinimum() {
		return Collections.min(this.getZahlen());
	}

	/**
	 * Diese Methode gibt das größte Element der Arraylist zurück.
	 * @return das größte Element der Arraylist
	 */
	@Override
	public double getMaximum() {
		return Collections.max(this.getZahlen());
	}

	/**
	 * Diese Methode fügt ein Element zur Arraylist hinzu.
	 * @param value ist der Wert den das Element, welches hinzugefügt wird, haben soll
	 */
	@Override
	public void add(double value) {
		this.getZahlen().add(value);
	}
	
	/**
	 * Diese Methode gibt die Größe der Arraylist zurück
	 * @return die Länge
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