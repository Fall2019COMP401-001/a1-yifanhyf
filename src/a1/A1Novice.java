package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfCustomer = scan.nextInt();
		
		for (int i=0; i<numberOfCustomer; i++) {
			
		// Total number of customers
		
		String firstName = scan.next();
		String lastName = scan.next();
		// Name of the customer
		
		int numberOfItem = scan.nextInt();
		// Items of this customer bought
		
		double priceTotal = 0;
		// If the customer bought nothing, the price would be 0
		
		String priceAtEnd = "";
		
		for (int j=0; j<numberOfItem; j++) {
		
		int quantity = scan.nextInt();
		String foodName = scan.next();
		double priceSingle = scan.nextDouble();
		// All items' quantity, name and their price
		
		priceTotal = priceTotal + priceSingle * quantity;
		priceAtEnd = String.format("%.2f", priceTotal);
		}
		// Total price for each customer
		
		char firstInitial = firstName.charAt(0);
		// Take the intial of the first name
		
		System.out.println(firstInitial + ". " + lastName + ": " + priceAtEnd);

		
		}
	}
}