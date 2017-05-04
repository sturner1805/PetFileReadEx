package ex13Blackjack;
import java.util.Scanner;

public class Blackjack {
	
	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	static int b = sc.nextInt();

	public static void main(String[] args) {
		
		comparitor(a,b);

	}
	
	public static void comparitor(int a, int b){
		if ((a>b | b>21) & a<22){
			System.out.println(a);
		}else if ((b>a | a>21) & b<22){
			System.out.println(b);
		}else if (a==b && a<21 && b<21){
			System.out.println("Draw");
		}else{
			System.out.println(0);
		}
	}
}
