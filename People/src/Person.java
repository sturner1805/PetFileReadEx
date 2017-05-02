
public class Person {
	
	private String name;
	private int age;
	private String job;
	
	protected Person(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public void form(){
		System.out.println("Name: "+name+".     Age: "+age+".     Job Title: "+job+".");
	}
}