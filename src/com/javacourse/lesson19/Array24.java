package com.javacourse.lesson19;

import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter the position number: ");
            arrayA[i] = input.nextInt();
            if (arrayA[i] % 2 == 0){
                arrayB[i] = 1;
            } else {
                arrayB[i] = 0;
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

    }
}
