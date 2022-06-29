package com.javacourse.lesson19;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int[] arrayA = new int[10];

        // User input.
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
        }

        System.out.println("Sum:");

        // Sum all elements of the array.
        for (int j = 0; j < arrayA.length; j++){
           sum += j;
        }
        System.out.print(sum + " ");
    }
}

