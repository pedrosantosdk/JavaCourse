package com.javacourse.class13;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

        // Pi declaration
        double pi = 3.1415926535898;

        // Asks for the diameter of the radius.
        Scanner scan = new Scanner(System.in);
        System.out.println("To calculate the area of a circle, enter the radius.");
        System.out.println("Enter the radius: ");
        double radius = scan.nextDouble();

        // Calculate the area of the circle.
        double area = pi * (radius * radius);
        System.out.printf("Area = %2f", area);
    }
}
