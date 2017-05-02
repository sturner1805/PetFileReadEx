
public class Person {
			
	String name;
	String job;
	int age;

	public Person (String name, String job, int age){
		this.name=name;
		this.job = job;
		this.age = age;	
	}
	
	static Person marc = new Person("Marc", " Ballr", 23);
	static Person hassan = new Person ("Hassan", " Woah", 21);
	static Person kieran = new Person ("Kieran", "n Alcoholic", 22);
	static Person sam = new Person ("Sam", " Pretentious Twat", 22);
	static Person gareth = new Person ("Gareth", " Beard", 30);
}