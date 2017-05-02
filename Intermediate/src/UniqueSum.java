
public class UniqueSum {
	
	public static void main (String[]args){
		
		System.out.println(uniqueSum(1,5,5));
	}
	
	public static int uniqueSum(int a, int b, int c){
		
		int sumabc = a + b + c;
				
		if (a == b){
			return c;
		}else if (a == c){
			return b;
		}else if(c == b){
			return a;
		}else{
			return sumabc; 
		}
	}

}
