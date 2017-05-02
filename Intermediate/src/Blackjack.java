
public class Blackjack {
	
	public static void main (String[]args){
		
		System.out.println(blackJack(25,21));
		
	}
	
	public static int blackJack(int a, int b){

		if ((a>b | b>22) & a<22){
			return a;
		}else if ((b>a | a>22) & b<22){
			return b;
		}else {
			return 0;
		}
	}
}
