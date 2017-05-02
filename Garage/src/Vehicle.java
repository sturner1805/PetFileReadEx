
public class Vehicle {
	
	
	int id;
	String name;
	int age;
	int mileage;
	
	public Vehicle (int id, String name, int age, int mileage){
		
		this.id = id;
		this.name =name;
		this.age = age;
		this.mileage = mileage;	
	}
	
	public int nameMultiplier(){
		int nameMultiplier = 0;
		if(name == "Car"){
			nameMultiplier = 5;
		}else if(name == "Motorcycle"){
			nameMultiplier = 2;
		}else{
			nameMultiplier = 3;
		}
		return nameMultiplier;
	}

	public int value(){
		int vehicleValue = 1000 * this.nameMultiplier() - (age * 10) - (mileage/100);
		return vehicleValue;
	}
}

