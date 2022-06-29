package com.javacourse.lesson19;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];

        // User input.
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter position number " + i + ":");
            arrayA[i] = input.nextInt();
        }

        System.out.println("Even numbers:");

        // Prints the number of even array numbers.
        for (int j : arrayA){
            if (j % 2 == 0 ){
                System.out.print(j + " ");
            }
        }
    }
}
