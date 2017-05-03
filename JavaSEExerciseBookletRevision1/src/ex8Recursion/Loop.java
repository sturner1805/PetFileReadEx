package ex8Recursion;

public class Loop {
	
	public static void main(String[] args) {
		
		looper();

	}
	
	public static void looper(){
		for (int i = 1 ; i <= 10 ; i++){
			sum(i, 5, false);
		}
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
