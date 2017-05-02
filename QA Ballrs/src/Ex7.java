
public class Ex7 {
	public static void main(String[]args){
		
		// 7 Modify your method from Task 6 to have another if statement that checks if one of the numbers is 0, if this is true then return the other non-0 number.
				sumNumbers3(2,5,false);
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
