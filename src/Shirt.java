
public class Shirt {
	public int shirtID = 4;
	public String description = "shirt is good";
	public String colorShirt = "red";
	public double price = 99.9;
	public int quantityInStock = 0;
	public void displayShirtInformation() {
		System.out.println("Shirt ID: " + shirtID);
		System.out.println("Shirt description:" + description);
		System.out.println("Color Code: " + colorShirt);
		System.out.println("Shirt price: $" + price);
		System.out.println("Quantity in stock: " + quantityInStock);
	}
}
