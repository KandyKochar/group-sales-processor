package storerecords;

import java.util.HashMap;
import java.util.Map;

public class SalesProcessor {

	 // Map to store customers using CustomerID as key
    private Map<Integer, Customer> customerMap;
    
    // Map to store products using ProductID as key
    private Map<Integer, Products> productMap;

    // Constructor initializes both maps
    public SalesProcessor() {
        customerMap = new HashMap<>();
        productMap = new HashMap<>();
    }


    // This method processes each record read from the file
    public void processRecord(int customerID, String firstName, String lastName, int productID, String productName, double price, int quantity) {

    	// Check if product already exists in map
        if (productMap.containsKey(productID)) {
        	 // If yes, update the total quantity purchased
            Products p = productMap.get(productID);
            p.addProducts(quantity);
        } else {
        	// If not, create a new product and add it to map
            Products p = new Products(productID, productName);
            p.addProducts(quantity);
            productMap.put(productID, p);
        }
        
     // Calculate total amount for this record
        double total = price * quantity;

        // Check if customer already exists in map
        if (customerMap.containsKey(customerID)) {
        	// If yes, update their total bill
            Customer c = customerMap.get(customerID);
            c.addBill(total);
        } else {
        	// If not, create a new customer and add to map
            Customer c = new Customer(customerID, firstName, lastName, total);
            customerMap.put(customerID, c);
        }
    }

 // Getter method to return customer map
    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }

    // Getter method to return product map
    public Map<Integer, Products> getProductMap() {
        return productMap;
    }
}