package com.javacourse.lesson17;

import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double students = 0;

        System.out.println("Enter the number of classes: ");
        double classes = input.nextDouble();

        for (int i = 0; i < classes; i++) {
            System.out.println("Enter the number of students: ");
            students += input.nextDouble();
        }
            double average = students / classes;
            if (average <= 40) {
            System.out.println("The average number of students per class is: " + average);
        } else {
            System.out.println("Error, the maximum number of students per room is 40 students.");
        }
    }
}
