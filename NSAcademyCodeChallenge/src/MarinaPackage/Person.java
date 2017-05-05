package MarinaPackage;
//Stage 1 person object

public class Person {

	//class attributes
	String firstName;
	String surname;
	String dob;
	String nationality;
//	String visaInfo;

	
	//constructor
	Person (String firstName, String surname, String dob, String nationality){
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
//		this.visaInfo = visaInfo;
	}

	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

//	public String getVisaInfo() {
//		return visaInfo;
//	}
//
//	public void setVisaInfo(String visaInfo) {
//		this.visaInfo = visaInfo;
//	}
		
		

}
