package com.javacourse.lesson17;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to see the multiplication table:");
        int number = input.nextInt();

        // Shows the multiplication table of the chosen number.
        for(int i = 1; i <= 10; i++){
            int sum = number * i;
            System.out.printf("%d x %d = %d\n",number,i, sum);
        }
    }
}
