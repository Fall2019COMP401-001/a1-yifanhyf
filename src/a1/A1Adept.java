package a1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A1Adept {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // The number of fruits in the store
        int numberOfItem = scanner.nextInt();

        // The name of each fruits
        List fruitList = new ArrayList<String>();
        // The price of each fruits
        List<Double> fruitPrice = new ArrayList<Double>();

        // get items from scanner
        for (int i=0; i < numberOfItem; i++) {
            fruitList.add(scanner.next());
            fruitPrice.add(scanner.nextDouble());
        }

        // Total number of customers in the store
        int numberOfCustomer = scanner.nextInt();

        List<String> firstName = new ArrayList<String>();
        List<String> lastName = new ArrayList<String>();

        // First and last name of each customer
        List<Double> priceTotal = new ArrayList<Double>();

        for (int i=0; i< numberOfCustomer; i++) {
            firstName.add(scanner.next());
            lastName.add(scanner.next());

            int countProduct = scanner.nextInt();
            double priceTotalNum = 0;

            for(int j=0; j< countProduct; j++) {
                int countUnit = scanner.nextInt();

                String name = scanner.next();
                double price = 0;

                for (int n=0; n< numberOfItem; n++ ) {
                    if (name.equals(fruitList.get(n))) {
                        price = fruitPrice.get(n);
                    }
                }

                priceTotalNum += price * countUnit;

            }


            priceTotal.add(priceTotalNum);
        }
        double max = 0;
        String maxFirstName = "";
        String maxLastName = "";

        for (int i=0; i< numberOfCustomer; i++) {
            if (priceTotal.get(i) > max) {
                max = priceTotal.get(i);
                maxFirstName = firstName.get(i);
                maxLastName = lastName.get(i);

            }
        }

        System.out.println(String.format("Biggest: %s %s (%.2f)",maxFirstName,  maxLastName, max));

        double min = priceTotal.get(0);
        String minFirstName = firstName.get(0);
        String minLastName = lastName.get(0);
        for (int i=0; i<numberOfCustomer; i++) {
            if (priceTotal.get(i) < min) {
                min = priceTotal.get(i);
                minFirstName = firstName.get(i);
                minLastName = lastName.get(i);
            }
        }
        System.out.println(String.format("Smallest: %s %s (%.2f)",minFirstName,  minLastName, min));
        double totalPrice = 0;
        for (int i=0; i< numberOfCustomer; i++) {
            totalPrice += priceTotal.get(i);

        }
        double average = totalPrice / numberOfCustomer;
        System.out.println(String.format("Average: %.2f", average));



    }
}
