package com.javacourse.lesson19;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creates an Array A with 15 integer elements and an Array B with the same type and size,
        // where each element of B must be the square of the respective element of A.
        int[] arrayA = new int[15];
        int[] arrayB = new int[arrayA.length];

        for(int i = 0; i < arrayA.length; i++){
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();

            arrayB[i] = arrayA[i] * arrayA[i];
        }

        System.out.print("Array A = ");

        for(int j : arrayA){
            System.out.printf(j + " ");
        }
        System.out.println();

        System.out.print("Array B = ");

        for(int k : arrayB){
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
