package com.javacourse.lesson15;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();
        String result = (age > 18) ? "Yes, you can vote!" : "No, you can't vote!";
        System.out.println(result);
    }
}
