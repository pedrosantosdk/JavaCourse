package com.javacourse.lesson19;

import java.util.Scanner;

public class Array33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter position number " + (i + 1) + " of array A: ");
            arrayA[i] = input.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Analyzing the number " + arrayA[i]);

            for (int j = 2; j < arrayA[i]; j++){
                if ( arrayA[i] % j == 0){
                    System.out.println(j + " is divisor");
                }
            }
            System.out.println();
        }



    }
}
