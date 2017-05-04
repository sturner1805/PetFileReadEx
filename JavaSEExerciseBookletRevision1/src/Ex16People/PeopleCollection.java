package Ex16People;
import java.util.ArrayList;

public class PeopleCollection {

	static Person sam = new Person ("Sam", 22, "Trainee Developer");
	static Person becca = new Person ("Rebecca", 21, "Nurse");
	static Person bruna = new Person ("Bruna", 23, "Nurse");
	static Person james = new Person ("James", 25, "Customs Officer");
	
	static ArrayList <Person> people = new ArrayList <Person>();
	
	public static void main(String[] args) {
		
		addPerson(sam);
		addPerson(bruna);
		addPerson(sam);

		addPerson(becca);
		for (Person P : people){
			P.form();
		}	
	}
	
	public static void addPerson(Person p){
		people.add(p);
		
	}
	
	
}
