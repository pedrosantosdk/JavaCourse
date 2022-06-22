package com.javacourse.lesson17;

import java.util.Scanner;

public class ListOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean prime;

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++) {
            prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }

            if(prime){
                System.out.println(i);
            }
        }
    }
}