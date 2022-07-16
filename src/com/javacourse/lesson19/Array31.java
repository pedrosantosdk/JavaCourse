package com.javacourse.lesson19;

import java.util.Scanner;

public class Array31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[5];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter position number " + (i + 1) + " of array A: ");
            arrayA[i] = input.nextInt();
        }

        System.out.println();

        for (int k : arrayA) {
            System.out.println("Table of " + k);

            for (int j = 1; j <= 10; j++) {
                int sum = k * j;
                System.out.println(k +" x " + j + " = " + sum);
            }
            System.out.println();
        }
    }
}