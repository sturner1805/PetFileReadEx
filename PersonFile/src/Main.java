import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	static ArrayList <Person> backRowBallrzTake2 = new ArrayList <Person> ();
	
	public static void main(String[]args){
		
		fileWriter();
		try {
			fileReader();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for (Person a : backRowBallrzTake2){
//			System.out.println(a.name);
//			System.out.println(a.age);
//			System.out.println(a.job);
//		}
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
				f.format("%s, %s, %s.\r\n", p.name, p.age, p.job);
//				System.out.println(p.name);
//				System.out.println(p.age);
//				System.out.println(p.job);
				}
			f.close();
		}catch (Exception e){
		}
		
	}
	
	public static void fileReader() throws FileNotFoundException{
		
		File f = new File ("C:\\Users\\Administrator\\Desktop\\eclipse\\people.txt");
		Scanner sc = new Scanner(f);
		String input  = "";
		while(sc.hasNext()){
			input += sc.nextLine() + "\n";
		}
		sc.close();	
		extractor(input);
		//System.out.println(input);
	}
	
	public static void extractor(String input){
		String [] person = input.split("\n");
		
		for(int i = 0 ; i < person.length ; i++){
			String individual = person[i];
			String [] attribute = individual.split(", ");
			String name = attribute [0];
			String tempAge = attribute [1];
			int age = Integer.parseInt(tempAge);
			String job = attribute [2];
			Person p = new Person (name, job, age);
			backRowBallrzTake2.add(p);
		}
	}
}
