
public class Boat extends Vehicle {
	boolean isMotorised;

	public Boat(int id, int seatCount, String color, boolean isMotorised) {
		super(id, seatCount, color);
		this.isMotorised = isMotorised;
	}

	public boolean isMotorised() {
		return isMotorised;
	}

	public void setMotorised(boolean isMotorised) {
		this.isMotorised = isMotorised;
	}

	public String toString() {
		return "ID: " + this.id + " SeatCount: " + this.seatCount + " Color: "
				+ this.color + " Motorised: " + this.isMotorised;
	}

}
