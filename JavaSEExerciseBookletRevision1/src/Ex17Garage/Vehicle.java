package Ex17Garage;

public class Vehicle {
	
	int id;
	String makeModel;
	int age;
	int mileage;
	
	public Vehicle (int id, String makeModel, int age, int mileage){
		
		this.id = id;
		this.makeModel = makeModel;
		this.age = age;
		this.mileage = mileage;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getmakeModel() {
		return makeModel;
	}

	public void setmakeModel(String makeModel) {
		this.makeModel = makeModel;
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
