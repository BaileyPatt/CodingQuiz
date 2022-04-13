
public class ProductExample  {
	
	private String name;
	private double price;
	private String category;
	private int quantity;
	private char size;
	private String author;
	private String color; 
	
	public ProductExample(String name, double price, String category, int quantity, char size, String color) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
	}

	public ProductExample(String name, double price, String category, int quantity, String author) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.author = author;
	}

	public ProductExample(String name, double price, String category, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity
				+ ", size=" + size + ", author=" + author + ", color=" + color + "]";
	}
	
	boolean buy() {
		
		if(this.quantity > 0) {
			this.quantity--;
			return true;
		}
		else {
			return false;
		}
	}
	


}