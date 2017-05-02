
public class Tank extends Vehicle {
	double firePower;

	public Tank(int id, int seatCount, String color, double firePower) {
		super(id, seatCount, color);
		this.firePower = firePower;
	}

	public double getFirePower() {
		return firePower;
	}

	public void setFirePower(double firePower) {
		this.firePower = firePower;
	}

	public String toString() {
		return "ID: " + this.id + " SeatCount: " + this.seatCount + " Color: "
				+ this.color + " FirePower: " + this.firePower;
	}

}
