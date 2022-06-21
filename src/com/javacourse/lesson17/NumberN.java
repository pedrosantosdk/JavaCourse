package com.javacourse.lesson17;

import java.util.Scanner;

public class NumberN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = input.nextInt();

        double sum = 0;

        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            System.out.printf(i + "/" + j + " + ");

            sum += i/j;
        }
        System.out.println("\nSum = " + sum);
    }
}

