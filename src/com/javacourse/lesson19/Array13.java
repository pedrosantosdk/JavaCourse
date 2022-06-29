package com.javacourse.lesson19;

import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
        }

        System.out.println("Sum:");

        // Sum the elements of the Array that are multiples of 5.
        for (int j : arrayA) {
            if (j % 5 == 0) {
                sum += j;
            }
        }
        System.out.print(sum + " ");
    }
}