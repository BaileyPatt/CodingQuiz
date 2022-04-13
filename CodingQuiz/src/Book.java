/* Name: Bailey Patt
 * Date: March 11, 2022
 * Description: Coding quiz 
 */
public class Book extends Product { //This is my Book class that extends the product class.

	//These are my private attributes specific to the book class
	private String author;
	private String genre;
	private String isbn;

	//Constructor that uses products class attributes plus this classes attributes
	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
	}

	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	//To string that takes the attributes and prints out the attributes characters or numbers and not the memory location when called upon.
	@Override
	public String toString() {
		return "Book [author=" + author + ", genre=" + genre + ", isbn=" + isbn + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", buy()=" + buy()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	//this is an abstract method called getDetails() which doesnt take any parameters but will print out the statment inside the method.
	@Override
	public void getDetails() {

		System.out.println("We sell books on Software Development");
	}
}
