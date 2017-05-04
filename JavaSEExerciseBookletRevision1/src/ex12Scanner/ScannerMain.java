package ex12Scanner;
import java.util.Scanner;

public class ScannerMain {
	
	static Scanner sc = new Scanner(System.in);
	static int arrLength = sc.nextInt();
	
	static int arr [] = new int [arrLength];
	
	public static void main (String [] args){
		
		arrayPop();
		arrayTen();
		
	}
	public static void arrayTen(){
		for (int i = 0 ; i < arr.length ; i++){
			arr[i] = (i+1) * 10;
			System.out.println(arr[i]);
		}	
	}
	
	public static void arrayPop(){
		
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
	}
	
	

}
