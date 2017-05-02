
public class Ex11 {
	public static void main(String[]args){
		
		// 11 Create a for loop that populates an integer array with values, outputting them at each iteration. Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
		int i = 1;
		int [] array = new int[10];
		for (i=0 ; i<array.length ; i++){
			array [i] = i;
			System.out.print(i+" ");
		}
		for (int x : array){
			x=x*10;
			System.out.print(x+" ");
		}
	}

}
