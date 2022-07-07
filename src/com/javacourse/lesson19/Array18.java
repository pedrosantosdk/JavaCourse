package com.javacourse.lesson19;

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < age.length; i++){
            System.out.println("Enter the age of person " + (i+1));
            age[i] = input.nextInt();
        }

        int youngerAge = age[0];
        int youngerAgeIndex = 0;
        int oldestAge = age[0];
        int oldestAgeIndex = 0;

        for (int i = 1; i < age.length; i++){
            if (age[i] > oldestAge) {
                oldestAge = age[i];
                oldestAgeIndex = i;
            } else if (age[i] < youngerAge) {
                youngerAge = age[i];
                youngerAgeIndex = i;
            }
        }

        System.out.print("Age array: ");
        for (int i : age) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Younger age = " + youngerAge);
        System.out.println("Indication of minor age: " + youngerAgeIndex);
        System.out.println("Oldest Age = " + oldestAge);
        System.out.println("Indication of older age: " + oldestAgeIndex);

    }
}
