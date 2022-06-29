package com.javacourse.lesson19;

import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Shows the percentage of odd and even elements within the array.
        int[] arrayA = new int[10];
        int odd = 0;

        // User input.
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
        }

        for (int k : arrayA) {
            if (k % 2 != 0) {
                odd++;
            }
        }

        int even = arrayA.length - odd;
        int evenPercentage = (even * 100) / arrayA.length;
        int oddPercentage = 100 - evenPercentage;

        System.out.print("Odd numbers = ");
        for (int j : arrayA) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        System.out.print("Even numbers = ");
        for (int j : arrayA) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers percentage: " + oddPercentage + "%");
        System.out.println("Percentage of even numbers: " + evenPercentage + "%");

    }
}