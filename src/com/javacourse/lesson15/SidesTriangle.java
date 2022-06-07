package com.javacourse.lesson15;

import java.util.Scanner;

public class SidesTriangle {

    public static void main(String[] args) {
        // Input of values.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        double firstSide = scan.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double secondSide = scan.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double thirdSide = scan.nextDouble();

        // Checks if the values form a triangle.
        if((firstSide < secondSide + thirdSide) && (secondSide < thirdSide + firstSide) && (thirdSide < firstSide + secondSide)) {
            if(firstSide == secondSide && thirdSide == firstSide) {
                System.out.println("These values form a triangle.");
                System.out.println("It's an equilateral triangle.");

            } else if(firstSide == secondSide || thirdSide == firstSide || secondSide == thirdSide) {
                System.out.println("These values form a triangle.");
                System.out.println("It's an isosceles triangle.");

            } else {
                System.out.println("These values form a triangle.");
                System.out.println("It's an scalene triangle.");
            }

            // If the values do not form a triangle do:
        } else {
            System.out.println("These values do not form a triangle.");
        }
    }
}
