package Ex17Garage;

public class Vehicle {
	
	int id;
	String type;
	String makeModel;
	int age;
	int mileage;
	
	public Vehicle (int id, String type, String makeModel, int age, int mileage){
		
		this.id = id;
		this.type = type;
		this.makeModel = makeModel;
		this.age = age;
		this.mileage = mileage;	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMakeModel() {
		return makeModel;
	}

	public void setMakeModel(String makeModel) {
		this.makeModel = makeModel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	
}
