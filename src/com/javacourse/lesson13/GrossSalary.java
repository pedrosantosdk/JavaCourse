package com.javacourse.lesson13;

import java.util.Scanner;

public class GrossSalary {

    public static void main(String[] args) {
        // Declaration of taxes:
        double incomeTax = 11;
        double pension = 8;
        double syndicate = 5;
        double total = incomeTax + pension + syndicate;

        // Asks for the amount earned per hour.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your hourly wage: ");
        double hours = scan.nextDouble();

        // Ask for the number of hours worked per month.
        System.out.println("Enter how many hours you work per month: ");
        int month = scan.nextInt();

        // Calcule the salary.
        double salary = hours * month;
        double realTotal = total / 100;
        double descont = salary - (realTotal * salary);

        // Calculation of the value of each tax.
        double pensionCalc = (salary / 100) * pension;
        double syndCalc = (salary / 100) * syndicate;
        double itCalc = (salary / 100) * incomeTax;

        // Gross salary and value of taxes.
        System.out.printf("\nYou paid %.2f in Pension." , pensionCalc);
        System.out.printf("\nYou paid %.2f in Syndicate." ,syndCalc);
        System.out.printf("\nYou paid %.2f in Income Tax." , itCalc);
        System.out.printf("\nYour total salary after tax deductions is " + descont);
    }
}
