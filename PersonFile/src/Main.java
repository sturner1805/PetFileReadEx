import java.util.ArrayList;
import java.util.Formatter;
import java.io.File;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args){
		
		fileWriter();
		fileReader();
		
	}
	
	public static void fileWriter(){
		
		ArrayList <Person> backRowBallrz = new ArrayList<Person>();
		backRowBallrz.add(Person.marc);
		backRowBallrz.add(Person.hassan);
		backRowBallrz.add(Person.kieran);
		backRowBallrz.add(Person.gareth);
		backRowBallrz.add(Person.sam);
		try{
			Formatter f = new Formatter ("C:\\Users\\Administrator\\Desktop\\eclipse\\people.txt");
			for (Person p : backRowBallrz){
				f.format("%s, %s, %s.\r\n", p.name, p.age, "is a" + p.job);
			}
			f.close();
		}catch (Exception e){
		}
	}
	
	public static void fileReader(){
		
		File f = new File ("C:\\Users\\Administrator\\Desktop\\eclipse\\people.txt");
		Scanner sc = new Scanner(f);
		String input  = "";
		while(sc.hasNext()){
			input += sc.nextLine() + "\n";
		}
		sc.close();	
	}

}
