
public abstract class Customer implements Library{
	
	int customerID;
	String name;
	int age;
	String email;
	
	public Customer(int customerID, String name, int age, String email){
		this.customerID = customerID;
		this.name = name;
		this.age = age;
		this.email = email;
		
	}
	
	public abstract void registerPerson();
	public abstract void deletePerson();
	public abstract void updatePerson();
	
}
