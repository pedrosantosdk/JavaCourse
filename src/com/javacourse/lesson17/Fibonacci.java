package com.javacourse.lesson17;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstTerm = 0, secondTerm = 1;

        // User input.
        System.out.println("Enter the nth term of the Fibonacci series: ");
        int numberFibonacci = input.nextInt();


        // Nth fibonacci number.
        for(int i =1; i <= numberFibonacci; ++i){
            System.out.println(firstTerm + "");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

