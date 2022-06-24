package com.javacourse.lesson19;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Creates an Array A with 5 integer elements and
            // an Array B with the same type and size as Array A.
            int[] arrayA = new int[5];
            int[] arrayB = new int[arrayA.length];

            for (int i = 0; i < arrayA.length; i++) {
                System.out.println("Enter position number " + i + ":");
                arrayA[i] = input.nextInt();

                arrayB[i] = arrayA[i];
            }
            System.out.print("Array A = ");
        for (int j : arrayA) {
            System.out.print(j + " ");
        }
            System.out.println();

            System.out.print("Array B = ");
        for (int k : arrayB) {
            System.out.print(k + " ");
        }
            System.out.println();
        }
    }


