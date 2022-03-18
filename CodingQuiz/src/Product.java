/* Name: Bailey Patt
 * Date: March 11, 2022
 * Description: Coding Quiz 
 */

public abstract class Product { 

	// Declaring all of my attributes here.
	private String name;
	private double price;
	private int quantity;

	/*
	 * These will be my only constructor that i will call upon in separate classes.
	 * This constructor will be called by String, double, String, int.
	 */
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// These are my public getters and setters because my attributes are private.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// This is my instance method that will check if there is product available to
	// be sold
	public boolean buy() {
		// I made an if statement that checks if the quantity of product is greater than
		// zero than it will return true, if not, it will return false.
		if (this.quantity > 0) {
			this.quantity--; // Here its taking the quantity of the product and reducing it 1 after it loops
								// through the if statement.
			return true;
		} else {
			return false; // If there is no product to be sold then it will return false.
		}
	}

	//this is an abstract method called getDetails() which doesnt take any parameters.
	public abstract void getDetails();
}
