package com.javacourse.class15;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.println("Quadratic Equation\nax2 + bx + c");
        System.out.println("Enter the value of (a).");
        int a = input.nextInt();

        // If A is equal to 0, the equation is not quadratic.
        if (a == 0){
            System.out.println("It is not a quadratic equation.");

        } else {
            System.out.println("Enter the value of (b).");
            int b = input.nextInt();

            System.out.println("Enter the value of (c).");
            int c = input.nextInt();

            // Calculate the delta.
            double delta = (b*b) - 4 * a*c;

            if(delta < 0){
                System.out.println("There are no real roots.");
            } else {
                System.out.println("Delta = " + delta);

                // Calculate the roots.
                double x1 = ((-b) + Math.sqrt (delta)) / 2 * a;
                double x2 = ((-b) - Math.sqrt (delta)) / 2 * a;

                // Show the roots.
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
