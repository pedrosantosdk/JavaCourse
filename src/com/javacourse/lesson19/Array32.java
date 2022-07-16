package com.javacourse.lesson19;

import java.util.Scanner;

public class Array32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];
        boolean prime;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter position number " + (i + 1) + " of array A: ");
            arrayA[i] = input.nextInt();
        }

        for(int i = 1; i <= arrayA.length; i++) {
            prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(!prime) {
                System.out.println("The number " + i + " is not a prime number.");
            } else {
                System.out.println("The number " + i + " is a prime number.");
            }
        }
    }
}
