
public class Ex8 {
	public static void main(String[]args){
		
		// 8 Create a for loop that will call and output the result of your method from Task 7 10 times, using the current iteration as one of the parameters you pass to it.
				for (int i = 0 ; i<10 ; i++){
					System.out.println(sumNumbers4(i,2,false));
				}
	}
	
	public static int sumNumbers4(int x, int y, boolean a){
		
		int sum = x + y;
		int product = x * y;
		if (x == 0){
			return y;
		} 
		if (y == 0){
			return x;
		}
		if (a == true){
			return sum;
		} else {
			return product;
		}
		
	}

}
