import java.util.ArrayList;

public abstract class Item implements Library{
	
	public static ArrayList <Item> catalogue = new ArrayList <Item>();
	
	
	static String status;
	static int itemID;
	String title;
	static String publisher;

	public Item (String status, int itemID, String title, String publisher){
		Item.status = status;
		Item.itemID = itemID;
		this.title = title;
		Item.publisher = publisher;
	}
	
	public static String getStatus() {
		return status;
	}

	public static void setStatus(String status) {
		Item.status = status;
	}

//	public int getItemID() {
//		return itemID;
//	}
//
//	public void setItemID(int itemID) {
//		Item.itemID = itemID;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		Item.title = title;
//	}
//
//	public String getPublisher() {
//		return publisher;
//	}
//
//	public void setPublisher(String publisher) {
//		Item.publisher = publisher;
//	}

	public abstract void checkOut();
	public abstract void checkIn();
	public abstract void addItem();
	public abstract void removeItem();
	public abstract void updateItem();
		
}
