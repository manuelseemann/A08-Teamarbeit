package Seemann;

public class Test {
	public static void main(String[] args){
		Flaeche kreis = new Flaeche(5, 0, 0);
		Flaeche rechteck = new Flaeche(4, 4, 0);
		Flaeche dreieck = new Flaeche(2, 2, 2);
		
		System.out.println(kreis.getFlaeche());
		System.out.println(dreieck.getFlaeche());
		System.out.println(rechteck.getFlaeche());
		
		Flaeche x = new Flaeche(0, 5, 0);
		System.out.println(x.getFlaeche());
		
		Flaeche y = new Flaeche(0, 0, 0);
		System.out.println(y.getFlaeche());
	}
}
