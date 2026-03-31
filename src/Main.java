package storerecords;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	// Raymond
        Map<Integer, Customer> customers = new HashMap<>();
        Map<Integer, Products> products = new HashMap<>();

        // Julian
        readFile("Sales.txt", customers, products);

        // Raymond
        DisplayBillSales.printCustomers(customers);
        DisplayBillSales.printProducts(products);
    }

    // Julian
    public static void readFile(String fileName, Map<Integer, Customer> customers, Map<Integer, Products> products) {

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                try {
                    String[] parts = line.split(" ");

                    int customerID = Integer.parseInt(parts[0]);
                    String firstName = parts[1];
                    String lastName = parts[2];
                    int productID = Integer.parseInt(parts[3]);
                    String productName = parts[4];
                    double price = Double.parseDouble(parts[5]);
                    int quantity = Integer.parseInt(parts[6]);

                    // Julian
                    if (!products.containsKey(productID)) {
                        products.put(productID, new Products(productID, productName));
                    }
                    products.get(productID).addProducts(quantity);

                    // Julian
                    if (!customers.containsKey(customerID)) {
                        customers.put(customerID, new Customer(customerID, firstName, lastName, 0));
                    }
                    customers.get(customerID).addBill(price * quantity);

                } catch (Exception e) {
                    System.out.println("Invalid line: " + line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }
}