package com.javacourse.lesson19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[15];
        double[] arrayB = new double[arrayA.length];

        // Each element in Array B is the square root of the respective element in Array A.
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
            arrayB[i] = Math.sqrt(arrayA[i]);
        }

        System.out.print("Array A = ");

        for (int j: arrayA){
            System.out.print(j + " ");
        }

        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Array B = ");
        for (int i = 0; i< arrayB.length; i++){
            System.out.print(df.format(arrayB[i]) + " ");
        }
        System.out.println();
    }
}
