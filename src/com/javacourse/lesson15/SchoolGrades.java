package com.javacourse.lesson15;

import java.util.Scanner;

public class SchoolGrades {

    public static void main(String[] args) {
        // Grades entry.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first semester grades: ");
        double firstSemester = scan.nextDouble();
        System.out.println("Enter your second semester grades: ");
        double secondSemester = scan.nextDouble();

        // Calculate the average.
        double averages = (firstSemester + secondSemester)/2;

        // Check your average and it shows:
        // Grade A and Approved.
        if(averages >= 9 && averages <= 10) {
            System.out.println("\nYour first semester grades: " + firstSemester);
            System.out.println("\nYour second semester grades: " + secondSemester);
            System.out.println("\nYour grade point average for the year: " + averages);
            System.out.println("\nLetter Grade: A.");
            System.out.println("\nApproved.");

            // Grade B and Approved.
        } else if (averages >= 7.5 && averages < 9) {
            System.out.println("\nYour first semester grades: " + firstSemester);
            System.out.println("\nYour second semester grades: " + secondSemester);
            System.out.println("\nYour grade point average for the year: " + averages);
            System.out.println("\nLetter Grade: B.");
            System.out.println("\nApproved.");

            // Grade C and Approved.
        } else if (averages >= 6.0 && averages < 7.5) {
            System.out.println("\nYour first semester grades: " + firstSemester);
            System.out.println("\nYour second semester grades: " + secondSemester);
            System.out.println("\nYour grade point average for the year: " + averages);
            System.out.println("\nLetter Grade: C.");
            System.out.println("\nApproved.");

            // Grade D and Reproved.
        } else if (averages >= 4 && averages < 6) {
            System.out.println("\nYour first semester grades: " + firstSemester);
            System.out.println("\nYour second semester grades: " + secondSemester);
            System.out.println("\nYour grade point average for the year: " + averages);
            System.out.println("\nLetter Grade: D.");
            System.out.println("\nReproved.");

            // Grade F and Reproved.
        } else if (averages >= 0 && averages < 4) {
            System.out.println("\nYour first semester grades: " + firstSemester);
            System.out.println("\nYour second semester grades: " + secondSemester);
            System.out.println("\nYour grade point average for the year: " + averages);
            System.out.println("\nLetter Grade: F.");
            System.out.println("\nReproved.");

            // ERROR MESSAGE.
        } else {
            System.out.println("Invalid number!\n" + "Try a number between 0 to 10. ");
        }
    }
}