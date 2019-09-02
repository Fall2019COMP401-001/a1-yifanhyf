package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numberOfItem = scan.nextInt();
        // The number of items in the store

        String[] itemName = new String[numberOfItem];
        double[] priceArray = new double[numberOfItem];
        // The name of each item
        // The price of each item

        for (int i = 0; i < numberOfItem; i++) {
            itemName[i] = scan.next();
            priceArray[i] = scan.nextDouble();
        }
        // Loop all the item

        int numberOfCustomer = scan.nextInt();
        // Total number of customers in the store

        String[] firstName = new String[numberOfCustomer];

        String[] lastName = new String[numberOfCustomer];
        // First and last name of each customer

        int[] itemCustomers = new int[numberOfItem];
        int[] itemSum = new int[numberOfItem];
        for (int i = 0; i < numberOfCustomer; i++) {
            firstName[i] = scan.next();
            lastName[i] = scan.next();

            int countProduct = scan.nextInt();


            for (int j = 0; j < countProduct; j++) {
                int countUnit = scan.nextInt();

                String name = scan.next();

                // update the itemCustomers array and itemSum array
                for (int n = 0; n < numberOfItem; n++) {
                    if (name.equals(itemName[n])) {
                        itemCustomers[n]++;
                        itemSum[n] += countUnit;
                    }
                }

            }
        }
        // display the results
        for (int n = 0; n < numberOfItem; n++) {
            if (itemCustomers[n] == 0) {
                System.out.println(String.format("No customers bought %s", itemName[n]));
            } else {
                System.out.println(String.format("%d customers bought %d %s", itemCustomers[n], itemSum[n], itemName[n]));
            }
        }


    }



		
    }
