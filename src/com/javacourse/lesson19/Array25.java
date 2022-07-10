package com.javacourse.lesson19;

import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter position number " + (i + 1) + " of array A: ");
            arrayA[i] = input.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter position number " + (i+1) + " of array B: ");
            arrayB[i] = input.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > arrayB[i]){
                arrayC[i] = 1;
            } else if (arrayA[i] == arrayB[i]){
                arrayC[i] = 0;
            } else if (arrayA[i] < arrayB[i]){
                arrayC[i] = -1;
            }
        }

        System.out.print("Array A: ");
        for (int i : arrayA){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Array B: ");
        for (int i : arrayB){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Array C: ");
        for (int i : arrayC){
            System.out.print(i + " ");
        }
    }
}
