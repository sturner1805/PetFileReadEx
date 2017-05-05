package Ex18PaintWizard;


public class Paints {
	
	int volume;
	double price;
	int areaPerLitre;
	
	public Paints (int v, double p, int a){
		
		this.volume = v;
		this.price = p;
		this.areaPerLitre = a;
	}
	
	public int getVolume(){
		return this.volume;
	}
	public void setVolume(int v){
		this.volume = v;
	}
	
	public double getPrice(){
		return this.price;
	}
	public void setPrice(double p){
		this.price = p;
	}
	
	public int getAreaPerLitre(){
		return this.areaPerLitre;
	}
	public void setAreaPerLitre(int a){
		this.areaPerLitre = a;
	}
}
