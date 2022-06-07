package com.javacourse.lesson13;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        // Asks for the amount earned per hour.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your hourly wage.: ");
        double hours = scan.nextDouble();

        // Ask for the number of hours worked per month.
        System.out.println("Enter how many hours you work per month: ");
        int month = scan.nextInt();

        // Calcule the salary.
        double salary = hours * month;
        System.out.println("You earn per month: "+ salary);
    }
}
