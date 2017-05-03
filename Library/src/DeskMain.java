import java.util.ArrayList;
import java.util.Scanner;


public class DeskMain {

	static Book harryPotter = new Book (Item.getStatus(), 001, "Harry Potter", "Bloomsbury", "J K Rowling", "Hardback");
	static Book theBFG = new Book (Item.getStatus(), 002, "The BFG", "Penguin", "Roald Dahl", "Paperback");
	static Book theHobbit = new Book (Item.getStatus(), 003, "The Hobbit", "Allen & Unwin", "J R R Tolkien", "Hardback");
	
	public static ArrayList <Item> catalogue = new ArrayList <Item>();
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		optionMenue();
	
//		Book.register(harryPotter);
//		DeskMain.register(theBFG);
//		DeskMain.checkOut(theBFG);
//		DeskMain.checkOut(theBFG);
		
	}

	public static void optionMenue(){
		
		System.out.println("Enter the number of the corresponding action from the options: (1)Add item to catalogue. (2)Lend Item. (3)Return Item. (4)Update Item. (5)Delete Item from catalogue.");
		int option = sc.nextInt();
		if(option == 1){
			add();
		}else if(option == 2){
			lendItem();
		}else if (option == 3){
			returnItem();
		}else if (option == 4){
			update();
		}else if (option == 5){
			delete();
		}
	}
	
	private static void delete() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void returnItem() {
		// TODO Auto-generated method stub
		
	}

	private static void lendItem() {
		// TODO Auto-generated method stub
		
	}

	public static void add() {
		System.out.println("What type of item are you adding? (1)Book. (2)Map. (3)Magazine.");
		int option = sc.nextInt();
		if(option == 1){
			addBook();
		}
		
//		catalogue.add(i);
//		Item.status = "Available";
//		System.out.println(i.title + " has been added to the Library ");// + Book.getStatus());
		
	}
	
	public static void addBook(){
		System.out.println("Enter title:");
		Book.setTitle(sc.next());
		System.out.println("Enter publisher:");
		Book.setPublisher(sc.next());
		System.out.println("Enter author:");
		Book.setAuthor(sc. next());
		System.out.println("Enter cover type:");
		Book.setCoverType(sc.next());
		Book.setStatus("Available");
		Book b = new Book (Book.getStatus(), Book.itemID, Book.getTitle(), Book.getPublisher(), Book.getAuthor(), Book.coverType);
		
	}
	
//	public static void lendItem() {
//		switch(Item.getStatus()){
//		case "Available":
//			Book.setStatus("On Loan");
//			break;
//		case "On Loan":
//			System.out.println(i.title + " is currently " + Item.getStatus());
//			break;
//		case "":
//			System.out.println(i.title + " is not on our records.");
//			break;			
//		}
//	}
}

