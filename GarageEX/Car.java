
public class Car extends Vehicle {
	int wheelCount;

	public Car(int id, int seatCount, String color, int wheelCount) {
		super(id, seatCount, color);
		this.wheelCount = wheelCount;
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}

	public String toString() {
		return "ID: " + this.id + " SeatCount: " + this.seatCount + " Color: "
				+ this.color + " wheelCount: " + this.wheelCount;
	}

}
