package com.javacourse.lesson19;

import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter the position number: ");
            arrayA[i] = input.nextInt();
        }

        boolean palindrome = true;
        for (int i = 0; i < (arrayA.length / 2); i++) {

            if (arrayA[i] != arrayA[arrayA.length - 1 - i]){
                palindrome = false;
                break;
            }
        }

        System.out.print("Array A = ");
        for (int j : arrayA) {
            System.out.print(j + " ");
        }
        System.out.println();

        if (palindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}
