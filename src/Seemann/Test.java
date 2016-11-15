package Seemann;
/**
 * Die Klasse Test testet die Methoden aus Zahlen, Flaeche und Rauminhalt
 * 
 * @author SEEMANN Manuel
 * @version 2016-11-10
 */

public class Test {
	/**
	 * Methode main ruft alle Klassen auf und gibt die Ergebnisse aus
	 * 
	 * @param args
	 */
	public static void main(String[] args){

		//Test der Klasse Zahlen Summe, Maximum und Minimum
		Zahlen z = new Zahlen();
		z.add(10);
		z.add(11);
		z.add(12);
		z.add(13);
		System.out.println("Summe: "+z.getSumme());
		System.out.println("Maximum: "+z.getMaximum());
		System.out.println("Minimum: "+z.getMinimum());
		
		
		//Test der Klasse Flaeche Kreis, Dreieck und Rechteck
		Flaeche kreis = new Flaeche();
		kreis.add(2);
		System.out.println("Kreis: "+kreis.getFlaeche());
		
		
		Flaeche dreieck = new Flaeche();
		dreieck.add(2);
		dreieck.add(3);
		dreieck.add(4);

		System.out.println("Dreieck: "+dreieck.getFlaeche());
		
		Flaeche rechteck = new Flaeche();
		rechteck.add(2);
		rechteck.add(3);

		System.out.println("Rechteck: "+rechteck.getFlaeche());
		

		RaumInhalt zylinder = new RaumInhalt();
		zylinder.add(2);
		zylinder.add(2);
		System.out.println("Zylinder: "+zylinder.getRaumInhalt());
		
		RaumInhalt quader = new RaumInhalt();
		quader.add(8);
		quader.add(2);
		quader.add(2);
		System.out.println("Quader: "+quader.getRaumInhalt());
		
		RaumInhalt prisma = new RaumInhalt();
		prisma.add(2);
		prisma.add(5);
		prisma.add(8);
		prisma.add(12);
		System.out.println("Prisma: "+prisma.getRaumInhalt());

		
		
	}
}