package com.javacourse.lesson19;

import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayA = new int[10];
        char[] arrayB = new char[arrayA.length];

        for (int i = 0; i < arrayA.length; i++){
          System.out.println("Enter position number " + (i+1) + " of array A: ");
          arrayA[i] = input.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++){
            if (arrayA[i] < 7){
                arrayB[i] = 'a';
            } else if (arrayA[i] == 7){
                arrayB[i] = 'b';
            } else if (arrayA[i] > 7 && arrayA[i] < 10){
                arrayB[i] = 'c';
            } else if (arrayA[i] == 10){
                arrayB[i] = 'd';
            } else {
                arrayB[i] = 'e';
            }
        }

        System.out.print("Array A: ");
        for (int i : arrayA){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Array B: ");
        for (char i : arrayB){
            System.out.print(i + " ");
        }






    }
}
