package ex6Conditionals;

public class MainMethod {
	
	public static void main(String[] args) {
		
		sum(5, 8, false);

	}
	
	public static int sum(int a, int b, boolean x){
		int answer;
		if(x == true){
			answer = a + b;
		}else{
			answer = a * b;
		}
		System.out.println(answer);
		return answer;
	}

}
