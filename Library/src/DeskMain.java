
public class DeskMain extends Book {

	public DeskMain(String status, int itemID, String title, String publisher, String author, String coverType) {
		super(status, itemID, title, publisher, author, coverType);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		Book.addItem(harryPotter);
		Book.addItem(theBFG);
		Book.checkOut(harryPotter);
		
	}

}
