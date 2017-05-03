package ex4ReturnTypes;

public class Main {
	
	public static void main (String[] args){
		printer ("Hello World!");
	}
	
	public static String printer (String a){
		System.out.println(a);
		return a;
	}

}
