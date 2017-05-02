
public class Ex9 {
	public static void main (String[]args){
		
		// 9 Create an array that will hold 10 integer values, populate the array with values, then call and output the result of your method from Task 7 with values that are stored in the array.
		int[] myArray = {5,2,4,6,3,1,8,9,7,2};
		sumNumbers3(myArray[4],myArray[7],false);
		
	}
	
	public static int sumNumbers3(int x, int y, boolean a){
		int sum = x + y;
		int product = x * y;
		if (x == 0){
			System.out.println(y);
			return y;
		} 
		if (y == 0){
			System.out.println(x);
			return x;
		}
		if (a == true){
			System.out.println(sum);
			return sum;
		} else {
			System.out.println(product);
			return product;
		}
		
	}

}
