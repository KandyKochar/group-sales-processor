package storerecords;

public class Products {
	private int productID;
	private String productName;
	private int totalPurchased;
	
	public Products(int productID, String productName) {
		this.productID = productID;
		this.productName = productName;
		this.totalPurchased = 0;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public void addProducts(int quantity) {
		this.totalPurchased += quantity;
	}
	
	public int getTotalPurchased() {
		return totalPurchased;
	}
	
	@Override
	public String toString() {
		return "Product ID: " + productID + ", Name: " + productName + ", Total Purchased: " + totalPurchased;
	}
}
