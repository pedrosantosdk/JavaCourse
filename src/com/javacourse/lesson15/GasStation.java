package com.javacourse.lesson15;

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ethanol = 1.90;
        double gasoline = 2.90;

        System.out.println("Do you want to fill up ethanol or gasoline?");
        String choice = input.next();

        System.out.println("How many liters do you want to fill?");
        int liters = input.nextInt();

        if (choice.equalsIgnoreCase("Ethanol")) {
            if (liters <= 20) {
                double fill = ethanol * liters;
                int discount = 3;
                double total = (fill / 100) * discount;
                double paid = fill - total;
                System.out.println("\nE-Ethanol");
                System.out.printf("\nYou have filled %d liters of ethanol.", liters);
                System.out.printf("\nYou paid: $%.2f ", paid);
            } else if (liters > 20) {
                double fill = ethanol * liters;
                int discount = 5;
                double total = (fill / 100) * discount;
                double paid = fill - total;
                System.out.println("\nE-Ethanol");
                System.out.printf("\nYou have filled %d liters of ethanol.", liters);
                System.out.printf("\nYou paid: $%.2f ", paid);
            }
        } else if (choice.equalsIgnoreCase("Gasoline")) {
            if (liters <= 20) {
                double fill = gasoline * liters;
                int discount = 4;
                double total = (fill / 100) * discount;
                double paid = fill - total;
                System.out.println("\nG-Gasoline");
                System.out.printf("\nYou have filled %d liters of gasoline.", liters);
                System.out.printf("\nYou paid: $%.2f ", paid);
            } else if (liters > 20) {
                double fill = gasoline * liters;
                int discount = 6;
                double total = (fill / 100) * discount;
                double paid = fill - total;
                System.out.println("\nG-Gasoline");
                System.out.printf("\nYou have filled %d liters of gasoline.", liters);
                System.out.printf("\nTotal: $%.2f ", paid);
            }
        }
    }
}