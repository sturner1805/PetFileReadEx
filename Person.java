
public class Person {
	
	String name;
	String dob;
	String job;
	int salary;
	
	Person (String name, String dob, String job, int salary) {
	this.setName(name);
	this.setDob(dob);
	this.setJob(job);
	this.setSalary(salary);;
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
	
	
	
}