package com.javacourse.lesson17;

import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean out = false;
        double price;
        double getPrice = 0;
        int products;
        String output;

        do {
            System.out.println("Do you want to make a new purchase? (y/n)");
            String newPurchase = input.next();

            if(newPurchase.equalsIgnoreCase("y")){
                output = "Walmart\n";

                System.out.println("Enter the quantity of products:");
                products = input.nextInt();

                for(int i = 1; i <= products; i++) {
                    System.out.println("Enter the price of product " + i);
                    price = input.nextDouble();
                    getPrice += price;
                    output += "Product " + i + ":$ " + price + "\n";
                }

                System.out.println("Enter the amount paid:");
                double paid = input.nextDouble();

                double change =  paid - getPrice;
                System.out.printf(output);
                System.out.printf("Paid: %2.2f\n", paid);
                System.out.printf("Total: $%2.2f\n", getPrice);
                System.out.printf("Change: $%2.2f\n", change);

            } else if (newPurchase.equalsIgnoreCase("n")) {
                out = true;
            }
        }while(!out);
    }
}
