package com.javacourse.lesson17;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input.
        System.out.println("Enter the number.");
        int number = input.nextInt();

        // Error message.
        while(number == 0){
            System.out.println("ERROR\n" +
                    "The number cannot be zero.");
            System.out.println("Enter the number.");
            number = input.nextInt();
        }

        // Checks if number is prime or composite.
        if(number % 2 == 0 && number != 2) {
            System.out.printf("The number %d is a composite number.", number);
        }
        else {
            System.out.printf("The number %d is a prime number.", number);
        }
    }
}
