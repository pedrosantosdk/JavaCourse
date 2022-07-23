package com.javacourse.lesson19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];

        // Each element of Array B is the element of Array A multiplied by its position.
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
            arrayB[i] = arrayA[i] * i;
        }

        System.out.print("Array A = ");

        for (int j : arrayA){
            System.out.print(j + " ");
        }

        System.out.println();

        System.out.print("Array B = ");
        for (int k : arrayB){
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
