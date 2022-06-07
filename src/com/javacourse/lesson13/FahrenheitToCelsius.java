package com.javacourse.lesson13;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        // Allows the use of the degree symbol.
        Scanner scan = new Scanner(System.in);
        char degreeSign = 0x0B0;

        // User input
        System.out.println("Convert Fahrenheit to Celsius");
        System.out.println("Enter degrees Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        // Convert Celsius to Fahrenheit.
        double convert = (fahrenheit - 32) * 5/9 ;
        System.out.printf("Conversion from %.2f%cF to Celsius is %.2f%cC", fahrenheit, degreeSign, convert, degreeSign);
    }
}
