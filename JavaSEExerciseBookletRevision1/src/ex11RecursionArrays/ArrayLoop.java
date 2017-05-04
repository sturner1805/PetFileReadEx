package ex11RecursionArrays;

public class ArrayLoop {
	
	static int arr [] = new int [11];
	
	public static void main (String [] args){
		
		arrayPop();
		arrayTen();
		
	}
	public static void arrayTen(){
		for (int i = 1 ; i < arr.length ; i++){
			arr[i] = i * 10;
			System.out.println(arr[i]);
		}	
	}
	
	public static void arrayPop(){
		
		for(int i = 1 ; i < arr.length ; i++){
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}
}
