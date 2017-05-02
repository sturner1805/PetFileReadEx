
public class MainClass {
	public static void main(String[] args) {

		Garage g = new Garage();

		Car c = new Car(3, 2, "Black", 4);
		Car c2 = new Car(3, 2, "Black", 4);
		Car c3 = new Car(3, 2, "Black", 4);
		Boat b = new Boat(4, 3, "Yellow", true);

		g.addVehicle(c);
		g.addVehicle(c2);
		g.addVehicle(c3);
		g.addVehicle(b);

		g.outputVehicles();

		g.removeVehicle("Car");

		System.out.println("Removing");
		g.outputVehicles();

		Tank willywonk = new Tank(10, 9, "Yellow", 9999999);
		g.addVehicle(willywonk);
		g.calculateBill();

	}
}
