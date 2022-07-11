package com.javacourse.lesson19;

import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];


        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter position number " + (i+1) + " of array A: ");
            arrayA[i] = input.nextInt();
            arrayB[arrayA.length - i - 1] =  arrayA[i];
        }

        System.out.print("Array A = ");
        for (int i : arrayA){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array B = ");
        for (int j : arrayB){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
