/* Name: Bailey Patt
 * Date: March 11, 2022
 * Description: Coding quiz
 */

public class Apparel extends Product { //This is my Apparel class that extends the product class.

	//Attributes that are specific to the Apparel class
	char size;
	String color;

	//Constructor that uses products class attributes plus this classes attributes
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}

	//To string that takes the attributes and prints out the attributes characters or numbers and not the memory location when called upon.
	@Override
	public String toString() {
		return "Apparel [size=" + size + ", color=" + color + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getQuantity()=" + getQuantity() + ", buy()=" + buy() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	//this is an abstract method called getDetails() which doesnt take any parameters but will print out the statment inside the method.
	@Override
	public void getDetails() {

		System.out.println("We sell different kinds of business clothes for both men and women!");
	}

}
