package Seemann;

public class RaumInhalt extends Flaeche implements IRaumInhalt{

	private double h;
	
	
	
	
	public RaumInhalt(){
		super();
		
	}

	@Override
	public double getRaumInhalt() {
		int size = super.getSize();
		double flaeche = super.getFlaeche();
		
		//Nichts geaddet
				if(size<1){
					System.out.println("Sie haben keine Zahlen geaddet bzw. nicht gen�gend.");
					return 0;
				}
				
				
				//Zylinder
				if(size==2){
					this.h = super.getZahlen(0);
					System.out.println(this.getFlaeche());
					return (this.h*this.getFlaeche());
				}
				
				
				//Quader
				if(size==3){
					this.h = super.getZahlen(0);
					System.out.println(this.getFlaeche());
					return Math.sqrt(h*this.getFlaeche());
				}
				
				//Prisma
				if(size>=4){
					this.h = super.getZahlen(0);
					System.out.println(this.getFlaeche());
					return Math.sqrt(h*this.getFlaeche());
				}
				System.out.println(flaeche);
				return 0;
			
	}	
}

