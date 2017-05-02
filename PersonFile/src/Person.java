
public class Person {
			
	String name;
	String job;
	int age;

	public Person (String name, String job, int age){
		this.name=name;
		this.job = job;
		this.age = age;	
	}
	
	static Person marc = new Person("Marc", "Ballr-Leadr", 23);
	static Person hassan = new Person ("Hassan", "Woah-Ballr", 21);
	static Person kieran = new Person ("Kieran", "Alcoholic Ballr", 22);
	static Person sam = new Person ("Sam", "Pretentious Ballr", 22);
	static Person gareth = new Person ("Gareth", "Bearded Ballr", 30);
}