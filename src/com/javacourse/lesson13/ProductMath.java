package com.javacourse.lesson13;

import java.util.Scanner;
public class ProductMath {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Enter the first integer:");
        int first = scan.nextInt();
        System.out.println("Enter the second integer:");
        int second = scan.nextInt();
        System.out.println("Enter a real number:");
        double real = scan.nextDouble();

        // The product of twice the first and half the second.
        int operation = (first * 2) * (second / 2);
        System.out.println("\nResult of product: " + operation);

        // The sum of triple the first and the third.
        double triple = first * 3 + real;
        System.out.println("\nSum result: " + triple);

        // The third cubed.
        double cube = real * real * real;
        System.out.println("\nResult: " + cube);
    }

}
