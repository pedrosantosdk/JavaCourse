package com.javacourse.lesson17;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
<<<<<<< HEAD
=======
        double count = 0;
>>>>>>> origin/master
        double number = 0;

        System.out.println("Enter the quantity of grades: ");
        double grades = input.nextDouble();

        for(int i = 0; i < grades; i++){
            System.out.println("Enter a number: ");
<<<<<<< HEAD
            number += input.nextDouble();

        }
        double result = number / grades;
        System.out.printf("The average of the grades was: %.2f",result);
=======
            number += input.nextInt();
            count ++;
        }
        double result = number / grades;
        System.out.println(result);
>>>>>>> origin/master
    }
}
