package com.javacourse.lesson19;

import java.util.Scanner;

public class Array22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];

        System.out.println("Enter only even numbers:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Enter the position number: ");
            arrayA[i] = input.nextInt();

            if (arrayA[i] % 2 != 0){
                break;
            }
        }

    }
}