package com.javacourse.lesson17;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Initial value.
        int n = 1;

        // Number chosen by the user.
        Scanner scan = new Scanner(System.in);
        System.out.println("Factorial Calculator");
        System.out.println("Choose the number you want to use the factorial:");
        int factorialCalc = scan.nextInt();

        // Calculate the factorial.
        for(int i = 1; i <= factorialCalc; i++){
            n = n*i;
        }

        // Result.
        System.out.println("Factorial of "+ factorialCalc +" is: "+ n);
        }
    }

