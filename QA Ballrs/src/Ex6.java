
public class Ex6 {
	public static void main(String[]args){
		
		// 6 Modify your method from Task 5 to accept another parameter, a Boolean, which if it is true, the method will return a sum of the two numbers, and if it is false it will return the multiplication of the two numbers.
				sumNumbers2(4,6,false);
	}
	
	public static int sumNumbers2(int x, int y, boolean a){
		int sum = x + y;
		int product = x * y;
		if (a == true){
			System.out.println(sum);
			return sum;
		}
		else{
			System.out.println(product);
			return product;
		}
		
	}

}
