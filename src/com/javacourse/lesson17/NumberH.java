package com.javacourse.lesson17;

import java.util.Scanner;

public class NumberH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = input.nextInt();

        double sum = 0;

        for(int i = 1; i <=n; i++){

            sum += 1/i;
        }
        System.out.println(sum);
    }
}
