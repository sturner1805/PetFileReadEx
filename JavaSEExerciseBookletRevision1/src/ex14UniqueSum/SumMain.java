package ex14UniqueSum;
import java.util.Scanner;

public class SumMain {
	
	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	static int b = sc.nextInt();
	static int c = sc.nextInt();

	public static void main(String[] args) {
		
		System.out.println(calculator(a,b,c));
		
	}
	
	public static int calculator(int x, int y, int z){
		int sumXYZ = x + y + z;
		if(x == y){
			return z;
		}else if(x == z){
			return y;
		}else if (y == z){
			return x;
		}else{
			return sumXYZ;
		}
	}

}
