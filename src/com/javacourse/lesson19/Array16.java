package com.javacourse.lesson19;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] arrayA = new int[10];
        int greaterThanFifteen = 0;
        int lessThanFifteen = 0;
        int equalToFifteen = 0;
        int quantityFifteen = 0;

        // User input.
        for (int i = 0;  i < arrayA.length; i++) {
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
        }

        System.out.println();
        System.out.print("Array A = ");

        // Shows the elements of the array.
        for (int i : arrayA){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : arrayA){
            if (i < 15){
                lessThanFifteen += i ;
            }
        }

        for (int i : arrayA){
            if (i == 15){
                equalToFifteen += 1;
            }
        }

        for (int i : arrayA) {
            if (i > 15) {
                greaterThanFifteen += i;
                quantityFifteen += 1;
            }
        }

        System.out.println("Sum of the elements stored in this array that are less than 15 = " + lessThanFifteen);
        System.out.println("Amount of elements stored in the array that are equal to 15 =  " + equalToFifteen);
        System.out.println("Average of the elements stored in the array that are greater than 15 = " + greaterThanFifteen / quantityFifteen);

    }
}
