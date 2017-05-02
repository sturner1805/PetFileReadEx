import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args){
		
		Person joe = new Person("Joe", 19, "Student");
		Person sam = new Person("Sam", 22, "Developer");
		Person dom = new Person("Dom", 16, "Super Nerd");
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(joe);
		people.add(sam);
		people.add(dom);
		
		for(Person p : people){
			p.form();
		}
	}
}

  