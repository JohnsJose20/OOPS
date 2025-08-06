package pack1;
class Book{
	String title;
	String authore;
	final int bookId;
	static int bookCounter=1000;
	static final String LIBRARY_NAME = "Central Library";
	
	Book (){
		title = "Not Defined";
		authore = "Not Defined";
		bookId = bookCounter++;
	}
	
	Book (String title,String authore){
		this.bookId = bookCounter++;
		this.title = title;
		this.authore = authore;
	}
	void displayInfo() {
		System.out.println("Book title       : "+title);
		System.out.println("Authore          : "+authore);
		System.out.println("Book ID          : "+bookId);
		
	}
	void displayInfo(boolean showLibrary) {
		displayInfo();
		if (showLibrary) {
			System.out.println("Library          : " + LIBRARY_NAME);
		}
		
	}
	static void displayTotalBooks() {
		System.out.println("\nTotal no of Book : " +(bookCounter - 1000)+ "\n\n");
	}}
	public class Main {
		public static void main(String[]args) {
			Book b1 = new Book("Coding Nights","Dawn K Vinod");
			b1.displayInfo(true);
			Book.displayTotalBooks();
			
			Book b2 = new Book("Dark Nights","Cyril");
			b2.displayInfo(true);
			Book.displayTotalBooks();
		}
}
	
	