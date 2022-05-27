package com.javacourse.class15;

import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Amount of the increase in percent.
        double twenty = 20.0;
        double fifteen = 15.0;
        double ten = 10.0;
        double five = 5.0;
        double oneH = 100.0;

        // User input.
        System.out.println("Calculation of salary increase");
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        // Calculates the percentage.
        double fIncrease = twenty / oneH;
        double sIncrease = fifteen / oneH;
        double tIncrease = ten / oneH;
        double foIncrease = five / oneH;

        // Shows the previous salary, the increase percentage, the increase amount, and the new salary.
        if(salary <280){
            double result = salary + (fIncrease * salary);
            double total = result - salary;
            System.out.printf("Your salary before the raise: $%.2f\n", salary);
            System.out.printf("The percentage of increase: %.2f%%\n", twenty);
            System.out.printf("The amount of the increase was: $%.2f\n" , total);
            System.out.printf("Your new salary is: $%.2f\n", result);

        } else if(salary >= 280 && salary < 700){
            double result = salary + (sIncrease * salary);
            double total = result - salary;
            System.out.printf("Your salary before the raise: $%.2f\n", salary);
            System.out.printf("The percentage of increase: %.2f%%\n", fifteen);
            System.out.printf("The amount of the increase was: $%.2f\n" , total);
            System.out.printf("Your new salary is: $%.2f\n", result);

        } else if(salary >= 700 && salary < 1500){
            double result = salary + (tIncrease * salary);
            double total = result - salary;
            System.out.printf("Your salary before the raise: $%.2f\n", salary);
            System.out.printf("The percentage of increase: %.2f%%\n", ten);
            System.out.printf("The amount of the increase was: $%.2f\n" , total);
            System.out.printf("Your new salary is: $%.2f\n", result);

        } else {
            double result = salary + (foIncrease * salary);
            double total = result - salary;
            System.out.printf("Your salary before the raise: $%.2f\n", salary);
            System.out.printf("The percentage of increase: %.2f%%\n", five);
            System.out.printf("The amount of the increase was: $%.2f\n" , total);
            System.out.printf("Your new salary is: $%.2f\n", result);
        }
    }
}
