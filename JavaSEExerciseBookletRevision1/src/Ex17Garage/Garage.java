package Ex17Garage;
import java.util.Scanner;
import java.util.ArrayList;

public class Garage {

	static Scanner sc = new Scanner (System.in);
	
	static ArrayList <Vehicle> garage = new ArrayList <Vehicle> ();
	
	static Car fiatPanda = new Car (1, "car", "Fiat Panda", 3, 5000, 5,5);
	static Car toyotaPrius = new Car (2, "car", "Toyota Prius", 7, 30000, 5, 5);
	static Car mazdaMX5 = new Car (3, "car", "Mazda MX5", 10, 120000, 3, 2);
	static Motorcycle r1200 = new Motorcycle (4, "motorcycle", "BMW R1200", 3, 12000, 3, "Touring");
	static Motorcycle harley = new Motorcycle (5, "motorcycle", "Harley Davison", 25, 500000, 2, "Classic");
	static Motorcycle kowazaki = new Motorcycle (6, "motorcycle", "Kowazaki Ninja", 7, 5000, 0, "Racing");
	
	
	
	public static void main(String[] args) {
		garage.add(fiatPanda);
		garage.add(kowazaki);
		garage.add(mazdaMX5);
		garage.add(r1200);
		garage.add(harley);
		garage.add(toyotaPrius);
		
		vehicleValue(1);
//		addVehicle();
		

	}
	
	public static void addVehicle(){
		System.out.println("Enter vehicle type.");
		String type = sc.nextLine();
		
			int id = 0; 
			int newId =	id+1;
			System.out.println("Enter make and model.");
			String makeModel = sc.nextLine();
			System.out.println("Enter car age.");
			int age = sc.nextInt();
			System.out.println("Enter milage.");
			int mileage = sc.nextInt();
		
			switch (type){
				case "car":
					System.out.println("Enter number of doors");
					int doors = sc.nextInt();
					System.out.println("Enter number of seats.");
					int seats = sc.nextInt();
					Car c = new Car (newId, type, makeModel, age, mileage, doors, seats);
					garage.add(c);
					break;
			
				case "motorcycle":
					System.out.println("Enter number of panniers.");
					int panniers = sc.nextInt();
					System.out.println("Enter style of motorcycle");
					String style = sc.next();
					Motorcycle m = new Motorcycle(newId, type, makeModel, age, mileage, panniers, style);
					garage.add(m);
					break;
					
				default:
					System.out.println("Error - invalid vehicle type");
			}	
	}			
			

	
	public static void removeVehicle(int ident){
		for (Vehicle v : garage){
			if (v.id == ident){
				garage.remove(v);
			}
		}
	}
	
	public static void vehicleValue(int ident){
		for (Vehicle v : garage){
			if (v.id == ident){
				garage.get(v.id-1);
			}	
//				System.out.println(v.makeModel);
			double valueVehicle = 10000 - 100*v.age - 0.5*v.mileage;
			switch(v.type){
			case "Car":
				double valueCar = valueVehicle + 200*((Car) v).doors + 500*((Car) v).seats;
				System.out.println(valueCar);
				break;
			case "motorcycle":
				int styleMultiplier = 0;
				if (((Motorcycle)v).style == "Touring"){
					styleMultiplier = 100;
				}if (((Motorcycle)v).style == "Racing"){
					styleMultiplier = 1000;
				}if (((Motorcycle)v).style == "Classic"){
					styleMultiplier = 500;
				}
				double valueMotorcycle = (valueVehicle + 100*((Motorcycle) v).panniers)*styleMultiplier;
				System.out.println(valueMotorcycle);
				break;
			}
		}
			
		
//		return ident;
	}
}

