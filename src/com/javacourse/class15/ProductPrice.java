package com.javacourse.class15;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input.
        System.out.println("Enter the price of the first product:");
        double product1 = scan.nextDouble();
        System.out.println("Enter the price of the second product:");
        double product2 = scan.nextDouble();
        System.out.println("Enter the price of the third product:");
        double product3 = scan.nextDouble();

        // Shows the cheapest product.
        if (product1 < product2 && product1 < product3) {
            System.out.printf("You must buy the product at this price: $%.2f", product1);
        } else if (product2 < product1 && product2 < product3) {
            System.out.printf("You must buy the product at this price: $%.2f" , product2);
        } else{
            System.out.printf("You must buy the product at this price: $%.2f" , product3);
        }
    }
}

