import java.util.ArrayList;

public class Garage {
	
ArrayList<Vehicle>garage = new ArrayList<Vehicle>();

	public static void main(String[] args){
		
		Car focus = new Car (1,"Ford Focus", 5, 50000, 5, 5, true);
		Car gt = new Car (2, "Masserati GT", 2, 20000, 2, 4, true);
		Car estate = new Car (3, "Volvo Estate", 12, 200000, 5, 7, true);
		Motorcycle bmw = new Motorcycle (4, "BMW R1200", 1, 5000, "Touring Bike", false, 3);
		Motorcycle honda = new Motorcycle (5, "Honda", 2, 10000, "Superbike", false, 2);
		Motorcycle vespa = new Motorcycle (6, "Vespa", 10, 15000, "Scooter", true, 1);
		Van transit = new Van (7, "Ford Transit", 3, 120000, 6, false, 2000);
		Van caddy = new Van (8, "VW Caddy", 11, 300000, 3, false, 900);
		Van LDV = new Van (9, "LDV", 7, 223000, 9, true, 2700);
		
		Garage g = new Garage();
		g.addVehicle(focus);
		g.addVehicle(gt);
		g.removeVehicle(1);
		g.outputVehicle(gt);
		g.emptyGarage();
		g.outputVehicle(gt);
		}
	
	public void addVehicle(Vehicle v){
		garage.add(v);
		System.out.println(v.name + " added to garage.");
	}
	
	public void removeVehicle(int id){
		for (Vehicle v : garage){
			if(v.id == id){
				garage.remove(v);
				System.out.println(v.name + " removed from garage.");
			}
		}
	}
	
	public void outputVehicle(Vehicle v){
		for(Vehicle f : garage){
			System.out.println(v.name + " £"+v.value());
		}
	}
	
	public void emptyGarage(){
		garage.removeAll(garage);
		System.out.println("Garage Empty");
	}
}
