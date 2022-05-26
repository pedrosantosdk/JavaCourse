package com.javacourse.class15;

import java.util.Scanner;

public class StudyTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input.
        System.out.println("Enter your study time");
        System.out.println("M - Morning, A - Afternoon, N - Night: ");
        String timeStudy = scan.next();

        // Check the chosen letter and print a greeting.
        if (timeStudy.length() == 1) {
            switch (timeStudy) {
                case "M":
                case "m":
                    System.out.println("Good Morning!");
                    break;
                case "A":
                case "a":
                    System.out.println("Good Afternoon!");
                    break;
                case "N":
                case "n":
                    System.out.println("Good Night!");
                    break;
                default:
                    System.out.println("Invalid.");
            }
        } else {
            System.out.println("Invalid string length..");
        }
    }
}
