package Ex19WorkingWithFiles;
import java.util.ArrayList;
import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileMain {
	
	static ArrayList <Person> people = new ArrayList <Person>();
	
	static Person sam = new Person ("Sam", "Trainee Developer", 22);
	static Person joe = new Person ("Joe", "Graphics Student", 19);
	static Person dom = new Person ("Dominic", "High School Pupil", 16);
	static Person rosie = new Person ("Rosanna", "Dance Student", 11);
	static Person becca = new Person ("Rebecca", "Staff Nurse", 21);
	
	static ArrayList <Person> readPeople = new ArrayList <Person>();
	
	public static void main (String [] args){
		
		people.add(sam);
		people.add(joe);
		people.add(dom);
		people.add(rosie);
		people.add(becca);
		
		fileWriter();
		
	}
	public static void fileWriter(){
		try{
			Formatter f = new Formatter ("C:\\Users\\Administrator\\Desktop\\eclipse\\peopleRevision1.txt");
			for (Person p : people){
				f.format("%s, %s, %s.\r\n" , p.getName(), p.getJob(), p.getAge());
			}
		f.close();
		}catch(Exception e){
			
		}
	}
	
	public static void fileReader() throws FileNotFoundException {
		File f = new File ("C:\\Users\\Administrator\\Desktop\\eclipse\\peopleRevision1.txt");
		Scanner sc = new Scanner(f);
		String input = "";
		while(sc.hasNextLine()){
			input += sc.next();
		}
		sc.close();
		dataExtractor(input);
	}
	
	public static void dataExtractor(String input){
		String [] people = input.split("\n");
		
		for (int i = 0 ; i < people.length ; i++ ){
			String individual = people[i];
			String [] data = individual.split(", ");
			String name = data[0];
			String job = data[1];
			String tempAge = data[2];
			int age = Integer.parseInt(tempAge);
			Person p = new Person (name, job, age);
			readPeople.add(p);
		}
	}

}
