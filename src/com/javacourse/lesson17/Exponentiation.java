package com.javacourse.lesson17;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        int result =1;

        // User input.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base.");
        int base = scan.nextInt();
        System.out.println("Enter the exponent.");
        int exponent = scan.nextInt();

        // Calculates the Exponentiation.
        for(; exponent != 0; --exponent){ // --exponent decrements exponent by 1 then gives you the value of exponent.
            result *= base;  // result = result*base;
        }
        System.out.println("Result: "+ result);
    }
}
