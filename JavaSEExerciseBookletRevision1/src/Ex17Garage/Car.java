package Ex17Garage;

public class Car extends Vehicle{
	
	int doors;
	int seats;
	
	public Car (int id, String makeModel, int age, int mileage, int doors, int seats){
		super(id, makeModel, age, mileage);
		this.doors = doors;
		this.seats = seats;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
}
