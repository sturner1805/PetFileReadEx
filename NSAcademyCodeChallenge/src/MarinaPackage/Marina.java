package MarinaPackage;
//Stage 2 marina object

import java.util.ArrayList;


public class Marina {

	String marinaName;
	String address;
	int capacity;
	ArrayList <Boat> moored = new ArrayList <Boat> ();
	
	public Marina(String marinaName, String address, int capacity){
		this.marinaName = marinaName;
		this.address = address;
		this.capacity = capacity;
	}

	public String getMarinaName() {
		return marinaName;
	}

	public void setMarinaName(String marinaName) {
		this.marinaName = marinaName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Boat> getMoored() {
		return moored;
	}

	public void setMoored(ArrayList<Boat> moored) {
		this.moored = moored;
	}

}
