
public class Animal {
	
	private String petName;
	private String species;
	
	Animal(String petName, String species){
		this.petName=petName;
		this.species=species;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getspecies() {
		return species;
	}

	public void setspecies(String species) {
		this.species = species;
	}

}
