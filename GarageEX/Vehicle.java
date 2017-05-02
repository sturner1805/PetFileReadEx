
public abstract class Vehicle {
	int id;
	int seatCount;
	String color;

	public Vehicle(int id, int seatCount, String color) {
		super();
		this.id = id;
		this.seatCount = seatCount;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
