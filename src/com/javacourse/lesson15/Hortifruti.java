package com.javacourse.lesson15;

import java.util.Scanner;

public class Hortifruti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pricing information and user input.
        System.out.println("""
                \t            Up to 5kg:         Above 5kg:
                \tStrawberry: $2.50 per Kg.      $2.20 per Kg.
                \tApple:      $1.80 per Kg.      $1.50 per Kg.
                """);
        System.out.println("Enter the amount of strawberries you want to buy(kg):");
        double strawberries = input.nextDouble();

        System.out.println("Enter the amount of apples you want to buy(kg):");
        double apples = input.nextDouble();

        // Checks if the amount of apples or strawberries is greater than 5.
       double strawberryPrice;
       if (strawberries <=5){
           strawberryPrice = 2.50;
       } else {
           strawberryPrice = 2.20;
       }

       double applePrice;
       if(apples <= 5){
           applePrice = 1.80;
       } else {
           applePrice = 1.50;
       }

       // Calculate the price of fruits
       double strawberryTotal = strawberries * strawberryPrice;
       double appleTotal = apples * applePrice;
       double weight = apples + strawberries;
       double totalPrice = appleTotal + strawberryTotal;

       // If the purchase exceeds 8 kg or 25 dollars, you receive a 10% discount.
       if(totalPrice > 25 || weight > 8){
           double discount = 10;
           double price = (totalPrice / 100) * discount;
           double paid = totalPrice - price;
           System.out.printf("You bought %.2f kg of strawberry.\n", strawberries);
           System.out.printf("You bought %.2f kg of apple.\n", apples);
           System.out.printf("The bill was $%.2f.", paid);
       } else {
           System.out.printf("You bought %.2f kg of strawberry.\n", strawberries);
           System.out.printf("You bought %.2f kg of apple.\n", apples);
           System.out.printf("The bill was $%.2f.", totalPrice);
       }
    }
}