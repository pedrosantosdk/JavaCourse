package com.javacourse.lesson19;

import java.util.Scanner;

public class Array35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arrayA = new double[11];

        for (int i = 0; i < arrayA.length; i++){
            arrayA[i] = Math.pow(2, i);
        }

        System.out.print("Array A: ");
        for (double i : arrayA){
            System.out.print(i + " ");
        }

        System.out.println();

    }
}
