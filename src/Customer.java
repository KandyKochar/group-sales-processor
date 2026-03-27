

package storerecords;

public class Customer {
	private int customerID;
	private String firstName;
	private String lastName;
	private double totalBill;
	
	public Customer(int customerID, String firstName, String lastName, double totalBill) {
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalBill = totalBill; // Bill always start at $0 until customer selects product(s)
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void addBill(double amount) {
		this.totalBill += amount; // Adds amount to totalBill
	}
	
	public double getTotalBill() {
		return totalBill;
	}
	
	@Override
	public String toString() {
		return "Customer ID: " + customerID + ", Name: " + firstName + " " + lastName + ", Total Bill: $" + String.format("%.2f", totalBill);
	}
}
