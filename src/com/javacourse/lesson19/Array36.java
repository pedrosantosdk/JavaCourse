package com.javacourse.lesson19;

import java.util.Scanner;

public class Array36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[15];
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter position number " + (i + 1) + " of array A: ");
            arrayA[i] = input.nextInt();
        }

        // Calculate the factorial.
        for(int i = 0; i < arrayA.length; i++){
            arrayB[i] = 1;
            for (int j = 1; j <= arrayA[i]; j++){
                arrayB[i] *= j;
            }
        }

        System.out.print("Array A: ");
        for(int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.print("Array B: ");
        for(int i = 0; i < arrayA.length; i++){
            System.out.print(arrayB[i] + " ");
        }
        System.out.println();
    }
}
