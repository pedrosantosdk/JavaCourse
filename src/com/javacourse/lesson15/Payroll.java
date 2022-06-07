package com.javacourse.lesson15;

import java.util.*;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks for the hourly wage and the amount of hours worked per month.
        System.out.println("Enter your hourly wage: ");
        double hours = input.nextDouble();
        System.out.println("Enter how many hours you work per month: ");
        int month = input.nextInt();

       double salary = hours * month;

        if(salary <=900){
            // Calculations of wages and fees.
            int incomeTax = 0;
            int pension = 10;
            int fgts = 11;
            double pensionCalc = (salary / 100) * pension;
            double itCalc = (salary / 100) * incomeTax;
            double total = incomeTax + pension;
            double fgtsCalc = (salary / 100) * fgts;
            double realTotal = total / 100;
            double netSal = salary - (realTotal * salary);
            double discounts = itCalc + pensionCalc;

            // Gross salary, net salary and fees.
            System.out.printf("\nGross Salary: R$%.2f", salary);
            System.out.printf("\n(-%d%%) Income Tax: R$%.2f" , incomeTax, itCalc);
            System.out.printf("\n(-%d%%) Pension: R$%.2f" , pension, pensionCalc);
            System.out.printf("\n(%d%%) FGTS: R$%.2f", fgts, fgtsCalc);
            System.out.printf("\nTotal discounts: R$%.2f", discounts);
            System.out.printf("\nNet salary: R$%.2f", netSal);

        } else if(salary >900 && salary <= 1500){
            // Calculations of wages and fees.
            int incomeTax = 5;
            int pension = 10;
            int fgts = 11;
            double pensionCalc = (salary / 100) * pension;
            double itCalc = (salary / 100) * incomeTax;
            double total = incomeTax + pension;
            double fgtsCalc = (salary / 100) * fgts;
            double realTotal = total / 100;
            double netSal = salary - (realTotal * salary);
            double discounts = itCalc + pensionCalc;

            // Gross salary, net salary and fees.
            System.out.printf("\nGross Salary: R$%.2f", salary);
            System.out.printf("\n(-%d%%) Income Tax: R$%.2f" , incomeTax, itCalc);
            System.out.printf("\n(-%d%%) Pension: R$%.2f" , pension, pensionCalc);
            System.out.printf("\n(%d%%) FGTS: R$%.2f", fgts, fgtsCalc);
            System.out.printf("\nTotal discounts: R$%.2f", discounts);
            System.out.printf("\nNet salary: R$%.2f", netSal);

        } else if(salary > 1500 && salary <= 2500){
            // Calculations of wages and fees.
            int incomeTax = 10;
            int pension = 10;
            int fgts = 11;
            double pensionCalc = (salary / 100) * pension;
            double itCalc = (salary / 100) * incomeTax;
            double total = incomeTax + pension;
            double fgtsCalc = (salary / 100) * fgts;
            double realTotal = total / 100;
            double netSal = salary - (realTotal * salary);
            double discounts = itCalc + pensionCalc;

            // Gross salary, net salary and fees.
            System.out.printf("\nGross Salary: R$%.2f", salary);
            System.out.printf("\n(-%d%%) Income Tax: R$%.2f" , incomeTax, itCalc);
            System.out.printf("\n(-%d%%) Pension: R$%.2f" , pension, pensionCalc);
            System.out.printf("\n(%d%%) FGTS: R$%.2f", fgts, fgtsCalc);
            System.out.printf("\nTotal discounts: R$%.2f", discounts);
            System.out.printf("\nNet salary: R$%.2f", netSal);
        } else {
            // Calculations of wages and fees.
            int incomeTax = 20;
            int pension = 10;
            int fgts = 11;
            double pensionCalc = (salary / 100) * pension;
            double itCalc = (salary / 100) * incomeTax;
            double total = incomeTax + pension;
            double fgtsCalc = (salary / 100) * fgts;
            double realTotal = total / 100;
            double netSal = salary - (realTotal * salary);
            double discounts = itCalc + pensionCalc;

            // Gross salary, net salary and fees.
            System.out.printf("\nGross Salary: R$%.2f", salary);
            System.out.printf("\n(-%d%%) Income Tax: R$%.2f" , incomeTax, itCalc);
            System.out.printf("\n(-%d%%) Pension: R$%.2f" , pension, pensionCalc);
            System.out.printf("\n(%d%%) FGTS: R$%.2f", fgts, fgtsCalc);
            System.out.printf("\nTotal discounts: R$%.2f", discounts);
            System.out.printf("\nNet salary: R$%.2f", netSal);
        }
    }
}
