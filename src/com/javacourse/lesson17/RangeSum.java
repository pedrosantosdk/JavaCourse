package com.javacourse.lesson17;

import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        // User input.
        System.out.println("Enter the first number: ");
        int first = input.nextInt();

        System.out.println("Enter the second number: ");
        int second = input.nextInt();

        // Sum the numbers of the range.
        for (int i = first+1; i < second; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
