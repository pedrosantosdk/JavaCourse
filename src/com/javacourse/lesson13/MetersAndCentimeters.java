package com.javacourse.lesson13;

import java.util.Scanner;

public class MetersAndCentimeters {

    public static void main(String[] args) {

        // Unit Converter.
        Scanner scan = new Scanner(System.in);
        System.out.println("Unit converter.");

        // Receive the number of meters.
        System.out.println("Please, enter with the length in meters: ");
        int meters = scan.nextInt();

        // Convert meters to centimeters
        int result = meters * 100;
        System.out.printf("Converting %d meters to centimeters is: %d centimeters. " , meters, result);
    }
}
