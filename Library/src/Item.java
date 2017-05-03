
public abstract class Item implements Library{
	
	
	
	static String status;
	static int itemID;
	static String title;
	static String publisher;

	public Item (String status, int itemID, String title, String publisher){
		this.status = status;
		this.itemID = itemID;
		this.title = title;
		this.publisher = publisher;
	}
	
	public static String getStatus() {
		return status;
	}

	public static void setStatus(String status) {
		Item.status = status;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		this.title = title;
	}

	public static String getPublisher() {
		return publisher;
	}

	public static void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public abstract void returnItem();
	public abstract void lendItem();
	public abstract void add();
	public abstract void delete();
	public abstract void update();
		
}
