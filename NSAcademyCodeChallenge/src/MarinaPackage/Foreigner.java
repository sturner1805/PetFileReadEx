package MarinaPackage;
//Stage 1 non-UK national
public class Foreigner extends Person{

	String visaInfo;
	
	Foreigner(String firstName, String surname, String dob, String nationality, String visaInfo) {
		super(firstName, surname, dob, nationality);
		this.visaInfo = visaInfo;
	}

	public String getVisaInfo() {
		return visaInfo;
	}

	public void setVisaInfo(String visaInfo) {
		this.visaInfo = visaInfo;
	}

}
