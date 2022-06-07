package com.javacourse.lesson15;

import java.util.Scanner;

public class PassedFailed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Enter your first grade in the test: ");
        double firstGrade = scan.nextDouble();
        System.out.println("Enter your second grande in the test: ");
        double secondGrade = scan.nextDouble();

        // Calculates the student's average on the test.
        double total = (firstGrade + secondGrade) / 2;

        // Checks whether the student passed or failed.
        if (total == 10) {
            System.out.println("Approved with distinction.");
        } else if (total >= 7 && total < 10) {
            System.out.println("Approved.");
        } else if (total >= 0 && total < 7) {
            System.out.println("Reproved.");
        } else {
            System.out.println("Invalid grade.");
        }
    }
}
