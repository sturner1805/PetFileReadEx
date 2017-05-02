import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle v) {
		vehicleList.add(v);
	}

	public void addVehicle(int id, int seatCount, String color,
			int wheelCount) {
		vehicleList.add(new Car(id, seatCount, color, wheelCount));
	}
	public void addVehicle(int id, int seatCount, String color,
			double firePower) {
		vehicleList.add(new Tank(id, seatCount, color, firePower));
	}

	public void outputVehicles() {
		for (Vehicle v : vehicleList) {
			System.out.println(v);
		}
	}

	public void removeVehicle(int id) {
		for (Vehicle v : vehicleList) {
			if (v.id == id) {
				vehicleList.remove(v);
				break;
			}
		}
	}

	public void removeVehicle(String type) {
		Iterator<Vehicle> it = vehicleList.iterator();
		while (it.hasNext()) {
			Vehicle v = it.next();
			if (type.equals("Car") && v instanceof Car) {
				it.remove();
			} else if (type.equals("Boat") && v instanceof Boat) {
				it.remove();
			} else if (type.equals("Tank") && v instanceof Tank) {
				it.remove();
			}
		}
	}

	public void calculateBill() {
		for (Vehicle v : vehicleList) {
			if (v instanceof Car) {
				Car c = (Car) v;
				double price = c.seatCount * c.wheelCount * 200;
				System.out.println("$$" + price);
			} else if (v instanceof Tank) {
				Tank willywonk = (Tank) v;
				double price = willywonk.seatCount * willywonk.firePower * 200;
				System.out.println("$$" + price);
			} else if (v instanceof Boat) {
				Boat c = (Boat) v;
				double price = c.seatCount * 200;
				if (c.isMotorised)
					price += 20000;
				System.out.println("$$" + price);
			}
		}
	}

}
