
public class TooHot {
	public static void main (String[]args){
		
		System.out.println(tooHot(100,true));
	}
	
	public static boolean tooHot(int temp, boolean summer){
		if(temp>=60 & temp<=90 & summer == false){
			return true;
		}else if(temp>=60 & temp<=100 & summer == true){
			return true;
		}else {
			return false;
		}
	}

}
