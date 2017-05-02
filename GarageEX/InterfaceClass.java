
public class InterfaceClass {

	void displayMainMenu() {
		System.out.println("Welcome to my Garage");
		System.out.println("Please enter a number for your option");
		System.out.println("1. Add a vehicle");
		System.out.println("2. Remove a vehicle by ID");
		System.out.println("3. Remove a vehicle by  Type");
		System.out.println("4. Output Vehicles");

		int input = InputClass.takeInt();
		switch (input) {
			case 1 :
				addAVehicle();
				break;
			case 2 :
				// remove a vehicle
		}
	}

	Vehicle addAVehicle() {
		System.out.println(
				"What kind of vehicle would you like to have? (Car/Tank/Boat)");
		String input = InputClass.takeString();
		Vehicle v = null;
		switch (input) {
			case "Car" :
				v = addACar();
				break;
			case "Tank" :
				// v = addATank();

		}
		return v;
	}

	public Car addACar() {

		boolean incorrectInput = true;
		int id = -1;
		int seatCount = -1;
		int wheelCount = -1;
		String color = "";
		while (incorrectInput) {
			try {
				System.out.println("Enter ID: ");
				id = Integer.parseInt(InputClass.takeString());
				System.out.println("Enter SeatCount: ");
				seatCount = Integer.parseInt(InputClass.takeString());
				System.out.println("Enter Color: ");
				color = InputClass.takeString();
				wheelCount = Integer.parseInt(InputClass.takeString());
				incorrectInput = false;
			} catch (Exception ex) {
				System.out.println(
						"Incorrect input, try again. " + ex.toString());
			}
		}

		return new Car(id, seatCount, color, wheelCount);
	}

}
