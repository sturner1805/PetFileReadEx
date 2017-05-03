package ex9Arrays;

public class MainArray {
	
	static int[] arr = {2,5,4,8,3,9,2,6,3,1};
	
	public static void main ( String[] args){
		
		arrayRead();
		
	}
	
	public static void arrayRead(){
		for(int i = 0 ; i <=10 ; i++){
			System.out.println(sum(arr[i], arr[1], true));
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
		//System.out.println(answer);
		return answer;
	}
}
