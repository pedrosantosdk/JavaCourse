package com.javacourse.lesson15;

import java.util.Scanner;

public class Hortifruti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pricing information and user input.
        System.out.println("""
                        \t            Up to 5kg:         Above 5kg: 
                        \tStrawberry: $2.50 per Kg.      $2.20 per Kg.
                        \tApples:     $1.80 per Kg.      $1.50 per Kg.
                        """);
        System.out.println("Enter the amount of strawberries you want to buy(kg):");
        double strawberries = input.nextDouble();;
        System.out.println("Enter the amount of apples you want to buy(kg):");
        double apples = input.nextDouble();
        double weight = apples + strawberries;

        // Checks the amount of fruit and calculates the purchase price.
        if(apples > 5 && strawberries > 5){
            double applePrice = 1.50;
            double strawberryPrice = 2.20;
            double appleKg = apples * applePrice;
            double strawberryKg = strawberries * strawberryPrice;
            double sum = strawberryKg + appleKg;
            if(sum > 25 || weight > 8){
                double discount = 10;
                double price = (sum / 100) * discount;
                double paid = sum - price;
                System.out.printf("You bought %.2f kg of strawberry.", strawberries);
                System.out.printf("You bought %.2f kg of apple.", apples);
                System.out.printf("The bill was $%.2f.", paid);
            } else {
                System.out.printf("You bought %.2f kg of strawberry.\n", strawberries);
                System.out.printf("You bought %.2f kg of apple.\n", apples);
                System.out.printf("The bill was $%.2f.", sum);
            }

        } else if(apples <= 5 && strawberries <=5) {
            double applePrice = 1.80;
            double strawberryPrice = 2.50;
            double appleKg = apples * applePrice;
            double strawberryKg = strawberries * strawberryPrice;
            double sum = strawberryKg + appleKg;
            if(sum > 25 || weight > 8){
                double discount = 10;
                double price = (sum / 100) * discount;
                double paid = sum - price;
                System.out.printf("You bought %.2f kg of strawberry.\n", strawberries);
                System.out.printf("You bought %.2f kg of apple.\n", apples);
                System.out.printf("The bill was $%.2f.", paid);
            } else {
                System.out.printf("You bought %.2f kg of strawberry.\n", strawberries);
                System.out.printf("You bought %.2f kg of apple.\n", apples);
                System.out.printf("The bill was $%.2f.", sum);
            }
        }
    }
}

