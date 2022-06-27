package com.javacourse.lesson19;

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("ArrayA = Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("ArrayB = Enter position number " + i + ":");
            arrayB[i] = input.nextInt();
            arrayC[i] = arrayA[i] / arrayB[i];
        }

        System.out.print("Array A = ");
        for (int j : arrayA){
            System.out.printf(j + " ");
        }
        System.out.println();

        System.out.print("Array B = ");
        for (int k : arrayB){
            System.out.printf(k + " ");
        }

        System.out.println();

        System.out.print("Array C = ");
        for (int l : arrayC){
            System.out.print(l + " ");
        }
        System.out.println();
    }
}
