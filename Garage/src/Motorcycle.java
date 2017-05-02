
public class Motorcycle extends Vehicle{
	
	String style;
	boolean sidecar;
	int panniers;
	
	public Motorcycle (int id, String name, int age, int mileage, 
						String style, boolean sidecar, int panniers){
		super(id, name, age, mileage);
		this.style = style;
		this.sidecar = sidecar;
		this.panniers = panniers;
	}
	
	public int stylemulti(){
		int styleMulti = 0;
		if (style == "Touring Bike"){
			styleMulti = 10;
		}else if(style == "Superbike"){
			styleMulti = 50;
		}else if(style == "Scooter"){
			styleMulti = 5;
		}
		return styleMulti;
	}
	
	public int hasSidecar(){
		int hasSidecar = 0;
		if(sidecar == true){
			hasSidecar = 500;
		}else{
			hasSidecar = 0;
		}
		return hasSidecar;
	}
	
	public int value(){
		int motorcycleValue = this.stylemulti() + this.hasSidecar() + panniers * 100;
		super.value();
		return motorcycleValue;
	}
}
