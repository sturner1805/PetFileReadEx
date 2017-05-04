package Ex17Garage;

public class Motorcycle extends Vehicle{
	
	int panniers;
	String style;
	
	public Motorcycle(int id, String makeModel, int age, int mileage, int panniers, String style){
		super (id, makeModel, age, mileage);
		this.panniers = panniers;
		this.style = style;
	}

	public int getPanniers() {
		return panniers;
	}

	public void setPanniers(int panniers) {
		this.panniers = panniers;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
