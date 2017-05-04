package Ex17Garage;
import java.util.Scanner;
import java.util.ArrayList;

public class Garage {

	static Scanner sc = new Scanner (System.in);
	
	static ArrayList <Vehicle> garage = new ArrayList <Vehicle> ();
	
	static Car fiatPanda = new Car (1, "Fiat Panda", 3, 5000, 5,5);
	Car toyotaPrius = new Car (2, "Toyota Prius", 7, 30000, 5, 5);
	Car mazdaMX5 = new Car (3, "Mazda MX5", 10, 120000, 3, 2);
	Motorcycle r1200 = new Motorcycle (4, "BMW R1200", 3, 12000, 3, "Touring");
	Motorcycle harley = new Motorcycle (5, "Harley Davison", 25, 500000, 2, "Classic");
	Motorcycle kowazaki = new Motorcycle (6, "Kowazaki Ninja", 7, 5000, 0, "Racing");
	
	
	
	public static void main(String[] args) {
	 garage.add(fiatPanda);	
//		addVehicle();
//		removeVehicle(1);
//		for (Vehicle v : garage){
//			System.out.println(v.getId());
//		}

	}
	
//	public static void addVehicle(){
//		System.out.println("Enter vehicle type.");
//		String vehicleType = sc.nextLine();
//		
//			int id = 0; 
//			int newId =	id+1;
//			System.out.println("Enter make and model.");
//			String makeModel = sc.nextLine();
//			System.out.println("Enter car age.");
//			int age = sc.nextInt();
//			System.out.println("Enter milage.");
//			int mileage = sc.nextInt();
//		
//			switch (vehicleType){
//				case "car":
//					System.out.println("Enter number of doors");
//					int doors = sc.nextInt();
//					System.out.println("Enter number of seats.");
//					int seats = sc.nextInt();
//					Car c = new Car (newId, makeModel, age, mileage, doors, seats);
//					garage.add(c);
//					break;
//			
//				case "motorcycle":
//					System.out.println("Enter number of panniers.");
//					int panniers = sc.nextInt();
//					System.out.println("Enter style of motorcycle");
//					String style = sc.next();
//					Motorcycle m = new Motorcycle(newId, makeModel, age, mileage, panniers, style);
//					garage.add(m);
//					break;
//			}
//	}			
			

	
	public static void removeVehicle(int ident){
		for (Vehicle v : garage){
			if (v.id == ident){
				garage.remove(v);
			}
		}
	}
}

