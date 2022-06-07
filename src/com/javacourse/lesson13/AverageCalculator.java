package com.javacourse.lesson13;

import java.util.Scanner;

public class AverageCalculator {
        public static void main(String[] args) {
            // It asks the grades for the quarters to sum and print the average.
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your first quarter grade: ");
            double firstQuarter = input.nextDouble();

            System.out.println("Enter your second quarter grade: ");
            double secondQuarter = input.nextDouble();

            System.out.println("Enter your third quarter grade: ");
            double thirdQuarter = input.nextDouble();

            System.out.println("Enter your fourth quarter grade: ");
            double fourthQuarter = input.nextDouble();

            double average = (firstQuarter + secondQuarter + thirdQuarter + fourthQuarter) / 4;
            System.out.printf("The average of grades was: %.2f ", average);
        }
    }

