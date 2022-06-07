package com.javacourse.lesson15;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input user.
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        boolean leapY = false;

        // Check if it is a leap year or not.
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            leapY = true;
            System.out.println("It's a leap year.");
        } else {
            System.out.println("It's not a leap year.");
        }
    }
}
