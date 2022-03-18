/* Name: Bailey Patt
 * Date: March 11, 2022
 * Description: Coding quiz
 */

public class Bath extends Product { //This is my Bath class that extends the product class.
	
	//Constructor that uses products class attributes plus this classes attributes
	//Bath doesnt have its own specific attributes so it takes them from the product class
	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);

	}

	//To string that takes the attributes and prints out the attributes characters or numbers and not the memory location when called upon.
	@Override
	public String toString() {
		return "Bath []";
	}

	//this is an abstract method called getDetails() which doesnt take any parameters but will print out the statment inside the method.
	@Override
	public void getDetails() {

		System.out.println("We sell organic bath products!");
	}
}
