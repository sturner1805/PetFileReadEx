import java.util.Scanner;

public class Ex12 {
	public static void main(String[]args){
		
		// 12 Modify the previous task to use the Scanner class, taking an integer off of the user and using that integer to determine how large the array is going to be.
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter number.");
		int arrayLength = scan.nextInt();
		
		int i = 100;
		int [] array = new int[arrayLength];
		for (i=0 ; i<array.length ; i++){
			array [i] = i;
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		
		for (int x : array){
			x=x*10;
			System.out.print(x+" ");
		}
		
		
		
	}

}
