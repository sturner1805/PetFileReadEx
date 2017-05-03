
public class Book extends Item{
	
	
		// TODO Auto-generated constructor stub
	
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

	static Book harryPotter = new Book (Item.getStatus(), 001, "Harry Potter", "Bloomsbury", "J K Rowling", "Hardback");
	static Book theBFG = new Book (Item.getStatus(), 002, "The BFG", "Penguin", "Roald Dahl", "Paperback");
	static Book theHobbit = new Book (Item.getStatus(), 003, "The Hobbit", "Allen & Unwin", "J R R Tolkien", "Hardback");
	
	public static void addItem(Book b) {
		catalogue.add(b);
		setStatus("Available");
		System.out.println(b.title + " has been added to the Library ");// + Book.getStatus());
		
	}
	
	public static void checkOut(Book b) {
		setStatus("On Loan");
		System.out.println(b.title + " is " + Book.getStatus());
	}

	public void checkIn(Book b) {
		setStatus("Available");
		System.out.println(b.title + " is " + Book.getStatus());
	}

	

	@Override
	public void removeItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		
	}

	
}
