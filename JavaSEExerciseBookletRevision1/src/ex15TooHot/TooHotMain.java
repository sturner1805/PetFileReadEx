package ex15TooHot;
import java.util.Scanner;

public class TooHotMain {
	
	static Scanner sc = new Scanner (System.in);
	static int temp = sc.nextInt();
	static String season = sc.next();
	
	public static boolean summer(){
		boolean summer;
		if(season == "summer"){
			summer = true;
		}else{
			summer = false;
		}return summer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(logic(temp, summer()));

	}
	
	public static boolean logic(int i, boolean b){
		if (i >= 60 && i <= 90 && b == false){
			return true;
		}else if (i >= 60 && i <= 100 && b == true){
			return true;
		}else{
			return false;
		}
	}
}
