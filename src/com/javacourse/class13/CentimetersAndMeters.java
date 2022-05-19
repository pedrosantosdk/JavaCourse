package com.javacourse.class13;

import java.util.Scanner;

public class CentimetersAndMeters {
    public static void main(String[] args) {

        // Unit Converter.
        Scanner input = new Scanner(System.in);
        System.out.println("Unit converter");

        // Receive the number of centimeters.
        System.out.println("Please, enter with the length in centimeters: ");
        double centimeters = input.nextDouble();

        // Converter centimeters to meters.
        double converter = centimeters / 100;
        System.out.printf("Converting %.2f centimers to meters is: %.2f meters.", centimeters, converter);
    }
}
