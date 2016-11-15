package Seemann;

/**
* Klasse RaumInhalt, zur Berechnung des Volumens / RaumInhalt von Zylinder , Quader und Prisma
* 
* @author Reichmann Adrian
* @version 2016-11-15
*/

public class RaumInhalt extends Flaeche implements IRaumInhalt{
	
	//Hoehen Attribut
	private double h;
	
	
	/**
	 * Konstruktor ruft den Konstruktor der Parent Klasse auf
	 */
	public RaumInhalt(){
		super();
		
	}

	/**
	 * Methode getRaumInhalt, berechnet und returnt das Volumen / RaumInhalt von Zylinder , Quader oder Prisma je nach geaddeten Zahlen
	 * 
	 * @return double Wert mit dem Volumen der erstellten Figur, bei Fehler 0.0
	 */
	@Override
	public double getRaumInhalt() {
		int size = super.getSize(); //Size der ArrayList
		double flaeche = super.getFlaeche(); //Die Fläche
		
		//Nichts geaddet
				if(size<1){
					System.out.println("Sie haben keine Zahlen geaddet bzw. nicht genügend.");
					return 0;
				}
				
				
				//Zylinder
				if(size==2){
					this.h = super.getZahlen(0); //Hoehe wird geholt
					this.setR(super.getZahlen(1)); //der Radius wird zwischen gespeichert
					this.getZahlen().clear();//Zahlen werden gecleared den der Flächeninhalt von einem Kreis kann nur mit einer Zahl berechnet werden
					this.add(this.getR());//der Radius wird wieder geaddet wegen des Flächeninhalts
					return this.h*this.getFlaeche();// Höhe mal der Fläche ist bekanntlich das Volumen...
				}
				
				
				//Quader
				if(size==3){
					this.h = super.getZahlen(0);//Selbes Prinzip mit zwischen Speichern und Clearen (aufgrund der getFlache Methode) wie bei Zylinder
					this.setA(super.getZahlen(1));
					this.setB(super.getZahlen(2));
					this.getZahlen().clear();
					this.add(this.getA());
					this.add(this.getB());
					return this.h*this.getFlaeche();
				}
				
				//Prisma
				if(size>=4){
					this.h = super.getZahlen(0);//Selbes Prinzip mit zwischen Speichern und Clearen (aufgrund der getFlache Methode) wie bei Zylinder
					this.setA(super.getZahlen(1));
					this.setA(super.getZahlen(1));
					this.setB(super.getZahlen(2));
					this.setC(super.getZahlen(3));
					this.getZahlen().clear();
					this.add(this.getA());
					this.add(this.getB());
					this.add(this.getC());
					return this.h*this.getFlaeche();
				}
				System.out.println(flaeche);
				return 0;
			
	}	
}

