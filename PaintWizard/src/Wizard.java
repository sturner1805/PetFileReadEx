import java.util.Scanner;

public class Wizard {
	
	double roomArea;
	Scanner sc = new Scanner (System.in);	
	public Wizard(double roomArea){
		this.roomArea=sc.nextDouble();
	}
			
	public static void main(String[] args) {
		
		Paints cheapoMax = new Paints(20, 19.99, 10);
		Paints averageJoes = new Paints(15, 17.99, 11);
		Paints dulux = new Paints (10, 25, 20);
		Wizard room = new Wizard(0);
		
//		System.out.println("CheapoMax will cost £"+room.costForRoom(cheapoMax)+" and there will be "+room.wastage(cheapoMax)+" litres remaining in the tin.");
//		System.out.println("AverageJoes will cost £"+room.costForRoom(averageJoes)+" and there will be "+room.wastage(averageJoes)+" litres remaining in the tin.");
//		System.out.println("DuluxourousPaints will cost £"+room.costForRoom(dulux)+" and there will be "+room.wastage(dulux)+" litres remaining in the tin.");
//		
		if(room.costForRoom(cheapoMax) < room.costForRoom(averageJoes) && room.costForRoom(cheapoMax) < room.costForRoom(dulux)){
			System.out.println("Cheapo Max");
		}else if (room.costForRoom(averageJoes) < room.costForRoom(cheapoMax) && room.costForRoom(averageJoes) < room.costForRoom(dulux)){
			System.out.println("Average Joes");
		}else{
			System.out.println("Duluxourous Paints");
		}
	}
	
	public double wastage(Paints p){
		return (roomArea / p.getAreaPerLitre()) % p.getVolume();
	}
	
	public double costForRoom(Paints p){
		double remainder = roomArea % (p.getVolume() * p.getAreaPerLitre());
		double numberTin = roomArea / (p.getVolume() * p.getAreaPerLitre());
	
		if (remainder>0){
			return (int)(numberTin + 1) * p.getPrice();
		}else{
			return numberTin * p.getPrice();
		}
	}
}