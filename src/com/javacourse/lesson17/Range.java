package com.javacourse.lesson17;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = input.nextInt();

        System.out.println("Enter the second number: ");
        int second = input.nextInt();

        // Shows the range of numbers between the first number and the second.
        for(int i = first+1; i < second; i++){
            System.out.println(i);
        }
    }
}
