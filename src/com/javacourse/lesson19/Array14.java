package com.javacourse.lesson19;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int[] arrayA = new int[10];

        // User input.
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
        }

        System.out.print("Odd numbers = ");
        // Shows the odd numbers in the array.
        for (int j : arrayA) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
        System.out.print("Sum of odd numbers = ");
        for (int k : arrayA) {
            if (k % 2 != 0) {
                sum += k;
            }
        }
            System.out.print(sum + " ");
            System.out.println();

            // Shows the simple arithmetic mean of the odd elements stored in the array.
            int average = sum / 10;
            System.out.print("Average = ");
            System.out.print(average);
        }
    }

