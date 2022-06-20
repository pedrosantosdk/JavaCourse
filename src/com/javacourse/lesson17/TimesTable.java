package com.javacourse.lesson17;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean output = false;

        // User chooses table number, starting and ending value.
        do {
            System.out.println("Enter the number you want to see the multiplication table:");
            int number = input.nextInt();

            System.out.println("Enter the starting table number: ");
            int initial = input.nextInt();

            System.out.println("Enter up to what number you want the multiplication table to show:");
            int max = input.nextInt();

            if (initial < max) {
                for (int i = initial; i <= max; i++) {
                    int sum = number * i;
                    System.out.printf("%d x %d = %d\n", number, i, sum);
                    output = true;
                }
            } else {
                System.out.println("The starting value cannot be greater than the ending value.");
            }
        }
        while (!output);
    }
}