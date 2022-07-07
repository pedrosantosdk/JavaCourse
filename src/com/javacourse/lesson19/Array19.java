package com.javacourse.lesson19;

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] grade1 = new double[10];
        double[] grade2 = new double[grade1.length];
        double[] results = new double[grade1.length];

        for (int i = 0; i < grade1.length; i++){
            System.out.println("Student " + (i+1) + ", enter the first grade: ");
            grade1[i] = input.nextDouble();
            System.out.println("Student " + (i+1) + ", enter the second grade: ");
            grade2[i] = input.nextDouble();
            results[i] = (grade1[i] + grade2[i]) / 2;
        }

        for (int i = 0; i < grade1.length; i++){
            System.out.println("Student " + (i+1) + ", your grade point average was: " + results[i]);
            if (results[i] >= 7){
                System.out.println("Congratulations, you've been approved!");
            } else if (results[i] < 7){
                System.out.println("Unfortunately, you failed the test.");
            }
            System.out.println();
        }
    }
}