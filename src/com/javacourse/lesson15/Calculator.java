package com.javacourse.lesson15;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input.
        System.out.println("Choose the operation you want to perform:\n" +
                "+ Sum\n" +
                "- Subtraction\n" +
                "/ Division\n" +
                "x Multiplication");
        String operator = input.next();

        // Checks if the operator is valid.
        if(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equalsIgnoreCase("x")) {
            System.out.println("Enter the first number: ");
            int first = input.nextInt();
            System.out.println("Enter the second number: ");
            int second = input.nextInt();

        // Checks whether the chosen operator and performs an operation.
            if(operator.equals("+")){
                int result = first + second;
                int even = result % 2;
                System.out.printf("The result of %d + %d = %d", first, second, result);
                if(even == 0 && result <0){
                    System.out.println("\nNegative and even.");
                } else if(even == 0 && result >0){
                        System.out.println("\nPositive and even.");
                } else if(even != 0 && result <0) {
                    System.out.println("\nNegative and odd.");
                } else if (even != 0 && result >0){
                    System.out.println("\nPositve and odd.");
                }

            } else if(operator.equals("-")){
                int result = first - second;
                int even = result % 2;
                System.out.printf("The result of %d - %d = %d", first, second, result);
                if(even == 0 && result <0){
                    System.out.println("\nNegative and even.");
                } else if(even == 0 && result >0){
                    System.out.println("\nPositive and even.");
                } else if(even != 0 && result <0) {
                    System.out.println("\nNegative and odd.");
                } else if (even != 0 && result >0){
                    System.out.println("\nPositve and odd.");
                }
        } else if(operator.equals("/")){
                int result = first / second;
                int even = result % 2;
                System.out.printf("The result of %d / %d = %d", first, second, result);
                if(even == 0 && result <0){
                    System.out.println("\nNegative and even.");
                } else if(even == 0 && result >0){
                    System.out.println("\nPositive and even.");
                } else if(even != 0 && result <0) {
                    System.out.println("\nNegative and odd.");
                } else if (even != 0 && result >0){
                    System.out.println("\nPositve and odd.");
                }
        } else if (operator.equalsIgnoreCase("x")){
                int result = first * second;
                int even = result % 2;
                System.out.printf("The result of %d x %d = %d", first, second, result);
                if(even == 0 && result <0){
                    System.out.println("\nNegative and even.");
                } else if(even == 0 && result >0){
                    System.out.println("\nPositive and even.");
                } else if(even != 0 && result <0) {
                    System.out.println("\nNegative and odd.");
                } else if (even != 0 && result >0){
                    System.out.println("\nPositve and odd.");
                }
            }
        } else {
            System.out.println("Error invalid operator.");  // Error output.
        }
    }
}

