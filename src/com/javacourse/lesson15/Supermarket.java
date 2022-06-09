package com.javacourse.lesson15;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks the user to choose which meat to buy:
        System.out.println("""
                \t Meat code:     Meat:          Up to 5kg:        Above 5kg:
                \t    1          T-bone         $4.90 per Kg     $5.80 per Kg
                \t    2          Rump Steak     $5.90 per Kg     $6.80 per Kg
                \t    3          Rump Cap       $6.90 per Kg     $7,80 per Kg
                """);
        System.out.println("Enter the code number of the chosen meat.");
        int code = input.nextInt();

        System.out.println("Enter the amount (kg):");
        double amount = input.nextDouble();

        double kiloPrice = 0;

        // Check the chosen meat and the price.
        if (code == 1) {
            System.out.println(amount + "kg - T-bone ");
            if (amount <= 5) {
                kiloPrice = 4.90;
            } else {
                kiloPrice = 5.80;
            }
        } else if (code == 2) {
            System.out.println(amount + "kg - Rump Steak");
            if (amount <= 5) {
                kiloPrice = 5.90;
            } else {
                kiloPrice = 6.80;
            }
        } else if (code == 3) {
            System.out.println(amount + "kg - Rump Cap");
            if (amount <= 5) {
                kiloPrice = 6.90;
            } else {
                kiloPrice = 7.80;
            }
        }

        // Calculate the price of meat.
        double total = amount * kiloPrice;
        System.out.printf("You bought %.2f kg at the price of $%.2f a kilo.\n", amount, kiloPrice);

        // Ask if you want to buy with the supermarket card, if yes, the customer receives a 5% discount.
        System.out.println("Do you want to buy with the supermarket card? (y/n)");
        String card = input.next();

        if (card.equalsIgnoreCase("y")) {
            double discount = (total / 100) * 5;
            System.out.println("Purchases were: $" + (total - discount));
        } else if(card.equalsIgnoreCase("n")){
            System.out.printf("Purchases were $%.2f", total);
        }
    }
}