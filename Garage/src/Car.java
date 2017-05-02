
public class Car extends Vehicle {
		
	protected int doors;
	protected int seats;
	protected boolean boot;
	
	public Car (int id, String name, int age, int mileage, 
				int doors, int seats, boolean boot){
		super(id, name, age, mileage);
		this.doors = doors;
		this.seats = seats;
		this.boot = boot;
	}
	
	public int hasBoot(){
	int hasBoot = 1;
	if(boot == true){
		hasBoot = 500;
	}else{
		hasBoot = 0;
	}
	return hasBoot;
	}
	
	public int value(){
		
		int carValue = super.value() + doors * 100 + seats * 200 + this.hasBoot();
		return carValue;
		
	}
}
