import java.util.Scanner;

public class Game {

	public static void main (String[]args){
		
	
		Player player = new Player ((int)(1+(Math.random() * 100000)), (int)(1+(Math.random() * 100000)));
		Chest chest = new Chest ((int)(1+(Math.random() * 100000)), (int)(1+(Math.random() * 100000)));
		
		System.out.println("Situation: 	A member of you crew is M.I.A.");
		System.out.println("Mission: 	Rendezvous with your missing crewmate.");
		System.out.println("Execution:	Your missing crewmate possesses an emergency beacon. Using a beacon locator, you must navigate to your crewmate's location.");
		System.out.println("		Your beacon locator will tell you the distance to your target location, but it will not give you the direction.");
		System.out.println("         	Due to a technical fault with your navigation system, you can only navigate north, south, east or west.");
		System.out.println("		Enter the direction and distance into your navigation system to change your position.");
		System.out.println("		Time is of the essence! you must reach your crewmate in as few moves as possible.");
		System.out.println();
		System.out.println("Target location at "+dial(player, chest)+" metres");
		int counter = 0;
		while(dial(player, chest) > 0){
			move(player);
		System.out.println("Target location at "+dial(player, chest)+" metres");
		counter ++;
		}
		System.out.println("Target location reached in "+counter+" moves.");
		
	}
	
	public static double dial(Player player, Chest chest){
		double xDiff = chest.getX()-player.getX();
		double yDiff = chest.getY()-player.getY();
		if (xDiff < 0){
			xDiff = Math.sqrt(xDiff*xDiff);
		}
		if (yDiff < 0){
			yDiff = Math.sqrt(yDiff*yDiff);
		}
		double distance = Math.sqrt(xDiff*xDiff+yDiff*yDiff);
		return distance;
		
	}
	
	public static void move(Player player){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter direction to travel (North/East/South/West): ");
		String direction = sc.next();
		System.out.print("Enter distance (metres) to travel "+direction.toLowerCase()+": ");
		int lengthMove = Integer.parseInt(sc.next());
		if (direction.toLowerCase().equals("north")){
			player.y += lengthMove;
		}
		if (direction.toLowerCase().equals("south")){
			player.y -= lengthMove;
		}
		if (direction.toLowerCase().equals("east")){
			player.x += lengthMove;
		}
		if (direction.toLowerCase().equals("west")){
			player.x -= lengthMove;
		}
	}
}
