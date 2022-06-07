package com.javacourse.lesson13;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Allows the use of the degree symbol.
        Scanner scan = new Scanner(System.in);
        char degreeSign = 0x0B0;

        // User input
        System.out.println("Convert Celsius to Fahrenheit.");
        System.out.println("Enter degrees Celsius: ");
        double degree = scan.nextDouble();

        // Convert Celsius to Fahrenheit.
        double convert = (degree * 9/5) + 32;
        System.out.printf("Conversion from %.2f%cC to Fahrenheit is %.2f%cF", degree, degreeSign, convert, degreeSign);
    }
}
