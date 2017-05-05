package Ex20Library;

public class Book extends Item{
	
	String author;
	String coverType;
	
	public Book(String status, int itemID, String title, String publisher, String author, String coverType) {
		super(status, itemID, title, publisher);
		this.author = author;
		this.coverType = coverType;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

}
