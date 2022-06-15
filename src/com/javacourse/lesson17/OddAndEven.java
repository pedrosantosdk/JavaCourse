package com.javacourse.lesson17;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        // Calculates whether the number is odd or even.
        for (int i = 0; i < 10; i++) {
            // User input.
            System.out.println("Enter an integer: ");
            int num = input.nextInt();

            // Counts the number of odd and even numbers.
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        // Shows the amount of:
        System.out.println("Amount:");
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}