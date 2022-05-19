package com.javacourse.class13;

import java.util.Scanner;

public class SumTwoValues {
    public static void main(String[] args) {
        // Create a Scanner object.
        Scanner input = new Scanner(System.in);

        // Reads the user's first input.
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();

        // Reads the user's second input.
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();

        // Sum the two numbers.
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of the two number is: " + sum);
    }
}
