package com.javacourse.lesson15;

import java.util.Scanner;

public class PositivesAndNegative {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();

        // Checks whether the number is positive or negative.
        if(num1 < 0){
            System.out.printf("Number %d is negative.", num1);
        } else{
            System.out.printf("Number %d is positive.", num1);
        }
    }
}
