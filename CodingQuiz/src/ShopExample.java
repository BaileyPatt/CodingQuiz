import java.util.Scanner;

public class ShopExample {
	
	static ProductExample[] inventory = {new ProductExample("Business Ritual Women’s Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue"),
						   new ProductExample("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth"),
						   new ProductExample("Men’s Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal"),
						   new ProductExample("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1),
						   new ProductExample("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman")};
	
	static double totalAmount = 0;
	
	static void displayMenu() {
		
		System.out.println("\nEnter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
		for(int i = 0; i<= inventory.length - 1; i++) {
			
			System.out.println(i + " : " + inventory[i].getName());
		}
	}
	
	public static void main(String[] args) {
		
		int userInput;
		Scanner input = new Scanner(System.in);
		
		do {
			
			displayMenu();
			userInput = input.nextInt();
			
			if(userInput >=0 && userInput <=4) {
				
				if(inventory[userInput].buy()) {
					
					System.out.println("Your purchase was successful");
					totalAmount += inventory[userInput].getPrice();
				}
				
				else {
					System.out.println("Sorry! This product is out of stock.");
				}
			}
			
		} while(userInput >=0 && userInput <=4);
		
		System.out.println("Thank you for shopping with us! The total amount is "  + totalAmount);
		
		
		
		input.close();
	}
}