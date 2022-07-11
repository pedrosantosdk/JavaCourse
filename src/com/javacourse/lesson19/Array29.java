package com.javacourse.lesson19;

import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[20];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter position number " + (i+1) + " of array A: ");
            arrayA[i] = input.nextInt();
            if (arrayA[i] % 2 == 0){
                arrayB[i] = arrayA[i];
            } else {
                arrayC[i] = arrayA[i];
            }
        }

        int bPosition = 0;
        int cPosition = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                arrayB[bPosition] = arrayA[i];
                bPosition++;
            } else {
                arrayC[cPosition] = arrayA[i];
                cPosition++;
            }
        }

        System.out.print("Array A = ");
        for (int i : arrayA){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array B = ");
        for (int j = 0; j < bPosition; j++){
            System.out.print(arrayB[j] + " ");
        }
        System.out.println();

        System.out.print("Array C = ");
        for (int k = 0; k < cPosition; k++) {
            System.out.print(arrayC[k] + " ");
        }
    }
}
