import java.util.Scanner;

public class InputClass {
	private static Scanner sc = new Scanner(System.in);

	public static String takeString() {
		return sc.next();
	}

	public static int takeInt() {
		return sc.nextInt();
	}

}
