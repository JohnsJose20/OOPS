class Book{
	String title;
	String authore;
	double price;
	int quantity;
	double value;
	
	Book(String title,String authore,double price,int quantity){
	this.title = title;
	this.authore = authore;
	this.price = price;
	this.quantity = quantity;
	TotalValue();
	}
	
	public void TotalValue() {
		value = price*quantity;
	}

	void displayDetails() {
		System.out.println("Book Name   : "+title);
		System.out.println("Authore     : "+authore);
		System.out.println("Price       : "+price+"$");
		System.out.println("Quantity    : "+quantity);
		System.out.println("Total Value : "+value+"$");
}}

public class ManageBook {
	public static void main(String[] args) {
        
        Book book1 = new Book("The Goat Life","Beniyamin",600,90);
        Book book2 = new Book("Coder Life","Dawn K Vinod",600,40);

        System.out.println("Details of Book 1 :\n");
        book1.displayDetails();
        System.out.println("\nDetails of Book 2 :\n");
        book2.displayDetails();
}

}
