import java.util.ArrayList;

public class Person {

	private String name;
	private String dob;
	private String job;
	private int salary;
	private ArrayList <Animal> pets = new ArrayList <Animal>();
	
	Person(String name, String dob, String job, int salary) {
		this.name = name;
		this.dob = dob;
		this.job = job;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void ownPet(Animal a) {
		pets.add(a);
	}
	public ArrayList<Animal> getPets() {
		return pets;
	}
	public void setPets(ArrayList<Animal> pets) {
		this.pets = pets;
	}
}