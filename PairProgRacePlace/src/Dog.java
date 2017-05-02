
public class Dog {

	int place;
	
	public Dog(int place)
	{
		this.place = place;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		if(place >= 1 && place <= 100)
			this.place = place;
	}
	
}
