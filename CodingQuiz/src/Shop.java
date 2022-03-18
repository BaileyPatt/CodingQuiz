/* Name: Bailey Patt
 * Date: March 11, 2022
 * Description: Coding Quiz
 */

import java.util.Scanner; //This is the scanner that allows me to take user input. 

public class Shop {

	static double totalAmount = 0;
	// static String[] inventory;

	// This is my array and I initialized all the products in one line.
	static Product[] inventory = {
			new Apparel("Business Ritual Women's Long Sleeve Top", 65.39, 4, 'L', "Blue"),
			new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth"),
			new Apparel("Mens Business Casual Shirt", 57.10, 2, 'M', "Teal"),
			new Bath("Organic Turmeric Soap", 11.25, 1),
			new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman") };

	// This is my Menu that will display the shortcuts and the product index for the
	// products in the cart.
	static void displayMenu() {

		System.out.println("Enter the product index (0 to 4) you want to buy. "
				+ "\nTo Exit the shopping cart, enter any number other than 0 to 4.");

		for (int i = 0; i <= inventory.length - 1; i++) { // Here i wrote a for loop that prints the name of each object
															// until the for loop reaches 4
			System.out.println(i + " : " + inventory[i].getName());
			
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int userInput;

		//Here I'm creating a Do-While loop to run through the menu until the shopper is done. 
		do {
			displayMenu(); // This will call back to my displayMenu method to print the menu screen.

			userInput = sc.nextInt(); //Here I'm assigning int userInput to the actual user inputed number.

			if (userInput >= 0 && userInput <= 4) { // This if loop will open if user input is between 0-4.

				if (inventory[userInput].buy()) { // This takes the users input and calls back to the product class to check if the item is in stock
					System.out.println("Your purchase was succesful! \n ");
					totalAmount = totalAmount + inventory[userInput].getPrice(); // If the item was in stock it comes here prints purchase was successful and adds price of product to total amount.
				}

				else {
					System.out.println("Sorry! That item is out of stock"); // if the if statement above is not true it comes here because the item is out of stock
				}

			}

		} while (userInput >= 0 && userInput <= 4); // the do loop will run until user puts a number outside of the range and prints the statement below plus the total amount.

		System.out.println("Thank you for shopping with us! " + totalAmount);

		sc.close();
	}
}
