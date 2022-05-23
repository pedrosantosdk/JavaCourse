package com.javacourse.class15;

import java.util.Scanner;

public class WrongUserInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean trueNumber = false;

        // While the number is less than 0 or more than 10 repeats until user put valid number.
        do {
            System.out.println("Enter a number between 0 to 10.");
            int zeroTen = scan.nextInt();

            if (zeroTen >= 0 && zeroTen <= 10) {
                System.out.println("You typed: " + zeroTen);
                trueNumber = true;
            } else {
                System.out.println("Invalid number, try entering a number between 0 to 10.");
            }
        } while (!trueNumber) ;
    }
}