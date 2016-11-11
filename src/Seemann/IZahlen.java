package Seemann;

/**
 * Dies ist das Interface Zahlen.
 * 
 * @author Alexander Hasenberger
 * @return 2016-11-11
 */
public interface IZahlen {
	/**
	 * getSumme Berechnet die Summe der Elemente, welche in der Arraylist vorhanden sind
	 * @return die Summe der Zahlen wird zur�ckgegeben
	 */
	public double getSumme();
	
	/**
	 * getMaximum gibt das kleinste Element der Arraylist zur�ck
	 * @return das kleinste Element
	 */
	public double getMinimum();
	
	/**
	 * getMaximum gibt das gr��te Element der Arraylist zur�ck
	 * @return das gr��te Element
	 */
	public double getMaximum();
	
	/**
	 * Diese Methode f�gt ein Element zur Arraylist hinzu
	 * @param value ist der Wert der das neue Element annehmen soll
	 */
	public void add(double value);
}

