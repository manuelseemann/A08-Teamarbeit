package Seemann;

public class Test {
	public static void main(String[] args){
		/*Flaeche kreis = new Flaeche(5, 0, 0);
		Flaeche rechteck = new Flaeche(4, 4, 0);
		Flaeche dreieck = new Flaeche(2, 2, 2);
		
		System.out.println(kreis.getFlaeche());
		System.out.println(dreieck.getFlaeche());
		System.out.println(rechteck.getFlaeche());
		
		Flaeche x = new Flaeche(0, 5, 0);
		System.out.println(x.getFlaeche());
		
		Flaeche y = new Flaeche(0, 0, 0);
		System.out.println(y.getFlaeche());*/
		Zahlen z = new Zahlen();
		z.add(10);
		z.add(11);
		z.add(12);
		z.add(13);
		System.out.println("Summe: "+z.getSumme());
		System.out.println("Maximum: "+z.getMaximum());
		System.out.println("Minimum: "+z.getMinimum());
		
		
		//----------------------------
		
		Flaeche f = new Flaeche("Kreis");
		f.add(2);

		System.out.println("Kreis: "+f.getFlaeche());
		
		Flaeche f1 = new Flaeche("Dreieck");
		f1.add(2);
		f1.add(3);
		f1.add(4);

		System.out.println("Dreieck: "+f1.getFlaeche());
		
		Flaeche f2 = new Flaeche("Rechteck");
		f2.add(2);
		f2.add(3);

		System.out.println("Rechteck: "+f2.getFlaeche());
		
	}
}