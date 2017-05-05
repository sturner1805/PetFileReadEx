package MarinaPackage;

import java.util.ArrayList;

//Stage 3 boat object

public class Boat implements Vehicle {

	String boatName;
	String countryOfOrigin;
	double size;
	ArrayList <Person> occupant = new ArrayList <Person>();
	
	Boat(String boatName, String countryOfOrigin, double size){
		this.boatName = boatName;
		this.countryOfOrigin = countryOfOrigin;
		this.size = size;
	}
	
	public String getBoatName() {
		return boatName;
	}

	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public double getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ArrayList<Person> getOccupant() {
		return occupant;
	}

	public void setOccupant(ArrayList<Person> occupants) {
		this.occupant = occupants;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deccelerate() {
		// TODO Auto-generated method stub
		
	}
	
	public void hasOccupant(Person p){	//Stage 4 - adding person to boat occupant array.
		occupant.add(p);
	}
}
