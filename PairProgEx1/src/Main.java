import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println(countTriple(enter.nextLine()));
	}
	
	public static int countTriple(String a){
		
	int answer = 0;
	
	char [] arr = a.toCharArray();
	
	for (int i=0; i < arr.length-2; i++){
		if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]){
			answer++;
		}
		
	}return answer;
	
	}
}
