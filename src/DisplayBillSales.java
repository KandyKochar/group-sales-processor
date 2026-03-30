
package storerecords;

import java.util.Map;

public class DisplayBillSales {

	public static void printCustomers(Map<Integer, Customer> customers) {
		System.out.println("CUSTOMER BILLS");
		for (Customer c : customers.values()) {
			System.out.println(c);
		}
	}
	
	public static void printProducts(Map<Integer, Products> products) {
		System.out.println("PRODUCT SALES");
		for (Products p : products.values()) {
			System.out.println(p);
		}
	}
}
