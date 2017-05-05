package Ex20Library;

public abstract class Item {
	String status;
	int itemID;
	String title;
	String publisher;
	
	public Item (String status, int itemID, String title, String publisher){
		this.status = status;
		this.itemID = itemID;
		this.title = title;
		this.publisher = publisher;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
