package com.javacourse.class15;

import java.util.Scanner;

public class GreaterBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = scan.nextInt();

        // Prints the largest number among the three.
        if(number1 > number2 && number1> number3){
            System.out.println("The greatest number is: " + number1);
        } else if(number2 > number1 && number2 > number3) {
            System.out.println("The greatest number is: " + number2);
        } else {
            System.out.println("The greatest number is: " + number3);
        }
    }
}
