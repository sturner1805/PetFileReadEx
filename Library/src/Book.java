
public class Book extends Item{
	
	static String author;
	static String coverType;
	
	public Book(String status, int itemID, String title, String publisher, String author, String coverType) {
		super(status, itemID, title, publisher);
		this.author = author;
		this.coverType = coverType;
	}
	
	public static String getAuthor() {
		return author;
	}

	public static void setAuthor(String author) {
		this.author = author;
	}

	public String getCoverType() {
		return coverType;
	}

	public static void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	
	
	
	
		
		

	public void checkIn(Book b) {
		setStatus("Available");
		System.out.println(b.title + " is " + Book.getStatus());
	}

	public void delete(Book b) {
		catalogue.remove(b);
		
	}

	
}
