package com.javacourse.class15;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input.
        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        // Checks if the even is odd.
        if(num % 2 == 0){
            System.out.printf("Number %d is even", num);
        } else {
            System.out.printf("Number %d is odd.", num);
        }
    }
}
