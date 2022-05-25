package com.javacourse.class15;

import java.util.Scanner;

public class GreaterThan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Enter an integer");
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();

        // Print the greatest number.
        if(firstNumber > secondNumber) {
            System.out.println("The greatest number is: " + firstNumber);
        }
        else {
            System.out.println("The greatest number is: " + secondNumber);
        }

    }
}
