package com.javacourse.class13;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        // User input.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your heigth in meters: ");
        double height = scan.nextDouble();

        // Calculate your ideal weight.
        double bmi = (72.7 * height) - 58;
        System.out.printf("Your BMI is %.2f, your ideal weight is: %.2f kilos" , height, bmi);
    }
}
