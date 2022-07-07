package com.javacourse.lesson19;

import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arrayA = new double[20];
        double dollarExchangeRate;

        System.out.println("Enter the dollar exchange rate: ");
        dollarExchangeRate = input.nextDouble();

        for (int i = 0; i < arrayA.length; i++){
            arrayA[i] = dollarExchangeRate * (i + 1);
        }

        System.out.println("Array A:");
        for (double i : arrayA) {
            System.out.print(i + " ");
        }
    }
}
