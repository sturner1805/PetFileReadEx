import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		reverseFactorial();
	}
		
	public static void reverseFactorial(){
//			int x = a;
//			int n = 2;
//			//int factorial = 0;
//			for (n=2 ; x/n == 1 ; n++){
//				x = x/n;
//			//if(x==1){
//			//	factorial = n;
//			//}
//			}
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int count = 2;
		
		while(a/count > 1){
			a=a/count;
			count++;
		}if(a/count<1){
			System.out.println("NONE");
		}else{
			System.out.println(count);
		}	
	}
}


