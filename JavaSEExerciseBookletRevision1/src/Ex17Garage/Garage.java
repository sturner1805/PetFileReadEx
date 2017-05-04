package Ex17Garage;
import java.util.Scanner;
import java.util.ArrayList;

public class Garage {

	static Scanner sc = new Scanner (System.in);
	
	static ArrayList <Vehicle> garage = new ArrayList <Vehicle> ();
	
	public static void main(String[] args) {
		
		addVehicle();

	}
	
	public static void addVehicle(){
		System.out.println("Enter vehicle type.");
		String vehicleType = sc.nextLine();
		
		int id = 0; 
		int newId =	id+1;
		System.out.println("Enter car make and model.");
		String makeModel = sc.nextLine();
		System.out.println("Enter car age.");
		int age = sc.nextInt();
		System.out.println("Enter milage.");
		int mileage = sc.nextInt();
		
		switch (vehicleType){
			case "car":
				System.out.println("Enter number of doors");
				int doors = sc.nextInt();
				System.out.println("Enter number of seats.");
				int seats = sc.nextInt();
				Car c = new Car (newId, makeModel, age, mileage, doors, seats);
				garage.add(c);
				break;
			
			case "motorcycle":
				System.out.println("~Enter number of panniers.");
				int panniers = sc.nextInt();
				System.out.println("Enter style of motorcycle");
				String style = sc.nextLine();
				Motorcycle m = new Motorcycle(newId, makeModel, age, mileage, panniers, style);
				garage.add(m);
		}
	}
}

