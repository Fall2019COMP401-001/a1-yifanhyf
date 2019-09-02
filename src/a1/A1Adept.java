package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int countIndex = scan.nextInt();
		
		String[] itemArray = new String[countIndex];
		double[] priceArray = new double[countIndex];
		
		for (int i=0; i < countIndex; i++) {
			itemArray[i] = scan.next();
			priceArray[i] = scan.nextDouble();
			
		}
		
		int countCustomer = scan.nextInt();
		
		String[] first = new String[countCustomer];
		
		String[] last = new String[countCustomer];
		
		double[] priceTotal = new double [countCustomer];
		
		for (int i=0; i< countCustomer; i++) {
			first[i] = scan.next();
			last[i] = scan.next();
			
			int countProduct = scan.nextInt();
			double priceTotalNum = 0;
		
		
		for(int j=0; j< countProduct; j++) {
			int countUnit = scan.nextInt();
		
			String name = scan.next();
			double price = 0;
			
		for (int n=0; n< countIndex; n++ ) {
			if (name.equals(itemArray[n])) {
				price = priceArray[n];
			}
		}
		
		priceTotalNum += price * countUnit;
		
	}
	
	
		priceTotal[i] = priceTotalNum;
  }
		double max = 0;
		String maxFirst = "";
		String maxLast = "";
		
		for (int i=0; 1< countCustomer; i++) {
			if (priceTotal[i] > max) {
				max = priceTotal[i];
				maxFirst = first[i];
				maxLast = last[i];
				
			}
		}
		
		String maxString = String.format("%.2f", max);
		System.out.println("Biggest: " + maxFirst + " " + maxLast + "(" + maxString + ")");
		
		double min = priceTotal[0];
		String minFirst = first[0];
		String minLast = last[0];
		for (int i=0; i<countCustomer; i++) {
			if (priceTotal[i] < min) {
				min = priceTotal[i];
				minFirst = first[i];
				minLast = last[i];
				
			}
		}
		String minString = String.format("%.2f", min);
		System.out.println("Smallest: " + minFirst + " (" + minString + ")");
		
		double totalPrice = 0; 
		for (int i=0; i< countCustomer; i++) {
			totalPrice += priceTotal[i];
			
		}
		double average = totalPrice / countCustomer;
		String averageString = String.format("%.2f", average);
		System.out.println("Average: " + averageString);
	
	
	
	}
}