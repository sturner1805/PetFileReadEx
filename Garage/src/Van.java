
public class Van extends Vehicle{
	
	int loadArea;
	boolean sideLoadingDoor;
	int maxLoad;
	
	public Van (int id, String name, int age, int mileage,
				int loadArea, boolean sideLoadingDoor, int maxLoad){
		super(id, name, age, mileage);
		this.loadArea = loadArea;
		this.sideLoadingDoor = sideLoadingDoor;
		this.maxLoad = maxLoad;
	}
	
	public int hasSideLoadingDoor(){
		int hasSideLoadingDoor = 0;
		if (sideLoadingDoor == true){
			hasSideLoadingDoor = 1000;
		}else{
			hasSideLoadingDoor = 0;
		}
		return hasSideLoadingDoor;
	}
	
	public int value(){
		int vanValue = loadArea * 5 + maxLoad *5 + this.hasSideLoadingDoor();
		super.value();
		return vanValue;
	}
}
