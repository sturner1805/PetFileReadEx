package ex7Conditionals2;

public class MainConditional {
	
	public static void main(String[] args) {
		
		sum(0, 8, false);

	}
	
	public static int sum(int a, int b, boolean x){
		int answer;
		if(x == true){
			answer = a + b;
		}else{
			answer = a * b;
		}if(a == 0){
			answer = b;
		}if(b == 0){
			answer = a;
		}
		System.out.println(answer);
		return answer;
	}
}
