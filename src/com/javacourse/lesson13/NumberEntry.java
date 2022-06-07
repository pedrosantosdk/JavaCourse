package com.javacourse.lesson13;

import java.util.Scanner;

public class NumberEntry {

    public static void main(String[] args) {
        // Create a Scanner object.
        Scanner scan = new Scanner(System.in);

        // Read user input.
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();

        // Output user input
        System.out.println("The reported number was: " + number);
    }
}