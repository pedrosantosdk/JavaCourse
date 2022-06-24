package com.javacourse.lesson18;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        /*Example of break:
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Enter a limit: ");
        int max = input.nextInt();


        for(int i = num; i <= max; i++){
        // Searches for the first number divisible by 7 after the number chosen by the user.
            if(i % 7 == 0){
                System.out.println("The value of i is: " + i);
                break;
            }
        }*/

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Enter a limit: ");
        int max = input.nextInt();

        for(int i = num; i <= max; i++){
            // Prints all numbers that are not divided by 7 from the starting value to the end value chosen by the user.
            if(i % 7 == 0){
                continue;
            }
            System.out.println("The value of i is: " + i);
        }
    }
}
