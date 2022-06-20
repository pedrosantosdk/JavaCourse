package com.javacourse.lesson17;

import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Calculates the salary increase from 1996 to 1997, with the initial rate of increase at 1.5% and increasing by double each year.
        System.out.println("Enter salary:");
        double salary = input.nextDouble();
        double increase = 1.5;
        int startingYear = 1996;
        int finalYear = 2022;
        double calc = (salary/100) * increase;

        for(int i = startingYear; i < finalYear; i++){
            System.out.printf("In %d the salary was: $%2.2f\n", i, salary + calc);
            calc += calc;
        }

        /*double salary = 1000;
        double increase = 1.5;
        int startingYear = 1996;
        int finalYear = 2022;
        double calc = (salary/100) * increase;

        for(int i = startingYear; i < finalYear; i++){
            System.out.printf("In %d the salary was: $%2.2f\n", i, salary + calc);
            calc += calc;
        }
    }*/

    }
}
