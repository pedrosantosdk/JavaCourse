package com.javacourse.lesson19;

import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] age = new int [10];
        int count = 0;

        System.out.println("Enter the age of 10 people");
        // User input.
       for (int i = 0; i < age.length; i++){
           System.out.println("Enter age: ");
           age[i] = input.nextInt();
       }

       // Counts the number of people over the age of 35.
       for (int j : age){
           if (j > 35){
              count += 1;
           }
       }

        System.out.print("Age array:");
        for (int i : age) {
            System.out.print(i + " ");
        }
        System.out.println();

       System.out.println("The number of people older than 35 years is: " + count);
    }
}
