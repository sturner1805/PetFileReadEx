
public abstract class Customer implements Library{
	
	int customerID;
	String name;
	int age;
	String email;
	
	private Customer(int customerID, String name, int age, String email){
		this.customerID = customerID;
		this.name = name;
		this.age = age;
		this.email = email;
		
	}
	
	public void registerPerson() {
		
		
	}
	
	public void deletePerson() {
		
		
	}

	public void updatePerson() {
		
		
	}
}
