package Seemann;
import java.util.ArrayList;
import java.util.Collections;

public class Zahlen implements IZahlen{
	private ArrayList<Double> zahlen;
	
	public Zahlen(){
		this.zahlen = new ArrayList<Double>();
	}

	@Override
	public double getSumme() {
		double summe = 0;
		for(int i = 0; i < this.zahlen.size(); i++){
			summe += this.zahlen.get(i);
		}
		return summe;
	}

	@Override
	public double getMinimum() {
		return Collections.min(this.zahlen);
	}

	@Override
	public double getMaximum() {
		return Collections.max(this.zahlen);
	}

	@Override
	public void add(double value) {
		this.zahlen.add(value);
		
	}
}
